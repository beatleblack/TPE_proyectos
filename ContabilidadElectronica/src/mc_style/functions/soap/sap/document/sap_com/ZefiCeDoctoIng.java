/**
 * ZefiCeDoctoIng.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZefiCeDoctoIng  implements java.io.Serializable {
    private java.lang.String ejerciciocxc;

    private java.lang.String sociedadcxc;

    private java.lang.String doctosapcxc;

    private java.lang.String satelite;

    private java.lang.String moneda;

    private java.lang.String tipocambio;

    public ZefiCeDoctoIng() {
    }

    public ZefiCeDoctoIng(
           java.lang.String ejerciciocxc,
           java.lang.String sociedadcxc,
           java.lang.String doctosapcxc,
           java.lang.String satelite,
           java.lang.String moneda,
           java.lang.String tipocambio) {
           this.ejerciciocxc = ejerciciocxc;
           this.sociedadcxc = sociedadcxc;
           this.doctosapcxc = doctosapcxc;
           this.satelite = satelite;
           this.moneda = moneda;
           this.tipocambio = tipocambio;
    }


    /**
     * Gets the ejerciciocxc value for this ZefiCeDoctoIng.
     * 
     * @return ejerciciocxc
     */
    public java.lang.String getEjerciciocxc() {
        return ejerciciocxc;
    }


    /**
     * Sets the ejerciciocxc value for this ZefiCeDoctoIng.
     * 
     * @param ejerciciocxc
     */
    public void setEjerciciocxc(java.lang.String ejerciciocxc) {
        this.ejerciciocxc = ejerciciocxc;
    }


    /**
     * Gets the sociedadcxc value for this ZefiCeDoctoIng.
     * 
     * @return sociedadcxc
     */
    public java.lang.String getSociedadcxc() {
        return sociedadcxc;
    }


    /**
     * Sets the sociedadcxc value for this ZefiCeDoctoIng.
     * 
     * @param sociedadcxc
     */
    public void setSociedadcxc(java.lang.String sociedadcxc) {
        this.sociedadcxc = sociedadcxc;
    }


    /**
     * Gets the doctosapcxc value for this ZefiCeDoctoIng.
     * 
     * @return doctosapcxc
     */
    public java.lang.String getDoctosapcxc() {
        return doctosapcxc;
    }


    /**
     * Sets the doctosapcxc value for this ZefiCeDoctoIng.
     * 
     * @param doctosapcxc
     */
    public void setDoctosapcxc(java.lang.String doctosapcxc) {
        this.doctosapcxc = doctosapcxc;
    }


    /**
     * Gets the satelite value for this ZefiCeDoctoIng.
     * 
     * @return satelite
     */
    public java.lang.String getSatelite() {
        return satelite;
    }


    /**
     * Sets the satelite value for this ZefiCeDoctoIng.
     * 
     * @param satelite
     */
    public void setSatelite(java.lang.String satelite) {
        this.satelite = satelite;
    }


    /**
     * Gets the moneda value for this ZefiCeDoctoIng.
     * 
     * @return moneda
     */
    public java.lang.String getMoneda() {
        return moneda;
    }


    /**
     * Sets the moneda value for this ZefiCeDoctoIng.
     * 
     * @param moneda
     */
    public void setMoneda(java.lang.String moneda) {
        this.moneda = moneda;
    }


    /**
     * Gets the tipocambio value for this ZefiCeDoctoIng.
     * 
     * @return tipocambio
     */
    public java.lang.String getTipocambio() {
        return tipocambio;
    }


    /**
     * Sets the tipocambio value for this ZefiCeDoctoIng.
     * 
     * @param tipocambio
     */
    public void setTipocambio(java.lang.String tipocambio) {
        this.tipocambio = tipocambio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZefiCeDoctoIng)) return false;
        ZefiCeDoctoIng other = (ZefiCeDoctoIng) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ejerciciocxc==null && other.getEjerciciocxc()==null) || 
             (this.ejerciciocxc!=null &&
              this.ejerciciocxc.equals(other.getEjerciciocxc()))) &&
            ((this.sociedadcxc==null && other.getSociedadcxc()==null) || 
             (this.sociedadcxc!=null &&
              this.sociedadcxc.equals(other.getSociedadcxc()))) &&
            ((this.doctosapcxc==null && other.getDoctosapcxc()==null) || 
             (this.doctosapcxc!=null &&
              this.doctosapcxc.equals(other.getDoctosapcxc()))) &&
            ((this.satelite==null && other.getSatelite()==null) || 
             (this.satelite!=null &&
              this.satelite.equals(other.getSatelite()))) &&
            ((this.moneda==null && other.getMoneda()==null) || 
             (this.moneda!=null &&
              this.moneda.equals(other.getMoneda()))) &&
            ((this.tipocambio==null && other.getTipocambio()==null) || 
             (this.tipocambio!=null &&
              this.tipocambio.equals(other.getTipocambio())));
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
        if (getEjerciciocxc() != null) {
            _hashCode += getEjerciciocxc().hashCode();
        }
        if (getSociedadcxc() != null) {
            _hashCode += getSociedadcxc().hashCode();
        }
        if (getDoctosapcxc() != null) {
            _hashCode += getDoctosapcxc().hashCode();
        }
        if (getSatelite() != null) {
            _hashCode += getSatelite().hashCode();
        }
        if (getMoneda() != null) {
            _hashCode += getMoneda().hashCode();
        }
        if (getTipocambio() != null) {
            _hashCode += getTipocambio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZefiCeDoctoIng.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZefiCeDoctoIng"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ejerciciocxc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ejerciciocxc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sociedadcxc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sociedadcxc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctosapcxc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Doctosapcxc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("satelite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Satelite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipocambio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tipocambio"));
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
