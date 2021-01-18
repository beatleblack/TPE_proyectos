/**
 * ValidEsnInAc_2020Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ValidEsnInAc_2020Response  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController validEsnInAc_2020Result;

    public ValidEsnInAc_2020Response() {
    }

    public ValidEsnInAc_2020Response(
           org.tempuri.ArrResultAgilController validEsnInAc_2020Result) {
           this.validEsnInAc_2020Result = validEsnInAc_2020Result;
    }


    /**
     * Gets the validEsnInAc_2020Result value for this ValidEsnInAc_2020Response.
     * 
     * @return validEsnInAc_2020Result
     */
    public org.tempuri.ArrResultAgilController getValidEsnInAc_2020Result() {
        return validEsnInAc_2020Result;
    }


    /**
     * Sets the validEsnInAc_2020Result value for this ValidEsnInAc_2020Response.
     * 
     * @param validEsnInAc_2020Result
     */
    public void setValidEsnInAc_2020Result(org.tempuri.ArrResultAgilController validEsnInAc_2020Result) {
        this.validEsnInAc_2020Result = validEsnInAc_2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidEsnInAc_2020Response)) return false;
        ValidEsnInAc_2020Response other = (ValidEsnInAc_2020Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validEsnInAc_2020Result==null && other.getValidEsnInAc_2020Result()==null) || 
             (this.validEsnInAc_2020Result!=null &&
              this.validEsnInAc_2020Result.equals(other.getValidEsnInAc_2020Result())));
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
        if (getValidEsnInAc_2020Result() != null) {
            _hashCode += getValidEsnInAc_2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidEsnInAc_2020Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ValidEsnInAc_2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validEsnInAc_2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidEsnInAc_2020Result"));
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
