/**
 * DataSubnet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DataSubnet  implements java.io.Serializable {
    private org.tempuri.Subnet2[] subnets;

    public DataSubnet() {
    }

    public DataSubnet(
           org.tempuri.Subnet2[] subnets) {
           this.subnets = subnets;
    }


    /**
     * Gets the subnets value for this DataSubnet.
     * 
     * @return subnets
     */
    public org.tempuri.Subnet2[] getSubnets() {
        return subnets;
    }


    /**
     * Sets the subnets value for this DataSubnet.
     * 
     * @param subnets
     */
    public void setSubnets(org.tempuri.Subnet2[] subnets) {
        this.subnets = subnets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSubnet)) return false;
        DataSubnet other = (DataSubnet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subnets==null && other.getSubnets()==null) || 
             (this.subnets!=null &&
              java.util.Arrays.equals(this.subnets, other.getSubnets())));
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
        if (getSubnets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubnets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubnets(), i);
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
        new org.apache.axis.description.TypeDesc(DataSubnet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DataSubnet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Subnets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Subnet2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Subnet2"));
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
