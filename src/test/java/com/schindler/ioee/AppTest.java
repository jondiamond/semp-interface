package com.schindler.ioee;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.solace.semp.sempv1.sempinterface.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

@SpringBootTest(classes = {
        ShowCommands.class,
        ConfigureCommands.class,
        Session.class
})
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration
public class AppTest
{
    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Autowired
    Session session;

    @Autowired
    ShowCommands showCommands;

    @Autowired
    ConfigureCommands configureCommands;

    String messageVpn = "default";

    @Before
    public void setupSession()
    {
        // These tests assume the following
        //      the broker SEMP interface is running on localhost:8080
        //      the username and passwords are admin
        //
        //      the vpn is default
        //
        //
        // to override this uncomment and change the lines below

        session.setSolaceSEMPURI("http://localhost:8080/SEMP");
        session.setSolaceSEMPUsername("admin");
        session.setSolaceSEMPPassword("admin");
        session.setMessageVpn("default");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void canOpenCloseSession()
    {
        Session session = new Session();

        openSession(session);
        closeSession(session);

        logger.info("Session opened and closed successfully");
    }

    @Test
    public void canExecuteShowSMRPSubscriptions()
    {
        HashMap<Integer, com.solace.semp.sempv1.SolaceSempReply.RpcReply.Rpc.Show.Smrp.Subscriptions.Subscription> subscriptionHashMap = null;

        try {
            subscriptionHashMap = showCommands.getCurrentSubscriptions();
        } catch (Exception e) {
            Assert.fail("Error executing show smrp subscriptions " + e.getMessage());
        }

        if(session.getLastHTTPResponseCode() != 200) {
            Assert.fail("show smrp subscriptions returned an unexpected response code " + session.getLastHTTPResponseCode() + ".");
        } else {
            logger.info("successfully ran show smrp subscriptions, retuning " + subscriptionHashMap.size() + " subscriptions.");
        }
    }

    @Test
    public void canConfigureClientSubscriptions()
    {
        try {
            configureCommands.configureSubscriptionEvents();
        } catch (Exception e) {
            Assert.fail("Error executing show smrp subscriptions " + e.getMessage());
        }

        if(session.getLastHTTPResponseCode() != 200) {
            Assert.fail("configure subscription events returned an unexpected response code " + session.getLastHTTPResponseCode() + ".");
        } else {
            logger.info("successfully configured client subscription events.");
        }
    }

    private void openSession(Session session)
    {
        try {
            session.open();

        }
        catch (Exception e) {
            Assert.fail("Exception opening session " + e.getMessage());
        }
    }

    private void closeSession(Session session)
    {
        try {
            session.close();

        }
        catch (Exception e) {
            Assert.fail("Exception closing session " + e.getMessage());
        }
    }
}
