package com.solace.semp.sempv1.sempinterface;

import com.solace.semp.sempv1.SolaceSempReply.ObjectFactory;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.IOException;

@Component
public class Session {

    private static final Logger logger = LoggerFactory.getLogger(Session.class);

    @Value("${solace.semp.uri:http://localhost:8080/SEMP}")
    private String solaceSEMPURI;

    @Value("${solace.semp.user:admin}")
    private String solaceSEMPUsername;

    @Value("${solace.semp.password:admin}")
    private String solaceSEMPPassword;

    @Value("${solace.semp.version:<rpc>}")
    private String solaceSEMPRPCVersion;

    private int lastHTTPResponseCode;

    private String messageVpn = "default";

    private CloseableHttpClient client;

    private JAXBContext rpcReplyContext = null;

    public Session() {
    }

    public String getSolaceSEMPURI() {
        return solaceSEMPURI;
    }

    public void setSolaceSEMPURI(String solaceSEMPURI) {
        this.solaceSEMPURI = solaceSEMPURI;
    }

    public String getSolaceSEMPUsername() {
        return solaceSEMPUsername;
    }

    public void setSolaceSEMPUsername(String solaceSEMPUsername) {
        this.solaceSEMPUsername = solaceSEMPUsername;
    }

    public String getSolaceSEMPPassword() {
        return solaceSEMPPassword;
    }

    public void setSolaceSEMPPassword(String solaceSEMPPassword) {
        this.solaceSEMPPassword = solaceSEMPPassword;
    }

    public String getSolaceSEMPRPCVersion() {
        return solaceSEMPRPCVersion;
    }

    public void setSolaceSEMPRPCVersion(String solaceSEMPRPCVersion) {
        this.solaceSEMPRPCVersion = solaceSEMPRPCVersion;
    }

    public CloseableHttpResponse execute(String commandXML) throws IOException, AuthenticationException {
        HttpPost httpPost = new HttpPost(solaceSEMPURI);

        httpPost.setEntity(new StringEntity(
                solaceSEMPRPCVersion + commandXML));

        UsernamePasswordCredentials creds
                = new UsernamePasswordCredentials(solaceSEMPUsername, solaceSEMPPassword);
        httpPost.addHeader(new BasicScheme().authenticate(creds, httpPost, null));

        CloseableHttpResponse response = client.execute(httpPost);

        lastHTTPResponseCode = response.getStatusLine().getStatusCode();

        return client.execute(httpPost);
    }

    public void open() {
        client = HttpClients.createDefault();
    }

    public void close() {
        if (client != null) {
            try {
                client.close();
            } catch (Exception ex) {
                logger.error("Error closing client.");
            }
        }
    }

    public JAXBContext getRpcReplyContext() {
        if (rpcReplyContext == null) {
            try {
                rpcReplyContext = JAXBContext.newInstance(ObjectFactory.class);
            } catch (JAXBException e) {
                logger.error("Could not create RPCReply JAXBContext");
            }
        }

        return rpcReplyContext;
    }

    public void setRpcReplyContext(JAXBContext rpcReplyContext)
    {
        this.rpcReplyContext = rpcReplyContext;
    }

    public int getLastHTTPResponseCode() {
        return lastHTTPResponseCode;
    }

    public String getMessageVpn() {
        return messageVpn;
    }

    public void setMessageVpn(String messageVpn) {
        this.messageVpn = messageVpn;
    }
}
