/**
 * GetDiskSpaceUsage2020Type10.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDiskSpaceUsage2020Type10  implements java.io.Serializable {
    private java.lang.String strIdCustomer;

    public GetDiskSpaceUsage2020Type10() {
    }

    public GetDiskSpaceUsage2020Type10(
           java.lang.String strIdCustomer) {
           this.strIdCustomer = strIdCustomer;
    }


    /**
     * Gets the strIdCustomer value for this GetDiskSpaceUsage2020Type10.
     * 
     * @return strIdCustomer
     */
    public java.lang.String getStrIdCustomer() {
        return strIdCustomer;
    }


    /**
     * Sets the strIdCustomer value for this GetDiskSpaceUsage2020Type10.
     * 
     * @param strIdCustomer
     */
    public void setStrIdCustomer(java.lang.String strIdCustomer) {
        this.strIdCustomer = strIdCustomer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDiskSpaceUsage2020Type10)) return false;
        GetDiskSpaceUsage2020Type10 other = (GetDiskSpaceUsage2020Type10) obj;
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
              this.strIdCustomer.equals(other.getStrIdCustomer())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDiskSpaceUsage2020Type10.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDiskSpaceUsage2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIdCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIdCustomer"));
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
