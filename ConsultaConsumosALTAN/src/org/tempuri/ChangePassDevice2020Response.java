/**
 * ChangePassDevice2020Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ChangePassDevice2020Response  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController changePassDevice2020Result;

    public ChangePassDevice2020Response() {
    }

    public ChangePassDevice2020Response(
           org.tempuri.ArrResultAgilController changePassDevice2020Result) {
           this.changePassDevice2020Result = changePassDevice2020Result;
    }


    /**
     * Gets the changePassDevice2020Result value for this ChangePassDevice2020Response.
     * 
     * @return changePassDevice2020Result
     */
    public org.tempuri.ArrResultAgilController getChangePassDevice2020Result() {
        return changePassDevice2020Result;
    }


    /**
     * Sets the changePassDevice2020Result value for this ChangePassDevice2020Response.
     * 
     * @param changePassDevice2020Result
     */
    public void setChangePassDevice2020Result(org.tempuri.ArrResultAgilController changePassDevice2020Result) {
        this.changePassDevice2020Result = changePassDevice2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePassDevice2020Response)) return false;
        ChangePassDevice2020Response other = (ChangePassDevice2020Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changePassDevice2020Result==null && other.getChangePassDevice2020Result()==null) || 
             (this.changePassDevice2020Result!=null &&
              this.changePassDevice2020Result.equals(other.getChangePassDevice2020Result())));
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
        if (getChangePassDevice2020Result() != null) {
            _hashCode += getChangePassDevice2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePassDevice2020Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ChangePassDevice2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePassDevice2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ChangePassDevice2020Result"));
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
