/**
 * DatumQoS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DatumQoS  implements java.io.Serializable {
    private org.tempuri.Qosdata qosdata;

    private org.tempuri.ClassifytemplateV2020 classifytemplate;

    private java.lang.Object timeTemplate;

    private java.lang.String[] sites;

    public DatumQoS() {
    }

    public DatumQoS(
           org.tempuri.Qosdata qosdata,
           org.tempuri.ClassifytemplateV2020 classifytemplate,
           java.lang.Object timeTemplate,
           java.lang.String[] sites) {
           this.qosdata = qosdata;
           this.classifytemplate = classifytemplate;
           this.timeTemplate = timeTemplate;
           this.sites = sites;
    }


    /**
     * Gets the qosdata value for this DatumQoS.
     * 
     * @return qosdata
     */
    public org.tempuri.Qosdata getQosdata() {
        return qosdata;
    }


    /**
     * Sets the qosdata value for this DatumQoS.
     * 
     * @param qosdata
     */
    public void setQosdata(org.tempuri.Qosdata qosdata) {
        this.qosdata = qosdata;
    }


    /**
     * Gets the classifytemplate value for this DatumQoS.
     * 
     * @return classifytemplate
     */
    public org.tempuri.ClassifytemplateV2020 getClassifytemplate() {
        return classifytemplate;
    }


    /**
     * Sets the classifytemplate value for this DatumQoS.
     * 
     * @param classifytemplate
     */
    public void setClassifytemplate(org.tempuri.ClassifytemplateV2020 classifytemplate) {
        this.classifytemplate = classifytemplate;
    }


    /**
     * Gets the timeTemplate value for this DatumQoS.
     * 
     * @return timeTemplate
     */
    public java.lang.Object getTimeTemplate() {
        return timeTemplate;
    }


    /**
     * Sets the timeTemplate value for this DatumQoS.
     * 
     * @param timeTemplate
     */
    public void setTimeTemplate(java.lang.Object timeTemplate) {
        this.timeTemplate = timeTemplate;
    }


    /**
     * Gets the sites value for this DatumQoS.
     * 
     * @return sites
     */
    public java.lang.String[] getSites() {
        return sites;
    }


    /**
     * Sets the sites value for this DatumQoS.
     * 
     * @param sites
     */
    public void setSites(java.lang.String[] sites) {
        this.sites = sites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatumQoS)) return false;
        DatumQoS other = (DatumQoS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qosdata==null && other.getQosdata()==null) || 
             (this.qosdata!=null &&
              this.qosdata.equals(other.getQosdata()))) &&
            ((this.classifytemplate==null && other.getClassifytemplate()==null) || 
             (this.classifytemplate!=null &&
              this.classifytemplate.equals(other.getClassifytemplate()))) &&
            ((this.timeTemplate==null && other.getTimeTemplate()==null) || 
             (this.timeTemplate!=null &&
              this.timeTemplate.equals(other.getTimeTemplate()))) &&
            ((this.sites==null && other.getSites()==null) || 
             (this.sites!=null &&
              java.util.Arrays.equals(this.sites, other.getSites())));
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
        if (getQosdata() != null) {
            _hashCode += getQosdata().hashCode();
        }
        if (getClassifytemplate() != null) {
            _hashCode += getClassifytemplate().hashCode();
        }
        if (getTimeTemplate() != null) {
            _hashCode += getTimeTemplate().hashCode();
        }
        if (getSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSites(), i);
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
        new org.apache.axis.description.TypeDesc(DatumQoS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DatumQoS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosdata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "qosdata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Qosdata"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classifytemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "classifytemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ClassifytemplateV2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "timeTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sites"));
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
