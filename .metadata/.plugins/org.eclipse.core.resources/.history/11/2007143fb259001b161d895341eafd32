/**
 * UsageDisk2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UsageDisk2020  implements java.io.Serializable {
    private int timestamp;

    private float diskSpaceUsage;

    private float diskSpaceAvail;

    public UsageDisk2020() {
    }

    public UsageDisk2020(
           int timestamp,
           float diskSpaceUsage,
           float diskSpaceAvail) {
           this.timestamp = timestamp;
           this.diskSpaceUsage = diskSpaceUsage;
           this.diskSpaceAvail = diskSpaceAvail;
    }


    /**
     * Gets the timestamp value for this UsageDisk2020.
     * 
     * @return timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this UsageDisk2020.
     * 
     * @param timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the diskSpaceUsage value for this UsageDisk2020.
     * 
     * @return diskSpaceUsage
     */
    public float getDiskSpaceUsage() {
        return diskSpaceUsage;
    }


    /**
     * Sets the diskSpaceUsage value for this UsageDisk2020.
     * 
     * @param diskSpaceUsage
     */
    public void setDiskSpaceUsage(float diskSpaceUsage) {
        this.diskSpaceUsage = diskSpaceUsage;
    }


    /**
     * Gets the diskSpaceAvail value for this UsageDisk2020.
     * 
     * @return diskSpaceAvail
     */
    public float getDiskSpaceAvail() {
        return diskSpaceAvail;
    }


    /**
     * Sets the diskSpaceAvail value for this UsageDisk2020.
     * 
     * @param diskSpaceAvail
     */
    public void setDiskSpaceAvail(float diskSpaceAvail) {
        this.diskSpaceAvail = diskSpaceAvail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageDisk2020)) return false;
        UsageDisk2020 other = (UsageDisk2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.timestamp == other.getTimestamp() &&
            this.diskSpaceUsage == other.getDiskSpaceUsage() &&
            this.diskSpaceAvail == other.getDiskSpaceAvail();
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
        _hashCode += getTimestamp();
        _hashCode += new Float(getDiskSpaceUsage()).hashCode();
        _hashCode += new Float(getDiskSpaceAvail()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageDisk2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "UsageDisk2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSpaceUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "diskSpaceUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSpaceAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "diskSpaceAvail"));
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
