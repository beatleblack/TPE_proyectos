/**
 * GetGlobalAppAqmWorstn2020ResponseType0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGlobalAppAqmWorstn2020ResponseType0  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getGlobalAppAqmWorstn2020Result;

    public GetGlobalAppAqmWorstn2020ResponseType0() {
    }

    public GetGlobalAppAqmWorstn2020ResponseType0(
           org.tempuri.ArrResultAgilController getGlobalAppAqmWorstn2020Result) {
           this.getGlobalAppAqmWorstn2020Result = getGlobalAppAqmWorstn2020Result;
    }


    /**
     * Gets the getGlobalAppAqmWorstn2020Result value for this GetGlobalAppAqmWorstn2020ResponseType0.
     * 
     * @return getGlobalAppAqmWorstn2020Result
     */
    public org.tempuri.ArrResultAgilController getGetGlobalAppAqmWorstn2020Result() {
        return getGlobalAppAqmWorstn2020Result;
    }


    /**
     * Sets the getGlobalAppAqmWorstn2020Result value for this GetGlobalAppAqmWorstn2020ResponseType0.
     * 
     * @param getGlobalAppAqmWorstn2020Result
     */
    public void setGetGlobalAppAqmWorstn2020Result(org.tempuri.ArrResultAgilController getGlobalAppAqmWorstn2020Result) {
        this.getGlobalAppAqmWorstn2020Result = getGlobalAppAqmWorstn2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGlobalAppAqmWorstn2020ResponseType0)) return false;
        GetGlobalAppAqmWorstn2020ResponseType0 other = (GetGlobalAppAqmWorstn2020ResponseType0) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGlobalAppAqmWorstn2020Result==null && other.getGetGlobalAppAqmWorstn2020Result()==null) || 
             (this.getGlobalAppAqmWorstn2020Result!=null &&
              this.getGlobalAppAqmWorstn2020Result.equals(other.getGetGlobalAppAqmWorstn2020Result())));
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
        if (getGetGlobalAppAqmWorstn2020Result() != null) {
            _hashCode += getGetGlobalAppAqmWorstn2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGlobalAppAqmWorstn2020ResponseType0.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getGlobalAppAqmWorstn2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGlobalAppAqmWorstn2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getGlobalAppAqmWorstn2020Result"));
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
