//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.semp.sempv1.SolaceSempReply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for group-nodeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="group-nodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="router-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="node-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip-address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="first-port" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group-nodeType", propOrder = {
        "routerName",
        "nodeType",
        "ipAddress",
        "firstPort",
        "status"
})
public class GroupNodeType {

    @XmlElement(name = "router-name", required = true)
    protected String routerName;
    @XmlElement(name = "node-type", required = true)
    protected String nodeType;
    @XmlElement(name = "ip-address", required = true)
    protected String ipAddress;
    @XmlElement(name = "first-port")
    @XmlSchemaType(name = "unsignedInt")
    protected Long firstPort;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the routerName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRouterName() {
        return routerName;
    }

    /**
     * Sets the value of the routerName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRouterName(String value) {
        this.routerName = value;
    }

    /**
     * Gets the value of the nodeType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNodeType(String value) {
        this.nodeType = value;
    }

    /**
     * Gets the value of the ipAddress property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the firstPort property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getFirstPort() {
        return firstPort;
    }

    /**
     * Sets the value of the firstPort property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFirstPort(Long value) {
        this.firstPort = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
