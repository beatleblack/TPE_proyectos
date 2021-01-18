/**
 * Data12.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Data12  implements java.io.Serializable {
    private org.tempuri.SubnetZ[] subnets;

    public Data12() {
    }

    public Data12(
           org.tempuri.SubnetZ[] subnets) {
           this.subnets = subnets;
    }


    /**
     * Gets the subnets value for this Data12.
     * 
     * @return subnets
     */
    public org.tempuri.SubnetZ[] getSubnets() {
        return subnets;
    }


    /**
     * Sets the subnets value for this Data12.
     * 
     * @param subnets
     */
    public void setSubnets(org.tempuri.SubnetZ[] subnets) {
        this.subnets = subnets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Data12)) return false;
        Data12 other = (Data12) obj;
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
        new org.apache.axis.description.TypeDesc(Data12.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Data12"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Subnets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SubnetZ"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "SubnetZ"));
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
