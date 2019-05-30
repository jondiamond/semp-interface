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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for acl-exception-configuration complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="acl-exception-configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="allow-default-action" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="num-exceptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="exceptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="exception">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acl-exception-configuration", propOrder = {

})
public class AclExceptionConfiguration {

    @XmlElement(name = "allow-default-action")
    protected boolean allowDefaultAction;
    @XmlElement(name = "num-exceptions")
    protected Integer numExceptions;
    protected AclExceptionConfiguration.Exceptions exceptions;

    /**
     * Gets the value of the allowDefaultAction property.
     */
    public boolean isAllowDefaultAction() {
        return allowDefaultAction;
    }

    /**
     * Sets the value of the allowDefaultAction property.
     */
    public void setAllowDefaultAction(boolean value) {
        this.allowDefaultAction = value;
    }

    /**
     * Gets the value of the numExceptions property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getNumExceptions() {
        return numExceptions;
    }

    /**
     * Sets the value of the numExceptions property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setNumExceptions(Integer value) {
        this.numExceptions = value;
    }

    /**
     * Gets the value of the exceptions property.
     *
     * @return possible object is
     * {@link AclExceptionConfiguration.Exceptions }
     */
    public AclExceptionConfiguration.Exceptions getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     *
     * @param value allowed object is
     *              {@link AclExceptionConfiguration.Exceptions }
     */
    public void setExceptions(AclExceptionConfiguration.Exceptions value) {
        this.exceptions = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="exception">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "exception"
    })
    public static class Exceptions {

        protected List<AclExceptionConfiguration.Exceptions.Exception> exception;

        /**
         * Gets the value of the exception property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exception property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getException().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AclExceptionConfiguration.Exceptions.Exception }
         */
        public List<AclExceptionConfiguration.Exceptions.Exception> getException() {
            if (exception == null) {
                exception = new ArrayList<AclExceptionConfiguration.Exceptions.Exception>();
            }
            return this.exception;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Exception {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
