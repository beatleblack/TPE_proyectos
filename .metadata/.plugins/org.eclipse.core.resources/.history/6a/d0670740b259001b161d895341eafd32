/**
 * PruebitaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PruebitaResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController[] pruebitaResult;

    public PruebitaResponse() {
    }

    public PruebitaResponse(
           org.tempuri.ArrResultAgilController[] pruebitaResult) {
           this.pruebitaResult = pruebitaResult;
    }


    /**
     * Gets the pruebitaResult value for this PruebitaResponse.
     * 
     * @return pruebitaResult
     */
    public org.tempuri.ArrResultAgilController[] getPruebitaResult() {
        return pruebitaResult;
    }


    /**
     * Sets the pruebitaResult value for this PruebitaResponse.
     * 
     * @param pruebitaResult
     */
    public void setPruebitaResult(org.tempuri.ArrResultAgilController[] pruebitaResult) {
        this.pruebitaResult = pruebitaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PruebitaResponse)) return false;
        PruebitaResponse other = (PruebitaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pruebitaResult==null && other.getPruebitaResult()==null) || 
             (this.pruebitaResult!=null &&
              java.util.Arrays.equals(this.pruebitaResult, other.getPruebitaResult())));
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
        if (getPruebitaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPruebitaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPruebitaResult(), i);
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
        new org.apache.axis.description.TypeDesc(PruebitaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PruebitaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pruebitaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PruebitaResult"));
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
