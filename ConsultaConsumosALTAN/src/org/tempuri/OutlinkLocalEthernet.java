/**
 * OutlinkLocalEthernet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OutlinkLocalEthernet  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String siteTemplateId;

    private java.lang.String siteTemplateName;

    private java.lang.String linkId;

    private java.lang.String linkName;

    private java.lang.String pbrTestAddress;

    private boolean enableNat;

    private int orderIndex;

    private java.lang.String bandwidthAllocation;

    public OutlinkLocalEthernet() {
    }

    public OutlinkLocalEthernet(
           java.lang.String id,
           java.lang.String siteTemplateId,
           java.lang.String siteTemplateName,
           java.lang.String linkId,
           java.lang.String linkName,
           java.lang.String pbrTestAddress,
           boolean enableNat,
           int orderIndex,
           java.lang.String bandwidthAllocation) {
           this.id = id;
           this.siteTemplateId = siteTemplateId;
           this.siteTemplateName = siteTemplateName;
           this.linkId = linkId;
           this.linkName = linkName;
           this.pbrTestAddress = pbrTestAddress;
           this.enableNat = enableNat;
           this.orderIndex = orderIndex;
           this.bandwidthAllocation = bandwidthAllocation;
    }


    /**
     * Gets the id value for this OutlinkLocalEthernet.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OutlinkLocalEthernet.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the siteTemplateId value for this OutlinkLocalEthernet.
     * 
     * @return siteTemplateId
     */
    public java.lang.String getSiteTemplateId() {
        return siteTemplateId;
    }


    /**
     * Sets the siteTemplateId value for this OutlinkLocalEthernet.
     * 
     * @param siteTemplateId
     */
    public void setSiteTemplateId(java.lang.String siteTemplateId) {
        this.siteTemplateId = siteTemplateId;
    }


    /**
     * Gets the siteTemplateName value for this OutlinkLocalEthernet.
     * 
     * @return siteTemplateName
     */
    public java.lang.String getSiteTemplateName() {
        return siteTemplateName;
    }


    /**
     * Sets the siteTemplateName value for this OutlinkLocalEthernet.
     * 
     * @param siteTemplateName
     */
    public void setSiteTemplateName(java.lang.String siteTemplateName) {
        this.siteTemplateName = siteTemplateName;
    }


    /**
     * Gets the linkId value for this OutlinkLocalEthernet.
     * 
     * @return linkId
     */
    public java.lang.String getLinkId() {
        return linkId;
    }


    /**
     * Sets the linkId value for this OutlinkLocalEthernet.
     * 
     * @param linkId
     */
    public void setLinkId(java.lang.String linkId) {
        this.linkId = linkId;
    }


    /**
     * Gets the linkName value for this OutlinkLocalEthernet.
     * 
     * @return linkName
     */
    public java.lang.String getLinkName() {
        return linkName;
    }


    /**
     * Sets the linkName value for this OutlinkLocalEthernet.
     * 
     * @param linkName
     */
    public void setLinkName(java.lang.String linkName) {
        this.linkName = linkName;
    }


    /**
     * Gets the pbrTestAddress value for this OutlinkLocalEthernet.
     * 
     * @return pbrTestAddress
     */
    public java.lang.String getPbrTestAddress() {
        return pbrTestAddress;
    }


    /**
     * Sets the pbrTestAddress value for this OutlinkLocalEthernet.
     * 
     * @param pbrTestAddress
     */
    public void setPbrTestAddress(java.lang.String pbrTestAddress) {
        this.pbrTestAddress = pbrTestAddress;
    }


    /**
     * Gets the enableNat value for this OutlinkLocalEthernet.
     * 
     * @return enableNat
     */
    public boolean isEnableNat() {
        return enableNat;
    }


    /**
     * Sets the enableNat value for this OutlinkLocalEthernet.
     * 
     * @param enableNat
     */
    public void setEnableNat(boolean enableNat) {
        this.enableNat = enableNat;
    }


    /**
     * Gets the orderIndex value for this OutlinkLocalEthernet.
     * 
     * @return orderIndex
     */
    public int getOrderIndex() {
        return orderIndex;
    }


    /**
     * Sets the orderIndex value for this OutlinkLocalEthernet.
     * 
     * @param orderIndex
     */
    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }


    /**
     * Gets the bandwidthAllocation value for this OutlinkLocalEthernet.
     * 
     * @return bandwidthAllocation
     */
    public java.lang.String getBandwidthAllocation() {
        return bandwidthAllocation;
    }


    /**
     * Sets the bandwidthAllocation value for this OutlinkLocalEthernet.
     * 
     * @param bandwidthAllocation
     */
    public void setBandwidthAllocation(java.lang.String bandwidthAllocation) {
        this.bandwidthAllocation = bandwidthAllocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutlinkLocalEthernet)) return false;
        OutlinkLocalEthernet other = (OutlinkLocalEthernet) obj;
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
            ((this.siteTemplateId==null && other.getSiteTemplateId()==null) || 
             (this.siteTemplateId!=null &&
              this.siteTemplateId.equals(other.getSiteTemplateId()))) &&
            ((this.siteTemplateName==null && other.getSiteTemplateName()==null) || 
             (this.siteTemplateName!=null &&
              this.siteTemplateName.equals(other.getSiteTemplateName()))) &&
            ((this.linkId==null && other.getLinkId()==null) || 
             (this.linkId!=null &&
              this.linkId.equals(other.getLinkId()))) &&
            ((this.linkName==null && other.getLinkName()==null) || 
             (this.linkName!=null &&
              this.linkName.equals(other.getLinkName()))) &&
            ((this.pbrTestAddress==null && other.getPbrTestAddress()==null) || 
             (this.pbrTestAddress!=null &&
              this.pbrTestAddress.equals(other.getPbrTestAddress()))) &&
            this.enableNat == other.isEnableNat() &&
            this.orderIndex == other.getOrderIndex() &&
            ((this.bandwidthAllocation==null && other.getBandwidthAllocation()==null) || 
             (this.bandwidthAllocation!=null &&
              this.bandwidthAllocation.equals(other.getBandwidthAllocation())));
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
        if (getSiteTemplateId() != null) {
            _hashCode += getSiteTemplateId().hashCode();
        }
        if (getSiteTemplateName() != null) {
            _hashCode += getSiteTemplateName().hashCode();
        }
        if (getLinkId() != null) {
            _hashCode += getLinkId().hashCode();
        }
        if (getLinkName() != null) {
            _hashCode += getLinkName().hashCode();
        }
        if (getPbrTestAddress() != null) {
            _hashCode += getPbrTestAddress().hashCode();
        }
        _hashCode += (isEnableNat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOrderIndex();
        if (getBandwidthAllocation() != null) {
            _hashCode += getBandwidthAllocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutlinkLocalEthernet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutlinkLocalEthernet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteTemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "linkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "linkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pbrTestAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pbrTestAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableNat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enableNat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "orderIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bandwidthAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
