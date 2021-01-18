/**
 * Datavpn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Datavpn  implements java.io.Serializable {
    private org.tempuri.Vpnservice2020[] vpnServices;

    public Datavpn() {
    }

    public Datavpn(
           org.tempuri.Vpnservice2020[] vpnServices) {
           this.vpnServices = vpnServices;
    }


    /**
     * Gets the vpnServices value for this Datavpn.
     * 
     * @return vpnServices
     */
    public org.tempuri.Vpnservice2020[] getVpnServices() {
        return vpnServices;
    }


    /**
     * Sets the vpnServices value for this Datavpn.
     * 
     * @param vpnServices
     */
    public void setVpnServices(org.tempuri.Vpnservice2020[] vpnServices) {
        this.vpnServices = vpnServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Datavpn)) return false;
        Datavpn other = (Datavpn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vpnServices==null && other.getVpnServices()==null) || 
             (this.vpnServices!=null &&
              java.util.Arrays.equals(this.vpnServices, other.getVpnServices())));
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
        if (getVpnServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVpnServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVpnServices(), i);
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
        new org.apache.axis.description.TypeDesc(Datavpn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Datavpn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vpnServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Vpnservice2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Vpnservice2020"));
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
