/**
 * Urlfilter2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Urlfilter2020  implements java.io.Serializable {
    private boolean enable;

    private java.lang.String action;

    private java.lang.String urls;

    private java.lang.String categoryLeve;

    private java.lang.String category;

    public Urlfilter2020() {
    }

    public Urlfilter2020(
           boolean enable,
           java.lang.String action,
           java.lang.String urls,
           java.lang.String categoryLeve,
           java.lang.String category) {
           this.enable = enable;
           this.action = action;
           this.urls = urls;
           this.categoryLeve = categoryLeve;
           this.category = category;
    }


    /**
     * Gets the enable value for this Urlfilter2020.
     * 
     * @return enable
     */
    public boolean isEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this Urlfilter2020.
     * 
     * @param enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    /**
     * Gets the action value for this Urlfilter2020.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this Urlfilter2020.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the urls value for this Urlfilter2020.
     * 
     * @return urls
     */
    public java.lang.String getUrls() {
        return urls;
    }


    /**
     * Sets the urls value for this Urlfilter2020.
     * 
     * @param urls
     */
    public void setUrls(java.lang.String urls) {
        this.urls = urls;
    }


    /**
     * Gets the categoryLeve value for this Urlfilter2020.
     * 
     * @return categoryLeve
     */
    public java.lang.String getCategoryLeve() {
        return categoryLeve;
    }


    /**
     * Sets the categoryLeve value for this Urlfilter2020.
     * 
     * @param categoryLeve
     */
    public void setCategoryLeve(java.lang.String categoryLeve) {
        this.categoryLeve = categoryLeve;
    }


    /**
     * Gets the category value for this Urlfilter2020.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Urlfilter2020.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Urlfilter2020)) return false;
        Urlfilter2020 other = (Urlfilter2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enable == other.isEnable() &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.urls==null && other.getUrls()==null) || 
             (this.urls!=null &&
              this.urls.equals(other.getUrls()))) &&
            ((this.categoryLeve==null && other.getCategoryLeve()==null) || 
             (this.categoryLeve!=null &&
              this.categoryLeve.equals(other.getCategoryLeve()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getUrls() != null) {
            _hashCode += getUrls().hashCode();
        }
        if (getCategoryLeve() != null) {
            _hashCode += getCategoryLeve().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Urlfilter2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Urlfilter2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryLeve");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "categoryLeve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
