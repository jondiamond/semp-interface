//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.semp.sempv1.SolaceSempReply;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replayLogType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="replayLogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message-vpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messages-logged" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="log-usage-mb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quota-mb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ingress-config-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="egress-config-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spooled-messages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="spooled-message" type="{}spooled-message" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replayLogType", propOrder = {
        "name",
        "messageVpn",
        "messagesLogged",
        "logUsageMb",
        "quotaMb",
        "ingressConfigStatus",
        "egressConfigStatus",
        "spooledMessages"
})
public class ReplayLogType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "message-vpn")
    protected String messageVpn;
    @XmlElement(name = "messages-logged")
    @XmlSchemaType(name = "unsignedInt")
    protected Long messagesLogged;
    @XmlElement(name = "log-usage-mb")
    protected Double logUsageMb;
    @XmlElement(name = "quota-mb")
    @XmlSchemaType(name = "unsignedInt")
    protected Long quotaMb;
    @XmlElement(name = "ingress-config-status")
    protected String ingressConfigStatus;
    @XmlElement(name = "egress-config-status")
    protected String egressConfigStatus;
    @XmlElement(name = "spooled-messages")
    protected ReplayLogType.SpooledMessages spooledMessages;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the messageVpn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessageVpn() {
        return messageVpn;
    }

    /**
     * Sets the value of the messageVpn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessageVpn(String value) {
        this.messageVpn = value;
    }

    /**
     * Gets the value of the messagesLogged property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMessagesLogged() {
        return messagesLogged;
    }

    /**
     * Sets the value of the messagesLogged property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMessagesLogged(Long value) {
        this.messagesLogged = value;
    }

    /**
     * Gets the value of the logUsageMb property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLogUsageMb() {
        return logUsageMb;
    }

    /**
     * Sets the value of the logUsageMb property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setLogUsageMb(Double value) {
        this.logUsageMb = value;
    }

    /**
     * Gets the value of the quotaMb property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getQuotaMb() {
        return quotaMb;
    }

    /**
     * Sets the value of the quotaMb property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setQuotaMb(Long value) {
        this.quotaMb = value;
    }

    /**
     * Gets the value of the ingressConfigStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIngressConfigStatus() {
        return ingressConfigStatus;
    }

    /**
     * Sets the value of the ingressConfigStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIngressConfigStatus(String value) {
        this.ingressConfigStatus = value;
    }

    /**
     * Gets the value of the egressConfigStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEgressConfigStatus() {
        return egressConfigStatus;
    }

    /**
     * Sets the value of the egressConfigStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEgressConfigStatus(String value) {
        this.egressConfigStatus = value;
    }

    /**
     * Gets the value of the spooledMessages property.
     *
     * @return possible object is
     * {@link ReplayLogType.SpooledMessages }
     */
    public ReplayLogType.SpooledMessages getSpooledMessages() {
        return spooledMessages;
    }

    /**
     * Sets the value of the spooledMessages property.
     *
     * @param value allowed object is
     *              {@link ReplayLogType.SpooledMessages }
     */
    public void setSpooledMessages(ReplayLogType.SpooledMessages value) {
        this.spooledMessages = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="spooled-message" type="{}spooled-message" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "spooledMessage"
    })
    public static class SpooledMessages {

        @XmlElement(name = "spooled-message")
        protected List<SpooledMessage> spooledMessage;

        /**
         * Gets the value of the spooledMessage property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spooledMessage property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpooledMessage().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpooledMessage }
         */
        public List<SpooledMessage> getSpooledMessage() {
            if (spooledMessage == null) {
                spooledMessage = new ArrayList<SpooledMessage>();
            }
            return this.spooledMessage;
        }

    }

}
