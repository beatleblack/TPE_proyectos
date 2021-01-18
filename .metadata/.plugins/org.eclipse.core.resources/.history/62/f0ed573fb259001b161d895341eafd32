/**
 * ResponseLostDevice2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResponseLostDevice2020  implements java.io.Serializable {
    private java.lang.String errcode;

    private java.lang.String errmsg;

    private org.tempuri.SuccessLostDevice[] success;

    private java.lang.Object[] fail;

    public ResponseLostDevice2020() {
    }

    public ResponseLostDevice2020(
           java.lang.String errcode,
           java.lang.String errmsg,
           org.tempuri.SuccessLostDevice[] success,
           java.lang.Object[] fail) {
           this.errcode = errcode;
           this.errmsg = errmsg;
           this.success = success;
           this.fail = fail;
    }


    /**
     * Gets the errcode value for this ResponseLostDevice2020.
     * 
     * @return errcode
     */
    public java.lang.String getErrcode() {
        return errcode;
    }


    /**
     * Sets the errcode value for this ResponseLostDevice2020.
     * 
     * @param errcode
     */
    public void setErrcode(java.lang.String errcode) {
        this.errcode = errcode;
    }


    /**
     * Gets the errmsg value for this ResponseLostDevice2020.
     * 
     * @return errmsg
     */
    public java.lang.String getErrmsg() {
        return errmsg;
    }


    /**
     * Sets the errmsg value for this ResponseLostDevice2020.
     * 
     * @param errmsg
     */
    public void setErrmsg(java.lang.String errmsg) {
        this.errmsg = errmsg;
    }


    /**
     * Gets the success value for this ResponseLostDevice2020.
     * 
     * @return success
     */
    public org.tempuri.SuccessLostDevice[] getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ResponseLostDevice2020.
     * 
     * @param success
     */
    public void setSuccess(org.tempuri.SuccessLostDevice[] success) {
        this.success = success;
    }


    /**
     * Gets the fail value for this ResponseLostDevice2020.
     * 
     * @return fail
     */
    public java.lang.Object[] getFail() {
        return fail;
    }


    /**
     * Sets the fail value for this ResponseLostDevice2020.
     * 
     * @param fail
     */
    public void setFail(java.lang.Object[] fail) {
        this.fail = fail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseLostDevice2020)) return false;
        ResponseLostDevice2020 other = (ResponseLostDevice2020) obj;
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
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              java.util.Arrays.equals(this.success, other.getSuccess()))) &&
            ((this.fail==null && other.getFail()==null) || 
             (this.fail!=null &&
              java.util.Arrays.equals(this.fail, other.getFail())));
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
        if (getSuccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccess(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFail(), i);
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
        new org.apache.axis.description.TypeDesc(ResponseLostDevice2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseLostDevice2020"));
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
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SuccessLostDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "SuccessLostDevice"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
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
