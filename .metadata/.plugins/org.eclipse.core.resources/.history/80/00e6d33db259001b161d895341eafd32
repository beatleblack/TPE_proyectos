/**
 * DatumLocalAccesethernet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DatumLocalAccesethernet  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String vpnId;

    private boolean enableLocal;

    private org.tempuri.SiteLocalEthernet[] sites;

    public DatumLocalAccesethernet() {
    }

    public DatumLocalAccesethernet(
           java.lang.String id,
           java.lang.String vpnId,
           boolean enableLocal,
           org.tempuri.SiteLocalEthernet[] sites) {
           this.id = id;
           this.vpnId = vpnId;
           this.enableLocal = enableLocal;
           this.sites = sites;
    }


    /**
     * Gets the id value for this DatumLocalAccesethernet.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DatumLocalAccesethernet.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the vpnId value for this DatumLocalAccesethernet.
     * 
     * @return vpnId
     */
    public java.lang.String getVpnId() {
        return vpnId;
    }


    /**
     * Sets the vpnId value for this DatumLocalAccesethernet.
     * 
     * @param vpnId
     */
    public void setVpnId(java.lang.String vpnId) {
        this.vpnId = vpnId;
    }


    /**
     * Gets the enableLocal value for this DatumLocalAccesethernet.
     * 
     * @return enableLocal
     */
    public boolean isEnableLocal() {
        return enableLocal;
    }


    /**
     * Sets the enableLocal value for this DatumLocalAccesethernet.
     * 
     * @param enableLocal
     */
    public void setEnableLocal(boolean enableLocal) {
        this.enableLocal = enableLocal;
    }


    /**
     * Gets the sites value for this DatumLocalAccesethernet.
     * 
     * @return sites
     */
    public org.tempuri.SiteLocalEthernet[] getSites() {
        return sites;
    }


    /**
     * Sets the sites value for this DatumLocalAccesethernet.
     * 
     * @param sites
     */
    public void setSites(org.tempuri.SiteLocalEthernet[] sites) {
        this.sites = sites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatumLocalAccesethernet)) return false;
        DatumLocalAccesethernet other = (DatumLocalAccesethernet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.vpnId==null && other.getVpnId()==null) || 
             (this.vpnId!=null &&
              this.vpnId.equals(other.getVpnId()))) &&
            this.enableLocal == other.isEnableLocal() &&
            ((this.sites==null && other.getSites()==null) || 
             (this.sites!=null &&
              java.util.Arrays.equals(this.sites, other.getSites())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVpnId() != null) {
            _hashCode += getVpnId().hashCode();
        }
        _hashCode += (isEnableLocal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSites(), i);
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
        new org.apache.axis.description.TypeDesc(DatumLocalAccesethernet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DatumLocalAccesethernet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vpnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enableLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SiteLocalEthernet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "SiteLocalEthernet"));
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
