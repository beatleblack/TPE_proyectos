/**
 * ResponseWanlinksTemplate2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResponseWanlinksTemplate2  implements java.io.Serializable {
    private java.lang.String templateName;

    private java.lang.String description;

    private int gatewayType;

    private java.lang.String siteTemplateId;

    private boolean isReuseLAN;

    private boolean isUsedBySite;

    private java.lang.String reservedVlan;

    private boolean veInterfaceEnabled;

    private org.tempuri.Wanlinkz2[] wanLinks;

    private java.lang.String[] interCpeLinks;

    public ResponseWanlinksTemplate2() {
    }

    public ResponseWanlinksTemplate2(
           java.lang.String templateName,
           java.lang.String description,
           int gatewayType,
           java.lang.String siteTemplateId,
           boolean isReuseLAN,
           boolean isUsedBySite,
           java.lang.String reservedVlan,
           boolean veInterfaceEnabled,
           org.tempuri.Wanlinkz2[] wanLinks,
           java.lang.String[] interCpeLinks) {
           this.templateName = templateName;
           this.description = description;
           this.gatewayType = gatewayType;
           this.siteTemplateId = siteTemplateId;
           this.isReuseLAN = isReuseLAN;
           this.isUsedBySite = isUsedBySite;
           this.reservedVlan = reservedVlan;
           this.veInterfaceEnabled = veInterfaceEnabled;
           this.wanLinks = wanLinks;
           this.interCpeLinks = interCpeLinks;
    }


    /**
     * Gets the templateName value for this ResponseWanlinksTemplate2.
     * 
     * @return templateName
     */
    public java.lang.String getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this ResponseWanlinksTemplate2.
     * 
     * @param templateName
     */
    public void setTemplateName(java.lang.String templateName) {
        this.templateName = templateName;
    }


    /**
     * Gets the description value for this ResponseWanlinksTemplate2.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResponseWanlinksTemplate2.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the gatewayType value for this ResponseWanlinksTemplate2.
     * 
     * @return gatewayType
     */
    public int getGatewayType() {
        return gatewayType;
    }


    /**
     * Sets the gatewayType value for this ResponseWanlinksTemplate2.
     * 
     * @param gatewayType
     */
    public void setGatewayType(int gatewayType) {
        this.gatewayType = gatewayType;
    }


    /**
     * Gets the siteTemplateId value for this ResponseWanlinksTemplate2.
     * 
     * @return siteTemplateId
     */
    public java.lang.String getSiteTemplateId() {
        return siteTemplateId;
    }


    /**
     * Sets the siteTemplateId value for this ResponseWanlinksTemplate2.
     * 
     * @param siteTemplateId
     */
    public void setSiteTemplateId(java.lang.String siteTemplateId) {
        this.siteTemplateId = siteTemplateId;
    }


    /**
     * Gets the isReuseLAN value for this ResponseWanlinksTemplate2.
     * 
     * @return isReuseLAN
     */
    public boolean isIsReuseLAN() {
        return isReuseLAN;
    }


    /**
     * Sets the isReuseLAN value for this ResponseWanlinksTemplate2.
     * 
     * @param isReuseLAN
     */
    public void setIsReuseLAN(boolean isReuseLAN) {
        this.isReuseLAN = isReuseLAN;
    }


    /**
     * Gets the isUsedBySite value for this ResponseWanlinksTemplate2.
     * 
     * @return isUsedBySite
     */
    public boolean isIsUsedBySite() {
        return isUsedBySite;
    }


    /**
     * Sets the isUsedBySite value for this ResponseWanlinksTemplate2.
     * 
     * @param isUsedBySite
     */
    public void setIsUsedBySite(boolean isUsedBySite) {
        this.isUsedBySite = isUsedBySite;
    }


    /**
     * Gets the reservedVlan value for this ResponseWanlinksTemplate2.
     * 
     * @return reservedVlan
     */
    public java.lang.String getReservedVlan() {
        return reservedVlan;
    }


    /**
     * Sets the reservedVlan value for this ResponseWanlinksTemplate2.
     * 
     * @param reservedVlan
     */
    public void setReservedVlan(java.lang.String reservedVlan) {
        this.reservedVlan = reservedVlan;
    }


    /**
     * Gets the veInterfaceEnabled value for this ResponseWanlinksTemplate2.
     * 
     * @return veInterfaceEnabled
     */
    public boolean isVeInterfaceEnabled() {
        return veInterfaceEnabled;
    }


    /**
     * Sets the veInterfaceEnabled value for this ResponseWanlinksTemplate2.
     * 
     * @param veInterfaceEnabled
     */
    public void setVeInterfaceEnabled(boolean veInterfaceEnabled) {
        this.veInterfaceEnabled = veInterfaceEnabled;
    }


    /**
     * Gets the wanLinks value for this ResponseWanlinksTemplate2.
     * 
     * @return wanLinks
     */
    public org.tempuri.Wanlinkz2[] getWanLinks() {
        return wanLinks;
    }


    /**
     * Sets the wanLinks value for this ResponseWanlinksTemplate2.
     * 
     * @param wanLinks
     */
    public void setWanLinks(org.tempuri.Wanlinkz2[] wanLinks) {
        this.wanLinks = wanLinks;
    }


    /**
     * Gets the interCpeLinks value for this ResponseWanlinksTemplate2.
     * 
     * @return interCpeLinks
     */
    public java.lang.String[] getInterCpeLinks() {
        return interCpeLinks;
    }


    /**
     * Sets the interCpeLinks value for this ResponseWanlinksTemplate2.
     * 
     * @param interCpeLinks
     */
    public void setInterCpeLinks(java.lang.String[] interCpeLinks) {
        this.interCpeLinks = interCpeLinks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseWanlinksTemplate2)) return false;
        ResponseWanlinksTemplate2 other = (ResponseWanlinksTemplate2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateName==null && other.getTemplateName()==null) || 
             (this.templateName!=null &&
              this.templateName.equals(other.getTemplateName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.gatewayType == other.getGatewayType() &&
            ((this.siteTemplateId==null && other.getSiteTemplateId()==null) || 
             (this.siteTemplateId!=null &&
              this.siteTemplateId.equals(other.getSiteTemplateId()))) &&
            this.isReuseLAN == other.isIsReuseLAN() &&
            this.isUsedBySite == other.isIsUsedBySite() &&
            ((this.reservedVlan==null && other.getReservedVlan()==null) || 
             (this.reservedVlan!=null &&
              this.reservedVlan.equals(other.getReservedVlan()))) &&
            this.veInterfaceEnabled == other.isVeInterfaceEnabled() &&
            ((this.wanLinks==null && other.getWanLinks()==null) || 
             (this.wanLinks!=null &&
              java.util.Arrays.equals(this.wanLinks, other.getWanLinks()))) &&
            ((this.interCpeLinks==null && other.getInterCpeLinks()==null) || 
             (this.interCpeLinks!=null &&
              java.util.Arrays.equals(this.interCpeLinks, other.getInterCpeLinks())));
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
        if (getTemplateName() != null) {
            _hashCode += getTemplateName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getGatewayType();
        if (getSiteTemplateId() != null) {
            _hashCode += getSiteTemplateId().hashCode();
        }
        _hashCode += (isIsReuseLAN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsUsedBySite() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReservedVlan() != null) {
            _hashCode += getReservedVlan().hashCode();
        }
        _hashCode += (isVeInterfaceEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWanLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWanLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWanLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInterCpeLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterCpeLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterCpeLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseWanlinksTemplate2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseWanlinksTemplate2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "templateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gatewayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("isReuseLAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isReuseLAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUsedBySite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isUsedBySite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedVlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "reservedVlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veInterfaceEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "veInterfaceEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wanLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "wanLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Wanlinkz2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wanlinkz2"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interCpeLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "interCpeLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
