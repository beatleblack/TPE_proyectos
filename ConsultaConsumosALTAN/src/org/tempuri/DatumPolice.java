/**
 * DatumPolice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DatumPolice  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String vpnId;

    private int status;

    private boolean active;

    private java.lang.String sites;

    private org.tempuri.Urlfilter2020 urlFilter;

    private org.tempuri.Firewall2020 firewall;

    private org.tempuri.Ips2020 ips;

    public DatumPolice() {
    }

    public DatumPolice(
           java.lang.String id,
           java.lang.String name,
           java.lang.String vpnId,
           int status,
           boolean active,
           java.lang.String sites,
           org.tempuri.Urlfilter2020 urlFilter,
           org.tempuri.Firewall2020 firewall,
           org.tempuri.Ips2020 ips) {
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
     * Gets the id value for this DatumPolice.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DatumPolice.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this DatumPolice.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DatumPolice.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vpnId value for this DatumPolice.
     * 
     * @return vpnId
     */
    public java.lang.String getVpnId() {
        return vpnId;
    }


    /**
     * Sets the vpnId value for this DatumPolice.
     * 
     * @param vpnId
     */
    public void setVpnId(java.lang.String vpnId) {
        this.vpnId = vpnId;
    }


    /**
     * Gets the status value for this DatumPolice.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DatumPolice.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the active value for this DatumPolice.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this DatumPolice.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the sites value for this DatumPolice.
     * 
     * @return sites
     */
    public java.lang.String getSites() {
        return sites;
    }


    /**
     * Sets the sites value for this DatumPolice.
     * 
     * @param sites
     */
    public void setSites(java.lang.String sites) {
        this.sites = sites;
    }


    /**
     * Gets the urlFilter value for this DatumPolice.
     * 
     * @return urlFilter
     */
    public org.tempuri.Urlfilter2020 getUrlFilter() {
        return urlFilter;
    }


    /**
     * Sets the urlFilter value for this DatumPolice.
     * 
     * @param urlFilter
     */
    public void setUrlFilter(org.tempuri.Urlfilter2020 urlFilter) {
        this.urlFilter = urlFilter;
    }


    /**
     * Gets the firewall value for this DatumPolice.
     * 
     * @return firewall
     */
    public org.tempuri.Firewall2020 getFirewall() {
        return firewall;
    }


    /**
     * Sets the firewall value for this DatumPolice.
     * 
     * @param firewall
     */
    public void setFirewall(org.tempuri.Firewall2020 firewall) {
        this.firewall = firewall;
    }


    /**
     * Gets the ips value for this DatumPolice.
     * 
     * @return ips
     */
    public org.tempuri.Ips2020 getIps() {
        return ips;
    }


    /**
     * Sets the ips value for this DatumPolice.
     * 
     * @param ips
     */
    public void setIps(org.tempuri.Ips2020 ips) {
        this.ips = ips;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatumPolice)) return false;
        DatumPolice other = (DatumPolice) obj;
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
              this.sites.equals(other.getSites()))) &&
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
            _hashCode += getSites().hashCode();
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
        new org.apache.axis.description.TypeDesc(DatumPolice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DatumPolice"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "urlFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Urlfilter2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "firewall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Firewall2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ips");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Ips2020"));
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
