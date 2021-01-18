/**
 * GetSecurityPolicies2020Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSecurityPolicies2020Response  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getSecurityPolicies2020Result;

    public GetSecurityPolicies2020Response() {
    }

    public GetSecurityPolicies2020Response(
           org.tempuri.ArrResultAgilController getSecurityPolicies2020Result) {
           this.getSecurityPolicies2020Result = getSecurityPolicies2020Result;
    }


    /**
     * Gets the getSecurityPolicies2020Result value for this GetSecurityPolicies2020Response.
     * 
     * @return getSecurityPolicies2020Result
     */
    public org.tempuri.ArrResultAgilController getGetSecurityPolicies2020Result() {
        return getSecurityPolicies2020Result;
    }


    /**
     * Sets the getSecurityPolicies2020Result value for this GetSecurityPolicies2020Response.
     * 
     * @param getSecurityPolicies2020Result
     */
    public void setGetSecurityPolicies2020Result(org.tempuri.ArrResultAgilController getSecurityPolicies2020Result) {
        this.getSecurityPolicies2020Result = getSecurityPolicies2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSecurityPolicies2020Response)) return false;
        GetSecurityPolicies2020Response other = (GetSecurityPolicies2020Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSecurityPolicies2020Result==null && other.getGetSecurityPolicies2020Result()==null) || 
             (this.getSecurityPolicies2020Result!=null &&
              this.getSecurityPolicies2020Result.equals(other.getGetSecurityPolicies2020Result())));
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
        if (getGetSecurityPolicies2020Result() != null) {
            _hashCode += getGetSecurityPolicies2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSecurityPolicies2020Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSecurityPolicies2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSecurityPolicies2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSecurityPolicies2020Result"));
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
