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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routeEntryType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="routeEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="phy-interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeEntryType", propOrder = {

})
public class RouteEntryType {

    @XmlElement(name = "phy-interface")
    protected String phyInterface;
    protected String destination;
    protected String gateway;
    protected String mask;
    @XmlElement(name = "interface")
    protected String _interface;

    /**
     * Gets the value of the phyInterface property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPhyInterface() {
        return phyInterface;
    }

    /**
     * Sets the value of the phyInterface property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhyInterface(String value) {
        this.phyInterface = value;
    }

    /**
     * Gets the value of the destination property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the gateway property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGateway(String value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the mask property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the interface property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInterface(String value) {
        this._interface = value;
    }

}
