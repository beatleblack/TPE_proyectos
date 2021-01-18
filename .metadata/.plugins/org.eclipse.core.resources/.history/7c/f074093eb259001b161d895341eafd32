/**
 * GetARInBDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetARInBDResponse  implements java.io.Serializable {
    private org.tempuri.A100[] getARInBDResult;

    public GetARInBDResponse() {
    }

    public GetARInBDResponse(
           org.tempuri.A100[] getARInBDResult) {
           this.getARInBDResult = getARInBDResult;
    }


    /**
     * Gets the getARInBDResult value for this GetARInBDResponse.
     * 
     * @return getARInBDResult
     */
    public org.tempuri.A100[] getGetARInBDResult() {
        return getARInBDResult;
    }


    /**
     * Sets the getARInBDResult value for this GetARInBDResponse.
     * 
     * @param getARInBDResult
     */
    public void setGetARInBDResult(org.tempuri.A100[] getARInBDResult) {
        this.getARInBDResult = getARInBDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetARInBDResponse)) return false;
        GetARInBDResponse other = (GetARInBDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getARInBDResult==null && other.getGetARInBDResult()==null) || 
             (this.getARInBDResult!=null &&
              java.util.Arrays.equals(this.getARInBDResult, other.getGetARInBDResult())));
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
        if (getGetARInBDResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetARInBDResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetARInBDResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetARInBDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetARInBDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getARInBDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetARInBDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "A100"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "A100"));
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
