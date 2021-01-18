/**
 * DeleteDevice2020AgileDBResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteDevice2020AgileDBResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController deleteDevice2020AgileDBResult;

    public DeleteDevice2020AgileDBResponse() {
    }

    public DeleteDevice2020AgileDBResponse(
           org.tempuri.ArrResultAgilController deleteDevice2020AgileDBResult) {
           this.deleteDevice2020AgileDBResult = deleteDevice2020AgileDBResult;
    }


    /**
     * Gets the deleteDevice2020AgileDBResult value for this DeleteDevice2020AgileDBResponse.
     * 
     * @return deleteDevice2020AgileDBResult
     */
    public org.tempuri.ArrResultAgilController getDeleteDevice2020AgileDBResult() {
        return deleteDevice2020AgileDBResult;
    }


    /**
     * Sets the deleteDevice2020AgileDBResult value for this DeleteDevice2020AgileDBResponse.
     * 
     * @param deleteDevice2020AgileDBResult
     */
    public void setDeleteDevice2020AgileDBResult(org.tempuri.ArrResultAgilController deleteDevice2020AgileDBResult) {
        this.deleteDevice2020AgileDBResult = deleteDevice2020AgileDBResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteDevice2020AgileDBResponse)) return false;
        DeleteDevice2020AgileDBResponse other = (DeleteDevice2020AgileDBResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteDevice2020AgileDBResult==null && other.getDeleteDevice2020AgileDBResult()==null) || 
             (this.deleteDevice2020AgileDBResult!=null &&
              this.deleteDevice2020AgileDBResult.equals(other.getDeleteDevice2020AgileDBResult())));
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
        if (getDeleteDevice2020AgileDBResult() != null) {
            _hashCode += getDeleteDevice2020AgileDBResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteDevice2020AgileDBResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteDevice2020AgileDBResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteDevice2020AgileDBResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteDevice2020AgileDBResult"));
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
