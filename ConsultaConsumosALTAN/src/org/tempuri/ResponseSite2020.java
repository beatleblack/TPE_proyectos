/**
 * ResponseSite2020.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ResponseSite2020  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private int role;

    private java.lang.String[] controlSites;

    private java.lang.Object siteTemplateId;

    private java.lang.Object siteTemplateName;

    private int siteGateType;

    private java.lang.String[] deviceIds;

    private org.tempuri.DeviceinfoZ[] deviceInfos;

    private java.lang.Object[] emails;

    private java.lang.String postcode;

    private java.lang.String address;

    private java.lang.String floor;

    private java.lang.String responsiblePerson;

    private java.lang.Object phoneNumber;

    private java.lang.String latitude;

    private java.lang.String longtitude;

    private int activateStatus;

    private boolean activateConfigured;

    private boolean underlayConfigured;

    private java.lang.Object status;

    private java.lang.String description;

    private java.lang.Object tag;

    private java.lang.Object isolated;

    public ResponseSite2020() {
    }

    public ResponseSite2020(
           java.lang.String id,
           java.lang.String name,
           int role,
           java.lang.String[] controlSites,
           java.lang.Object siteTemplateId,
           java.lang.Object siteTemplateName,
           int siteGateType,
           java.lang.String[] deviceIds,
           org.tempuri.DeviceinfoZ[] deviceInfos,
           java.lang.Object[] emails,
           java.lang.String postcode,
           java.lang.String address,
           java.lang.String floor,
           java.lang.String responsiblePerson,
           java.lang.Object phoneNumber,
           java.lang.String latitude,
           java.lang.String longtitude,
           int activateStatus,
           boolean activateConfigured,
           boolean underlayConfigured,
           java.lang.Object status,
           java.lang.String description,
           java.lang.Object tag,
           java.lang.Object isolated) {
           this.id = id;
           this.name = name;
           this.role = role;
           this.controlSites = controlSites;
           this.siteTemplateId = siteTemplateId;
           this.siteTemplateName = siteTemplateName;
           this.siteGateType = siteGateType;
           this.deviceIds = deviceIds;
           this.deviceInfos = deviceInfos;
           this.emails = emails;
           this.postcode = postcode;
           this.address = address;
           this.floor = floor;
           this.responsiblePerson = responsiblePerson;
           this.phoneNumber = phoneNumber;
           this.latitude = latitude;
           this.longtitude = longtitude;
           this.activateStatus = activateStatus;
           this.activateConfigured = activateConfigured;
           this.underlayConfigured = underlayConfigured;
           this.status = status;
           this.description = description;
           this.tag = tag;
           this.isolated = isolated;
    }


    /**
     * Gets the id value for this ResponseSite2020.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ResponseSite2020.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ResponseSite2020.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResponseSite2020.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the role value for this ResponseSite2020.
     * 
     * @return role
     */
    public int getRole() {
        return role;
    }


    /**
     * Sets the role value for this ResponseSite2020.
     * 
     * @param role
     */
    public void setRole(int role) {
        this.role = role;
    }


    /**
     * Gets the controlSites value for this ResponseSite2020.
     * 
     * @return controlSites
     */
    public java.lang.String[] getControlSites() {
        return controlSites;
    }


    /**
     * Sets the controlSites value for this ResponseSite2020.
     * 
     * @param controlSites
     */
    public void setControlSites(java.lang.String[] controlSites) {
        this.controlSites = controlSites;
    }


    /**
     * Gets the siteTemplateId value for this ResponseSite2020.
     * 
     * @return siteTemplateId
     */
    public java.lang.Object getSiteTemplateId() {
        return siteTemplateId;
    }


    /**
     * Sets the siteTemplateId value for this ResponseSite2020.
     * 
     * @param siteTemplateId
     */
    public void setSiteTemplateId(java.lang.Object siteTemplateId) {
        this.siteTemplateId = siteTemplateId;
    }


    /**
     * Gets the siteTemplateName value for this ResponseSite2020.
     * 
     * @return siteTemplateName
     */
    public java.lang.Object getSiteTemplateName() {
        return siteTemplateName;
    }


    /**
     * Sets the siteTemplateName value for this ResponseSite2020.
     * 
     * @param siteTemplateName
     */
    public void setSiteTemplateName(java.lang.Object siteTemplateName) {
        this.siteTemplateName = siteTemplateName;
    }


    /**
     * Gets the siteGateType value for this ResponseSite2020.
     * 
     * @return siteGateType
     */
    public int getSiteGateType() {
        return siteGateType;
    }


    /**
     * Sets the siteGateType value for this ResponseSite2020.
     * 
     * @param siteGateType
     */
    public void setSiteGateType(int siteGateType) {
        this.siteGateType = siteGateType;
    }


    /**
     * Gets the deviceIds value for this ResponseSite2020.
     * 
     * @return deviceIds
     */
    public java.lang.String[] getDeviceIds() {
        return deviceIds;
    }


    /**
     * Sets the deviceIds value for this ResponseSite2020.
     * 
     * @param deviceIds
     */
    public void setDeviceIds(java.lang.String[] deviceIds) {
        this.deviceIds = deviceIds;
    }


    /**
     * Gets the deviceInfos value for this ResponseSite2020.
     * 
     * @return deviceInfos
     */
    public org.tempuri.DeviceinfoZ[] getDeviceInfos() {
        return deviceInfos;
    }


    /**
     * Sets the deviceInfos value for this ResponseSite2020.
     * 
     * @param deviceInfos
     */
    public void setDeviceInfos(org.tempuri.DeviceinfoZ[] deviceInfos) {
        this.deviceInfos = deviceInfos;
    }


    /**
     * Gets the emails value for this ResponseSite2020.
     * 
     * @return emails
     */
    public java.lang.Object[] getEmails() {
        return emails;
    }


    /**
     * Sets the emails value for this ResponseSite2020.
     * 
     * @param emails
     */
    public void setEmails(java.lang.Object[] emails) {
        this.emails = emails;
    }


    /**
     * Gets the postcode value for this ResponseSite2020.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this ResponseSite2020.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the address value for this ResponseSite2020.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ResponseSite2020.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the floor value for this ResponseSite2020.
     * 
     * @return floor
     */
    public java.lang.String getFloor() {
        return floor;
    }


    /**
     * Sets the floor value for this ResponseSite2020.
     * 
     * @param floor
     */
    public void setFloor(java.lang.String floor) {
        this.floor = floor;
    }


    /**
     * Gets the responsiblePerson value for this ResponseSite2020.
     * 
     * @return responsiblePerson
     */
    public java.lang.String getResponsiblePerson() {
        return responsiblePerson;
    }


    /**
     * Sets the responsiblePerson value for this ResponseSite2020.
     * 
     * @param responsiblePerson
     */
    public void setResponsiblePerson(java.lang.String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }


    /**
     * Gets the phoneNumber value for this ResponseSite2020.
     * 
     * @return phoneNumber
     */
    public java.lang.Object getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this ResponseSite2020.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.Object phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the latitude value for this ResponseSite2020.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this ResponseSite2020.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longtitude value for this ResponseSite2020.
     * 
     * @return longtitude
     */
    public java.lang.String getLongtitude() {
        return longtitude;
    }


    /**
     * Sets the longtitude value for this ResponseSite2020.
     * 
     * @param longtitude
     */
    public void setLongtitude(java.lang.String longtitude) {
        this.longtitude = longtitude;
    }


    /**
     * Gets the activateStatus value for this ResponseSite2020.
     * 
     * @return activateStatus
     */
    public int getActivateStatus() {
        return activateStatus;
    }


    /**
     * Sets the activateStatus value for this ResponseSite2020.
     * 
     * @param activateStatus
     */
    public void setActivateStatus(int activateStatus) {
        this.activateStatus = activateStatus;
    }


    /**
     * Gets the activateConfigured value for this ResponseSite2020.
     * 
     * @return activateConfigured
     */
    public boolean isActivateConfigured() {
        return activateConfigured;
    }


    /**
     * Sets the activateConfigured value for this ResponseSite2020.
     * 
     * @param activateConfigured
     */
    public void setActivateConfigured(boolean activateConfigured) {
        this.activateConfigured = activateConfigured;
    }


    /**
     * Gets the underlayConfigured value for this ResponseSite2020.
     * 
     * @return underlayConfigured
     */
    public boolean isUnderlayConfigured() {
        return underlayConfigured;
    }


    /**
     * Sets the underlayConfigured value for this ResponseSite2020.
     * 
     * @param underlayConfigured
     */
    public void setUnderlayConfigured(boolean underlayConfigured) {
        this.underlayConfigured = underlayConfigured;
    }


    /**
     * Gets the status value for this ResponseSite2020.
     * 
     * @return status
     */
    public java.lang.Object getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResponseSite2020.
     * 
     * @param status
     */
    public void setStatus(java.lang.Object status) {
        this.status = status;
    }


    /**
     * Gets the description value for this ResponseSite2020.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResponseSite2020.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the tag value for this ResponseSite2020.
     * 
     * @return tag
     */
    public java.lang.Object getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this ResponseSite2020.
     * 
     * @param tag
     */
    public void setTag(java.lang.Object tag) {
        this.tag = tag;
    }


    /**
     * Gets the isolated value for this ResponseSite2020.
     * 
     * @return isolated
     */
    public java.lang.Object getIsolated() {
        return isolated;
    }


    /**
     * Sets the isolated value for this ResponseSite2020.
     * 
     * @param isolated
     */
    public void setIsolated(java.lang.Object isolated) {
        this.isolated = isolated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseSite2020)) return false;
        ResponseSite2020 other = (ResponseSite2020) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.role == other.getRole() &&
            ((this.controlSites==null && other.getControlSites()==null) || 
             (this.controlSites!=null &&
              java.util.Arrays.equals(this.controlSites, other.getControlSites()))) &&
            ((this.siteTemplateId==null && other.getSiteTemplateId()==null) || 
             (this.siteTemplateId!=null &&
              this.siteTemplateId.equals(other.getSiteTemplateId()))) &&
            ((this.siteTemplateName==null && other.getSiteTemplateName()==null) || 
             (this.siteTemplateName!=null &&
              this.siteTemplateName.equals(other.getSiteTemplateName()))) &&
            this.siteGateType == other.getSiteGateType() &&
            ((this.deviceIds==null && other.getDeviceIds()==null) || 
             (this.deviceIds!=null &&
              java.util.Arrays.equals(this.deviceIds, other.getDeviceIds()))) &&
            ((this.deviceInfos==null && other.getDeviceInfos()==null) || 
             (this.deviceInfos!=null &&
              java.util.Arrays.equals(this.deviceInfos, other.getDeviceInfos()))) &&
            ((this.emails==null && other.getEmails()==null) || 
             (this.emails!=null &&
              java.util.Arrays.equals(this.emails, other.getEmails()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.floor==null && other.getFloor()==null) || 
             (this.floor!=null &&
              this.floor.equals(other.getFloor()))) &&
            ((this.responsiblePerson==null && other.getResponsiblePerson()==null) || 
             (this.responsiblePerson!=null &&
              this.responsiblePerson.equals(other.getResponsiblePerson()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longtitude==null && other.getLongtitude()==null) || 
             (this.longtitude!=null &&
              this.longtitude.equals(other.getLongtitude()))) &&
            this.activateStatus == other.getActivateStatus() &&
            this.activateConfigured == other.isActivateConfigured() &&
            this.underlayConfigured == other.isUnderlayConfigured() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            ((this.isolated==null && other.getIsolated()==null) || 
             (this.isolated!=null &&
              this.isolated.equals(other.getIsolated())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getRole();
        if (getControlSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControlSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControlSites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSiteTemplateId() != null) {
            _hashCode += getSiteTemplateId().hashCode();
        }
        if (getSiteTemplateName() != null) {
            _hashCode += getSiteTemplateName().hashCode();
        }
        _hashCode += getSiteGateType();
        if (getDeviceIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getFloor() != null) {
            _hashCode += getFloor().hashCode();
        }
        if (getResponsiblePerson() != null) {
            _hashCode += getResponsiblePerson().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongtitude() != null) {
            _hashCode += getLongtitude().hashCode();
        }
        _hashCode += getActivateStatus();
        _hashCode += (isActivateConfigured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUnderlayConfigured() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getIsolated() != null) {
            _hashCode += getIsolated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseSite2020.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSite2020"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlSites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "controlSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteTemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteGateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "siteGateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceinfoZ"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceinfoZ"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "emails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "floor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsiblePerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "responsiblePerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longtitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "longtitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "activateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateConfigured");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "activateConfigured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underlayConfigured");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "underlayConfigured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isolated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isolated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
