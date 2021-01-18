/**
 * IsExistDevice2020Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IsExistDevice2020Response  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController isExistDevice2020Result;

    public IsExistDevice2020Response() {
    }

    public IsExistDevice2020Response(
           org.tempuri.ArrResultAgilController isExistDevice2020Result) {
           this.isExistDevice2020Result = isExistDevice2020Result;
    }


    /**
     * Gets the isExistDevice2020Result value for this IsExistDevice2020Response.
     * 
     * @return isExistDevice2020Result
     */
    public org.tempuri.ArrResultAgilController getIsExistDevice2020Result() {
        return isExistDevice2020Result;
    }


    /**
     * Sets the isExistDevice2020Result value for this IsExistDevice2020Response.
     * 
     * @param isExistDevice2020Result
     */
    public void setIsExistDevice2020Result(org.tempuri.ArrResultAgilController isExistDevice2020Result) {
        this.isExistDevice2020Result = isExistDevice2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsExistDevice2020Response)) return false;
        IsExistDevice2020Response other = (IsExistDevice2020Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isExistDevice2020Result==null && other.getIsExistDevice2020Result()==null) || 
             (this.isExistDevice2020Result!=null &&
              this.isExistDevice2020Result.equals(other.getIsExistDevice2020Result())));
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
        if (getIsExistDevice2020Result() != null) {
            _hashCode += getIsExistDevice2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsExistDevice2020Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsExistDevice2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExistDevice2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsExistDevice2020Result"));
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
