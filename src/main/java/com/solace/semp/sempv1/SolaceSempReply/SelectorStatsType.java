//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.semp.sempv1.SolaceSempReply;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selector-stats-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="selector-stats-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="last-message-id-examined" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="messages-selector-matched" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="messages-selector-did-not-match" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="total-messages-examined" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selector-stats-type", propOrder = {
        "lastMessageIdExamined",
        "messagesSelectorMatched",
        "messagesSelectorDidNotMatch",
        "totalMessagesExamined"
})
public class SelectorStatsType {

    @XmlElement(name = "last-message-id-examined", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lastMessageIdExamined;
    @XmlElement(name = "messages-selector-matched", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger messagesSelectorMatched;
    @XmlElement(name = "messages-selector-did-not-match", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger messagesSelectorDidNotMatch;
    @XmlElement(name = "total-messages-examined", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalMessagesExamined;

    /**
     * Gets the value of the lastMessageIdExamined property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLastMessageIdExamined() {
        return lastMessageIdExamined;
    }

    /**
     * Sets the value of the lastMessageIdExamined property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLastMessageIdExamined(BigInteger value) {
        this.lastMessageIdExamined = value;
    }

    /**
     * Gets the value of the messagesSelectorMatched property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMessagesSelectorMatched() {
        return messagesSelectorMatched;
    }

    /**
     * Sets the value of the messagesSelectorMatched property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMessagesSelectorMatched(BigInteger value) {
        this.messagesSelectorMatched = value;
    }

    /**
     * Gets the value of the messagesSelectorDidNotMatch property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMessagesSelectorDidNotMatch() {
        return messagesSelectorDidNotMatch;
    }

    /**
     * Sets the value of the messagesSelectorDidNotMatch property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMessagesSelectorDidNotMatch(BigInteger value) {
        this.messagesSelectorDidNotMatch = value;
    }

    /**
     * Gets the value of the totalMessagesExamined property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getTotalMessagesExamined() {
        return totalMessagesExamined;
    }

    /**
     * Sets the value of the totalMessagesExamined property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setTotalMessagesExamined(BigInteger value) {
        this.totalMessagesExamined = value;
    }

}
