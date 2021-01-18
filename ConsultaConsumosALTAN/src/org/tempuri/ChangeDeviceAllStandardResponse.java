/**
 * ChangeDeviceAllStandardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ChangeDeviceAllStandardResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController changeDeviceAllStandardResult;

    public ChangeDeviceAllStandardResponse() {
    }

    public ChangeDeviceAllStandardResponse(
           org.tempuri.ArrResultAgilController changeDeviceAllStandardResult) {
           this.changeDeviceAllStandardResult = changeDeviceAllStandardResult;
    }


    /**
     * Gets the changeDeviceAllStandardResult value for this ChangeDeviceAllStandardResponse.
     * 
     * @return changeDeviceAllStandardResult
     */
    public org.tempuri.ArrResultAgilController getChangeDeviceAllStandardResult() {
        return changeDeviceAllStandardResult;
    }


    /**
     * Sets the changeDeviceAllStandardResult value for this ChangeDeviceAllStandardResponse.
     * 
     * @param changeDeviceAllStandardResult
     */
    public void setChangeDeviceAllStandardResult(org.tempuri.ArrResultAgilController changeDeviceAllStandardResult) {
        this.changeDeviceAllStandardResult = changeDeviceAllStandardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeDeviceAllStandardResponse)) return false;
        ChangeDeviceAllStandardResponse other = (ChangeDeviceAllStandardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeDeviceAllStandardResult==null && other.getChangeDeviceAllStandardResult()==null) || 
             (this.changeDeviceAllStandardResult!=null &&
              this.changeDeviceAllStandardResult.equals(other.getChangeDeviceAllStandardResult())));
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
        if (getChangeDeviceAllStandardResult() != null) {
            _hashCode += getChangeDeviceAllStandardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeDeviceAllStandardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ChangeDeviceAllStandardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeDeviceAllStandardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ChangeDeviceAllStandardResult"));
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
