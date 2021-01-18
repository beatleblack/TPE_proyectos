/**
 * GetInfoQoSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetInfoQoSResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getInfoQoSResult;

    public GetInfoQoSResponse() {
    }

    public GetInfoQoSResponse(
           org.tempuri.ArrResultAgilController getInfoQoSResult) {
           this.getInfoQoSResult = getInfoQoSResult;
    }


    /**
     * Gets the getInfoQoSResult value for this GetInfoQoSResponse.
     * 
     * @return getInfoQoSResult
     */
    public org.tempuri.ArrResultAgilController getGetInfoQoSResult() {
        return getInfoQoSResult;
    }


    /**
     * Sets the getInfoQoSResult value for this GetInfoQoSResponse.
     * 
     * @param getInfoQoSResult
     */
    public void setGetInfoQoSResult(org.tempuri.ArrResultAgilController getInfoQoSResult) {
        this.getInfoQoSResult = getInfoQoSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoQoSResponse)) return false;
        GetInfoQoSResponse other = (GetInfoQoSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInfoQoSResult==null && other.getGetInfoQoSResult()==null) || 
             (this.getInfoQoSResult!=null &&
              this.getInfoQoSResult.equals(other.getGetInfoQoSResult())));
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
        if (getGetInfoQoSResult() != null) {
            _hashCode += getGetInfoQoSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoQoSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetInfoQoSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInfoQoSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetInfoQoSResult"));
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
