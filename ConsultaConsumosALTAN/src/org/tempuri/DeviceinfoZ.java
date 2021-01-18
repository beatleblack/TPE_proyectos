/**
 * DeviceinfoZ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeviceinfoZ  implements java.io.Serializable {
    private java.lang.String deviceID;

    private java.lang.String deviceType;

    private java.lang.String deviceName;

    private java.lang.String deviceESN;

    private java.lang.Object fSharp;

    private java.lang.Object linkInfo;

    private java.lang.Object linkID;

    public DeviceinfoZ() {
    }

    public DeviceinfoZ(
           java.lang.String deviceID,
           java.lang.String deviceType,
           java.lang.String deviceName,
           java.lang.String deviceESN,
           java.lang.Object fSharp,
           java.lang.Object linkInfo,
           java.lang.Object linkID) {
           this.deviceID = deviceID;
           this.deviceType = deviceType;
           this.deviceName = deviceName;
           this.deviceESN = deviceESN;
           this.fSharp = fSharp;
           this.linkInfo = linkInfo;
           this.linkID = linkID;
    }


    /**
     * Gets the deviceID value for this DeviceinfoZ.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this DeviceinfoZ.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceType value for this DeviceinfoZ.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this DeviceinfoZ.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the deviceName value for this DeviceinfoZ.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DeviceinfoZ.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceESN value for this DeviceinfoZ.
     * 
     * @return deviceESN
     */
    public java.lang.String getDeviceESN() {
        return deviceESN;
    }


    /**
     * Sets the deviceESN value for this DeviceinfoZ.
     * 
     * @param deviceESN
     */
    public void setDeviceESN(java.lang.String deviceESN) {
        this.deviceESN = deviceESN;
    }


    /**
     * Gets the fSharp value for this DeviceinfoZ.
     * 
     * @return fSharp
     */
    public java.lang.Object getFSharp() {
        return fSharp;
    }


    /**
     * Sets the fSharp value for this DeviceinfoZ.
     * 
     * @param fSharp
     */
    public void setFSharp(java.lang.Object fSharp) {
        this.fSharp = fSharp;
    }


    /**
     * Gets the linkInfo value for this DeviceinfoZ.
     * 
     * @return linkInfo
     */
    public java.lang.Object getLinkInfo() {
        return linkInfo;
    }


    /**
     * Sets the linkInfo value for this DeviceinfoZ.
     * 
     * @param linkInfo
     */
    public void setLinkInfo(java.lang.Object linkInfo) {
        this.linkInfo = linkInfo;
    }


    /**
     * Gets the linkID value for this DeviceinfoZ.
     * 
     * @return linkID
     */
    public java.lang.Object getLinkID() {
        return linkID;
    }


    /**
     * Sets the linkID value for this DeviceinfoZ.
     * 
     * @param linkID
     */
    public void setLinkID(java.lang.Object linkID) {
        this.linkID = linkID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceinfoZ)) return false;
        DeviceinfoZ other = (DeviceinfoZ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.deviceESN==null && other.getDeviceESN()==null) || 
             (this.deviceESN!=null &&
              this.deviceESN.equals(other.getDeviceESN()))) &&
            ((this.fSharp==null && other.getFSharp()==null) || 
             (this.fSharp!=null &&
              this.fSharp.equals(other.getFSharp()))) &&
            ((this.linkInfo==null && other.getLinkInfo()==null) || 
             (this.linkInfo!=null &&
              this.linkInfo.equals(other.getLinkInfo()))) &&
            ((this.linkID==null && other.getLinkID()==null) || 
             (this.linkID!=null &&
              this.linkID.equals(other.getLinkID())));
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
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getDeviceESN() != null) {
            _hashCode += getDeviceESN().hashCode();
        }
        if (getFSharp() != null) {
            _hashCode += getFSharp().hashCode();
        }
        if (getLinkInfo() != null) {
            _hashCode += getLinkInfo().hashCode();
        }
        if (getLinkID() != null) {
            _hashCode += getLinkID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceinfoZ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceinfoZ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceESN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceESN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FSharp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fSharp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "linkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "linkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
