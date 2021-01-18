/**
 * SiteLocalEthernet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SiteLocalEthernet  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String siteId;

    private java.lang.String _operator;

    private java.lang.String siteName;

    private boolean enablePbrTest;

    private java.lang.String pbrTestAddress;

    private org.tempuri.OutlinkLocalEthernet[] outLinks;

    private java.lang.String policyType;

    private java.lang.String policys;

    private boolean enableVas;

    public SiteLocalEthernet() {
    }

    public SiteLocalEthernet(
           java.lang.String id,
           java.lang.String siteId,
           java.lang.String _operator,
           java.lang.String siteName,
           boolean enablePbrTest,
           java.lang.String pbrTestAddress,
           org.tempuri.OutlinkLocalEthernet[] outLinks,
           java.lang.String policyType,
           java.lang.String policys,
           boolean enableVas) {
           this.id = id;
           this.siteId = siteId;
           this._operator = _operator;
           this.siteName = siteName;
           this.enablePbrTest = enablePbrTest;
           this.pbrTestAddress = pbrTestAddress;
           this.outLinks = outLinks;
           this.policyType = policyType;
           this.policys = policys;
           this.enableVas = enableVas;
    }


    /**
     * Gets the id value for this SiteLocalEthernet.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SiteLocalEthernet.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the siteId value for this SiteLocalEthernet.
     * 
     * @return siteId
     */
    public java.lang.String getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this SiteLocalEthernet.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the _operator value for this SiteLocalEthernet.
     * 
     * @return _operator
     */
    public java.lang.String get_operator() {
        return _operator;
    }


    /**
     * Sets the _operator value for this SiteLocalEthernet.
     * 
     * @param _operator
     */
    public void set_operator(java.lang.String _operator) {
        this._operator = _operator;
    }


    /**
     * Gets the siteName value for this SiteLocalEthernet.
     * 
     * @return siteName
     */
    public java.lang.String getSiteName() {
        return siteName;
    }


    /**
     * Sets the siteName value for this SiteLocalEthernet.
     * 
     * @param siteName
     */
    public void setSiteName(java.lang.String siteName) {
        this.siteName = siteName;
    }


    /**
     * Gets the enablePbrTest value for this SiteLocalEthernet.
     * 
     * @return enablePbrTest
     */
    public boolean isEnablePbrTest() {
        return enablePbrTest;
    }


    /**
     * Sets the enablePbrTest value for this SiteLocalEthernet.
     * 
     * @param enablePbrTest
     */
    public void setEnablePbrTest(boolean enablePbrTest) {
        this.enablePbrTest = enablePbrTest;
    }


    /**
     * Gets the pbrTestAddress value for this SiteLocalEthernet.
     * 
     * @return pbrTestAddress
     */
    public java.lang.String getPbrTestAddress() {
        return pbrTestAddress;
    }


    /**
     * Sets the pbrTestAddress value for this SiteLocalEthernet.
     * 
     * @param pbrTestAddress
     */
    public void setPbrTestAddress(java.lang.String pbrTestAddress) {
        this.pbrTestAddress = pbrTestAddress;
    }


    /**
     * Gets the outLinks value for this SiteLocalEthernet.
     * 
     * @return outLinks
     */
    public org.tempuri.OutlinkLocalEthernet[] getOutLinks() {
        return outLinks;
    }


    /**
     * Sets the outLinks value for this SiteLocalEthernet.
     * 
     * @param outLinks
     */
    public void setOutLinks(org.tempuri.OutlinkLocalEthernet[] outLinks) {
        this.outLinks = outLinks;
    }


    /**
     * Gets the policyType value for this SiteLocalEthernet.
     * 
     * @return policyType
     */
    public java.lang.String getPolicyType() {
        return policyType;
    }


    /**
     * Sets the policyType value for this SiteLocalEthernet.
     * 
     * @param policyType
     */
    public void setPolicyType(java.lang.String policyType) {
        this.policyType = policyType;
    }


    /**
     * Gets the policys value for this SiteLocalEthernet.
     * 
     * @return policys
     */
    public java.lang.String getPolicys() {
        return policys;
    }


    /**
     * Sets the policys value for this SiteLocalEthernet.
     * 
     * @param policys
     */
    public void setPolicys(java.lang.String policys) {
        this.policys = policys;
    }


    /**
     * Gets the enableVas value for this SiteLocalEthernet.
     * 
     * @return enableVas
     */
    public boolean isEnableVas() {
        return enableVas;
    }


    /**
     * Sets the enableVas value for this SiteLocalEthernet.
     * 
     * @param enableVas
     */
    public void setEnableVas(boolean enableVas) {
        this.enableVas = enableVas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteLocalEthernet)) return false;
        SiteLocalEthernet other = (SiteLocalEthernet) obj;
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
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this._operator==null && other.get_operator()==null) || 
             (this._operator!=null &&
              this._operator.equals(other.get_operator()))) &&
            ((this.siteName==null && other.getSiteName()==null) || 
             (this.siteName!=null &&
              this.siteName.equals(other.getSiteName()))) &&
            this.enablePbrTest == other.isEnablePbrTest() &&
            ((this.pbrTestAddress==null && other.getPbrTestAddress()==null) || 
             (this.pbrTestAddress!=null &&
              this.pbrTestAddress.equals(other.getPbrTestAddress()))) &&
            ((this.outLinks==null && other.getOutLinks()==null) || 
             (this.outLinks!=null &&
              java.util.Arrays.equals(this.outLinks, other.getOutLinks()))) &&
            ((this.policyType==null && other.getPolicyType()==null) || 
             (this.policyType!=null &&
              this.policyType.equals(other.getPolicyType()))) &&
            ((this.policys==null && other.getPolicys()==null) || 
             (this.policys!=null &&
              this.policys.equals(other.getPolicys()))) &&
            this.enableVas == other.isEnableVas();
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
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (get_operator() != null) {
            _hashCode += get_operator().hashCode();
        }
        if (getSiteName() != null) {
            _hashCode += getSiteName().hashCode();
        }
        _hashCode += (isEnablePbrTest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPbrTestAddress() != null) {
            _hashCode += getPbrTestAddress().hashCode();
        }
        if (getOutLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyType() != null) {
            _hashCode += getPolicyType().hashCode();
        }
        if (getPolicys() != null) {
            _hashCode += getPolicys().hashCode();
        }
        _hashCode += (isEnableVas() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteLocalEthernet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SiteLocalEthernet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "_operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablePbrTest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enablePbrTest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pbrTestAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pbrTestAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "outLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutlinkLocalEthernet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "OutlinkLocalEthernet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "policyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "policys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableVas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enableVas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
