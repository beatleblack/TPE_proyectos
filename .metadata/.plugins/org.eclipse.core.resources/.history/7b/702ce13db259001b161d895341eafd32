/**
 * GetSiteHealtInfo2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSiteHealtInfo2020  implements java.io.Serializable {
    private org.tempuri.Sitehealthlist2020[] siteHealthList;

    private org.tempuri.Sitehealthdistributionvo2020 siteHealthDistributionVO;

    public GetSiteHealtInfo2020() {
    }

    public GetSiteHealtInfo2020(
           org.tempuri.Sitehealthlist2020[] siteHealthList,
           org.tempuri.Sitehealthdistributionvo2020 siteHealthDistributionVO) {
           this.siteHealthList = siteHealthList;
           this.siteHealthDistributionVO = siteHealthDistributionVO;
    }


    /**
     * Gets the siteHealthList value for this GetSiteHealtInfo2020.
     * 
     * @return siteHealthList
     */
    public org.tempuri.Sitehealthlist2020[] getSiteHealthList() {
        return siteHealthList;
    }


    /**
     * Sets the siteHealthList value for this GetSiteHealtInfo2020.
     * 
     * @param siteHealthList
     */
    public void setSiteHealthList(org.tempuri.Sitehealthlist2020[] siteHealthList) {
        this.siteHealthList = siteHealthList;
    }


    /**
     * Gets the siteHealthDistributionVO value for this GetSiteHealtInfo2020.
     * 
     * @return siteHealthDistributionVO
     */
    public org.tempuri.Sitehealthdistributionvo2020 getSiteHealthDistributionVO() {
        return siteHealthDistributionVO;
    }


    /**
     * Sets the siteHealthDistributionVO value for this GetSiteHealtInfo2020.
     * 
     * @param siteHealthDistributionVO
     */
    public void setSiteHealthDistributionVO(org.tempuri.Sitehealthdistributionvo2020 siteHealthDistributionVO) {
        this.siteHealthDistributionVO = siteHealthDistributionVO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSiteHealtInfo2020)) return false;
        GetSiteHealtInfo2020 other = (GetSiteHealtInfo2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siteHealthList==null && other.getSiteHealthList()==null) || 
             (this.siteHealthList!=null &&
              java.util.Arrays.equals(this.siteHealthList, other.getSiteHealthList()))) &&
            ((this.siteHealthDistributionVO==null && other.getSiteHealthDistributionVO()==null) || 
             (this.siteHealthDistributionVO!=null &&
              this.siteHealthDistributionVO.equals(other.getSiteHealthDistributionVO())));
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
        if (getSiteHealthList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSiteHealthList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiteHealthList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSiteHealthDistributionVO() != null) {
            _hashCode += getSiteHealthDistributionVO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSiteHealtInfo2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GetSiteHealtInfo2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteHealthList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteHealthList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Sitehealthlist2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Sitehealthlist2020"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteHealthDistributionVO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteHealthDistributionVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Sitehealthdistributionvo2020"));
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
