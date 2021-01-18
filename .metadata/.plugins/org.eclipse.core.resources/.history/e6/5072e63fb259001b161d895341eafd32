/**
 * GetBasicInformation2020ResponseType11.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBasicInformation2020ResponseType11  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getBasicInformation2020Result;

    public GetBasicInformation2020ResponseType11() {
    }

    public GetBasicInformation2020ResponseType11(
           org.tempuri.ArrResultAgilController getBasicInformation2020Result) {
           this.getBasicInformation2020Result = getBasicInformation2020Result;
    }


    /**
     * Gets the getBasicInformation2020Result value for this GetBasicInformation2020ResponseType11.
     * 
     * @return getBasicInformation2020Result
     */
    public org.tempuri.ArrResultAgilController getGetBasicInformation2020Result() {
        return getBasicInformation2020Result;
    }


    /**
     * Sets the getBasicInformation2020Result value for this GetBasicInformation2020ResponseType11.
     * 
     * @param getBasicInformation2020Result
     */
    public void setGetBasicInformation2020Result(org.tempuri.ArrResultAgilController getBasicInformation2020Result) {
        this.getBasicInformation2020Result = getBasicInformation2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBasicInformation2020ResponseType11)) return false;
        GetBasicInformation2020ResponseType11 other = (GetBasicInformation2020ResponseType11) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBasicInformation2020Result==null && other.getGetBasicInformation2020Result()==null) || 
             (this.getBasicInformation2020Result!=null &&
              this.getBasicInformation2020Result.equals(other.getGetBasicInformation2020Result())));
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
        if (getGetBasicInformation2020Result() != null) {
            _hashCode += getGetBasicInformation2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBasicInformation2020ResponseType11.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getBasicInformation2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBasicInformation2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getBasicInformation2020Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "arrResultAgilController"));
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
