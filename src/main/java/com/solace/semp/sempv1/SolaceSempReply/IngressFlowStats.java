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
 * <p>Java class for ingress-flow-stats complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ingress-flow-stats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flow-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flow-id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="publisher-id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="spooling-not-ready" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="out-of-order-messages-received" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="duplicate-messages-received" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="no-eligible-destinations" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="spool-over-quota" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="qendpt-over-quota" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="local-message-count-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="max-msg-size-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="remote-router-spooling-not-supported" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="spool-to-adb-fail" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="spool-to-disk-fail" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="spool-file-limit-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="downstream-quota-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="errored-message" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="queue-not-found" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="spool-shutdown" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="user-profile-deny-guaranteed" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="no-local-delivery" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="smf-ttl-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="publish-acl-denied" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="destination-group-error" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="not-compatible-with-forwarding-mode" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="low-priority-msg-congestion-discard" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="replication-is-standby-discard" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="sync-replication-ineligible-discard" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="last-message-id-sent" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="window-size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="guaranteed-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="sequenced-topic-matches" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="seq-num-already-assigned" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="seq-num-rollover" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="seq-num-messages-discarded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="transacted-messages-not-sequenced" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingress-flow-stats", propOrder = {
        "flowName",
        "flowId",
        "publisherId",
        "spoolingNotReady",
        "outOfOrderMessagesReceived",
        "duplicateMessagesReceived",
        "noEligibleDestinations",
        "spoolOverQuota",
        "qendptOverQuota",
        "localMessageCountExceeded",
        "maxMsgSizeExceeded",
        "remoteRouterSpoolingNotSupported",
        "spoolToAdbFail",
        "spoolToDiskFail",
        "spoolFileLimitExceeded",
        "downstreamQuotaExceeded",
        "erroredMessage",
        "queueNotFound",
        "spoolShutdown",
        "userProfileDenyGuaranteed",
        "noLocalDelivery",
        "smfTtlExceeded",
        "publishAclDenied",
        "destinationGroupError",
        "notCompatibleWithForwardingMode",
        "lowPriorityMsgCongestionDiscard",
        "replicationIsStandbyDiscard",
        "syncReplicationIneligibleDiscard",
        "lastMessageIdSent",
        "windowSize",
        "guaranteedMessages",
        "sequencedTopicMatches",
        "seqNumAlreadyAssigned",
        "seqNumRollover",
        "seqNumMessagesDiscarded",
        "transactedMessagesNotSequenced"
})
public class IngressFlowStats {

