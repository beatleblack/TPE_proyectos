/**
 * Firewallupdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Firewallupdate  implements java.io.Serializable {
    private boolean enable;

    private java.lang.Object inboundDefaultAction;

    private java.lang.Object outboundDefaultAction;

    private java.lang.Object[] fwFilters;

    public Firewallupdate() {
    }

    public Firewallupdate(
           boolean enable,
           java.lang.Object inboundDefaultAction,
           java.lang.Object outboundDefaultAction,
           java.lang.Object[] fwFilters) {
           this.enable = enable;
           this.inboundDefaultAction = inboundDefaultAction;
           this.outboundDefaultAction = outboundDefaultAction;
           this.fwFilters = fwFilters;
    }


    /**
     * Gets the enable value for this Firewallupdate.
     * 
     * @return enable
     */
    public boolean isEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this Firewallupdate.
     * 
     * @param enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    /**
     * Gets the inboundDefaultAction value for this Firewallupdate.
     * 
     * @return inboundDefaultAction
     */
    public java.lang.Object getInboundDefaultAction() {
        return inboundDefaultAction;
    }


    /**
     * Sets the inboundDefaultAction value for this Firewallupdate.
     * 
     * @param inboundDefaultAction
     */
    public void setInboundDefaultAction(java.lang.Object inboundDefaultAction) {
        this.inboundDefaultAction = inboundDefaultAction;
    }


    /**
     * Gets the outboundDefaultAction value for this Firewallupdate.
     * 
     * @return outboundDefaultAction
     */
    public java.lang.Object getOutboundDefaultAction() {
        return outboundDefaultAction;
    }


    /**
     * Sets the outboundDefaultAction value for this Firewallupdate.
     * 
     * @param outboundDefaultAction
     */
    public void setOutboundDefaultAction(java.lang.Object outboundDefaultAction) {
        this.outboundDefaultAction = outboundDefaultAction;
    }


    /**
     * Gets the fwFilters value for this Firewallupdate.
     * 
     * @return fwFilters
     */
    public java.lang.Object[] getFwFilters() {
        return fwFilters;
    }


    /**
     * Sets the fwFilters value for this Firewallupdate.
     * 
     * @param fwFilters
     */
    public void setFwFilters(java.lang.Object[] fwFilters) {
        this.fwFilters = fwFilters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Firewallupdate)) return false;
        Firewallupdate other = (Firewallupdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enable == other.isEnable() &&
            ((this.inboundDefaultAction==null && other.getInboundDefaultAction()==null) || 
             (this.inboundDefaultAction!=null &&
              this.inboundDefaultAction.equals(other.getInboundDefaultAction()))) &&
            ((this.outboundDefaultAction==null && other.getOutboundDefaultAction()==null) || 
             (this.outboundDefaultAction!=null &&
              this.outboundDefaultAction.equals(other.getOutboundDefaultAction()))) &&
            ((this.fwFilters==null && other.getFwFilters()==null) || 
             (this.fwFilters!=null &&
              java.util.Arrays.equals(this.fwFilters, other.getFwFilters())));
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
        _hashCode += (isEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInboundDefaultAction() != null) {
            _hashCode += getInboundDefaultAction().hashCode();
        }
        if (getOutboundDefaultAction() != null) {
            _hashCode += getOutboundDefaultAction().hashCode();
        }
        if (getFwFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFwFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFwFilters(), i);
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
        new org.apache.axis.description.TypeDesc(Firewallupdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Firewallupdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundDefaultAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "inboundDefaultAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundDefaultAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "outboundDefaultAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fwFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fwFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
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
