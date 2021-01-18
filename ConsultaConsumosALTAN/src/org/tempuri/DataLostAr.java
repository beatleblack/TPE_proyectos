/**
 * DataLostAr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DataLostAr  implements java.io.Serializable {
    private java.lang.Object checkBoxId;

    private java.lang.String deviceGroupType;

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String esn;

    private java.lang.Object category;

    private java.lang.Object deviceIp;

    private java.lang.Object manageIp;

    private java.lang.Object macAddress;

    private java.lang.String neType;

    private java.lang.String type;

    private java.lang.Object gisLon;

    private java.lang.Object gisLat;

    private java.lang.Object version;

    private java.lang.Object patchVersion;

    private java.lang.String status;

    private java.lang.Object vendor;

    private java.lang.String description;

    private java.lang.Object certStatus;

    private int onlineTime;

    private java.lang.Object updateTime;

    private java.lang.String tenantId;

    private java.lang.String tenantName;

    private java.lang.Object orgnizationId;

    private java.lang.Object orgnizationName;

    private java.lang.Object deviceGroupId;

    private java.lang.Object deviceGroupName;

    private java.lang.Object stackId;

    private java.lang.Object stackName;

    private java.lang.Object creator;

    private java.lang.Object createTime;

    private java.lang.Object startupTime;

    private java.lang.Object registerTime;

    private java.lang.Object modifier;

    private java.lang.Object modifyTime;

    private java.lang.Object result;

    private java.lang.Object resultCode;

    private java.lang.Object pkgName;

    private java.lang.Object pkgStatus;

    private java.lang.String seriesType;

    private java.lang.Object apType;

    private java.lang.Object runningStatus;

    private boolean stacked;

    private boolean multiEsned;

    private java.lang.Object esns;

    private java.lang.Object deviceForm;

    private java.lang.Object parentApName;

    private java.lang.Object mirrorGroupName;

    private java.lang.Object mirrorGroupId;

    private java.lang.String[] deviceRole;

    private int manageType;

    private java.lang.Object boardsName;

    private boolean ztpConfirm;

    private int managementStatus;

    private java.lang.Object[] managementStatusReasons;

    private java.lang.String resourceId;

    private int managementMode;

    private java.lang.Object manufacturer;

    public DataLostAr() {
    }

    public DataLostAr(
           java.lang.Object checkBoxId,
           java.lang.String deviceGroupType,
           java.lang.String id,
           java.lang.String name,
           java.lang.String esn,
           java.lang.Object category,
           java.lang.Object deviceIp,
           java.lang.Object manageIp,
           java.lang.Object macAddress,
           java.lang.String neType,
           java.lang.String type,
           java.lang.Object gisLon,
           java.lang.Object gisLat,
           java.lang.Object version,
           java.lang.Object patchVersion,
           java.lang.String status,
           java.lang.Object vendor,
           java.lang.String description,
           java.lang.Object certStatus,
           int onlineTime,
           java.lang.Object updateTime,
           java.lang.String tenantId,
           java.lang.String tenantName,
           java.lang.Object orgnizationId,
           java.lang.Object orgnizationName,
           java.lang.Object deviceGroupId,
           java.lang.Object deviceGroupName,
           java.lang.Object stackId,
           java.lang.Object stackName,
           java.lang.Object creator,
           java.lang.Object createTime,
           java.lang.Object startupTime,
           java.lang.Object registerTime,
           java.lang.Object modifier,
           java.lang.Object modifyTime,
           java.lang.Object result,
           java.lang.Object resultCode,
           java.lang.Object pkgName,
           java.lang.Object pkgStatus,
           java.lang.String seriesType,
           java.lang.Object apType,
           java.lang.Object runningStatus,
           boolean stacked,
           boolean multiEsned,
           java.lang.Object esns,
           java.lang.Object deviceForm,
           java.lang.Object parentApName,
           java.lang.Object mirrorGroupName,
           java.lang.Object mirrorGroupId,
           java.lang.String[] deviceRole,
           int manageType,
           java.lang.Object boardsName,
           boolean ztpConfirm,
           int managementStatus,
           java.lang.Object[] managementStatusReasons,
           java.lang.String resourceId,
           int managementMode,
           java.lang.Object manufacturer) {
           this.checkBoxId = checkBoxId;
           this.deviceGroupType = deviceGroupType;
           this.id = id;
           this.name = name;
           this.esn = esn;
           this.category = category;
           this.deviceIp = deviceIp;
           this.manageIp = manageIp;
           this.macAddress = macAddress;
           this.neType = neType;
           this.type = type;
           this.gisLon = gisLon;
           this.gisLat = gisLat;
           this.version = version;
           this.patchVersion = patchVersion;
           this.status = status;
           this.vendor = vendor;
           this.description = description;
           this.certStatus = certStatus;
           this.onlineTime = onlineTime;
           this.updateTime = updateTime;
           this.tenantId = tenantId;
           this.tenantName = tenantName;
           this.orgnizationId = orgnizationId;
           this.orgnizationName = orgnizationName;
           this.deviceGroupId = deviceGroupId;
           this.deviceGroupName = deviceGroupName;
           this.stackId = stackId;
           this.stackName = stackName;
           this.creator = creator;
           this.createTime = createTime;
           this.startupTime = startupTime;
           this.registerTime = registerTime;
           this.modifier = modifier;
           this.modifyTime = modifyTime;
           this.result = result;
           this.resultCode = resultCode;
           this.pkgName = pkgName;
           this.pkgStatus = pkgStatus;
           this.seriesType = seriesType;
           this.apType = apType;
           this.runningStatus = runningStatus;
           this.stacked = stacked;
           this.multiEsned = multiEsned;
           this.esns = esns;
           this.deviceForm = deviceForm;
           this.parentApName = parentApName;
           this.mirrorGroupName = mirrorGroupName;
           this.mirrorGroupId = mirrorGroupId;
           this.deviceRole = deviceRole;
           this.manageType = manageType;
           this.boardsName = boardsName;
           this.ztpConfirm = ztpConfirm;
           this.managementStatus = managementStatus;
           this.managementStatusReasons = managementStatusReasons;
           this.resourceId = resourceId;
           this.managementMode = managementMode;
           this.manufacturer = manufacturer;
    }


    /**
     * Gets the checkBoxId value for this DataLostAr.
     * 
     * @return checkBoxId
     */
    public java.lang.Object getCheckBoxId() {
        return checkBoxId;
    }


    /**
     * Sets the checkBoxId value for this DataLostAr.
     * 
     * @param checkBoxId
     */
    public void setCheckBoxId(java.lang.Object checkBoxId) {
        this.checkBoxId = checkBoxId;
    }


    /**
     * Gets the deviceGroupType value for this DataLostAr.
     * 
     * @return deviceGroupType
     */
    public java.lang.String getDeviceGroupType() {
        return deviceGroupType;
    }


    /**
     * Sets the deviceGroupType value for this DataLostAr.
     * 
     * @param deviceGroupType
     */
    public void setDeviceGroupType(java.lang.String deviceGroupType) {
        this.deviceGroupType = deviceGroupType;
    }


    /**
     * Gets the id value for this DataLostAr.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DataLostAr.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this DataLostAr.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DataLostAr.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the esn value for this DataLostAr.
     * 
     * @return esn
     */
    public java.lang.String getEsn() {
        return esn;
    }


    /**
     * Sets the esn value for this DataLostAr.
     * 
     * @param esn
     */
    public void setEsn(java.lang.String esn) {
        this.esn = esn;
    }


    /**
     * Gets the category value for this DataLostAr.
     * 
     * @return category
     */
    public java.lang.Object getCategory() {
        return category;
    }


    /**
     * Sets the category value for this DataLostAr.
     * 
     * @param category
     */
    public void setCategory(java.lang.Object category) {
        this.category = category;
    }


    /**
     * Gets the deviceIp value for this DataLostAr.
     * 
     * @return deviceIp
     */
    public java.lang.Object getDeviceIp() {
        return deviceIp;
    }


    /**
     * Sets the deviceIp value for this DataLostAr.
     * 
     * @param deviceIp
     */
    public void setDeviceIp(java.lang.Object deviceIp) {
        this.deviceIp = deviceIp;
    }


    /**
     * Gets the manageIp value for this DataLostAr.
     * 
     * @return manageIp
     */
    public java.lang.Object getManageIp() {
        return manageIp;
    }


    /**
     * Sets the manageIp value for this DataLostAr.
     * 
     * @param manageIp
     */
    public void setManageIp(java.lang.Object manageIp) {
        this.manageIp = manageIp;
    }


    /**
     * Gets the macAddress value for this DataLostAr.
     * 
     * @return macAddress
     */
    public java.lang.Object getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this DataLostAr.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.Object macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the neType value for this DataLostAr.
     * 
     * @return neType
     */
    public java.lang.String getNeType() {
        return neType;
    }


    /**
     * Sets the neType value for this DataLostAr.
     * 
     * @param neType
     */
    public void setNeType(java.lang.String neType) {
        this.neType = neType;
    }


    /**
     * Gets the type value for this DataLostAr.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DataLostAr.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the gisLon value for this DataLostAr.
     * 
     * @return gisLon
     */
    public java.lang.Object getGisLon() {
        return gisLon;
    }


    /**
     * Sets the gisLon value for this DataLostAr.
     * 
     * @param gisLon
     */
    public void setGisLon(java.lang.Object gisLon) {
        this.gisLon = gisLon;
    }


    /**
     * Gets the gisLat value for this DataLostAr.
     * 
     * @return gisLat
     */
    public java.lang.Object getGisLat() {
        return gisLat;
    }


    /**
     * Sets the gisLat value for this DataLostAr.
     * 
     * @param gisLat
     */
    public void setGisLat(java.lang.Object gisLat) {
        this.gisLat = gisLat;
    }


    /**
     * Gets the version value for this DataLostAr.
     * 
     * @return version
     */
    public java.lang.Object getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DataLostAr.
     * 
     * @param version
     */
    public void setVersion(java.lang.Object version) {
        this.version = version;
    }


    /**
     * Gets the patchVersion value for this DataLostAr.
     * 
     * @return patchVersion
     */
    public java.lang.Object getPatchVersion() {
        return patchVersion;
    }


    /**
     * Sets the patchVersion value for this DataLostAr.
     * 
     * @param patchVersion
     */
    public void setPatchVersion(java.lang.Object patchVersion) {
        this.patchVersion = patchVersion;
    }


    /**
     * Gets the status value for this DataLostAr.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DataLostAr.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the vendor value for this DataLostAr.
     * 
     * @return vendor
     */
    public java.lang.Object getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this DataLostAr.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.Object vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the description value for this DataLostAr.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DataLostAr.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the certStatus value for this DataLostAr.
     * 
     * @return certStatus
     */
    public java.lang.Object getCertStatus() {
        return certStatus;
    }


    /**
     * Sets the certStatus value for this DataLostAr.
     * 
     * @param certStatus
     */
    public void setCertStatus(java.lang.Object certStatus) {
        this.certStatus = certStatus;
    }


    /**
     * Gets the onlineTime value for this DataLostAr.
     * 
     * @return onlineTime
     */
    public int getOnlineTime() {
        return onlineTime;
    }


    /**
     * Sets the onlineTime value for this DataLostAr.
     * 
     * @param onlineTime
     */
    public void setOnlineTime(int onlineTime) {
        this.onlineTime = onlineTime;
    }


    /**
     * Gets the updateTime value for this DataLostAr.
     * 
     * @return updateTime
     */
    public java.lang.Object getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this DataLostAr.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.lang.Object updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the tenantId value for this DataLostAr.
     * 
     * @return tenantId
     */
    public java.lang.String getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this DataLostAr.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the tenantName value for this DataLostAr.
     * 
     * @return tenantName
     */
    public java.lang.String getTenantName() {
        return tenantName;
    }


    /**
     * Sets the tenantName value for this DataLostAr.
     * 
     * @param tenantName
     */
    public void setTenantName(java.lang.String tenantName) {
        this.tenantName = tenantName;
    }


    /**
     * Gets the orgnizationId value for this DataLostAr.
     * 
     * @return orgnizationId
     */
    public java.lang.Object getOrgnizationId() {
        return orgnizationId;
    }


    /**
     * Sets the orgnizationId value for this DataLostAr.
     * 
     * @param orgnizationId
     */
    public void setOrgnizationId(java.lang.Object orgnizationId) {
        this.orgnizationId = orgnizationId;
    }


    /**
     * Gets the orgnizationName value for this DataLostAr.
     * 
     * @return orgnizationName
     */
    public java.lang.Object getOrgnizationName() {
        return orgnizationName;
    }


    /**
     * Sets the orgnizationName value for this DataLostAr.
     * 
     * @param orgnizationName
     */
    public void setOrgnizationName(java.lang.Object orgnizationName) {
        this.orgnizationName = orgnizationName;
    }


    /**
     * Gets the deviceGroupId value for this DataLostAr.
     * 
     * @return deviceGroupId
     */
    public java.lang.Object getDeviceGroupId() {
        return deviceGroupId;
    }


    /**
     * Sets the deviceGroupId value for this DataLostAr.
     * 
     * @param deviceGroupId
     */
    public void setDeviceGroupId(java.lang.Object deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }


    /**
     * Gets the deviceGroupName value for this DataLostAr.
     * 
     * @return deviceGroupName
     */
    public java.lang.Object getDeviceGroupName() {
        return deviceGroupName;
    }


    /**
     * Sets the deviceGroupName value for this DataLostAr.
     * 
     * @param deviceGroupName
     */
    public void setDeviceGroupName(java.lang.Object deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }


    /**
     * Gets the stackId value for this DataLostAr.
     * 
     * @return stackId
     */
    public java.lang.Object getStackId() {
        return stackId;
    }


    /**
     * Sets the stackId value for this DataLostAr.
     * 
     * @param stackId
     */
    public void setStackId(java.lang.Object stackId) {
        this.stackId = stackId;
    }


    /**
     * Gets the stackName value for this DataLostAr.
     * 
     * @return stackName
     */
    public java.lang.Object getStackName() {
        return stackName;
    }


    /**
     * Sets the stackName value for this DataLostAr.
     * 
     * @param stackName
     */
    public void setStackName(java.lang.Object stackName) {
        this.stackName = stackName;
    }


    /**
     * Gets the creator value for this DataLostAr.
     * 
     * @return creator
     */
    public java.lang.Object getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this DataLostAr.
     * 
     * @param creator
     */
    public void setCreator(java.lang.Object creator) {
        this.creator = creator;
    }


    /**
     * Gets the createTime value for this DataLostAr.
     * 
     * @return createTime
     */
    public java.lang.Object getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this DataLostAr.
     * 
     * @param createTime
     */
    public void setCreateTime(java.lang.Object createTime) {
        this.createTime = createTime;
    }


    /**
     * Gets the startupTime value for this DataLostAr.
     * 
     * @return startupTime
     */
    public java.lang.Object getStartupTime() {
        return startupTime;
    }


    /**
     * Sets the startupTime value for this DataLostAr.
     * 
     * @param startupTime
     */
    public void setStartupTime(java.lang.Object startupTime) {
        this.startupTime = startupTime;
    }


    /**
     * Gets the registerTime value for this DataLostAr.
     * 
     * @return registerTime
     */
    public java.lang.Object getRegisterTime() {
        return registerTime;
    }


    /**
     * Sets the registerTime value for this DataLostAr.
     * 
     * @param registerTime
     */
    public void setRegisterTime(java.lang.Object registerTime) {
        this.registerTime = registerTime;
    }


    /**
     * Gets the modifier value for this DataLostAr.
     * 
     * @return modifier
     */
    public java.lang.Object getModifier() {
        return modifier;
    }


    /**
     * Sets the modifier value for this DataLostAr.
     * 
     * @param modifier
     */
    public void setModifier(java.lang.Object modifier) {
        this.modifier = modifier;
    }


    /**
     * Gets the modifyTime value for this DataLostAr.
     * 
     * @return modifyTime
     */
    public java.lang.Object getModifyTime() {
        return modifyTime;
    }


    /**
     * Sets the modifyTime value for this DataLostAr.
     * 
     * @param modifyTime
     */
    public void setModifyTime(java.lang.Object modifyTime) {
        this.modifyTime = modifyTime;
    }


    /**
     * Gets the result value for this DataLostAr.
     * 
     * @return result
     */
    public java.lang.Object getResult() {
        return result;
    }


    /**
     * Sets the result value for this DataLostAr.
     * 
     * @param result
     */
    public void setResult(java.lang.Object result) {
        this.result = result;
    }


    /**
     * Gets the resultCode value for this DataLostAr.
     * 
     * @return resultCode
     */
    public java.lang.Object getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this DataLostAr.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.Object resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the pkgName value for this DataLostAr.
     * 
     * @return pkgName
     */
    public java.lang.Object getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this DataLostAr.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.Object pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the pkgStatus value for this DataLostAr.
     * 
     * @return pkgStatus
     */
    public java.lang.Object getPkgStatus() {
        return pkgStatus;
    }


    /**
     * Sets the pkgStatus value for this DataLostAr.
     * 
     * @param pkgStatus
     */
    public void setPkgStatus(java.lang.Object pkgStatus) {
        this.pkgStatus = pkgStatus;
    }


    /**
     * Gets the seriesType value for this DataLostAr.
     * 
     * @return seriesType
     */
    public java.lang.String getSeriesType() {
        return seriesType;
    }


    /**
     * Sets the seriesType value for this DataLostAr.
     * 
     * @param seriesType
     */
    public void setSeriesType(java.lang.String seriesType) {
        this.seriesType = seriesType;
    }


    /**
     * Gets the apType value for this DataLostAr.
     * 
     * @return apType
     */
    public java.lang.Object getApType() {
        return apType;
    }


    /**
     * Sets the apType value for this DataLostAr.
     * 
     * @param apType
     */
    public void setApType(java.lang.Object apType) {
        this.apType = apType;
    }


    /**
     * Gets the runningStatus value for this DataLostAr.
     * 
     * @return runningStatus
     */
    public java.lang.Object getRunningStatus() {
        return runningStatus;
    }


    /**
     * Sets the runningStatus value for this DataLostAr.
     * 
     * @param runningStatus
     */
    public void setRunningStatus(java.lang.Object runningStatus) {
        this.runningStatus = runningStatus;
    }


    /**
     * Gets the stacked value for this DataLostAr.
     * 
     * @return stacked
     */
    public boolean isStacked() {
        return stacked;
    }


    /**
     * Sets the stacked value for this DataLostAr.
     * 
     * @param stacked
     */
    public void setStacked(boolean stacked) {
        this.stacked = stacked;
    }


    /**
     * Gets the multiEsned value for this DataLostAr.
     * 
     * @return multiEsned
     */
    public boolean isMultiEsned() {
        return multiEsned;
    }


    /**
     * Sets the multiEsned value for this DataLostAr.
     * 
     * @param multiEsned
     */
    public void setMultiEsned(boolean multiEsned) {
        this.multiEsned = multiEsned;
    }


    /**
     * Gets the esns value for this DataLostAr.
     * 
     * @return esns
     */
    public java.lang.Object getEsns() {
        return esns;
    }


    /**
     * Sets the esns value for this DataLostAr.
     * 
     * @param esns
     */
    public void setEsns(java.lang.Object esns) {
        this.esns = esns;
    }


    /**
     * Gets the deviceForm value for this DataLostAr.
     * 
     * @return deviceForm
     */
    public java.lang.Object getDeviceForm() {
        return deviceForm;
    }


    /**
     * Sets the deviceForm value for this DataLostAr.
     * 
     * @param deviceForm
     */
    public void setDeviceForm(java.lang.Object deviceForm) {
        this.deviceForm = deviceForm;
    }


    /**
     * Gets the parentApName value for this DataLostAr.
     * 
     * @return parentApName
     */
    public java.lang.Object getParentApName() {
        return parentApName;
    }


    /**
     * Sets the parentApName value for this DataLostAr.
     * 
     * @param parentApName
     */
    public void setParentApName(java.lang.Object parentApName) {
        this.parentApName = parentApName;
    }


    /**
     * Gets the mirrorGroupName value for this DataLostAr.
     * 
     * @return mirrorGroupName
     */
    public java.lang.Object getMirrorGroupName() {
        return mirrorGroupName;
    }


    /**
     * Sets the mirrorGroupName value for this DataLostAr.
     * 
     * @param mirrorGroupName
     */
    public void setMirrorGroupName(java.lang.Object mirrorGroupName) {
        this.mirrorGroupName = mirrorGroupName;
    }


    /**
     * Gets the mirrorGroupId value for this DataLostAr.
     * 
     * @return mirrorGroupId
     */
    public java.lang.Object getMirrorGroupId() {
        return mirrorGroupId;
    }


    /**
     * Sets the mirrorGroupId value for this DataLostAr.
     * 
     * @param mirrorGroupId
     */
    public void setMirrorGroupId(java.lang.Object mirrorGroupId) {
        this.mirrorGroupId = mirrorGroupId;
    }


    /**
     * Gets the deviceRole value for this DataLostAr.
     * 
     * @return deviceRole
     */
    public java.lang.String[] getDeviceRole() {
        return deviceRole;
    }


    /**
     * Sets the deviceRole value for this DataLostAr.
     * 
     * @param deviceRole
     */
    public void setDeviceRole(java.lang.String[] deviceRole) {
        this.deviceRole = deviceRole;
    }


    /**
     * Gets the manageType value for this DataLostAr.
     * 
     * @return manageType
     */
    public int getManageType() {
        return manageType;
    }


    /**
     * Sets the manageType value for this DataLostAr.
     * 
     * @param manageType
     */
    public void setManageType(int manageType) {
        this.manageType = manageType;
    }


    /**
     * Gets the boardsName value for this DataLostAr.
     * 
     * @return boardsName
     */
    public java.lang.Object getBoardsName() {
        return boardsName;
    }


    /**
     * Sets the boardsName value for this DataLostAr.
     * 
     * @param boardsName
     */
    public void setBoardsName(java.lang.Object boardsName) {
        this.boardsName = boardsName;
    }


    /**
     * Gets the ztpConfirm value for this DataLostAr.
     * 
     * @return ztpConfirm
     */
    public boolean isZtpConfirm() {
        return ztpConfirm;
    }


    /**
     * Sets the ztpConfirm value for this DataLostAr.
     * 
     * @param ztpConfirm
     */
    public void setZtpConfirm(boolean ztpConfirm) {
        this.ztpConfirm = ztpConfirm;
    }


    /**
     * Gets the managementStatus value for this DataLostAr.
     * 
     * @return managementStatus
     */
    public int getManagementStatus() {
        return managementStatus;
    }


    /**
     * Sets the managementStatus value for this DataLostAr.
     * 
     * @param managementStatus
     */
    public void setManagementStatus(int managementStatus) {
        this.managementStatus = managementStatus;
    }


    /**
     * Gets the managementStatusReasons value for this DataLostAr.
     * 
     * @return managementStatusReasons
     */
    public java.lang.Object[] getManagementStatusReasons() {
        return managementStatusReasons;
    }


    /**
     * Sets the managementStatusReasons value for this DataLostAr.
     * 
     * @param managementStatusReasons
     */
    public void setManagementStatusReasons(java.lang.Object[] managementStatusReasons) {
        this.managementStatusReasons = managementStatusReasons;
    }


    /**
     * Gets the resourceId value for this DataLostAr.
     * 
     * @return resourceId
     */
    public java.lang.String getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this DataLostAr.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the managementMode value for this DataLostAr.
     * 
     * @return managementMode
     */
    public int getManagementMode() {
        return managementMode;
    }


    /**
     * Sets the managementMode value for this DataLostAr.
     * 
     * @param managementMode
     */
    public void setManagementMode(int managementMode) {
        this.managementMode = managementMode;
    }


    /**
     * Gets the manufacturer value for this DataLostAr.
     * 
     * @return manufacturer
     */
    public java.lang.Object getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this DataLostAr.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.Object manufacturer) {
        this.manufacturer = manufacturer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataLostAr)) return false;
        DataLostAr other = (DataLostAr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkBoxId==null && other.getCheckBoxId()==null) || 
             (this.checkBoxId!=null &&
              this.checkBoxId.equals(other.getCheckBoxId()))) &&
            ((this.deviceGroupType==null && other.getDeviceGroupType()==null) || 
             (this.deviceGroupType!=null &&
              this.deviceGroupType.equals(other.getDeviceGroupType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.esn==null && other.getEsn()==null) || 
             (this.esn!=null &&
              this.esn.equals(other.getEsn()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.deviceIp==null && other.getDeviceIp()==null) || 
             (this.deviceIp!=null &&
              this.deviceIp.equals(other.getDeviceIp()))) &&
            ((this.manageIp==null && other.getManageIp()==null) || 
             (this.manageIp!=null &&
              this.manageIp.equals(other.getManageIp()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.neType==null && other.getNeType()==null) || 
             (this.neType!=null &&
              this.neType.equals(other.getNeType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.gisLon==null && other.getGisLon()==null) || 
             (this.gisLon!=null &&
              this.gisLon.equals(other.getGisLon()))) &&
            ((this.gisLat==null && other.getGisLat()==null) || 
             (this.gisLat!=null &&
              this.gisLat.equals(other.getGisLat()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.patchVersion==null && other.getPatchVersion()==null) || 
             (this.patchVersion!=null &&
              this.patchVersion.equals(other.getPatchVersion()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.certStatus==null && other.getCertStatus()==null) || 
             (this.certStatus!=null &&
              this.certStatus.equals(other.getCertStatus()))) &&
            this.onlineTime == other.getOnlineTime() &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId()))) &&
            ((this.tenantName==null && other.getTenantName()==null) || 
             (this.tenantName!=null &&
              this.tenantName.equals(other.getTenantName()))) &&
            ((this.orgnizationId==null && other.getOrgnizationId()==null) || 
             (this.orgnizationId!=null &&
              this.orgnizationId.equals(other.getOrgnizationId()))) &&
            ((this.orgnizationName==null && other.getOrgnizationName()==null) || 
             (this.orgnizationName!=null &&
              this.orgnizationName.equals(other.getOrgnizationName()))) &&
            ((this.deviceGroupId==null && other.getDeviceGroupId()==null) || 
             (this.deviceGroupId!=null &&
              this.deviceGroupId.equals(other.getDeviceGroupId()))) &&
            ((this.deviceGroupName==null && other.getDeviceGroupName()==null) || 
             (this.deviceGroupName!=null &&
              this.deviceGroupName.equals(other.getDeviceGroupName()))) &&
            ((this.stackId==null && other.getStackId()==null) || 
             (this.stackId!=null &&
              this.stackId.equals(other.getStackId()))) &&
            ((this.stackName==null && other.getStackName()==null) || 
             (this.stackName!=null &&
              this.stackName.equals(other.getStackName()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime()))) &&
            ((this.startupTime==null && other.getStartupTime()==null) || 
             (this.startupTime!=null &&
              this.startupTime.equals(other.getStartupTime()))) &&
            ((this.registerTime==null && other.getRegisterTime()==null) || 
             (this.registerTime!=null &&
              this.registerTime.equals(other.getRegisterTime()))) &&
            ((this.modifier==null && other.getModifier()==null) || 
             (this.modifier!=null &&
              this.modifier.equals(other.getModifier()))) &&
            ((this.modifyTime==null && other.getModifyTime()==null) || 
             (this.modifyTime!=null &&
              this.modifyTime.equals(other.getModifyTime()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.pkgName==null && other.getPkgName()==null) || 
             (this.pkgName!=null &&
              this.pkgName.equals(other.getPkgName()))) &&
            ((this.pkgStatus==null && other.getPkgStatus()==null) || 
             (this.pkgStatus!=null &&
              this.pkgStatus.equals(other.getPkgStatus()))) &&
            ((this.seriesType==null && other.getSeriesType()==null) || 
             (this.seriesType!=null &&
              this.seriesType.equals(other.getSeriesType()))) &&
            ((this.apType==null && other.getApType()==null) || 
             (this.apType!=null &&
              this.apType.equals(other.getApType()))) &&
            ((this.runningStatus==null && other.getRunningStatus()==null) || 
             (this.runningStatus!=null &&
              this.runningStatus.equals(other.getRunningStatus()))) &&
            this.stacked == other.isStacked() &&
            this.multiEsned == other.isMultiEsned() &&
            ((this.esns==null && other.getEsns()==null) || 
             (this.esns!=null &&
              this.esns.equals(other.getEsns()))) &&
            ((this.deviceForm==null && other.getDeviceForm()==null) || 
             (this.deviceForm!=null &&
              this.deviceForm.equals(other.getDeviceForm()))) &&
            ((this.parentApName==null && other.getParentApName()==null) || 
             (this.parentApName!=null &&
              this.parentApName.equals(other.getParentApName()))) &&
            ((this.mirrorGroupName==null && other.getMirrorGroupName()==null) || 
             (this.mirrorGroupName!=null &&
              this.mirrorGroupName.equals(other.getMirrorGroupName()))) &&
            ((this.mirrorGroupId==null && other.getMirrorGroupId()==null) || 
             (this.mirrorGroupId!=null &&
              this.mirrorGroupId.equals(other.getMirrorGroupId()))) &&
            ((this.deviceRole==null && other.getDeviceRole()==null) || 
             (this.deviceRole!=null &&
              java.util.Arrays.equals(this.deviceRole, other.getDeviceRole()))) &&
            this.manageType == other.getManageType() &&
            ((this.boardsName==null && other.getBoardsName()==null) || 
             (this.boardsName!=null &&
              this.boardsName.equals(other.getBoardsName()))) &&
            this.ztpConfirm == other.isZtpConfirm() &&
            this.managementStatus == other.getManagementStatus() &&
            ((this.managementStatusReasons==null && other.getManagementStatusReasons()==null) || 
             (this.managementStatusReasons!=null &&
              java.util.Arrays.equals(this.managementStatusReasons, other.getManagementStatusReasons()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            this.managementMode == other.getManagementMode() &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer())));
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
        if (getCheckBoxId() != null) {
            _hashCode += getCheckBoxId().hashCode();
        }
        if (getDeviceGroupType() != null) {
            _hashCode += getDeviceGroupType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEsn() != null) {
            _hashCode += getEsn().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getDeviceIp() != null) {
            _hashCode += getDeviceIp().hashCode();
        }
        if (getManageIp() != null) {
            _hashCode += getManageIp().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getNeType() != null) {
            _hashCode += getNeType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getGisLon() != null) {
            _hashCode += getGisLon().hashCode();
        }
        if (getGisLat() != null) {
            _hashCode += getGisLat().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getPatchVersion() != null) {
            _hashCode += getPatchVersion().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCertStatus() != null) {
            _hashCode += getCertStatus().hashCode();
        }
        _hashCode += getOnlineTime();
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        if (getTenantName() != null) {
            _hashCode += getTenantName().hashCode();
        }
        if (getOrgnizationId() != null) {
            _hashCode += getOrgnizationId().hashCode();
        }
        if (getOrgnizationName() != null) {
            _hashCode += getOrgnizationName().hashCode();
        }
        if (getDeviceGroupId() != null) {
            _hashCode += getDeviceGroupId().hashCode();
        }
        if (getDeviceGroupName() != null) {
            _hashCode += getDeviceGroupName().hashCode();
        }
        if (getStackId() != null) {
            _hashCode += getStackId().hashCode();
        }
        if (getStackName() != null) {
            _hashCode += getStackName().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        if (getStartupTime() != null) {
            _hashCode += getStartupTime().hashCode();
        }
        if (getRegisterTime() != null) {
            _hashCode += getRegisterTime().hashCode();
        }
        if (getModifier() != null) {
            _hashCode += getModifier().hashCode();
        }
        if (getModifyTime() != null) {
            _hashCode += getModifyTime().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getPkgName() != null) {
            _hashCode += getPkgName().hashCode();
        }
        if (getPkgStatus() != null) {
            _hashCode += getPkgStatus().hashCode();
        }
        if (getSeriesType() != null) {
            _hashCode += getSeriesType().hashCode();
        }
        if (getApType() != null) {
            _hashCode += getApType().hashCode();
        }
        if (getRunningStatus() != null) {
            _hashCode += getRunningStatus().hashCode();
        }
        _hashCode += (isStacked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMultiEsned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEsns() != null) {
            _hashCode += getEsns().hashCode();
        }
        if (getDeviceForm() != null) {
            _hashCode += getDeviceForm().hashCode();
        }
        if (getParentApName() != null) {
            _hashCode += getParentApName().hashCode();
        }
        if (getMirrorGroupName() != null) {
            _hashCode += getMirrorGroupName().hashCode();
        }
        if (getMirrorGroupId() != null) {
            _hashCode += getMirrorGroupId().hashCode();
        }
        if (getDeviceRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getManageType();
        if (getBoardsName() != null) {
            _hashCode += getBoardsName().hashCode();
        }
        _hashCode += (isZtpConfirm() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getManagementStatus();
        if (getManagementStatusReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagementStatusReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagementStatusReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        _hashCode += getManagementMode();
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataLostAr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DataLostAr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkBoxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "checkBoxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("esn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "esn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "manageIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "neType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gisLon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gisLon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gisLat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gisLat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patchVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "patchVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vendor"));
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
        elemField.setFieldName("certStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "certStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "onlineTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "updateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tenantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgnizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "orgnizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgnizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "orgnizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stackId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stackName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stackName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "createTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "startupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "registerTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "modifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "modifyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pkgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pkgStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "seriesType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "apType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "runningStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stacked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiEsned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "multiEsned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "esns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentApName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "parentApName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mirrorGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mirrorGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mirrorGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mirrorGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deviceRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "manageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boardsName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "boardsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ztpConfirm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ztpConfirm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "managementStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementStatusReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "managementStatusReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "managementMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "manufacturer"));
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
