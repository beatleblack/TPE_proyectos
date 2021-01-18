/**
 * Tenantextranlextrainfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Tenantextranlextrainfo  implements java.io.Serializable {
    private java.lang.String tenantAddress;

    private java.lang.String tenantEmail;

    private boolean emailUnique;

    private java.lang.String tenantPhone;

    private java.lang.String countryCode;

    private java.lang.String photo;

    private java.lang.String userId;

    private java.lang.String userName;

    private java.lang.String postalCode;

    private java.lang.String userPhone;

    private java.lang.String userPhoneCountryCode;

    public Tenantextranlextrainfo() {
    }

    public Tenantextranlextrainfo(
           java.lang.String tenantAddress,
           java.lang.String tenantEmail,
           boolean emailUnique,
           java.lang.String tenantPhone,
           java.lang.String countryCode,
           java.lang.String photo,
           java.lang.String userId,
           java.lang.String userName,
           java.lang.String postalCode,
           java.lang.String userPhone,
           java.lang.String userPhoneCountryCode) {
           this.tenantAddress = tenantAddress;
           this.tenantEmail = tenantEmail;
           this.emailUnique = emailUnique;
           this.tenantPhone = tenantPhone;
           this.countryCode = countryCode;
           this.photo = photo;
           this.userId = userId;
           this.userName = userName;
           this.postalCode = postalCode;
           this.userPhone = userPhone;
           this.userPhoneCountryCode = userPhoneCountryCode;
    }


    /**
     * Gets the tenantAddress value for this Tenantextranlextrainfo.
     * 
     * @return tenantAddress
     */
    public java.lang.String getTenantAddress() {
        return tenantAddress;
    }


    /**
     * Sets the tenantAddress value for this Tenantextranlextrainfo.
     * 
     * @param tenantAddress
     */
    public void setTenantAddress(java.lang.String tenantAddress) {
        this.tenantAddress = tenantAddress;
    }


    /**
     * Gets the tenantEmail value for this Tenantextranlextrainfo.
     * 
     * @return tenantEmail
     */
    public java.lang.String getTenantEmail() {
        return tenantEmail;
    }


    /**
     * Sets the tenantEmail value for this Tenantextranlextrainfo.
     * 
     * @param tenantEmail
     */
    public void setTenantEmail(java.lang.String tenantEmail) {
        this.tenantEmail = tenantEmail;
    }


    /**
     * Gets the emailUnique value for this Tenantextranlextrainfo.
     * 
     * @return emailUnique
     */
    public boolean isEmailUnique() {
        return emailUnique;
    }


    /**
     * Sets the emailUnique value for this Tenantextranlextrainfo.
     * 
     * @param emailUnique
     */
    public void setEmailUnique(boolean emailUnique) {
        this.emailUnique = emailUnique;
    }


    /**
     * Gets the tenantPhone value for this Tenantextranlextrainfo.
     * 
     * @return tenantPhone
     */
    public java.lang.String getTenantPhone() {
        return tenantPhone;
    }


    /**
     * Sets the tenantPhone value for this Tenantextranlextrainfo.
     * 
     * @param tenantPhone
     */
    public void setTenantPhone(java.lang.String tenantPhone) {
        this.tenantPhone = tenantPhone;
    }


    /**
     * Gets the countryCode value for this Tenantextranlextrainfo.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this Tenantextranlextrainfo.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the photo value for this Tenantextranlextrainfo.
     * 
     * @return photo
     */
    public java.lang.String getPhoto() {
        return photo;
    }


    /**
     * Sets the photo value for this Tenantextranlextrainfo.
     * 
     * @param photo
     */
    public void setPhoto(java.lang.String photo) {
        this.photo = photo;
    }


    /**
     * Gets the userId value for this Tenantextranlextrainfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Tenantextranlextrainfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this Tenantextranlextrainfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Tenantextranlextrainfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the postalCode value for this Tenantextranlextrainfo.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Tenantextranlextrainfo.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the userPhone value for this Tenantextranlextrainfo.
     * 
     * @return userPhone
     */
    public java.lang.String getUserPhone() {
        return userPhone;
    }


    /**
     * Sets the userPhone value for this Tenantextranlextrainfo.
     * 
     * @param userPhone
     */
    public void setUserPhone(java.lang.String userPhone) {
        this.userPhone = userPhone;
    }


    /**
     * Gets the userPhoneCountryCode value for this Tenantextranlextrainfo.
     * 
     * @return userPhoneCountryCode
     */
    public java.lang.String getUserPhoneCountryCode() {
        return userPhoneCountryCode;
    }


    /**
     * Sets the userPhoneCountryCode value for this Tenantextranlextrainfo.
     * 
     * @param userPhoneCountryCode
     */
    public void setUserPhoneCountryCode(java.lang.String userPhoneCountryCode) {
        this.userPhoneCountryCode = userPhoneCountryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tenantextranlextrainfo)) return false;
        Tenantextranlextrainfo other = (Tenantextranlextrainfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tenantAddress==null && other.getTenantAddress()==null) || 
             (this.tenantAddress!=null &&
              this.tenantAddress.equals(other.getTenantAddress()))) &&
            ((this.tenantEmail==null && other.getTenantEmail()==null) || 
             (this.tenantEmail!=null &&
              this.tenantEmail.equals(other.getTenantEmail()))) &&
            this.emailUnique == other.isEmailUnique() &&
            ((this.tenantPhone==null && other.getTenantPhone()==null) || 
             (this.tenantPhone!=null &&
              this.tenantPhone.equals(other.getTenantPhone()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.photo==null && other.getPhoto()==null) || 
             (this.photo!=null &&
              this.photo.equals(other.getPhoto()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.userPhone==null && other.getUserPhone()==null) || 
             (this.userPhone!=null &&
              this.userPhone.equals(other.getUserPhone()))) &&
            ((this.userPhoneCountryCode==null && other.getUserPhoneCountryCode()==null) || 
             (this.userPhoneCountryCode!=null &&
              this.userPhoneCountryCode.equals(other.getUserPhoneCountryCode())));
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
        if (getTenantAddress() != null) {
            _hashCode += getTenantAddress().hashCode();
        }
        if (getTenantEmail() != null) {
            _hashCode += getTenantEmail().hashCode();
        }
        _hashCode += (isEmailUnique() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTenantPhone() != null) {
            _hashCode += getTenantPhone().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getPhoto() != null) {
            _hashCode += getPhoto().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getUserPhone() != null) {
            _hashCode += getUserPhone().hashCode();
        }
        if (getUserPhoneCountryCode() != null) {
            _hashCode += getUserPhoneCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tenantextranlextrainfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Tenantextranlextrainfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tenantAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tenantEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailUnique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "emailUnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tenantPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "photo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPhoneCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userPhoneCountryCode"));
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