    @XmlElement(name = "flow-name")
    protected String flowName;
    @XmlElement(name = "flow-id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long flowId;
    @XmlElement(name = "publisher-id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long publisherId;
    @XmlElement(name = "spooling-not-ready")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolingNotReady;
    @XmlElement(name = "out-of-order-messages-received")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger outOfOrderMessagesReceived;
    @XmlElement(name = "duplicate-messages-received")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger duplicateMessagesReceived;
    @XmlElement(name = "no-eligible-destinations")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noEligibleDestinations;
    @XmlElement(name = "spool-over-quota")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolOverQuota;
    @XmlElement(name = "qendpt-over-quota")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger qendptOverQuota;
    @XmlElement(name = "local-message-count-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger localMessageCountExceeded;
    @XmlElement(name = "max-msg-size-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger maxMsgSizeExceeded;
    @XmlElement(name = "remote-router-spooling-not-supported")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger remoteRouterSpoolingNotSupported;
    @XmlElement(name = "spool-to-adb-fail")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolToAdbFail;
    @XmlElement(name = "spool-to-disk-fail")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolToDiskFail;
    @XmlElement(name = "spool-file-limit-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolFileLimitExceeded;
    @XmlElement(name = "downstream-quota-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger downstreamQuotaExceeded;
    @XmlElement(name = "errored-message")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger erroredMessage;
    @XmlElement(name = "queue-not-found")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger queueNotFound;
    @XmlElement(name = "spool-shutdown")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spoolShutdown;
    @XmlElement(name = "user-profile-deny-guaranteed")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger userProfileDenyGuaranteed;
    @XmlElement(name = "no-local-delivery")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger noLocalDelivery;
    @XmlElement(name = "smf-ttl-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger smfTtlExceeded;
    @XmlElement(name = "publish-acl-denied")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger publishAclDenied;
    @XmlElement(name = "destination-group-error")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger destinationGroupError;
    @XmlElement(name = "not-compatible-with-forwarding-mode")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger notCompatibleWithForwardingMode;
    @XmlElement(name = "low-priority-msg-congestion-discard")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lowPriorityMsgCongestionDiscard;
    @XmlElement(name = "replication-is-standby-discard")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger replicationIsStandbyDiscard;
    @XmlElement(name = "sync-replication-ineligible-discard")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger syncReplicationIneligibleDiscard;
    @XmlElement(name = "last-message-id-sent")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lastMessageIdSent;
    @XmlElement(name = "window-size")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger windowSize;
    @XmlElement(name = "guaranteed-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger guaranteedMessages;
    @XmlElement(name = "sequenced-topic-matches")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequencedTopicMatches;
    @XmlElement(name = "seq-num-already-assigned")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger seqNumAlreadyAssigned;
    @XmlElement(name = "seq-num-rollover")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger seqNumRollover;
    @XmlElement(name = "seq-num-messages-discarded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger seqNumMessagesDiscarded;
    @XmlElement(name = "transacted-messages-not-sequenced")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transactedMessagesNotSequenced;

    /**
     * Gets the value of the flowName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlowName() {
        return flowName;
    }

    /**
     * Sets the value of the flowName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlowName(String value) {
        this.flowName = value;
    }

    /**
     * Gets the value of the flowId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getFlowId() {
        return flowId;
    }

    /**
     * Sets the value of the flowId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFlowId(Long value) {
        this.flowId = value;
    }

    /**
     * Gets the value of the publisherId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPublisherId(Long value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the spoolingNotReady property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSpoolingNotReady() {
        return spoolingNotReady;
    }

    /**
     * Sets the value of the spoolingNotReady property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSpoolingNotReady(BigInteger value) {
        this.spoolingNotReady = value;
    }

    /**
     * Gets the value of the outOfOrderMessagesReceived property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getOutOfOrderMessagesReceived() {
        return outOfOrderMessagesReceived;
    }

    /**
     * Sets the value of the outOfOrderMessagesReceived property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setOutOfOrderMessagesReceived(BigInteger value) {
        this.outOfOrderMessagesReceived = value;
    }

    /**
     * Gets the value of the duplicateMessagesReceived property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDuplicateMessagesReceived() {
        return duplicateMessagesReceived;
    }

    /**
     * Sets the value of the duplicateMessagesReceived property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDuplicateMessagesReceived(BigInteger value) {
        this.duplicateMessagesReceived = value;
    }

    /**
     * Gets the value of the noEligibleDestinations property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNoEligibleDestinations() {
        return noEligibleDestinations;
    }

    /**
     * Sets the value of the noEligibleDestinations property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNoEligibleDestinations(BigInteger value) {
        this.noEligibleDestinations = value;
    }

    /**
     * Gets the value of the spoolOverQuota property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSpoolOverQuota() {
        return spoolOverQuota;
    }

    /**
     * Sets the value of the spoolOverQuota property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSpoolOverQuota(BigInteger value) {
        this.spoolOverQuota = value;
    }

    /**
     * Gets the value of the qendptOverQuota property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQendptOverQuota() {
        return qendptOverQuota;
    }

    /**
     * Sets the value of the qendptOverQuota property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQendptOverQuota(BigInteger value) {
        this.qendptOverQuota = value;
    }

    /**
     * Gets the value of the localMessageCountExceeded property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLocalMessageCountExceeded() {
        return localMessageCountExceeded;
    }

    /**
     * Sets the value of the localMessageCountExceeded property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLocalMessageCountExceeded(BigInteger value) {
        this.localMessageCountExceeded = value;
    }

    /**
     * Gets the value of the maxMsgSizeExceeded property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMaxMsgSizeExceeded() {
        return maxMsgSizeExceeded;
    }

    /**
     * Sets the value of the maxMsgSizeExceeded property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMaxMsgSizeExceeded(BigInteger value) {
        this.maxMsgSizeExceeded = value;
    }

    /**
     * Gets the value of the remoteRouterSpoolingNotSupported property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getRemoteRouterSpoolingNotSupported() {
        return remoteRouterSpoolingNotSupported;
    }

    /**
     * Sets the value of the remoteRouterSpoolingNotSupported property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setRemoteRouterSpoolingNotSupported(BigInteger value) {
        this.remoteRouterSpoolingNotSupported = value;
    }

    /**
     * Gets the value of the spoolToAdbFail property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSpoolToAdbFail() {
        return spoolToAdbFail;
    }

    /**
     * Sets the value of the spoolToAdbFail property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSpoolToAdbFail(BigInteger value) {
        this.spoolToAdbFail = value;
    }

    /**
     * Gets the value of the spoolToDiskFail property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSpoolToDiskFail() {
        return spoolToDiskFail;
    }

    /**
     * Sets the value of the spoolToDiskFail property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSpoolToDiskFail(BigInteger value) {
        this.spoolToDiskFail = value;
    }

    /**
     * Gets the value of the spoolFileLimitExceeded property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSpoolFileLimitExceeded() {
        return spoolFileLimitExceeded;
    }

    /**
     * Sets the value of the spoolFileLimitExceeded property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSpoolFileLimitExceeded(BigInteger value) {
        this.spoolFileLimitExceeded = value;
    }

    /**
     * Gets the value of the downstreamQuotaExceeded property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDownstreamQuotaExceeded() {
        return downstreamQuotaExceeded;
    }

    /**
     * Sets the value of the downstreamQuotaExceeded property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDownstreamQuotaExceeded(BigInteger value) {
        this.downstreamQuotaExceeded = value;
    }

    /**
     * Gets the value of the erroredMessage property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getErroredMessage() {
        return erroredMessage;
    }

    /**
     * Sets the value of the erroredMessage property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setErroredMessage(BigInteger value) {
        this.erroredMessage = value;
    }

    /**
     * Gets the value of the queueNotFound property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQueueNotFound() {
        return queueNotFound;
    }

    /**
     * Sets the value of the queueNotFound property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQueueNotFound(BigInteger value) {
        this.queueNotFound = value;
    }

    /**
     * Gets the value of the spoolShutdown property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSpoolShutdown() {
        return spoolShutdown;
    }

    /**
     * Sets the value of the spoolShutdown property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSpoolShutdown(BigInteger value) {
        this.spoolShutdown = value;
    }

    /**
     * Gets the value of the userProfileDenyGuaranteed property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getUserProfileDenyGuaranteed() {
        return userProfileDenyGuaranteed;
    }

    /**
     * Sets the value of the userProfileDenyGuaranteed property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setUserProfileDenyGuaranteed(BigInteger value) {
        this.userProfileDenyGuaranteed = value;
    }

    /**
     * Gets the value of the noLocalDelivery property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNoLocalDelivery() {
        return noLocalDelivery;
    }

    /**
     * Sets the value of the noLocalDelivery property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNoLocalDelivery(BigInteger value) {
        this.noLocalDelivery = value;
    }

    /**
     * Gets the value of the smfTtlExceeded property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSmfTtlExceeded() {
        return smfTtlExceeded;
    }

    /**
     * Sets the value of the smfTtlExceeded property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSmfTtlExceeded(BigInteger value) {
        this.smfTtlExceeded = value;
    }

    /**
     * Gets the value of the publishAclDenied property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPublishAclDenied() {
        return publishAclDenied;
    }

    /**
     * Sets the value of the publishAclDenied property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPublishAclDenied(BigInteger value) {
        this.publishAclDenied = value;
    }

    /**
     * Gets the value of the destinationGroupError property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDestinationGroupError() {
        return destinationGroupError;
    }

    /**
     * Sets the value of the destinationGroupError property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDestinationGroupError(BigInteger value) {
        this.destinationGroupError = value;
    }

    /**
     * Gets the value of the notCompatibleWithForwardingMode property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNotCompatibleWithForwardingMode() {
        return notCompatibleWithForwardingMode;
    }

    /**
     * Sets the value of the notCompatibleWithForwardingMode property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNotCompatibleWithForwardingMode(BigInteger value) {
        this.notCompatibleWithForwardingMode = value;
    }

    /**
     * Gets the value of the lowPriorityMsgCongestionDiscard property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLowPriorityMsgCongestionDiscard() {
        return lowPriorityMsgCongestionDiscard;
    }

    /**
     * Sets the value of the lowPriorityMsgCongestionDiscard property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLowPriorityMsgCongestionDiscard(BigInteger value) {
        this.lowPriorityMsgCongestionDiscard = value;
    }

    /**
     * Gets the value of the replicationIsStandbyDiscard property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getReplicationIsStandbyDiscard() {
        return replicationIsStandbyDiscard;
    }

    /**
     * Sets the value of the replicationIsStandbyDiscard property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setReplicationIsStandbyDiscard(BigInteger value) {
        this.replicationIsStandbyDiscard = value;
    }

    /**
     * Gets the value of the syncReplicationIneligibleDiscard property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSyncReplicationIneligibleDiscard() {
        return syncReplicationIneligibleDiscard;
    }

    /**
     * Sets the value of the syncReplicationIneligibleDiscard property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSyncReplicationIneligibleDiscard(BigInteger value) {
        this.syncReplicationIneligibleDiscard = value;
    }

    /**
     * Gets the value of the lastMessageIdSent property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLastMessageIdSent() {
        return lastMessageIdSent;
    }

    /**
     * Sets the value of the lastMessageIdSent property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLastMessageIdSent(BigInteger value) {
        this.lastMessageIdSent = value;
    }

    /**
     * Gets the value of the windowSize property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setWindowSize(BigInteger value) {
        this.windowSize = value;
    }

    /**
     * Gets the value of the guaranteedMessages property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getGuaranteedMessages() {
        return guaranteedMessages;
    }

    /**
     * Sets the value of the guaranteedMessages property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setGuaranteedMessages(BigInteger value) {
        this.guaranteedMessages = value;
    }

    /**
     * Gets the value of the sequencedTopicMatches property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSequencedTopicMatches() {
        return sequencedTopicMatches;
    }

    /**
     * Sets the value of the sequencedTopicMatches property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSequencedTopicMatches(BigInteger value) {
        this.sequencedTopicMatches = value;
    }

    /**
     * Gets the value of the seqNumAlreadyAssigned property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSeqNumAlreadyAssigned() {
        return seqNumAlreadyAssigned;
    }

    /**
     * Sets the value of the seqNumAlreadyAssigned property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSeqNumAlreadyAssigned(BigInteger value) {
        this.seqNumAlreadyAssigned = value;
    }

    /**
     * Gets the value of the seqNumRollover property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSeqNumRollover() {
        return seqNumRollover;
    }

    /**
     * Sets the value of the seqNumRollover property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSeqNumRollover(BigInteger value) {
        this.seqNumRollover = value;
    }

    /**
     * Gets the value of the seqNumMessagesDiscarded property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSeqNumMessagesDiscarded() {
        return seqNumMessagesDiscarded;
    }

    /**
     * Sets the value of the seqNumMessagesDiscarded property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSeqNumMessagesDiscarded(BigInteger value) {
        this.seqNumMessagesDiscarded = value;
    }

    /**
     * Gets the value of the transactedMessagesNotSequenced property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getTransactedMessagesNotSequenced() {
        return transactedMessagesNotSequenced;
    }

    /**
     * Sets the value of the transactedMessagesNotSequenced property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setTransactedMessagesNotSequenced(BigInteger value) {
        this.transactedMessagesNotSequenced = value;
    }

}
