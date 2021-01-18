/**
 * ResponseAppAqmWorstn2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResponseAppAqmWorstn2020  implements java.io.Serializable {
    private org.tempuri.Performancevolist2020[] performanceVOList;

    private int totalCount;

    private int distinction;

    private int good;

    private int average;

    private int bad;

    public ResponseAppAqmWorstn2020() {
    }

    public ResponseAppAqmWorstn2020(
           org.tempuri.Performancevolist2020[] performanceVOList,
           int totalCount,
           int distinction,
           int good,
           int average,
           int bad) {
           this.performanceVOList = performanceVOList;
           this.totalCount = totalCount;
           this.distinction = distinction;
           this.good = good;
           this.average = average;
           this.bad = bad;
    }


    /**
     * Gets the performanceVOList value for this ResponseAppAqmWorstn2020.
     * 
     * @return performanceVOList
     */
    public org.tempuri.Performancevolist2020[] getPerformanceVOList() {
        return performanceVOList;
    }


    /**
     * Sets the performanceVOList value for this ResponseAppAqmWorstn2020.
     * 
     * @param performanceVOList
     */
    public void setPerformanceVOList(org.tempuri.Performancevolist2020[] performanceVOList) {
        this.performanceVOList = performanceVOList;
    }


    /**
     * Gets the totalCount value for this ResponseAppAqmWorstn2020.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this ResponseAppAqmWorstn2020.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * Gets the distinction value for this ResponseAppAqmWorstn2020.
     * 
     * @return distinction
     */
    public int getDistinction() {
        return distinction;
    }


    /**
     * Sets the distinction value for this ResponseAppAqmWorstn2020.
     * 
     * @param distinction
     */
    public void setDistinction(int distinction) {
        this.distinction = distinction;
    }


    /**
     * Gets the good value for this ResponseAppAqmWorstn2020.
     * 
     * @return good
     */
    public int getGood() {
        return good;
    }


    /**
     * Sets the good value for this ResponseAppAqmWorstn2020.
     * 
     * @param good
     */
    public void setGood(int good) {
        this.good = good;
    }


    /**
     * Gets the average value for this ResponseAppAqmWorstn2020.
     * 
     * @return average
     */
    public int getAverage() {
        return average;
    }


    /**
     * Sets the average value for this ResponseAppAqmWorstn2020.
     * 
     * @param average
     */
    public void setAverage(int average) {
        this.average = average;
    }


    /**
     * Gets the bad value for this ResponseAppAqmWorstn2020.
     * 
     * @return bad
     */
    public int getBad() {
        return bad;
    }


    /**
     * Sets the bad value for this ResponseAppAqmWorstn2020.
     * 
     * @param bad
     */
    public void setBad(int bad) {
        this.bad = bad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseAppAqmWorstn2020)) return false;
        ResponseAppAqmWorstn2020 other = (ResponseAppAqmWorstn2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.performanceVOList==null && other.getPerformanceVOList()==null) || 
             (this.performanceVOList!=null &&
              java.util.Arrays.equals(this.performanceVOList, other.getPerformanceVOList()))) &&
            this.totalCount == other.getTotalCount() &&
            this.distinction == other.getDistinction() &&
            this.good == other.getGood() &&
            this.average == other.getAverage() &&
            this.bad == other.getBad();
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
        if (getPerformanceVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformanceVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformanceVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalCount();
        _hashCode += getDistinction();
        _hashCode += getGood();
        _hashCode += getAverage();
        _hashCode += getBad();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseAppAqmWorstn2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseAppAqmWorstn2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performanceVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "performanceVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Performancevolist2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Performancevolist2020"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
