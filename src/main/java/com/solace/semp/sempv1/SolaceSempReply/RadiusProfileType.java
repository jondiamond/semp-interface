//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.semp.sempv1.SolaceSempReply;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for radius-profile-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="radius-profile-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profile-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shutdown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retransmit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="radius-server" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ip-port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last-reply-message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="requests-accepted" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                   &lt;element name="requests-rejected" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                   &lt;element name="timeouts" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                   &lt;element name="server-unavailable" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                   &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="radius-server-v2" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ip-port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "radius-profile-type", propOrder = {
        "profileName",
        "shutdown",
        "retransmit",
        "timeout",
        "radiusServer",
        "radiusServerV2"
})
public class RadiusProfileType {

    @XmlElement(name = "profile-name")
    protected String profileName;
    protected String shutdown;
    protected Integer retransmit;
    protected Integer timeout;
    @XmlElement(name = "radius-server")
    protected List<RadiusProfileType.RadiusServer> radiusServer;
    @XmlElement(name = "radius-server-v2")
    protected List<RadiusProfileType.RadiusServerV2> radiusServerV2;

    /**
     * Gets the value of the profileName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the shutdown property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getShutdown() {
        return shutdown;
    }

    /**
     * Sets the value of the shutdown property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShutdown(String value) {
        this.shutdown = value;
    }

    /**
     * Gets the value of the retransmit property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRetransmit() {
        return retransmit;
    }

    /**
     * Sets the value of the retransmit property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRetransmit(Integer value) {
        this.retransmit = value;
    }

    /**
     * Gets the value of the timeout property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the radiusServer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radiusServer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadiusServer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadiusProfileType.RadiusServer }
     */
    public List<RadiusProfileType.RadiusServer> getRadiusServer() {
        if (radiusServer == null) {
            radiusServer = new ArrayList<RadiusProfileType.RadiusServer>();
        }
        return this.radiusServer;
    }

    /**
     * Gets the value of the radiusServerV2 property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radiusServerV2 property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadiusServerV2().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadiusProfileType.RadiusServerV2 }
     */
    public List<RadiusProfileType.RadiusServerV2> getRadiusServerV2() {
        if (radiusServerV2 == null) {
            radiusServerV2 = new ArrayList<RadiusProfileType.RadiusServerV2>();
        }
        return this.radiusServerV2;
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
     *       &lt;all>
     *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ip-port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last-reply-message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="requests-accepted" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *         &lt;element name="requests-rejected" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *         &lt;element name="timeouts" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *         &lt;element name="server-unavailable" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *         &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class RadiusServer {

        protected Integer index;
        @XmlElement(name = "ip-port")
        protected String ipPort;
        @XmlElement(name = "last-reply-message")
        protected String lastReplyMessage;
        @XmlElement(name = "requests-accepted")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger requestsAccepted;
        @XmlElement(name = "requests-rejected")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger requestsRejected;
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger timeouts;
        @XmlElement(name = "server-unavailable")
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger serverUnavailable;
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger errors;

        /**
         * Gets the value of the index property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setIndex(Integer value) {
            this.index = value;
        }

        /**
         * Gets the value of the ipPort property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIpPort() {
            return ipPort;
        }

        /**
         * Sets the value of the ipPort property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIpPort(String value) {
            this.ipPort = value;
        }

        /**
         * Gets the value of the lastReplyMessage property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getLastReplyMessage() {
            return lastReplyMessage;
        }

        /**
         * Sets the value of the lastReplyMessage property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLastReplyMessage(String value) {
            this.lastReplyMessage = value;
        }

        /**
         * Gets the value of the requestsAccepted property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getRequestsAccepted() {
            return requestsAccepted;
        }

        /**
         * Sets the value of the requestsAccepted property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setRequestsAccepted(BigInteger value) {
            this.requestsAccepted = value;
        }

        /**
         * Gets the value of the requestsRejected property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getRequestsRejected() {
            return requestsRejected;
        }

        /**
         * Sets the value of the requestsRejected property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setRequestsRejected(BigInteger value) {
            this.requestsRejected = value;
        }

        /**
         * Gets the value of the timeouts property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getTimeouts() {
            return timeouts;
        }

        /**
         * Sets the value of the timeouts property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setTimeouts(BigInteger value) {
            this.timeouts = value;
        }

        /**
         * Gets the value of the serverUnavailable property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getServerUnavailable() {
            return serverUnavailable;
        }

        /**
         * Sets the value of the serverUnavailable property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setServerUnavailable(BigInteger value) {
            this.serverUnavailable = value;
        }

        /**
         * Gets the value of the errors property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getErrors() {
            return errors;
        }

        /**
         * Sets the value of the errors property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setErrors(BigInteger value) {
            this.errors = value;
        }

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
     *       &lt;all>
     *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ip-port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class RadiusServerV2 {

        protected Integer index;
        @XmlElement(name = "ip-port")
        protected String ipPort;

        /**
         * Gets the value of the index property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setIndex(Integer value) {
            this.index = value;
        }

        /**
         * Gets the value of the ipPort property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIpPort() {
            return ipPort;
        }

        /**
         * Sets the value of the ipPort property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIpPort(String value) {
            this.ipPort = value;
        }

    }

}
