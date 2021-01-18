/**
 * GetSiteHealthInfo_UPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSiteHealthInfo_UPResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getSiteHealthInfo_UPResult;

    public GetSiteHealthInfo_UPResponse() {
    }

    public GetSiteHealthInfo_UPResponse(
           org.tempuri.ArrResultAgilController getSiteHealthInfo_UPResult) {
           this.getSiteHealthInfo_UPResult = getSiteHealthInfo_UPResult;
    }


    /**
     * Gets the getSiteHealthInfo_UPResult value for this GetSiteHealthInfo_UPResponse.
     * 
     * @return getSiteHealthInfo_UPResult
     */
    public org.tempuri.ArrResultAgilController getGetSiteHealthInfo_UPResult() {
        return getSiteHealthInfo_UPResult;
    }


    /**
     * Sets the getSiteHealthInfo_UPResult value for this GetSiteHealthInfo_UPResponse.
     * 
     * @param getSiteHealthInfo_UPResult
     */
    public void setGetSiteHealthInfo_UPResult(org.tempuri.ArrResultAgilController getSiteHealthInfo_UPResult) {
        this.getSiteHealthInfo_UPResult = getSiteHealthInfo_UPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSiteHealthInfo_UPResponse)) return false;
        GetSiteHealthInfo_UPResponse other = (GetSiteHealthInfo_UPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSiteHealthInfo_UPResult==null && other.getGetSiteHealthInfo_UPResult()==null) || 
             (this.getSiteHealthInfo_UPResult!=null &&
              this.getSiteHealthInfo_UPResult.equals(other.getGetSiteHealthInfo_UPResult())));
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
        if (getGetSiteHealthInfo_UPResult() != null) {
            _hashCode += getGetSiteHealthInfo_UPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSiteHealthInfo_UPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getSiteHealthInfo_UPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSiteHealthInfo_UPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getSiteHealthInfo_UPResult"));
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
