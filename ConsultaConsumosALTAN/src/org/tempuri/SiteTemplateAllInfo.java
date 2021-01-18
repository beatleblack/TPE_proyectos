/**
 * SiteTemplateAllInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SiteTemplateAllInfo  implements java.io.Serializable {
    private java.lang.String templateName;

    private java.lang.String description;

    private int gatewayType;

    private boolean isDefaultTemplate;

    private java.lang.String siteTemplateId;

    public SiteTemplateAllInfo() {
    }

    public SiteTemplateAllInfo(
           java.lang.String templateName,
           java.lang.String description,
           int gatewayType,
           boolean isDefaultTemplate,
           java.lang.String siteTemplateId) {
           this.templateName = templateName;
           this.description = description;
           this.gatewayType = gatewayType;
           this.isDefaultTemplate = isDefaultTemplate;
           this.siteTemplateId = siteTemplateId;
    }


    /**
     * Gets the templateName value for this SiteTemplateAllInfo.
     * 
     * @return templateName
     */
    public java.lang.String getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this SiteTemplateAllInfo.
     * 
     * @param templateName
     */
    public void setTemplateName(java.lang.String templateName) {
        this.templateName = templateName;
    }


    /**
     * Gets the description value for this SiteTemplateAllInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SiteTemplateAllInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the gatewayType value for this SiteTemplateAllInfo.
     * 
     * @return gatewayType
     */
    public int getGatewayType() {
        return gatewayType;
    }


    /**
     * Sets the gatewayType value for this SiteTemplateAllInfo.
     * 
     * @param gatewayType
     */
    public void setGatewayType(int gatewayType) {
        this.gatewayType = gatewayType;
    }


    /**
     * Gets the isDefaultTemplate value for this SiteTemplateAllInfo.
     * 
     * @return isDefaultTemplate
     */
    public boolean isIsDefaultTemplate() {
        return isDefaultTemplate;
    }


    /**
     * Sets the isDefaultTemplate value for this SiteTemplateAllInfo.
     * 
     * @param isDefaultTemplate
     */
    public void setIsDefaultTemplate(boolean isDefaultTemplate) {
        this.isDefaultTemplate = isDefaultTemplate;
    }


    /**
     * Gets the siteTemplateId value for this SiteTemplateAllInfo.
     * 
     * @return siteTemplateId
     */
    public java.lang.String getSiteTemplateId() {
        return siteTemplateId;
    }


    /**
     * Sets the siteTemplateId value for this SiteTemplateAllInfo.
     * 
     * @param siteTemplateId
     */
    public void setSiteTemplateId(java.lang.String siteTemplateId) {
        this.siteTemplateId = siteTemplateId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteTemplateAllInfo)) return false;
        SiteTemplateAllInfo other = (SiteTemplateAllInfo) obj;
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
            this.isDefaultTemplate == other.isIsDefaultTemplate() &&
            ((this.siteTemplateId==null && other.getSiteTemplateId()==null) || 
             (this.siteTemplateId!=null &&
              this.siteTemplateId.equals(other.getSiteTemplateId())));
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
        _hashCode += (isIsDefaultTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSiteTemplateId() != null) {
            _hashCode += getSiteTemplateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteTemplateAllInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SiteTemplateAllInfo"));
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
        elemField.setFieldName("isDefaultTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isDefaultTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteTemplateId"));
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
