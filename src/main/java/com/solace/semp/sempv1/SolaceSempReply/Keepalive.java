//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.semp.sempv1.SolaceSempReply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keepalive complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="keepalive">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="idle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keepalive", propOrder = {

})
public class Keepalive {

    @XmlSchemaType(name = "unsignedInt")
    protected long count;
    @XmlSchemaType(name = "unsignedInt")
    protected long idle;
    @XmlSchemaType(name = "unsignedInt")
    protected long interval;

    /**
     * Gets the value of the count property.
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the idle property.
     */
    public long getIdle() {
        return idle;
    }

    /**
     * Sets the value of the idle property.
     */
    public void setIdle(long value) {
        this.idle = value;
    }

    /**
     * Gets the value of the interval property.
     */
    public long getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     */
    public void setInterval(long value) {
        this.interval = value;
    }

}
