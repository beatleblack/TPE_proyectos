/**
 * Throughputtrendvolists2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Throughputtrendvolists2020  implements java.io.Serializable {
    private org.tempuri.Totalthroughput2020[] totalThroughput;

    private org.tempuri.Anothertotalthroughput2020[] anotherTotalThroughput;

    private org.tempuri.Totalpacket2020[] totalPacket;

    public Throughputtrendvolists2020() {
    }

    public Throughputtrendvolists2020(
           org.tempuri.Totalthroughput2020[] totalThroughput,
           org.tempuri.Anothertotalthroughput2020[] anotherTotalThroughput,
           org.tempuri.Totalpacket2020[] totalPacket) {
           this.totalThroughput = totalThroughput;
           this.anotherTotalThroughput = anotherTotalThroughput;
           this.totalPacket = totalPacket;
    }


    /**
     * Gets the totalThroughput value for this Throughputtrendvolists2020.
     * 
     * @return totalThroughput
     */
    public org.tempuri.Totalthroughput2020[] getTotalThroughput() {
        return totalThroughput;
    }


    /**
     * Sets the totalThroughput value for this Throughputtrendvolists2020.
     * 
     * @param totalThroughput
     */
    public void setTotalThroughput(org.tempuri.Totalthroughput2020[] totalThroughput) {
        this.totalThroughput = totalThroughput;
    }


    /**
     * Gets the anotherTotalThroughput value for this Throughputtrendvolists2020.
     * 
     * @return anotherTotalThroughput
     */
    public org.tempuri.Anothertotalthroughput2020[] getAnotherTotalThroughput() {
        return anotherTotalThroughput;
    }


    /**
     * Sets the anotherTotalThroughput value for this Throughputtrendvolists2020.
     * 
     * @param anotherTotalThroughput
     */
    public void setAnotherTotalThroughput(org.tempuri.Anothertotalthroughput2020[] anotherTotalThroughput) {
        this.anotherTotalThroughput = anotherTotalThroughput;
    }


    /**
     * Gets the totalPacket value for this Throughputtrendvolists2020.
     * 
     * @return totalPacket
     */
    public org.tempuri.Totalpacket2020[] getTotalPacket() {
        return totalPacket;
    }


    /**
     * Sets the totalPacket value for this Throughputtrendvolists2020.
     * 
     * @param totalPacket
     */
    public void setTotalPacket(org.tempuri.Totalpacket2020[] totalPacket) {
        this.totalPacket = totalPacket;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Throughputtrendvolists2020)) return false;
        Throughputtrendvolists2020 other = (Throughputtrendvolists2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalThroughput==null && other.getTotalThroughput()==null) || 
             (this.totalThroughput!=null &&
              java.util.Arrays.equals(this.totalThroughput, other.getTotalThroughput()))) &&
            ((this.anotherTotalThroughput==null && other.getAnotherTotalThroughput()==null) || 
             (this.anotherTotalThroughput!=null &&
              java.util.Arrays.equals(this.anotherTotalThroughput, other.getAnotherTotalThroughput()))) &&
            ((this.totalPacket==null && other.getTotalPacket()==null) || 
             (this.totalPacket!=null &&
              java.util.Arrays.equals(this.totalPacket, other.getTotalPacket())));
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
        if (getTotalThroughput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalThroughput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalThroughput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnotherTotalThroughput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnotherTotalThroughput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnotherTotalThroughput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalPacket() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalPacket());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalPacket(), i);
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
        new org.apache.axis.description.TypeDesc(Throughputtrendvolists2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Throughputtrendvolists2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalThroughput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalThroughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Totalthroughput2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Totalthroughput2020"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anotherTotalThroughput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "anotherTotalThroughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Anothertotalthroughput2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Anothertotalthroughput2020"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPacket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalPacket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Totalpacket2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Totalpacket2020"));
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
