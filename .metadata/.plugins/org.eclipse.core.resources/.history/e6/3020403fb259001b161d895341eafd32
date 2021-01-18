/**
 * OutConsumosAltanPro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OutConsumosAltanPro  implements java.io.Serializable {
    private double gb;

    private double mb;

    public OutConsumosAltanPro() {
    }

    public OutConsumosAltanPro(
           double gb,
           double mb) {
           this.gb = gb;
           this.mb = mb;
    }


    /**
     * Gets the gb value for this OutConsumosAltanPro.
     * 
     * @return gb
     */
    public double getGb() {
        return gb;
    }


    /**
     * Sets the gb value for this OutConsumosAltanPro.
     * 
     * @param gb
     */
    public void setGb(double gb) {
        this.gb = gb;
    }


    /**
     * Gets the mb value for this OutConsumosAltanPro.
     * 
     * @return mb
     */
    public double getMb() {
        return mb;
    }


    /**
     * Sets the mb value for this OutConsumosAltanPro.
     * 
     * @param mb
     */
    public void setMb(double mb) {
        this.mb = mb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutConsumosAltanPro)) return false;
        OutConsumosAltanPro other = (OutConsumosAltanPro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gb == other.getGb() &&
            this.mb == other.getMb();
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
        _hashCode += new Double(getGb()).hashCode();
        _hashCode += new Double(getMb()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutConsumosAltanPro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutConsumosAltanPro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
