/**
 * GetDiskSpaceUsage2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDiskSpaceUsage2020  implements java.io.Serializable {
    private java.lang.String strGetTenant;

    private java.lang.String strGetPWD;

    private java.lang.String strIdDevice;

    public GetDiskSpaceUsage2020() {
    }

    public GetDiskSpaceUsage2020(
           java.lang.String strGetTenant,
           java.lang.String strGetPWD,
           java.lang.String strIdDevice) {
           this.strGetTenant = strGetTenant;
           this.strGetPWD = strGetPWD;
           this.strIdDevice = strIdDevice;
    }


    /**
     * Gets the strGetTenant value for this GetDiskSpaceUsage2020.
     * 
     * @return strGetTenant
     */
    public java.lang.String getStrGetTenant() {
        return strGetTenant;
    }


    /**
     * Sets the strGetTenant value for this GetDiskSpaceUsage2020.
     * 
     * @param strGetTenant
     */
    public void setStrGetTenant(java.lang.String strGetTenant) {
        this.strGetTenant = strGetTenant;
    }


    /**
     * Gets the strGetPWD value for this GetDiskSpaceUsage2020.
     * 
     * @return strGetPWD
     */
    public java.lang.String getStrGetPWD() {
        return strGetPWD;
    }


    /**
     * Sets the strGetPWD value for this GetDiskSpaceUsage2020.
     * 
     * @param strGetPWD
     */
    public void setStrGetPWD(java.lang.String strGetPWD) {
        this.strGetPWD = strGetPWD;
    }


    /**
     * Gets the strIdDevice value for this GetDiskSpaceUsage2020.
     * 
     * @return strIdDevice
     */
    public java.lang.String getStrIdDevice() {
        return strIdDevice;
    }


    /**
     * Sets the strIdDevice value for this GetDiskSpaceUsage2020.
     * 
     * @param strIdDevice
     */
    public void setStrIdDevice(java.lang.String strIdDevice) {
        this.strIdDevice = strIdDevice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDiskSpaceUsage2020)) return false;
        GetDiskSpaceUsage2020 other = (GetDiskSpaceUsage2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strGetTenant==null && other.getStrGetTenant()==null) || 
             (this.strGetTenant!=null &&
              this.strGetTenant.equals(other.getStrGetTenant()))) &&
            ((this.strGetPWD==null && other.getStrGetPWD()==null) || 
             (this.strGetPWD!=null &&
              this.strGetPWD.equals(other.getStrGetPWD()))) &&
            ((this.strIdDevice==null && other.getStrIdDevice()==null) || 
             (this.strIdDevice!=null &&
              this.strIdDevice.equals(other.getStrIdDevice())));
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
        if (getStrGetTenant() != null) {
            _hashCode += getStrGetTenant().hashCode();
        }
        if (getStrGetPWD() != null) {
            _hashCode += getStrGetPWD().hashCode();
        }
        if (getStrIdDevice() != null) {
            _hashCode += getStrIdDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDiskSpaceUsage2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getDiskSpaceUsage2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strGetTenant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strGetTenant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strGetPWD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strGetPWD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIdDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIdDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
