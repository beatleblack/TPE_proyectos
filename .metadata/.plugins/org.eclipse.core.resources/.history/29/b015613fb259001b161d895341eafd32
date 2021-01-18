/**
 * ResponseSiteTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResponseSiteTemplate  implements java.io.Serializable {
    private java.lang.String errcode;

    private java.lang.String errmsg;

    private int sitetemplatecount;

    private org.tempuri.SiteTemplateAllInfo[] sitetemplateoverallinfo;

    public ResponseSiteTemplate() {
    }

    public ResponseSiteTemplate(
           java.lang.String errcode,
           java.lang.String errmsg,
           int sitetemplatecount,
           org.tempuri.SiteTemplateAllInfo[] sitetemplateoverallinfo) {
           this.errcode = errcode;
           this.errmsg = errmsg;
           this.sitetemplatecount = sitetemplatecount;
           this.sitetemplateoverallinfo = sitetemplateoverallinfo;
    }


    /**
     * Gets the errcode value for this ResponseSiteTemplate.
     * 
     * @return errcode
     */
    public java.lang.String getErrcode() {
        return errcode;
    }


    /**
     * Sets the errcode value for this ResponseSiteTemplate.
     * 
     * @param errcode
     */
    public void setErrcode(java.lang.String errcode) {
        this.errcode = errcode;
    }


    /**
     * Gets the errmsg value for this ResponseSiteTemplate.
     * 
     * @return errmsg
     */
    public java.lang.String getErrmsg() {
        return errmsg;
    }


    /**
     * Sets the errmsg value for this ResponseSiteTemplate.
     * 
     * @param errmsg
     */
    public void setErrmsg(java.lang.String errmsg) {
        this.errmsg = errmsg;
    }


    /**
     * Gets the sitetemplatecount value for this ResponseSiteTemplate.
     * 
     * @return sitetemplatecount
     */
    public int getSitetemplatecount() {
        return sitetemplatecount;
    }


    /**
     * Sets the sitetemplatecount value for this ResponseSiteTemplate.
     * 
     * @param sitetemplatecount
     */
    public void setSitetemplatecount(int sitetemplatecount) {
        this.sitetemplatecount = sitetemplatecount;
    }


    /**
     * Gets the sitetemplateoverallinfo value for this ResponseSiteTemplate.
     * 
     * @return sitetemplateoverallinfo
     */
    public org.tempuri.SiteTemplateAllInfo[] getSitetemplateoverallinfo() {
        return sitetemplateoverallinfo;
    }


    /**
     * Sets the sitetemplateoverallinfo value for this ResponseSiteTemplate.
     * 
     * @param sitetemplateoverallinfo
     */
    public void setSitetemplateoverallinfo(org.tempuri.SiteTemplateAllInfo[] sitetemplateoverallinfo) {
        this.sitetemplateoverallinfo = sitetemplateoverallinfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseSiteTemplate)) return false;
        ResponseSiteTemplate other = (ResponseSiteTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errcode==null && other.getErrcode()==null) || 
             (this.errcode!=null &&
              this.errcode.equals(other.getErrcode()))) &&
            ((this.errmsg==null && other.getErrmsg()==null) || 
             (this.errmsg!=null &&
              this.errmsg.equals(other.getErrmsg()))) &&
            this.sitetemplatecount == other.getSitetemplatecount() &&
            ((this.sitetemplateoverallinfo==null && other.getSitetemplateoverallinfo()==null) || 
             (this.sitetemplateoverallinfo!=null &&
              java.util.Arrays.equals(this.sitetemplateoverallinfo, other.getSitetemplateoverallinfo())));
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
        if (getErrcode() != null) {
            _hashCode += getErrcode().hashCode();
        }
        if (getErrmsg() != null) {
            _hashCode += getErrmsg().hashCode();
        }
        _hashCode += getSitetemplatecount();
        if (getSitetemplateoverallinfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitetemplateoverallinfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitetemplateoverallinfo(), i);
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
        new org.apache.axis.description.TypeDesc(ResponseSiteTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSiteTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "errcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errmsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "errmsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitetemplatecount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sitetemplatecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitetemplateoverallinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sitetemplateoverallinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SiteTemplateAllInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "SiteTemplateAllInfo"));
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
