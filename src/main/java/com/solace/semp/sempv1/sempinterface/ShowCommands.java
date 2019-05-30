package com.solace.semp.sempv1.sempinterface;

import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Component
public class ShowCommands {

    @Autowired
    private Session session;

    @Value("${solace.semp.show.subscriptions:<show><smrp><subscriptions></subscriptions></smrp></show></rpc>}")
    private String solaceSEMPShowSubcriptions;

    private static final Logger logger = LoggerFactory.getLogger(ShowCommands.class);

    private JAXBContext jaxbContext;

    public ShowCommands(){

    }

    public HashMap<Integer, com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription>
    getCurrentSubscriptions() throws ClientProtocolException, IOException, AuthenticationException, JAXBException {

        ArrayList<com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription>
                subscriptions = new ArrayList();

        HashMap<Integer, com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription> subscriptionMap = new
                HashMap<Integer, com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription>();

        session.open();

        logger.info("Running show command: {}", solaceSEMPShowSubcriptions);
        CloseableHttpResponse response = session.execute(solaceSEMPShowSubcriptions);

        if (response.getStatusLine().getStatusCode() == 200) {
            logger.info("Received 200 response from SEMP API");

            HttpEntity httpEntity = response.getEntity();
            String apiOutput = EntityUtils.toString(httpEntity);

            jaxbContext = session.getRpcReplyContext();

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            com.solace.semp.sempv1.SolaceSempReply.RpcReply reply = (com.solace.semp.sempv1.SolaceSempReply.RpcReply) jaxbUnmarshaller.unmarshal(new StringReader(apiOutput));

            com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions subs = reply.getRpc().getShow().getSmrp().getSubscriptions();

            subscriptions = (ArrayList<com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription>)
                    subs.getSubscription();

            for (int subCounter = 0; subCounter < subscriptions.size(); subCounter++) {
                com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription subscription = subscriptions.get(subCounter);
                int hashCode = Objects.hash(
                        subscription.getVpnName(),
                        subscription.getDestinationName(),
                        subscription.getDestinationType(),
                        subscription.getPersistence(),
                        subscription.getRedundancy(),
                        subscription.getBlockId(),
                        subscription.getDtoPriority(),
                        subscription.getTopic());
                subscriptionMap.put(hashCode, subscription);
            }
        } else {
            logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());
        }

        session.close();

        logger.info("Show command completed", solaceSEMPShowSubcriptions);

        return subscriptionMap;
    }

}
