/**
 * ResponseSubnetQ2020B.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResponseSubnetQ2020B  implements java.io.Serializable {
    private org.tempuri.QuerysubnetsresponseB querySubnetsResponse;

    public ResponseSubnetQ2020B() {
    }

    public ResponseSubnetQ2020B(
           org.tempuri.QuerysubnetsresponseB querySubnetsResponse) {
           this.querySubnetsResponse = querySubnetsResponse;
    }


    /**
     * Gets the querySubnetsResponse value for this ResponseSubnetQ2020B.
     * 
     * @return querySubnetsResponse
     */
    public org.tempuri.QuerysubnetsresponseB getQuerySubnetsResponse() {
        return querySubnetsResponse;
    }


    /**
     * Sets the querySubnetsResponse value for this ResponseSubnetQ2020B.
     * 
     * @param querySubnetsResponse
     */
    public void setQuerySubnetsResponse(org.tempuri.QuerysubnetsresponseB querySubnetsResponse) {
        this.querySubnetsResponse = querySubnetsResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseSubnetQ2020B)) return false;
        ResponseSubnetQ2020B other = (ResponseSubnetQ2020B) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySubnetsResponse==null && other.getQuerySubnetsResponse()==null) || 
             (this.querySubnetsResponse!=null &&
              this.querySubnetsResponse.equals(other.getQuerySubnetsResponse())));
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
        if (getQuerySubnetsResponse() != null) {
            _hashCode += getQuerySubnetsResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseSubnetQ2020B.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSubnetQ2020B"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySubnetsResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QuerySubnetsResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "QuerysubnetsresponseB"));
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
