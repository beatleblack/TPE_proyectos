/**
 * Totalthroughput2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Totalthroughput2020  implements java.io.Serializable {
    private java.lang.String time;

    private float anotherTotalThroughput;

    private float totalAllThroughput;

    private float totalPackets;

    public Totalthroughput2020() {
    }

    public Totalthroughput2020(
           java.lang.String time,
           float anotherTotalThroughput,
           float totalAllThroughput,
           float totalPackets) {
           this.time = time;
           this.anotherTotalThroughput = anotherTotalThroughput;
           this.totalAllThroughput = totalAllThroughput;
           this.totalPackets = totalPackets;
    }


    /**
     * Gets the time value for this Totalthroughput2020.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this Totalthroughput2020.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the anotherTotalThroughput value for this Totalthroughput2020.
     * 
     * @return anotherTotalThroughput
     */
    public float getAnotherTotalThroughput() {
        return anotherTotalThroughput;
    }


    /**
     * Sets the anotherTotalThroughput value for this Totalthroughput2020.
     * 
     * @param anotherTotalThroughput
     */
    public void setAnotherTotalThroughput(float anotherTotalThroughput) {
        this.anotherTotalThroughput = anotherTotalThroughput;
    }


    /**
     * Gets the totalAllThroughput value for this Totalthroughput2020.
     * 
     * @return totalAllThroughput
     */
    public float getTotalAllThroughput() {
        return totalAllThroughput;
    }


    /**
     * Sets the totalAllThroughput value for this Totalthroughput2020.
     * 
     * @param totalAllThroughput
     */
    public void setTotalAllThroughput(float totalAllThroughput) {
        this.totalAllThroughput = totalAllThroughput;
    }


    /**
     * Gets the totalPackets value for this Totalthroughput2020.
     * 
     * @return totalPackets
     */
    public float getTotalPackets() {
        return totalPackets;
    }


    /**
     * Sets the totalPackets value for this Totalthroughput2020.
     * 
     * @param totalPackets
     */
    public void setTotalPackets(float totalPackets) {
        this.totalPackets = totalPackets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Totalthroughput2020)) return false;
        Totalthroughput2020 other = (Totalthroughput2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            this.anotherTotalThroughput == other.getAnotherTotalThroughput() &&
            this.totalAllThroughput == other.getTotalAllThroughput() &&
            this.totalPackets == other.getTotalPackets();
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
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        _hashCode += new Float(getAnotherTotalThroughput()).hashCode();
        _hashCode += new Float(getTotalAllThroughput()).hashCode();
        _hashCode += new Float(getTotalPackets()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Totalthroughput2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Totalthroughput2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anotherTotalThroughput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "anotherTotalThroughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAllThroughput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalAllThroughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPackets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalPackets"));
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
