/**
 * DeleteAr2020Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteAr2020Response  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController deleteAr2020Result;

    public DeleteAr2020Response() {
    }

    public DeleteAr2020Response(
           org.tempuri.ArrResultAgilController deleteAr2020Result) {
           this.deleteAr2020Result = deleteAr2020Result;
    }


    /**
     * Gets the deleteAr2020Result value for this DeleteAr2020Response.
     * 
     * @return deleteAr2020Result
     */
    public org.tempuri.ArrResultAgilController getDeleteAr2020Result() {
        return deleteAr2020Result;
    }


    /**
     * Sets the deleteAr2020Result value for this DeleteAr2020Response.
     * 
     * @param deleteAr2020Result
     */
    public void setDeleteAr2020Result(org.tempuri.ArrResultAgilController deleteAr2020Result) {
        this.deleteAr2020Result = deleteAr2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteAr2020Response)) return false;
        DeleteAr2020Response other = (DeleteAr2020Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteAr2020Result==null && other.getDeleteAr2020Result()==null) || 
             (this.deleteAr2020Result!=null &&
              this.deleteAr2020Result.equals(other.getDeleteAr2020Result())));
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
        if (getDeleteAr2020Result() != null) {
            _hashCode += getDeleteAr2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteAr2020Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteAr2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteAr2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteAr2020Result"));
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
