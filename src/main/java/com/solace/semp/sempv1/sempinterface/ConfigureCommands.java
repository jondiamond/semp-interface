package com.solace.semp.sempv1.sempinterface;

import com.solace.semp.sempv1.SolaceSempReply.ObjectFactory;
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

@Component
public class ConfigureCommands {

    @Autowired
    private Session session;

    @Value("${solace.semp.configure.subscriptionevents:<message-vpn><vpn-name>{vpn}</vpn-name><event><publish-subscription><event-topic-format></event-topic-format><v2></v2></publish-subscription></event></message-vpn></rpc>}")
    private String solaceSEMPConfigureSubscriptionEvents;

    private static final Logger logger = LoggerFactory.getLogger(ConfigureCommands.class);

    private JAXBContext jaxbContext;

    public ConfigureCommands(){

    }

    public boolean configureSubscriptionEvents() throws ClientProtocolException, IOException, AuthenticationException, JAXBException {

        boolean success = false;

        session.open();

        solaceSEMPConfigureSubscriptionEvents = solaceSEMPConfigureSubscriptionEvents.replace("{vpn}", session.getMessageVpn());

        logger.info("Running configure command: {}", solaceSEMPConfigureSubscriptionEvents);
        CloseableHttpResponse response = session.execute(solaceSEMPConfigureSubscriptionEvents);

        if (response.getStatusLine().getStatusCode() == 200) {
            logger.info("Received 200 response from SEMP API");

            HttpEntity httpEntity = response.getEntity();
            String apiOutput = EntityUtils.toString(httpEntity);

            jaxbContext = session.getRpcReplyContext();

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            com.solace.semp.sempv1.SolaceSempReply.RpcReply reply = (com.solace.semp.sempv1.SolaceSempReply.RpcReply) jaxbUnmarshaller.unmarshal(new StringReader(apiOutput));

            com.solace.semp.sempv1.SolaceSempReply.RpcReply.ExecuteResult result = reply.getExecuteResult();

            if (result.getCode().equals("ok")) {
                success = true;
            }
            else {
                success = false;
                logger.info("Response from SEMP API {}", apiOutput);
            }

            logger.info("Result code {}", result.getCode());

        } else {
            logger.warn("Received unexpected ({}) response from SEMP API", response.getStatusLine().getStatusCode());

            success = false;
        }

        session.close();

        logger.info("Configure command completed ({})", solaceSEMPConfigureSubscriptionEvents);

        return success;
    }

    public boolean configureSubscriptionEvents(String messageVpn) throws ClientProtocolException, IOException, AuthenticationException, JAXBException {

        session.setMessageVpn(messageVpn);

        return configureSubscriptionEvents();
    }

}
