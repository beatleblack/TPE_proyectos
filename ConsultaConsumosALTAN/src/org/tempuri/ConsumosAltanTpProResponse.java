/**
 * ConsumosAltanTpProResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ConsumosAltanTpProResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController consumosAltanTpProResult;

    public ConsumosAltanTpProResponse() {
    }

    public ConsumosAltanTpProResponse(
           org.tempuri.ArrResultAgilController consumosAltanTpProResult) {
           this.consumosAltanTpProResult = consumosAltanTpProResult;
    }


    /**
     * Gets the consumosAltanTpProResult value for this ConsumosAltanTpProResponse.
     * 
     * @return consumosAltanTpProResult
     */
    public org.tempuri.ArrResultAgilController getConsumosAltanTpProResult() {
        return consumosAltanTpProResult;
    }


    /**
     * Sets the consumosAltanTpProResult value for this ConsumosAltanTpProResponse.
     * 
     * @param consumosAltanTpProResult
     */
    public void setConsumosAltanTpProResult(org.tempuri.ArrResultAgilController consumosAltanTpProResult) {
        this.consumosAltanTpProResult = consumosAltanTpProResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsumosAltanTpProResponse)) return false;
        ConsumosAltanTpProResponse other = (ConsumosAltanTpProResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consumosAltanTpProResult==null && other.getConsumosAltanTpProResult()==null) || 
             (this.consumosAltanTpProResult!=null &&
              this.consumosAltanTpProResult.equals(other.getConsumosAltanTpProResult())));
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
        if (getConsumosAltanTpProResult() != null) {
            _hashCode += getConsumosAltanTpProResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsumosAltanTpProResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ConsumosAltanTpProResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumosAltanTpProResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ConsumosAltanTpProResult"));
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
