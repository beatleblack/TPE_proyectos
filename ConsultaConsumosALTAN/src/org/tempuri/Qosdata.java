/**
 * Qosdata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Qosdata  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String vpnId;

    private java.lang.String name;

    private java.lang.String priority;

    private boolean bandwidthEnable;

    private java.lang.String bandwidthType;

    private java.lang.String bandwidthValuetype;

    private java.lang.String bandwidthValue;

    private boolean limimEnable;

    private java.lang.String limitType;

    private java.lang.String limitValuetype;

    private java.lang.String limitValue;

    private boolean markdscpEnable;

    private java.lang.String dscp;

    private boolean markdscpInnerEnable;

    private java.lang.String dscpInner;

    private boolean lanEnable;

    private boolean wanEnable;

    private boolean enableStatistic;

    private boolean enableLanStatistic;

    private boolean enableRemark8021P;

    private int remark8021PValue;

    private boolean enableQueueLength;

    private java.lang.Object queueByteLength;

    private java.lang.Object queuePacketLength;

    private int status;

    private boolean isActive;

    private java.lang.String policyType;

    private java.lang.Object deviceId;

    private java.lang.Object interfaceId;

    private java.lang.Object interfaceName;

    private java.lang.Object siteId;

    public Qosdata() {
    }

    public Qosdata(
           java.lang.String id,
           java.lang.String vpnId,
           java.lang.String name,
           java.lang.String priority,
           boolean bandwidthEnable,
           java.lang.String bandwidthType,
           java.lang.String bandwidthValuetype,
           java.lang.String bandwidthValue,
           boolean limimEnable,
           java.lang.String limitType,
           java.lang.String limitValuetype,
           java.lang.String limitValue,
           boolean markdscpEnable,
           java.lang.String dscp,
           boolean markdscpInnerEnable,
           java.lang.String dscpInner,
           boolean lanEnable,
           boolean wanEnable,
           boolean enableStatistic,
           boolean enableLanStatistic,
           boolean enableRemark8021P,
           int remark8021PValue,
           boolean enableQueueLength,
           java.lang.Object queueByteLength,
           java.lang.Object queuePacketLength,
           int status,
           boolean isActive,
           java.lang.String policyType,
           java.lang.Object deviceId,
           java.lang.Object interfaceId,
           java.lang.Object interfaceName,
           java.lang.Object siteId) {
           this.id = id;
           this.vpnId = vpnId;
           this.name = name;
           this.priority = priority;
           this.bandwidthEnable = bandwidthEnable;
           this.bandwidthType = bandwidthType;
           this.bandwidthValuetype = bandwidthValuetype;
           this.bandwidthValue = bandwidthValue;
           this.limimEnable = limimEnable;
           this.limitType = limitType;
           this.limitValuetype = limitValuetype;
           this.limitValue = limitValue;
           this.markdscpEnable = markdscpEnable;
           this.dscp = dscp;
           this.markdscpInnerEnable = markdscpInnerEnable;
           this.dscpInner = dscpInner;
           this.lanEnable = lanEnable;
           this.wanEnable = wanEnable;
           this.enableStatistic = enableStatistic;
           this.enableLanStatistic = enableLanStatistic;
           this.enableRemark8021P = enableRemark8021P;
           this.remark8021PValue = remark8021PValue;
           this.enableQueueLength = enableQueueLength;
           this.queueByteLength = queueByteLength;
           this.queuePacketLength = queuePacketLength;
           this.status = status;
           this.isActive = isActive;
           this.policyType = policyType;
           this.deviceId = deviceId;
           this.interfaceId = interfaceId;
           this.interfaceName = interfaceName;
           this.siteId = siteId;
    }


    /**
     * Gets the id value for this Qosdata.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Qosdata.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the vpnId value for this Qosdata.
     * 
     * @return vpnId
     */
    public java.lang.String getVpnId() {
        return vpnId;
    }


    /**
     * Sets the vpnId value for this Qosdata.
     * 
     * @param vpnId
     */
    public void setVpnId(java.lang.String vpnId) {
        this.vpnId = vpnId;
    }


    /**
     * Gets the name value for this Qosdata.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Qosdata.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the priority value for this Qosdata.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Qosdata.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the bandwidthEnable value for this Qosdata.
     * 
     * @return bandwidthEnable
     */
    public boolean isBandwidthEnable() {
        return bandwidthEnable;
    }


    /**
     * Sets the bandwidthEnable value for this Qosdata.
     * 
     * @param bandwidthEnable
     */
    public void setBandwidthEnable(boolean bandwidthEnable) {
        this.bandwidthEnable = bandwidthEnable;
    }


    /**
     * Gets the bandwidthType value for this Qosdata.
     * 
     * @return bandwidthType
     */
    public java.lang.String getBandwidthType() {
        return bandwidthType;
    }


    /**
     * Sets the bandwidthType value for this Qosdata.
     * 
     * @param bandwidthType
     */
    public void setBandwidthType(java.lang.String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }


    /**
     * Gets the bandwidthValuetype value for this Qosdata.
     * 
     * @return bandwidthValuetype
     */
    public java.lang.String getBandwidthValuetype() {
        return bandwidthValuetype;
    }


    /**
     * Sets the bandwidthValuetype value for this Qosdata.
     * 
     * @param bandwidthValuetype
     */
    public void setBandwidthValuetype(java.lang.String bandwidthValuetype) {
        this.bandwidthValuetype = bandwidthValuetype;
    }


    /**
     * Gets the bandwidthValue value for this Qosdata.
     * 
     * @return bandwidthValue
     */
    public java.lang.String getBandwidthValue() {
        return bandwidthValue;
    }


    /**
     * Sets the bandwidthValue value for this Qosdata.
     * 
     * @param bandwidthValue
     */
    public void setBandwidthValue(java.lang.String bandwidthValue) {
        this.bandwidthValue = bandwidthValue;
    }


    /**
     * Gets the limimEnable value for this Qosdata.
     * 
     * @return limimEnable
     */
    public boolean isLimimEnable() {
        return limimEnable;
    }


    /**
     * Sets the limimEnable value for this Qosdata.
     * 
     * @param limimEnable
     */
    public void setLimimEnable(boolean limimEnable) {
        this.limimEnable = limimEnable;
    }


    /**
     * Gets the limitType value for this Qosdata.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this Qosdata.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the limitValuetype value for this Qosdata.
     * 
     * @return limitValuetype
     */
    public java.lang.String getLimitValuetype() {
        return limitValuetype;
    }


    /**
     * Sets the limitValuetype value for this Qosdata.
     * 
     * @param limitValuetype
     */
    public void setLimitValuetype(java.lang.String limitValuetype) {
        this.limitValuetype = limitValuetype;
    }


    /**
     * Gets the limitValue value for this Qosdata.
     * 
     * @return limitValue
     */
    public java.lang.String getLimitValue() {
        return limitValue;
    }


    /**
     * Sets the limitValue value for this Qosdata.
     * 
     * @param limitValue
     */
    public void setLimitValue(java.lang.String limitValue) {
        this.limitValue = limitValue;
    }


    /**
     * Gets the markdscpEnable value for this Qosdata.
     * 
     * @return markdscpEnable
     */
    public boolean isMarkdscpEnable() {
        return markdscpEnable;
    }


    /**
     * Sets the markdscpEnable value for this Qosdata.
     * 
     * @param markdscpEnable
     */
    public void setMarkdscpEnable(boolean markdscpEnable) {
        this.markdscpEnable = markdscpEnable;
    }


    /**
     * Gets the dscp value for this Qosdata.
     * 
     * @return dscp
     */
    public java.lang.String getDscp() {
        return dscp;
    }


    /**
     * Sets the dscp value for this Qosdata.
     * 
     * @param dscp
     */
    public void setDscp(java.lang.String dscp) {
        this.dscp = dscp;
    }


    /**
     * Gets the markdscpInnerEnable value for this Qosdata.
     * 
     * @return markdscpInnerEnable
     */
    public boolean isMarkdscpInnerEnable() {
        return markdscpInnerEnable;
    }


    /**
     * Sets the markdscpInnerEnable value for this Qosdata.
     * 
     * @param markdscpInnerEnable
     */
    public void setMarkdscpInnerEnable(boolean markdscpInnerEnable) {
        this.markdscpInnerEnable = markdscpInnerEnable;
    }


    /**
     * Gets the dscpInner value for this Qosdata.
     * 
     * @return dscpInner
     */
    public java.lang.String getDscpInner() {
        return dscpInner;
    }


    /**
     * Sets the dscpInner value for this Qosdata.
     * 
     * @param dscpInner
     */
    public void setDscpInner(java.lang.String dscpInner) {
        this.dscpInner = dscpInner;
    }


    /**
     * Gets the lanEnable value for this Qosdata.
     * 
     * @return lanEnable
     */
    public boolean isLanEnable() {
        return lanEnable;
    }


    /**
     * Sets the lanEnable value for this Qosdata.
     * 
     * @param lanEnable
     */
    public void setLanEnable(boolean lanEnable) {
        this.lanEnable = lanEnable;
    }


    /**
     * Gets the wanEnable value for this Qosdata.
     * 
     * @return wanEnable
     */
    public boolean isWanEnable() {
        return wanEnable;
    }


    /**
     * Sets the wanEnable value for this Qosdata.
     * 
     * @param wanEnable
     */
    public void setWanEnable(boolean wanEnable) {
        this.wanEnable = wanEnable;
    }


    /**
     * Gets the enableStatistic value for this Qosdata.
     * 
     * @return enableStatistic
     */
    public boolean isEnableStatistic() {
        return enableStatistic;
    }


    /**
     * Sets the enableStatistic value for this Qosdata.
     * 
     * @param enableStatistic
     */
    public void setEnableStatistic(boolean enableStatistic) {
        this.enableStatistic = enableStatistic;
    }


    /**
     * Gets the enableLanStatistic value for this Qosdata.
     * 
     * @return enableLanStatistic
     */
    public boolean isEnableLanStatistic() {
        return enableLanStatistic;
    }


    /**
     * Sets the enableLanStatistic value for this Qosdata.
     * 
     * @param enableLanStatistic
     */
    public void setEnableLanStatistic(boolean enableLanStatistic) {
        this.enableLanStatistic = enableLanStatistic;
    }


    /**
     * Gets the enableRemark8021P value for this Qosdata.
     * 
     * @return enableRemark8021P
     */
    public boolean isEnableRemark8021P() {
        return enableRemark8021P;
    }


    /**
     * Sets the enableRemark8021P value for this Qosdata.
     * 
     * @param enableRemark8021P
     */
    public void setEnableRemark8021P(boolean enableRemark8021P) {
        this.enableRemark8021P = enableRemark8021P;
    }


    /**
     * Gets the remark8021PValue value for this Qosdata.
     * 
     * @return remark8021PValue
     */
    public int getRemark8021PValue() {
        return remark8021PValue;
    }


    /**
     * Sets the remark8021PValue value for this Qosdata.
     * 
     * @param remark8021PValue
     */
    public void setRemark8021PValue(int remark8021PValue) {
        this.remark8021PValue = remark8021PValue;
    }


    /**
     * Gets the enableQueueLength value for this Qosdata.
     * 
     * @return enableQueueLength
     */
    public boolean isEnableQueueLength() {
        return enableQueueLength;
    }


    /**
     * Sets the enableQueueLength value for this Qosdata.
     * 
     * @param enableQueueLength
     */
    public void setEnableQueueLength(boolean enableQueueLength) {
        this.enableQueueLength = enableQueueLength;
    }


    /**
     * Gets the queueByteLength value for this Qosdata.
     * 
     * @return queueByteLength
     */
    public java.lang.Object getQueueByteLength() {
        return queueByteLength;
    }


    /**
     * Sets the queueByteLength value for this Qosdata.
     * 
     * @param queueByteLength
     */
    public void setQueueByteLength(java.lang.Object queueByteLength) {
        this.queueByteLength = queueByteLength;
    }


    /**
     * Gets the queuePacketLength value for this Qosdata.
     * 
     * @return queuePacketLength
     */
    public java.lang.Object getQueuePacketLength() {
        return queuePacketLength;
    }


    /**
     * Sets the queuePacketLength value for this Qosdata.
     * 
     * @param queuePacketLength
     */
    public void setQueuePacketLength(java.lang.Object queuePacketLength) {
        this.queuePacketLength = queuePacketLength;
    }


    /**
     * Gets the status value for this Qosdata.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Qosdata.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the isActive value for this Qosdata.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Qosdata.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the policyType value for this Qosdata.
     * 
     * @return policyType
     */
    public java.lang.String getPolicyType() {
        return policyType;
    }


    /**
     * Sets the policyType value for this Qosdata.
     * 
     * @param policyType
     */
    public void setPolicyType(java.lang.String policyType) {
        this.policyType = policyType;
    }


    /**
     * Gets the deviceId value for this Qosdata.
     * 
     * @return deviceId
     */
    public java.lang.Object getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this Qosdata.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.Object deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the interfaceId value for this Qosdata.
     * 
     * @return interfaceId
     */
    public java.lang.Object getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this Qosdata.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.Object interfaceId) {
        this.interfaceId = interfaceId;
    }


    /**
     * Gets the interfaceName value for this Qosdata.
     * 
     * @return interfaceName
     */
    public java.lang.Object getInterfaceName() {
        return interfaceName;
    }


    /**
     * Sets the interfaceName value for this Qosdata.
     * 
     * @param interfaceName
     */
    public void setInterfaceName(java.lang.Object interfaceName) {
        this.interfaceName = interfaceName;
    }


    /**
     * Gets the siteId value for this Qosdata.
     * 
     * @return siteId
     */
    public java.lang.Object getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Qosdata.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.Object siteId) {
        this.siteId = siteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Qosdata)) return false;
        Qosdata other = (Qosdata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.vpnId==null && other.getVpnId()==null) || 
             (this.vpnId!=null &&
              this.vpnId.equals(other.getVpnId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            this.bandwidthEnable == other.isBandwidthEnable() &&
            ((this.bandwidthType==null && other.getBandwidthType()==null) || 
             (this.bandwidthType!=null &&
              this.bandwidthType.equals(other.getBandwidthType()))) &&
            ((this.bandwidthValuetype==null && other.getBandwidthValuetype()==null) || 
             (this.bandwidthValuetype!=null &&
              this.bandwidthValuetype.equals(other.getBandwidthValuetype()))) &&
            ((this.bandwidthValue==null && other.getBandwidthValue()==null) || 
             (this.bandwidthValue!=null &&
              this.bandwidthValue.equals(other.getBandwidthValue()))) &&
            this.limimEnable == other.isLimimEnable() &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            ((this.limitValuetype==null && other.getLimitValuetype()==null) || 
             (this.limitValuetype!=null &&
              this.limitValuetype.equals(other.getLimitValuetype()))) &&
            ((this.limitValue==null && other.getLimitValue()==null) || 
             (this.limitValue!=null &&
              this.limitValue.equals(other.getLimitValue()))) &&
            this.markdscpEnable == other.isMarkdscpEnable() &&
            ((this.dscp==null && other.getDscp()==null) || 
             (this.dscp!=null &&
              this.dscp.equals(other.getDscp()))) &&
            this.markdscpInnerEnable == other.isMarkdscpInnerEnable() &&
            ((this.dscpInner==null && other.getDscpInner()==null) || 
             (this.dscpInner!=null &&
              this.dscpInner.equals(other.getDscpInner()))) &&
            this.lanEnable == other.isLanEnable() &&
            this.wanEnable == other.isWanEnable() &&
            this.enableStatistic == other.isEnableStatistic() &&
            this.enableLanStatistic == other.isEnableLanStatistic() &&
            this.enableRemark8021P == other.isEnableRemark8021P() &&
            this.remark8021PValue == other.getRemark8021PValue() &&
            this.enableQueueLength == other.isEnableQueueLength() &&
            ((this.queueByteLength==null && other.getQueueByteLength()==null) || 
             (this.queueByteLength!=null &&
              this.queueByteLength.equals(other.getQueueByteLength()))) &&
            ((this.queuePacketLength==null && other.getQueuePacketLength()==null) || 
             (this.queuePacketLength!=null &&
              this.queuePacketLength.equals(other.getQueuePacketLength()))) &&
            this.status == other.getStatus() &&
            this.isActive == other.isIsActive() &&
            ((this.policyType==null && other.getPolicyType()==null) || 
             (this.policyType!=null &&
              this.policyType.equals(other.getPolicyType()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.interfaceId==null && other.getInterfaceId()==null) || 
             (this.interfaceId!=null &&
              this.interfaceId.equals(other.getInterfaceId()))) &&
            ((this.interfaceName==null && other.getInterfaceName()==null) || 
             (this.interfaceName!=null &&
              this.interfaceName.equals(other.getInterfaceName()))) &&
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVpnId() != null) {
            _hashCode += getVpnId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        _hashCode += (isBandwidthEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBandwidthType() != null) {
            _hashCode += getBandwidthType().hashCode();
        }
        if (getBandwidthValuetype() != null) {
            _hashCode += getBandwidthValuetype().hashCode();
        }
        if (getBandwidthValue() != null) {
            _hashCode += getBandwidthValue().hashCode();
        }
        _hashCode += (isLimimEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        if (getLimitValuetype() != null) {
            _hashCode += getLimitValuetype().hashCode();
        }
        if (getLimitValue() != null) {
            _hashCode += getLimitValue().hashCode();
        }
        _hashCode += (isMarkdscpEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDscp() != null) {
            _hashCode += getDscp().hashCode();
        }
        _hashCode += (isMarkdscpInnerEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDscpInner() != null) {
            _hashCode += getDscpInner().hashCode();
        }
        _hashCode += (isLanEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWanEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableStatistic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableLanStatistic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableRemark8021P() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getRemark8021PValue();
        _hashCode += (isEnableQueueLength() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getQueueByteLength() != null) {
            _hashCode += getQueueByteLength().hashCode();
        }
        if (getQueuePacketLength() != null) {
            _hashCode += getQueuePacketLength().hashCode();
        }
        _hashCode += getStatus();
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPolicyType() != null) {
            _hashCode += getPolicyType().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        if (getInterfaceName() != null) {
            _hashCode += getInterfaceName().hashCode();
        }
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Qosdata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Qosdata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vpnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bandwidthEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bandwidthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthValuetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bandwidthValuetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bandwidthValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limimEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "limimEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "limitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValuetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "limitValuetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "limitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markdscpEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "markdscpEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dscp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dscp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markdscpInnerEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "markdscpInnerEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dscpInner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dscpInner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lanEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lanEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wanEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "wanEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableStatistic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enableStatistic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableLanStatistic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enableLanStatistic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableRemark8021P");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enableRemark8021p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark8021PValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "remark8021pValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableQueueLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enableQueueLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueByteLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "queueByteLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queuePacketLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "queuePacketLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "policyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "interfaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "interfaceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
