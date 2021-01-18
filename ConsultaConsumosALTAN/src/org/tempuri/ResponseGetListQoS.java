/**
 * ResponseGetListQoS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResponseGetListQoS  implements java.io.Serializable {
    private java.lang.String errcode;

    private java.lang.String errmsg;

    private org.tempuri.ResultQoS result;

    public ResponseGetListQoS() {
    }

    public ResponseGetListQoS(
           java.lang.String errcode,
           java.lang.String errmsg,
           org.tempuri.ResultQoS result) {
           this.errcode = errcode;
           this.errmsg = errmsg;
           this.result = result;
    }


    /**
     * Gets the errcode value for this ResponseGetListQoS.
     * 
     * @return errcode
     */
    public java.lang.String getErrcode() {
        return errcode;
    }


    /**
     * Sets the errcode value for this ResponseGetListQoS.
     * 
     * @param errcode
     */
    public void setErrcode(java.lang.String errcode) {
        this.errcode = errcode;
    }


    /**
     * Gets the errmsg value for this ResponseGetListQoS.
     * 
     * @return errmsg
     */
    public java.lang.String getErrmsg() {
        return errmsg;
    }


    /**
     * Sets the errmsg value for this ResponseGetListQoS.
     * 
     * @param errmsg
     */
    public void setErrmsg(java.lang.String errmsg) {
        this.errmsg = errmsg;
    }


    /**
     * Gets the result value for this ResponseGetListQoS.
     * 
     * @return result
     */
    public org.tempuri.ResultQoS getResult() {
        return result;
    }


    /**
     * Sets the result value for this ResponseGetListQoS.
     * 
     * @param result
     */
    public void setResult(org.tempuri.ResultQoS result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseGetListQoS)) return false;
        ResponseGetListQoS other = (ResponseGetListQoS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errcode==null && other.getErrcode()==null) || 
             (this.errcode!=null &&
              this.errcode.equals(other.getErrcode()))) &&
            ((this.errmsg==null && other.getErrmsg()==null) || 
             (this.errmsg!=null &&
              this.errmsg.equals(other.getErrmsg()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getErrcode() != null) {
            _hashCode += getErrcode().hashCode();
        }
        if (getErrmsg() != null) {
            _hashCode += getErrmsg().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseGetListQoS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetListQoS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "errcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errmsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "errmsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResultQoS"));
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
