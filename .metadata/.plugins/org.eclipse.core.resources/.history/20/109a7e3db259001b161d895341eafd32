/**
 * AddonQoS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddonQoS  implements java.io.Serializable {
    private java.lang.String strIdCustomer;

    private org.tempuri.AddonQosV2020[] arrQos;

    public AddonQoS() {
    }

    public AddonQoS(
           java.lang.String strIdCustomer,
           org.tempuri.AddonQosV2020[] arrQos) {
           this.strIdCustomer = strIdCustomer;
           this.arrQos = arrQos;
    }


    /**
     * Gets the strIdCustomer value for this AddonQoS.
     * 
     * @return strIdCustomer
     */
    public java.lang.String getStrIdCustomer() {
        return strIdCustomer;
    }


    /**
     * Sets the strIdCustomer value for this AddonQoS.
     * 
     * @param strIdCustomer
     */
    public void setStrIdCustomer(java.lang.String strIdCustomer) {
        this.strIdCustomer = strIdCustomer;
    }


    /**
     * Gets the arrQos value for this AddonQoS.
     * 
     * @return arrQos
     */
    public org.tempuri.AddonQosV2020[] getArrQos() {
        return arrQos;
    }


    /**
     * Sets the arrQos value for this AddonQoS.
     * 
     * @param arrQos
     */
    public void setArrQos(org.tempuri.AddonQosV2020[] arrQos) {
        this.arrQos = arrQos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddonQoS)) return false;
        AddonQoS other = (AddonQoS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strIdCustomer==null && other.getStrIdCustomer()==null) || 
             (this.strIdCustomer!=null &&
              this.strIdCustomer.equals(other.getStrIdCustomer()))) &&
            ((this.arrQos==null && other.getArrQos()==null) || 
             (this.arrQos!=null &&
              java.util.Arrays.equals(this.arrQos, other.getArrQos())));
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
        if (getStrIdCustomer() != null) {
            _hashCode += getStrIdCustomer().hashCode();
        }
        if (getArrQos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrQos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrQos(), i);
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
        new org.apache.axis.description.TypeDesc(AddonQoS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddonQoS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIdCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIdCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrQos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ArrQos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "AddonQosV2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "AddonQosV2020"));
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
