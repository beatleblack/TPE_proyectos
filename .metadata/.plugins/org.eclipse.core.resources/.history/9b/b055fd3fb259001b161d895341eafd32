/**
 * OutBbpspacket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OutBbpspacket  implements java.io.Serializable {
    private float upwardSpeed;

    private float downwardSpeed;

    public OutBbpspacket() {
    }

    public OutBbpspacket(
           float upwardSpeed,
           float downwardSpeed) {
           this.upwardSpeed = upwardSpeed;
           this.downwardSpeed = downwardSpeed;
    }


    /**
     * Gets the upwardSpeed value for this OutBbpspacket.
     * 
     * @return upwardSpeed
     */
    public float getUpwardSpeed() {
        return upwardSpeed;
    }


    /**
     * Sets the upwardSpeed value for this OutBbpspacket.
     * 
     * @param upwardSpeed
     */
    public void setUpwardSpeed(float upwardSpeed) {
        this.upwardSpeed = upwardSpeed;
    }


    /**
     * Gets the downwardSpeed value for this OutBbpspacket.
     * 
     * @return downwardSpeed
     */
    public float getDownwardSpeed() {
        return downwardSpeed;
    }


    /**
     * Sets the downwardSpeed value for this OutBbpspacket.
     * 
     * @param downwardSpeed
     */
    public void setDownwardSpeed(float downwardSpeed) {
        this.downwardSpeed = downwardSpeed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutBbpspacket)) return false;
        OutBbpspacket other = (OutBbpspacket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.upwardSpeed == other.getUpwardSpeed() &&
            this.downwardSpeed == other.getDownwardSpeed();
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
        _hashCode += new Float(getUpwardSpeed()).hashCode();
        _hashCode += new Float(getDownwardSpeed()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutBbpspacket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutBbpspacket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upwardSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "upwardSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downwardSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "downwardSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
