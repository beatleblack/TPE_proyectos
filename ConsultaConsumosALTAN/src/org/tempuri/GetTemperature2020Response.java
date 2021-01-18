/**
 * GetTemperature2020Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTemperature2020Response  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getTemperature2020Result;

    public GetTemperature2020Response() {
    }

    public GetTemperature2020Response(
           org.tempuri.ArrResultAgilController getTemperature2020Result) {
           this.getTemperature2020Result = getTemperature2020Result;
    }


    /**
     * Gets the getTemperature2020Result value for this GetTemperature2020Response.
     * 
     * @return getTemperature2020Result
     */
    public org.tempuri.ArrResultAgilController getGetTemperature2020Result() {
        return getTemperature2020Result;
    }


    /**
     * Sets the getTemperature2020Result value for this GetTemperature2020Response.
     * 
     * @param getTemperature2020Result
     */
    public void setGetTemperature2020Result(org.tempuri.ArrResultAgilController getTemperature2020Result) {
        this.getTemperature2020Result = getTemperature2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTemperature2020Response)) return false;
        GetTemperature2020Response other = (GetTemperature2020Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTemperature2020Result==null && other.getGetTemperature2020Result()==null) || 
             (this.getTemperature2020Result!=null &&
              this.getTemperature2020Result.equals(other.getGetTemperature2020Result())));
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
        if (getGetTemperature2020Result() != null) {
            _hashCode += getGetTemperature2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTemperature2020Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTemperature2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTemperature2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTemperature2020Result"));
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
