/**
 * Sitehealthdistributionvo2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Sitehealthdistributionvo2020  implements java.io.Serializable {
    private int distinction;

    private int good;

    private int average;

    private int bad;

    private int na;

    private int total;

    public Sitehealthdistributionvo2020() {
    }

    public Sitehealthdistributionvo2020(
           int distinction,
           int good,
           int average,
           int bad,
           int na,
           int total) {
           this.distinction = distinction;
           this.good = good;
           this.average = average;
           this.bad = bad;
           this.na = na;
           this.total = total;
    }


    /**
     * Gets the distinction value for this Sitehealthdistributionvo2020.
     * 
     * @return distinction
     */
    public int getDistinction() {
        return distinction;
    }


    /**
     * Sets the distinction value for this Sitehealthdistributionvo2020.
     * 
     * @param distinction
     */
    public void setDistinction(int distinction) {
        this.distinction = distinction;
    }


    /**
     * Gets the good value for this Sitehealthdistributionvo2020.
     * 
     * @return good
     */
    public int getGood() {
        return good;
    }


    /**
     * Sets the good value for this Sitehealthdistributionvo2020.
     * 
     * @param good
     */
    public void setGood(int good) {
        this.good = good;
    }


    /**
     * Gets the average value for this Sitehealthdistributionvo2020.
     * 
     * @return average
     */
    public int getAverage() {
        return average;
    }


    /**
     * Sets the average value for this Sitehealthdistributionvo2020.
     * 
     * @param average
     */
    public void setAverage(int average) {
        this.average = average;
    }


    /**
     * Gets the bad value for this Sitehealthdistributionvo2020.
     * 
     * @return bad
     */
    public int getBad() {
        return bad;
    }


    /**
     * Sets the bad value for this Sitehealthdistributionvo2020.
     * 
     * @param bad
     */
    public void setBad(int bad) {
        this.bad = bad;
    }


    /**
     * Gets the na value for this Sitehealthdistributionvo2020.
     * 
     * @return na
     */
    public int getNa() {
        return na;
    }


    /**
     * Sets the na value for this Sitehealthdistributionvo2020.
     * 
     * @param na
     */
    public void setNa(int na) {
        this.na = na;
    }


    /**
     * Gets the total value for this Sitehealthdistributionvo2020.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this Sitehealthdistributionvo2020.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sitehealthdistributionvo2020)) return false;
        Sitehealthdistributionvo2020 other = (Sitehealthdistributionvo2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.distinction == other.getDistinction() &&
            this.good == other.getGood() &&
            this.average == other.getAverage() &&
            this.bad == other.getBad() &&
            this.na == other.getNa() &&
            this.total == other.getTotal();
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
        _hashCode += getDistinction();
        _hashCode += getGood();
        _hashCode += getAverage();
        _hashCode += getBad();
        _hashCode += getNa();
        _hashCode += getTotal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sitehealthdistributionvo2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Sitehealthdistributionvo2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distinction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "distinction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("good");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "good"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("average");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "average"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("na");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "na"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
