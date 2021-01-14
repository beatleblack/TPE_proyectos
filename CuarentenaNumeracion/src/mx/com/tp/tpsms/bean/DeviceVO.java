/**
 * DeviceVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.tp.tpsms.bean;

public class DeviceVO  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String esn;

    private java.lang.String isDemo;

    private java.lang.String isInternal;

    private java.lang.String isTest;

    private java.lang.String mac;

    private java.lang.String userAgent;

    public DeviceVO() {
    }

    public DeviceVO(
           java.lang.String alias,
           java.lang.String esn,
           java.lang.String isDemo,
           java.lang.String isInternal,
           java.lang.String isTest,
           java.lang.String mac,
           java.lang.String userAgent) {
           this.alias = alias;
           this.esn = esn;
           this.isDemo = isDemo;
           this.isInternal = isInternal;
           this.isTest = isTest;
           this.mac = mac;
           this.userAgent = userAgent;
    }


    /**
     * Gets the alias value for this DeviceVO.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this DeviceVO.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the esn value for this DeviceVO.
     * 
     * @return esn
     */
    public java.lang.String getEsn() {
        return esn;
    }


    /**
     * Sets the esn value for this DeviceVO.
     * 
     * @param esn
     */
    public void setEsn(java.lang.String esn) {
        this.esn = esn;
    }


    /**
     * Gets the isDemo value for this DeviceVO.
     * 
     * @return isDemo
     */
    public java.lang.String getIsDemo() {
        return isDemo;
    }


    /**
     * Sets the isDemo value for this DeviceVO.
     * 
     * @param isDemo
     */
    public void setIsDemo(java.lang.String isDemo) {
        this.isDemo = isDemo;
    }


    /**
     * Gets the isInternal value for this DeviceVO.
     * 
     * @return isInternal
     */
    public java.lang.String getIsInternal() {
        return isInternal;
    }


    /**
     * Sets the isInternal value for this DeviceVO.
     * 
     * @param isInternal
     */
    public void setIsInternal(java.lang.String isInternal) {
        this.isInternal = isInternal;
    }


    /**
     * Gets the isTest value for this DeviceVO.
     * 
     * @return isTest
     */
    public java.lang.String getIsTest() {
        return isTest;
    }


    /**
     * Sets the isTest value for this DeviceVO.
     * 
     * @param isTest
     */
    public void setIsTest(java.lang.String isTest) {
        this.isTest = isTest;
    }


    /**
     * Gets the mac value for this DeviceVO.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this DeviceVO.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the userAgent value for this DeviceVO.
     * 
     * @return userAgent
     */
    public java.lang.String getUserAgent() {
        return userAgent;
    }


    /**
     * Sets the userAgent value for this DeviceVO.
     * 
     * @param userAgent
     */
    public void setUserAgent(java.lang.String userAgent) {
        this.userAgent = userAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceVO)) return false;
        DeviceVO other = (DeviceVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.esn==null && other.getEsn()==null) || 
             (this.esn!=null &&
              this.esn.equals(other.getEsn()))) &&
            ((this.isDemo==null && other.getIsDemo()==null) || 
             (this.isDemo!=null &&
              this.isDemo.equals(other.getIsDemo()))) &&
            ((this.isInternal==null && other.getIsInternal()==null) || 
             (this.isInternal!=null &&
              this.isInternal.equals(other.getIsInternal()))) &&
            ((this.isTest==null && other.getIsTest()==null) || 
             (this.isTest!=null &&
              this.isTest.equals(other.getIsTest()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.userAgent==null && other.getUserAgent()==null) || 
             (this.userAgent!=null &&
              this.userAgent.equals(other.getUserAgent())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getEsn() != null) {
            _hashCode += getEsn().hashCode();
        }
        if (getIsDemo() != null) {
            _hashCode += getIsDemo().hashCode();
        }
        if (getIsInternal() != null) {
            _hashCode += getIsInternal().hashCode();
        }
        if (getIsTest() != null) {
            _hashCode += getIsTest().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getUserAgent() != null) {
            _hashCode += getUserAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.tpsms.tp.com.mx/", "deviceVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDemo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDemo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInternal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isInternal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isTest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userAgent"));
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
