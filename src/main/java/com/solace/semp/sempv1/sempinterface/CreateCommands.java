package com.solace.semp.sempv1.sempinterface;

import com.solace.semp.sempv1.SolaceSempReply.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Component
public class CreateCommands {

    @Autowired
    private Session session;

    private static final Logger logger = LoggerFactory.getLogger(CreateCommands.class);

    private JAXBContext jaxbContext;

    public CreateCommands(){

    }

}
