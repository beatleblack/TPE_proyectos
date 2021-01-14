/**
 * ProcessResponseDatosCliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM;

public class ProcessResponseDatosCliente  implements java.io.Serializable {
    private java.lang.String accountNo;

    private java.lang.String name;

    private java.lang.String lastName;

    private java.lang.String dn;

    private java.lang.String ciudad;

    private int idPackage;

    private java.lang.String packageDescription;

    private java.lang.String statusCuenta;

    public ProcessResponseDatosCliente() {
    }

    public ProcessResponseDatosCliente(
           java.lang.String accountNo,
           java.lang.String name,
           java.lang.String lastName,
           java.lang.String dn,
           java.lang.String ciudad,
           int idPackage,
           java.lang.String packageDescription,
           java.lang.String statusCuenta) {
           this.accountNo = accountNo;
           this.name = name;
           this.lastName = lastName;
           this.dn = dn;
           this.ciudad = ciudad;
           this.idPackage = idPackage;
           this.packageDescription = packageDescription;
           this.statusCuenta = statusCuenta;
    }


    /**
     * Gets the accountNo value for this ProcessResponseDatosCliente.
     * 
     * @return accountNo
     */
    public java.lang.String getAccountNo() {
        return accountNo;
    }


    /**
     * Sets the accountNo value for this ProcessResponseDatosCliente.
     * 
     * @param accountNo
     */
    public void setAccountNo(java.lang.String accountNo) {
        this.accountNo = accountNo;
    }


    /**
     * Gets the name value for this ProcessResponseDatosCliente.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProcessResponseDatosCliente.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the lastName value for this ProcessResponseDatosCliente.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this ProcessResponseDatosCliente.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the dn value for this ProcessResponseDatosCliente.
     * 
     * @return dn
     */
    public java.lang.String getDn() {
        return dn;
    }


    /**
     * Sets the dn value for this ProcessResponseDatosCliente.
     * 
     * @param dn
     */
    public void setDn(java.lang.String dn) {
        this.dn = dn;
    }


    /**
     * Gets the ciudad value for this ProcessResponseDatosCliente.
     * 
     * @return ciudad
     */
    public java.lang.String getCiudad() {
        return ciudad;
    }


    /**
     * Sets the ciudad value for this ProcessResponseDatosCliente.
     * 
     * @param ciudad
     */
    public void setCiudad(java.lang.String ciudad) {
        this.ciudad = ciudad;
    }


    /**
     * Gets the idPackage value for this ProcessResponseDatosCliente.
     * 
     * @return idPackage
     */
    public int getIdPackage() {
        return idPackage;
    }


    /**
     * Sets the idPackage value for this ProcessResponseDatosCliente.
     * 
     * @param idPackage
     */
    public void setIdPackage(int idPackage) {
        this.idPackage = idPackage;
    }


    /**
     * Gets the packageDescription value for this ProcessResponseDatosCliente.
     * 
     * @return packageDescription
     */
    public java.lang.String getPackageDescription() {
        return packageDescription;
    }


    /**
     * Sets the packageDescription value for this ProcessResponseDatosCliente.
     * 
     * @param packageDescription
     */
    public void setPackageDescription(java.lang.String packageDescription) {
        this.packageDescription = packageDescription;
    }


    /**
     * Gets the statusCuenta value for this ProcessResponseDatosCliente.
     * 
     * @return statusCuenta
     */
    public java.lang.String getStatusCuenta() {
        return statusCuenta;
    }


    /**
     * Sets the statusCuenta value for this ProcessResponseDatosCliente.
     * 
     * @param statusCuenta
     */
    public void setStatusCuenta(java.lang.String statusCuenta) {
        this.statusCuenta = statusCuenta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessResponseDatosCliente)) return false;
        ProcessResponseDatosCliente other = (ProcessResponseDatosCliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNo==null && other.getAccountNo()==null) || 
             (this.accountNo!=null &&
              this.accountNo.equals(other.getAccountNo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.dn==null && other.getDn()==null) || 
             (this.dn!=null &&
              this.dn.equals(other.getDn()))) &&
            ((this.ciudad==null && other.getCiudad()==null) || 
             (this.ciudad!=null &&
              this.ciudad.equals(other.getCiudad()))) &&
            this.idPackage == other.getIdPackage() &&
            ((this.packageDescription==null && other.getPackageDescription()==null) || 
             (this.packageDescription!=null &&
              this.packageDescription.equals(other.getPackageDescription()))) &&
            ((this.statusCuenta==null && other.getStatusCuenta()==null) || 
             (this.statusCuenta!=null &&
              this.statusCuenta.equals(other.getStatusCuenta())));
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
        if (getAccountNo() != null) {
            _hashCode += getAccountNo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getDn() != null) {
            _hashCode += getDn().hashCode();
        }
        if (getCiudad() != null) {
            _hashCode += getCiudad().hashCode();
        }
        _hashCode += getIdPackage();
        if (getPackageDescription() != null) {
            _hashCode += getPackageDescription().hashCode();
        }
        if (getStatusCuenta() != null) {
            _hashCode += getStatusCuenta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessResponseDatosCliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", ">>processResponse>datosCliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "accountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "dn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "ciudad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "idPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "packageDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "statusCuenta"));
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
