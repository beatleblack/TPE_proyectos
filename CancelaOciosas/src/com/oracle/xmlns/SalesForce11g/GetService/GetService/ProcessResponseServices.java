/**
 * ProcessResponseServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.SalesForce11g.GetService.GetService;

public class ProcessResponseServices  implements java.io.Serializable {
    private java.lang.String idService;

    private java.lang.String service;

    private java.lang.String serialNumber;

    private java.lang.String idStb;

    private java.lang.String modelSTB;

    private java.lang.String MAC;

    private java.lang.String DN;

    private java.lang.String tipoDN;

    private java.lang.String included;

    private java.lang.String status;

    public ProcessResponseServices() {
    }

    public ProcessResponseServices(
           java.lang.String idService,
           java.lang.String service,
           java.lang.String serialNumber,
           java.lang.String idStb,
           java.lang.String modelSTB,
           java.lang.String MAC,
           java.lang.String DN,
           java.lang.String tipoDN,
           java.lang.String included,
           java.lang.String status) {
           this.idService = idService;
           this.service = service;
           this.serialNumber = serialNumber;
           this.idStb = idStb;
           this.modelSTB = modelSTB;
           this.MAC = MAC;
           this.DN = DN;
           this.tipoDN = tipoDN;
           this.included = included;
           this.status = status;
    }


    /**
     * Gets the idService value for this ProcessResponseServices.
     * 
     * @return idService
     */
    public java.lang.String getIdService() {
        return idService;
    }


    /**
     * Sets the idService value for this ProcessResponseServices.
     * 
     * @param idService
     */
    public void setIdService(java.lang.String idService) {
        this.idService = idService;
    }


    /**
     * Gets the service value for this ProcessResponseServices.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this ProcessResponseServices.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the serialNumber value for this ProcessResponseServices.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ProcessResponseServices.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the idStb value for this ProcessResponseServices.
     * 
     * @return idStb
     */
    public java.lang.String getIdStb() {
        return idStb;
    }


    /**
     * Sets the idStb value for this ProcessResponseServices.
     * 
     * @param idStb
     */
    public void setIdStb(java.lang.String idStb) {
        this.idStb = idStb;
    }


    /**
     * Gets the modelSTB value for this ProcessResponseServices.
     * 
     * @return modelSTB
     */
    public java.lang.String getModelSTB() {
        return modelSTB;
    }


    /**
     * Sets the modelSTB value for this ProcessResponseServices.
     * 
     * @param modelSTB
     */
    public void setModelSTB(java.lang.String modelSTB) {
        this.modelSTB = modelSTB;
    }


    /**
     * Gets the MAC value for this ProcessResponseServices.
     * 
     * @return MAC
     */
    public java.lang.String getMAC() {
        return MAC;
    }


    /**
     * Sets the MAC value for this ProcessResponseServices.
     * 
     * @param MAC
     */
    public void setMAC(java.lang.String MAC) {
        this.MAC = MAC;
    }


    /**
     * Gets the DN value for this ProcessResponseServices.
     * 
     * @return DN
     */
    public java.lang.String getDN() {
        return DN;
    }


    /**
     * Sets the DN value for this ProcessResponseServices.
     * 
     * @param DN
     */
    public void setDN(java.lang.String DN) {
        this.DN = DN;
    }


    /**
     * Gets the tipoDN value for this ProcessResponseServices.
     * 
     * @return tipoDN
     */
    public java.lang.String getTipoDN() {
        return tipoDN;
    }


    /**
     * Sets the tipoDN value for this ProcessResponseServices.
     * 
     * @param tipoDN
     */
    public void setTipoDN(java.lang.String tipoDN) {
        this.tipoDN = tipoDN;
    }


    /**
     * Gets the included value for this ProcessResponseServices.
     * 
     * @return included
     */
    public java.lang.String getIncluded() {
        return included;
    }


    /**
     * Sets the included value for this ProcessResponseServices.
     * 
     * @param included
     */
    public void setIncluded(java.lang.String included) {
        this.included = included;
    }


    /**
     * Gets the status value for this ProcessResponseServices.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProcessResponseServices.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessResponseServices)) return false;
        ProcessResponseServices other = (ProcessResponseServices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idService==null && other.getIdService()==null) || 
             (this.idService!=null &&
              this.idService.equals(other.getIdService()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.idStb==null && other.getIdStb()==null) || 
             (this.idStb!=null &&
              this.idStb.equals(other.getIdStb()))) &&
            ((this.modelSTB==null && other.getModelSTB()==null) || 
             (this.modelSTB!=null &&
              this.modelSTB.equals(other.getModelSTB()))) &&
            ((this.MAC==null && other.getMAC()==null) || 
             (this.MAC!=null &&
              this.MAC.equals(other.getMAC()))) &&
            ((this.DN==null && other.getDN()==null) || 
             (this.DN!=null &&
              this.DN.equals(other.getDN()))) &&
            ((this.tipoDN==null && other.getTipoDN()==null) || 
             (this.tipoDN!=null &&
              this.tipoDN.equals(other.getTipoDN()))) &&
            ((this.included==null && other.getIncluded()==null) || 
             (this.included!=null &&
              this.included.equals(other.getIncluded()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getIdService() != null) {
            _hashCode += getIdService().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getIdStb() != null) {
            _hashCode += getIdStb().hashCode();
        }
        if (getModelSTB() != null) {
            _hashCode += getModelSTB().hashCode();
        }
        if (getMAC() != null) {
            _hashCode += getMAC().hashCode();
        }
        if (getDN() != null) {
            _hashCode += getDN().hashCode();
        }
        if (getTipoDN() != null) {
            _hashCode += getTipoDN().hashCode();
        }
        if (getIncluded() != null) {
            _hashCode += getIncluded().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessResponseServices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", ">>processResponse>Services"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "IdService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "IdStb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelSTB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "ModelSTB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "MAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "DN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "TipoDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("included");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Included"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
