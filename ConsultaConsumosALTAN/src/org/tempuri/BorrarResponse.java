/**
 * BorrarResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BorrarResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController[] borrarResult;

    public BorrarResponse() {
    }

    public BorrarResponse(
           org.tempuri.ArrResultAgilController[] borrarResult) {
           this.borrarResult = borrarResult;
    }


    /**
     * Gets the borrarResult value for this BorrarResponse.
     * 
     * @return borrarResult
     */
    public org.tempuri.ArrResultAgilController[] getBorrarResult() {
        return borrarResult;
    }


    /**
     * Sets the borrarResult value for this BorrarResponse.
     * 
     * @param borrarResult
     */
    public void setBorrarResult(org.tempuri.ArrResultAgilController[] borrarResult) {
        this.borrarResult = borrarResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BorrarResponse)) return false;
        BorrarResponse other = (BorrarResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.borrarResult==null && other.getBorrarResult()==null) || 
             (this.borrarResult!=null &&
              java.util.Arrays.equals(this.borrarResult, other.getBorrarResult())));
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
        if (getBorrarResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBorrarResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBorrarResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BorrarResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BorrarResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("borrarResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BorrarResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "arrResultAgilController"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "arrResultAgilController"));
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
