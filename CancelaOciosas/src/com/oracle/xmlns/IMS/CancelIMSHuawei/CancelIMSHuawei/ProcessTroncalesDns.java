/**
 * ProcessTroncalesDns.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei;

public class ProcessTroncalesDns  implements java.io.Serializable {
    private java.lang.String DN;

    private java.lang.String IP;

    private com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDnsDID[] DID;

    public ProcessTroncalesDns() {
    }

    public ProcessTroncalesDns(
           java.lang.String DN,
           java.lang.String IP,
           com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDnsDID[] DID) {
           this.DN = DN;
           this.IP = IP;
           this.DID = DID;
    }


    /**
     * Gets the DN value for this ProcessTroncalesDns.
     * 
     * @return DN
     */
    public java.lang.String getDN() {
        return DN;
    }


    /**
     * Sets the DN value for this ProcessTroncalesDns.
     * 
     * @param DN
     */
    public void setDN(java.lang.String DN) {
        this.DN = DN;
    }


    /**
     * Gets the IP value for this ProcessTroncalesDns.
     * 
     * @return IP
     */
    public java.lang.String getIP() {
        return IP;
    }


    /**
     * Sets the IP value for this ProcessTroncalesDns.
     * 
     * @param IP
     */
    public void setIP(java.lang.String IP) {
        this.IP = IP;
    }


    /**
     * Gets the DID value for this ProcessTroncalesDns.
     * 
     * @return DID
     */
    public com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDnsDID[] getDID() {
        return DID;
    }


    /**
     * Sets the DID value for this ProcessTroncalesDns.
     * 
     * @param DID
     */
    public void setDID(com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDnsDID[] DID) {
        this.DID = DID;
    }

    public com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDnsDID getDID(int i) {
        return this.DID[i];
    }

    public void setDID(int i, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDnsDID _value) {
        this.DID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessTroncalesDns)) return false;
        ProcessTroncalesDns other = (ProcessTroncalesDns) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DN==null && other.getDN()==null) || 
             (this.DN!=null &&
              this.DN.equals(other.getDN()))) &&
            ((this.IP==null && other.getIP()==null) || 
             (this.IP!=null &&
              this.IP.equals(other.getIP()))) &&
            ((this.DID==null && other.getDID()==null) || 
             (this.DID!=null &&
              java.util.Arrays.equals(this.DID, other.getDID())));
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
        if (getDN() != null) {
            _hashCode += getDN().hashCode();
        }
        if (getIP() != null) {
            _hashCode += getIP().hashCode();
        }
        if (getDID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDID(), i);
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
        new org.apache.axis.description.TypeDesc(ProcessTroncalesDns.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>>process>Troncales>Dns"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "DN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "IP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "DID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>>>process>Troncales>Dns>DID"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
