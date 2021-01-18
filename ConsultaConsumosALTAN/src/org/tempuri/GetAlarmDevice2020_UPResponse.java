/**
 * GetAlarmDevice2020_UPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAlarmDevice2020_UPResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getAlarmDevice2020_UPResult;

    public GetAlarmDevice2020_UPResponse() {
    }

    public GetAlarmDevice2020_UPResponse(
           org.tempuri.ArrResultAgilController getAlarmDevice2020_UPResult) {
           this.getAlarmDevice2020_UPResult = getAlarmDevice2020_UPResult;
    }


    /**
     * Gets the getAlarmDevice2020_UPResult value for this GetAlarmDevice2020_UPResponse.
     * 
     * @return getAlarmDevice2020_UPResult
     */
    public org.tempuri.ArrResultAgilController getGetAlarmDevice2020_UPResult() {
        return getAlarmDevice2020_UPResult;
    }


    /**
     * Sets the getAlarmDevice2020_UPResult value for this GetAlarmDevice2020_UPResponse.
     * 
     * @param getAlarmDevice2020_UPResult
     */
    public void setGetAlarmDevice2020_UPResult(org.tempuri.ArrResultAgilController getAlarmDevice2020_UPResult) {
        this.getAlarmDevice2020_UPResult = getAlarmDevice2020_UPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAlarmDevice2020_UPResponse)) return false;
        GetAlarmDevice2020_UPResponse other = (GetAlarmDevice2020_UPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAlarmDevice2020_UPResult==null && other.getGetAlarmDevice2020_UPResult()==null) || 
             (this.getAlarmDevice2020_UPResult!=null &&
              this.getAlarmDevice2020_UPResult.equals(other.getGetAlarmDevice2020_UPResult())));
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
        if (getGetAlarmDevice2020_UPResult() != null) {
            _hashCode += getGetAlarmDevice2020_UPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAlarmDevice2020_UPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAlarmDevice2020_UPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAlarmDevice2020_UPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAlarmDevice2020_UPResult"));
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
