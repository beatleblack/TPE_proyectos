/**
 * OutGetAppStatistics2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OutGetAppStatistics2020  implements java.io.Serializable {
    private java.lang.String tableType;

    private float averageAllThroughput;

    private org.tempuri.Throughputtrendvolists2020 throughputTrendVOLists;

    private org.tempuri.Topntrafficapplist2020[] topnTrafficAppList;

    private java.lang.String[] topnVisitorsAppList;

    public OutGetAppStatistics2020() {
    }

    public OutGetAppStatistics2020(
           java.lang.String tableType,
           float averageAllThroughput,
           org.tempuri.Throughputtrendvolists2020 throughputTrendVOLists,
           org.tempuri.Topntrafficapplist2020[] topnTrafficAppList,
           java.lang.String[] topnVisitorsAppList) {
           this.tableType = tableType;
           this.averageAllThroughput = averageAllThroughput;
           this.throughputTrendVOLists = throughputTrendVOLists;
           this.topnTrafficAppList = topnTrafficAppList;
           this.topnVisitorsAppList = topnVisitorsAppList;
    }


    /**
     * Gets the tableType value for this OutGetAppStatistics2020.
     * 
     * @return tableType
     */
    public java.lang.String getTableType() {
        return tableType;
    }


    /**
     * Sets the tableType value for this OutGetAppStatistics2020.
     * 
     * @param tableType
     */
    public void setTableType(java.lang.String tableType) {
        this.tableType = tableType;
    }


    /**
     * Gets the averageAllThroughput value for this OutGetAppStatistics2020.
     * 
     * @return averageAllThroughput
     */
    public float getAverageAllThroughput() {
        return averageAllThroughput;
    }


    /**
     * Sets the averageAllThroughput value for this OutGetAppStatistics2020.
     * 
     * @param averageAllThroughput
     */
    public void setAverageAllThroughput(float averageAllThroughput) {
        this.averageAllThroughput = averageAllThroughput;
    }


    /**
     * Gets the throughputTrendVOLists value for this OutGetAppStatistics2020.
     * 
     * @return throughputTrendVOLists
     */
    public org.tempuri.Throughputtrendvolists2020 getThroughputTrendVOLists() {
        return throughputTrendVOLists;
    }


    /**
     * Sets the throughputTrendVOLists value for this OutGetAppStatistics2020.
     * 
     * @param throughputTrendVOLists
     */
    public void setThroughputTrendVOLists(org.tempuri.Throughputtrendvolists2020 throughputTrendVOLists) {
        this.throughputTrendVOLists = throughputTrendVOLists;
    }


    /**
     * Gets the topnTrafficAppList value for this OutGetAppStatistics2020.
     * 
     * @return topnTrafficAppList
     */
    public org.tempuri.Topntrafficapplist2020[] getTopnTrafficAppList() {
        return topnTrafficAppList;
    }


    /**
     * Sets the topnTrafficAppList value for this OutGetAppStatistics2020.
     * 
     * @param topnTrafficAppList
     */
    public void setTopnTrafficAppList(org.tempuri.Topntrafficapplist2020[] topnTrafficAppList) {
        this.topnTrafficAppList = topnTrafficAppList;
    }


    /**
     * Gets the topnVisitorsAppList value for this OutGetAppStatistics2020.
     * 
     * @return topnVisitorsAppList
     */
    public java.lang.String[] getTopnVisitorsAppList() {
        return topnVisitorsAppList;
    }


    /**
     * Sets the topnVisitorsAppList value for this OutGetAppStatistics2020.
     * 
     * @param topnVisitorsAppList
     */
    public void setTopnVisitorsAppList(java.lang.String[] topnVisitorsAppList) {
        this.topnVisitorsAppList = topnVisitorsAppList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutGetAppStatistics2020)) return false;
        OutGetAppStatistics2020 other = (OutGetAppStatistics2020) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tableType==null && other.getTableType()==null) || 
             (this.tableType!=null &&
              this.tableType.equals(other.getTableType()))) &&
            this.averageAllThroughput == other.getAverageAllThroughput() &&
            ((this.throughputTrendVOLists==null && other.getThroughputTrendVOLists()==null) || 
             (this.throughputTrendVOLists!=null &&
              this.throughputTrendVOLists.equals(other.getThroughputTrendVOLists()))) &&
            ((this.topnTrafficAppList==null && other.getTopnTrafficAppList()==null) || 
             (this.topnTrafficAppList!=null &&
              java.util.Arrays.equals(this.topnTrafficAppList, other.getTopnTrafficAppList()))) &&
            ((this.topnVisitorsAppList==null && other.getTopnVisitorsAppList()==null) || 
             (this.topnVisitorsAppList!=null &&
              java.util.Arrays.equals(this.topnVisitorsAppList, other.getTopnVisitorsAppList())));
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
        if (getTableType() != null) {
            _hashCode += getTableType().hashCode();
        }
        _hashCode += new Float(getAverageAllThroughput()).hashCode();
        if (getThroughputTrendVOLists() != null) {
            _hashCode += getThroughputTrendVOLists().hashCode();
        }
        if (getTopnTrafficAppList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopnTrafficAppList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopnTrafficAppList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTopnVisitorsAppList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopnVisitorsAppList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopnVisitorsAppList(), i);
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
        new org.apache.axis.description.TypeDesc(OutGetAppStatistics2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutGetAppStatistics2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tableType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageAllThroughput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "averageAllThroughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throughputTrendVOLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "throughputTrendVOLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Throughputtrendvolists2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topnTrafficAppList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "topnTrafficAppList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Topntrafficapplist2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Topntrafficapplist2020"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topnVisitorsAppList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "topnVisitorsAppList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
