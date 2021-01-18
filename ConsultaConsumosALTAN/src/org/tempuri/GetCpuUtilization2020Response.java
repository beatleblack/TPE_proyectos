/**
 * GetCpuUtilization2020Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCpuUtilization2020Response  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController getCpuUtilization2020Result;

    public GetCpuUtilization2020Response() {
    }

    public GetCpuUtilization2020Response(
           org.tempuri.ArrResultAgilController getCpuUtilization2020Result) {
           this.getCpuUtilization2020Result = getCpuUtilization2020Result;
    }


    /**
     * Gets the getCpuUtilization2020Result value for this GetCpuUtilization2020Response.
     * 
     * @return getCpuUtilization2020Result
     */
    public org.tempuri.ArrResultAgilController getGetCpuUtilization2020Result() {
        return getCpuUtilization2020Result;
    }


    /**
     * Sets the getCpuUtilization2020Result value for this GetCpuUtilization2020Response.
     * 
     * @param getCpuUtilization2020Result
     */
    public void setGetCpuUtilization2020Result(org.tempuri.ArrResultAgilController getCpuUtilization2020Result) {
        this.getCpuUtilization2020Result = getCpuUtilization2020Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCpuUtilization2020Response)) return false;
        GetCpuUtilization2020Response other = (GetCpuUtilization2020Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCpuUtilization2020Result==null && other.getGetCpuUtilization2020Result()==null) || 
             (this.getCpuUtilization2020Result!=null &&
              this.getCpuUtilization2020Result.equals(other.getGetCpuUtilization2020Result())));
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
        if (getGetCpuUtilization2020Result() != null) {
            _hashCode += getGetCpuUtilization2020Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCpuUtilization2020Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getCpuUtilization2020Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCpuUtilization2020Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getCpuUtilization2020Result"));
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
