/**
 * Datumupdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Datumupdate  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String vpnId;

    private int status;

    private boolean active;

    private java.lang.Object[] sites;

    private org.tempuri.Urlfilterupdate urlFilter;

    private org.tempuri.Firewallupdate firewall;

    private org.tempuri.Ipsupdate ips;

    public Datumupdate() {
    }

    public Datumupdate(
           java.lang.String id,
           java.lang.String name,
           java.lang.String vpnId,
           int status,
           boolean active,
           java.lang.Object[] sites,
           org.tempuri.Urlfilterupdate urlFilter,
           org.tempuri.Firewallupdate firewall,
           org.tempuri.Ipsupdate ips) {
           this.id = id;
           this.name = name;
           this.vpnId = vpnId;
           this.status = status;
           this.active = active;
           this.sites = sites;
           this.urlFilter = urlFilter;
           this.firewall = firewall;
           this.ips = ips;
    }


    /**
     * Gets the id value for this Datumupdate.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Datumupdate.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Datumupdate.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Datumupdate.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vpnId value for this Datumupdate.
     * 
     * @return vpnId
     */
    public java.lang.String getVpnId() {
        return vpnId;
    }


    /**
     * Sets the vpnId value for this Datumupdate.
     * 
     * @param vpnId
     */
    public void setVpnId(java.lang.String vpnId) {
        this.vpnId = vpnId;
    }


    /**
     * Gets the status value for this Datumupdate.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Datumupdate.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the active value for this Datumupdate.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Datumupdate.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the sites value for this Datumupdate.
     * 
     * @return sites
     */
    public java.lang.Object[] getSites() {
        return sites;
    }


    /**
     * Sets the sites value for this Datumupdate.
     * 
     * @param sites
     */
    public void setSites(java.lang.Object[] sites) {
        this.sites = sites;
    }


    /**
     * Gets the urlFilter value for this Datumupdate.
     * 
     * @return urlFilter
     */
    public org.tempuri.Urlfilterupdate getUrlFilter() {
        return urlFilter;
    }


    /**
     * Sets the urlFilter value for this Datumupdate.
     * 
     * @param urlFilter
     */
    public void setUrlFilter(org.tempuri.Urlfilterupdate urlFilter) {
        this.urlFilter = urlFilter;
    }


    /**
     * Gets the firewall value for this Datumupdate.
     * 
     * @return firewall
     */
    public org.tempuri.Firewallupdate getFirewall() {
        return firewall;
    }


    /**
     * Sets the firewall value for this Datumupdate.
     * 
     * @param firewall
     */
    public void setFirewall(org.tempuri.Firewallupdate firewall) {
        this.firewall = firewall;
    }


    /**
     * Gets the ips value for this Datumupdate.
     * 
     * @return ips
     */
    public org.tempuri.Ipsupdate getIps() {
        return ips;
    }


    /**
     * Sets the ips value for this Datumupdate.
     * 
     * @param ips
     */
    public void setIps(org.tempuri.Ipsupdate ips) {
        this.ips = ips;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Datumupdate)) return false;
        Datumupdate other = (Datumupdate) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.vpnId==null && other.getVpnId()==null) || 
             (this.vpnId!=null &&
              this.vpnId.equals(other.getVpnId()))) &&
            this.status == other.getStatus() &&
            this.active == other.isActive() &&
            ((this.sites==null && other.getSites()==null) || 
             (this.sites!=null &&
              java.util.Arrays.equals(this.sites, other.getSites()))) &&
            ((this.urlFilter==null && other.getUrlFilter()==null) || 
             (this.urlFilter!=null &&
              this.urlFilter.equals(other.getUrlFilter()))) &&
            ((this.firewall==null && other.getFirewall()==null) || 
             (this.firewall!=null &&
              this.firewall.equals(other.getFirewall()))) &&
            ((this.ips==null && other.getIps()==null) || 
             (this.ips!=null &&
              this.ips.equals(other.getIps())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVpnId() != null) {
            _hashCode += getVpnId().hashCode();
        }
        _hashCode += getStatus();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getUrlFilter() != null) {
            _hashCode += getUrlFilter().hashCode();
        }
        if (getFirewall() != null) {
            _hashCode += getFirewall().hashCode();
        }
        if (getIps() != null) {
            _hashCode += getIps().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Datumupdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Datumupdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "name"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "urlFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Urlfilterupdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "firewall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Firewallupdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ips");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Ipsupdate"));
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
