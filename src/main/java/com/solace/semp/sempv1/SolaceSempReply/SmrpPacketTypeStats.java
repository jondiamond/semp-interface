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
 * <p>Java class for smrpPacketTypeStats complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="smrpPacketTypeStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="packets-rx" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bytes-rx" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="packets-tx" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bytes-tx" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smrpPacketTypeStats", propOrder = {

})
public class SmrpPacketTypeStats {

    @XmlElement(name = "packets-rx")
    protected long packetsRx;
    @XmlElement(name = "bytes-rx")
    protected long bytesRx;
    @XmlElement(name = "packets-tx")
    protected long packetsTx;
    @XmlElement(name = "bytes-tx")
    protected long bytesTx;

    /**
     * Gets the value of the packetsRx property.
     */
    public long getPacketsRx() {
        return packetsRx;
    }

    /**
     * Sets the value of the packetsRx property.
     */
    public void setPacketsRx(long value) {
        this.packetsRx = value;
    }

    /**
     * Gets the value of the bytesRx property.
     */
    public long getBytesRx() {
        return bytesRx;
    }

    /**
     * Sets the value of the bytesRx property.
     */
    public void setBytesRx(long value) {
        this.bytesRx = value;
    }

    /**
     * Gets the value of the packetsTx property.
     */
    public long getPacketsTx() {
        return packetsTx;
    }

    /**
     * Sets the value of the packetsTx property.
     */
    public void setPacketsTx(long value) {
        this.packetsTx = value;
    }

    /**
     * Gets the value of the bytesTx property.
     */
    public long getBytesTx() {
        return bytesTx;
    }

    /**
     * Sets the value of the bytesTx property.
     */
    public void setBytesTx(long value) {
        this.bytesTx = value;
    }

}
