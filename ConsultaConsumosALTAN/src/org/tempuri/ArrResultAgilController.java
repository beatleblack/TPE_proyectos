/**
 * ArrResultAgilController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ArrResultAgilController  implements java.io.Serializable {
    private long idResult;

    private int result;

    private java.lang.String resultDescription;

    private java.lang.String[] tokens;

    private org.tempuri.ResponseTenant2020 responseTenant2020;

    private org.tempuri.ResponseDevice2020 responseDevice2020;

    private org.tempuri.ResponseLostDevice2020 responseLostDevice2020;

    private org.tempuri.ResponseOK responseOK;

    private org.tempuri.ResponseSiteTemplate responseSiteTemplate;

    private org.tempuri.ResponsechangePassword responsechangePassword;

    private org.tempuri.GetSiteforUpdates getSiteforUpdates;

    private org.tempuri.ReponseIDTenantforDelete reponseIDTenantforDelete;

    private org.tempuri.ResponseVPNService responseVPNService;

    private org.tempuri.ResponseSubnet responseSubnet;

    private org.tempuri.ResponseWanlinksTemplate responseWanlinksTemplate;

    private org.tempuri.ResponseWanlinksTemplate2 responseWanlinksTemplate2;

    private org.tempuri.ResponseSITEID responseSITEID;

    private org.tempuri.ResponseVPNServiceGet responseVPNServiceGet;

    private org.tempuri.ResponseLocalEthernet responseLocalEthernet;

    private org.tempuri.ResponseSite2020 responseSite2020;

    private org.tempuri.ResponseSubnetQ2020 responseSubnetQ2020;

    private org.tempuri.ResponseSubnetQ2020B responseSubnetQ2020B;

    private org.tempuri.SubnetsL12 subnetsL12;

    private org.tempuri.ResponseAllDevice responseAllDevice;

    private org.tempuri.ResponseLostAr2020 responseLostAr2020;

    private org.tempuri.GetSiteHealtInfo2020 getSiteHealtInfo2020;

    private org.tempuri.ResponseAppAqmWorstn2020 responseAppAqmWorstn2020;

    private org.tempuri.OutGetAppStatistics2020 outGetAppStatistics2020;

    private org.tempuri.ResponseHub responseHub;

    private org.tempuri.ResponseCpuUt2020 responseGet2020;

    private org.tempuri.ResponseGetalarm responseGetalarm;

    private org.tempuri.ResponseGetBasicInformation responseGetBasicInformation;

    private org.tempuri.ResponseGetVPNID responseGetVPNID;

    private org.tempuri.ResponseSecurityPolice2020 responseSecurityPolice2020;

    private org.tempuri.ResponseAllTenants2020 responseAllTenants2020;

    private org.tempuri.ResponseUsageDisk2020 responseUsageDisk2020;

    private org.tempuri.ResponseMemoryDev2020 responseMemoryDev2020;

    private org.tempuri.ResponseTemperature2020 responseTemperature2020;

    private org.tempuri.OutGetDevice_v2020 outGetDevice_v2020;

    private org.tempuri.OutGetDashboardIMaster dashboardInfoIMaster;

    private org.tempuri.ResponseGetListQoS responseGetListQoS;

    private org.tempuri.OutConsumosAltanPro outConsumosAltan;

    public ArrResultAgilController() {
    }

    public ArrResultAgilController(
           long idResult,
           int result,
           java.lang.String resultDescription,
           java.lang.String[] tokens,
           org.tempuri.ResponseTenant2020 responseTenant2020,
           org.tempuri.ResponseDevice2020 responseDevice2020,
           org.tempuri.ResponseLostDevice2020 responseLostDevice2020,
           org.tempuri.ResponseOK responseOK,
           org.tempuri.ResponseSiteTemplate responseSiteTemplate,
           org.tempuri.ResponsechangePassword responsechangePassword,
           org.tempuri.GetSiteforUpdates getSiteforUpdates,
           org.tempuri.ReponseIDTenantforDelete reponseIDTenantforDelete,
           org.tempuri.ResponseVPNService responseVPNService,
           org.tempuri.ResponseSubnet responseSubnet,
           org.tempuri.ResponseWanlinksTemplate responseWanlinksTemplate,
           org.tempuri.ResponseWanlinksTemplate2 responseWanlinksTemplate2,
           org.tempuri.ResponseSITEID responseSITEID,
           org.tempuri.ResponseVPNServiceGet responseVPNServiceGet,
           org.tempuri.ResponseLocalEthernet responseLocalEthernet,
           org.tempuri.ResponseSite2020 responseSite2020,
           org.tempuri.ResponseSubnetQ2020 responseSubnetQ2020,
           org.tempuri.ResponseSubnetQ2020B responseSubnetQ2020B,
           org.tempuri.SubnetsL12 subnetsL12,
           org.tempuri.ResponseAllDevice responseAllDevice,
           org.tempuri.ResponseLostAr2020 responseLostAr2020,
           org.tempuri.GetSiteHealtInfo2020 getSiteHealtInfo2020,
           org.tempuri.ResponseAppAqmWorstn2020 responseAppAqmWorstn2020,
           org.tempuri.OutGetAppStatistics2020 outGetAppStatistics2020,
           org.tempuri.ResponseHub responseHub,
           org.tempuri.ResponseCpuUt2020 responseGet2020,
           org.tempuri.ResponseGetalarm responseGetalarm,
           org.tempuri.ResponseGetBasicInformation responseGetBasicInformation,
           org.tempuri.ResponseGetVPNID responseGetVPNID,
           org.tempuri.ResponseSecurityPolice2020 responseSecurityPolice2020,
           org.tempuri.ResponseAllTenants2020 responseAllTenants2020,
           org.tempuri.ResponseUsageDisk2020 responseUsageDisk2020,
           org.tempuri.ResponseMemoryDev2020 responseMemoryDev2020,
           org.tempuri.ResponseTemperature2020 responseTemperature2020,
           org.tempuri.OutGetDevice_v2020 outGetDevice_v2020,
           org.tempuri.OutGetDashboardIMaster dashboardInfoIMaster,
           org.tempuri.ResponseGetListQoS responseGetListQoS,
           org.tempuri.OutConsumosAltanPro outConsumosAltan) {
           this.idResult = idResult;
           this.result = result;
           this.resultDescription = resultDescription;
           this.tokens = tokens;
           this.responseTenant2020 = responseTenant2020;
           this.responseDevice2020 = responseDevice2020;
           this.responseLostDevice2020 = responseLostDevice2020;
           this.responseOK = responseOK;
           this.responseSiteTemplate = responseSiteTemplate;
           this.responsechangePassword = responsechangePassword;
           this.getSiteforUpdates = getSiteforUpdates;
           this.reponseIDTenantforDelete = reponseIDTenantforDelete;
           this.responseVPNService = responseVPNService;
           this.responseSubnet = responseSubnet;
           this.responseWanlinksTemplate = responseWanlinksTemplate;
           this.responseWanlinksTemplate2 = responseWanlinksTemplate2;
           this.responseSITEID = responseSITEID;
           this.responseVPNServiceGet = responseVPNServiceGet;
           this.responseLocalEthernet = responseLocalEthernet;
           this.responseSite2020 = responseSite2020;
           this.responseSubnetQ2020 = responseSubnetQ2020;
           this.responseSubnetQ2020B = responseSubnetQ2020B;
           this.subnetsL12 = subnetsL12;
           this.responseAllDevice = responseAllDevice;
           this.responseLostAr2020 = responseLostAr2020;
           this.getSiteHealtInfo2020 = getSiteHealtInfo2020;
           this.responseAppAqmWorstn2020 = responseAppAqmWorstn2020;
           this.outGetAppStatistics2020 = outGetAppStatistics2020;
           this.responseHub = responseHub;
           this.responseGet2020 = responseGet2020;
           this.responseGetalarm = responseGetalarm;
           this.responseGetBasicInformation = responseGetBasicInformation;
           this.responseGetVPNID = responseGetVPNID;
           this.responseSecurityPolice2020 = responseSecurityPolice2020;
           this.responseAllTenants2020 = responseAllTenants2020;
           this.responseUsageDisk2020 = responseUsageDisk2020;
           this.responseMemoryDev2020 = responseMemoryDev2020;
           this.responseTemperature2020 = responseTemperature2020;
           this.outGetDevice_v2020 = outGetDevice_v2020;
           this.dashboardInfoIMaster = dashboardInfoIMaster;
           this.responseGetListQoS = responseGetListQoS;
           this.outConsumosAltan = outConsumosAltan;
    }


    /**
     * Gets the idResult value for this ArrResultAgilController.
     * 
     * @return idResult
     */
    public long getIdResult() {
        return idResult;
    }


    /**
     * Sets the idResult value for this ArrResultAgilController.
     * 
     * @param idResult
     */
    public void setIdResult(long idResult) {
        this.idResult = idResult;
    }


    /**
     * Gets the result value for this ArrResultAgilController.
     * 
     * @return result
     */
    public int getResult() {
        return result;
    }


    /**
     * Sets the result value for this ArrResultAgilController.
     * 
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Gets the resultDescription value for this ArrResultAgilController.
     * 
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this ArrResultAgilController.
     * 
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the tokens value for this ArrResultAgilController.
     * 
     * @return tokens
     */
    public java.lang.String[] getTokens() {
        return tokens;
    }


    /**
     * Sets the tokens value for this ArrResultAgilController.
     * 
     * @param tokens
     */
    public void setTokens(java.lang.String[] tokens) {
        this.tokens = tokens;
    }


    /**
     * Gets the responseTenant2020 value for this ArrResultAgilController.
     * 
     * @return responseTenant2020
     */
    public org.tempuri.ResponseTenant2020 getResponseTenant2020() {
        return responseTenant2020;
    }


    /**
     * Sets the responseTenant2020 value for this ArrResultAgilController.
     * 
     * @param responseTenant2020
     */
    public void setResponseTenant2020(org.tempuri.ResponseTenant2020 responseTenant2020) {
        this.responseTenant2020 = responseTenant2020;
    }


    /**
     * Gets the responseDevice2020 value for this ArrResultAgilController.
     * 
     * @return responseDevice2020
     */
    public org.tempuri.ResponseDevice2020 getResponseDevice2020() {
        return responseDevice2020;
    }


    /**
     * Sets the responseDevice2020 value for this ArrResultAgilController.
     * 
     * @param responseDevice2020
     */
    public void setResponseDevice2020(org.tempuri.ResponseDevice2020 responseDevice2020) {
        this.responseDevice2020 = responseDevice2020;
    }


    /**
     * Gets the responseLostDevice2020 value for this ArrResultAgilController.
     * 
     * @return responseLostDevice2020
     */
    public org.tempuri.ResponseLostDevice2020 getResponseLostDevice2020() {
        return responseLostDevice2020;
    }


    /**
     * Sets the responseLostDevice2020 value for this ArrResultAgilController.
     * 
     * @param responseLostDevice2020
     */
    public void setResponseLostDevice2020(org.tempuri.ResponseLostDevice2020 responseLostDevice2020) {
        this.responseLostDevice2020 = responseLostDevice2020;
    }


    /**
     * Gets the responseOK value for this ArrResultAgilController.
     * 
     * @return responseOK
     */
    public org.tempuri.ResponseOK getResponseOK() {
        return responseOK;
    }


    /**
     * Sets the responseOK value for this ArrResultAgilController.
     * 
     * @param responseOK
     */
    public void setResponseOK(org.tempuri.ResponseOK responseOK) {
        this.responseOK = responseOK;
    }


    /**
     * Gets the responseSiteTemplate value for this ArrResultAgilController.
     * 
     * @return responseSiteTemplate
     */
    public org.tempuri.ResponseSiteTemplate getResponseSiteTemplate() {
        return responseSiteTemplate;
    }


    /**
     * Sets the responseSiteTemplate value for this ArrResultAgilController.
     * 
     * @param responseSiteTemplate
     */
    public void setResponseSiteTemplate(org.tempuri.ResponseSiteTemplate responseSiteTemplate) {
        this.responseSiteTemplate = responseSiteTemplate;
    }


    /**
     * Gets the responsechangePassword value for this ArrResultAgilController.
     * 
     * @return responsechangePassword
     */
    public org.tempuri.ResponsechangePassword getResponsechangePassword() {
        return responsechangePassword;
    }


    /**
     * Sets the responsechangePassword value for this ArrResultAgilController.
     * 
     * @param responsechangePassword
     */
    public void setResponsechangePassword(org.tempuri.ResponsechangePassword responsechangePassword) {
        this.responsechangePassword = responsechangePassword;
    }


    /**
     * Gets the getSiteforUpdates value for this ArrResultAgilController.
     * 
     * @return getSiteforUpdates
     */
    public org.tempuri.GetSiteforUpdates getGetSiteforUpdates() {
        return getSiteforUpdates;
    }


    /**
     * Sets the getSiteforUpdates value for this ArrResultAgilController.
     * 
     * @param getSiteforUpdates
     */
    public void setGetSiteforUpdates(org.tempuri.GetSiteforUpdates getSiteforUpdates) {
        this.getSiteforUpdates = getSiteforUpdates;
    }


    /**
     * Gets the reponseIDTenantforDelete value for this ArrResultAgilController.
     * 
     * @return reponseIDTenantforDelete
     */
    public org.tempuri.ReponseIDTenantforDelete getReponseIDTenantforDelete() {
        return reponseIDTenantforDelete;
    }


    /**
     * Sets the reponseIDTenantforDelete value for this ArrResultAgilController.
     * 
     * @param reponseIDTenantforDelete
     */
    public void setReponseIDTenantforDelete(org.tempuri.ReponseIDTenantforDelete reponseIDTenantforDelete) {
        this.reponseIDTenantforDelete = reponseIDTenantforDelete;
    }


    /**
     * Gets the responseVPNService value for this ArrResultAgilController.
     * 
     * @return responseVPNService
     */
    public org.tempuri.ResponseVPNService getResponseVPNService() {
        return responseVPNService;
    }


    /**
     * Sets the responseVPNService value for this ArrResultAgilController.
     * 
     * @param responseVPNService
     */
    public void setResponseVPNService(org.tempuri.ResponseVPNService responseVPNService) {
        this.responseVPNService = responseVPNService;
    }


    /**
     * Gets the responseSubnet value for this ArrResultAgilController.
     * 
     * @return responseSubnet
     */
    public org.tempuri.ResponseSubnet getResponseSubnet() {
        return responseSubnet;
    }


    /**
     * Sets the responseSubnet value for this ArrResultAgilController.
     * 
     * @param responseSubnet
     */
    public void setResponseSubnet(org.tempuri.ResponseSubnet responseSubnet) {
        this.responseSubnet = responseSubnet;
    }


    /**
     * Gets the responseWanlinksTemplate value for this ArrResultAgilController.
     * 
     * @return responseWanlinksTemplate
     */
    public org.tempuri.ResponseWanlinksTemplate getResponseWanlinksTemplate() {
        return responseWanlinksTemplate;
    }


    /**
     * Sets the responseWanlinksTemplate value for this ArrResultAgilController.
     * 
     * @param responseWanlinksTemplate
     */
    public void setResponseWanlinksTemplate(org.tempuri.ResponseWanlinksTemplate responseWanlinksTemplate) {
        this.responseWanlinksTemplate = responseWanlinksTemplate;
    }


    /**
     * Gets the responseWanlinksTemplate2 value for this ArrResultAgilController.
     * 
     * @return responseWanlinksTemplate2
     */
    public org.tempuri.ResponseWanlinksTemplate2 getResponseWanlinksTemplate2() {
        return responseWanlinksTemplate2;
    }


    /**
     * Sets the responseWanlinksTemplate2 value for this ArrResultAgilController.
     * 
     * @param responseWanlinksTemplate2
     */
    public void setResponseWanlinksTemplate2(org.tempuri.ResponseWanlinksTemplate2 responseWanlinksTemplate2) {
        this.responseWanlinksTemplate2 = responseWanlinksTemplate2;
    }


    /**
     * Gets the responseSITEID value for this ArrResultAgilController.
     * 
     * @return responseSITEID
     */
    public org.tempuri.ResponseSITEID getResponseSITEID() {
        return responseSITEID;
    }


    /**
     * Sets the responseSITEID value for this ArrResultAgilController.
     * 
     * @param responseSITEID
     */
    public void setResponseSITEID(org.tempuri.ResponseSITEID responseSITEID) {
        this.responseSITEID = responseSITEID;
    }


    /**
     * Gets the responseVPNServiceGet value for this ArrResultAgilController.
     * 
     * @return responseVPNServiceGet
     */
    public org.tempuri.ResponseVPNServiceGet getResponseVPNServiceGet() {
        return responseVPNServiceGet;
    }


    /**
     * Sets the responseVPNServiceGet value for this ArrResultAgilController.
     * 
     * @param responseVPNServiceGet
     */
    public void setResponseVPNServiceGet(org.tempuri.ResponseVPNServiceGet responseVPNServiceGet) {
        this.responseVPNServiceGet = responseVPNServiceGet;
    }


    /**
     * Gets the responseLocalEthernet value for this ArrResultAgilController.
     * 
     * @return responseLocalEthernet
     */
    public org.tempuri.ResponseLocalEthernet getResponseLocalEthernet() {
        return responseLocalEthernet;
    }


    /**
     * Sets the responseLocalEthernet value for this ArrResultAgilController.
     * 
     * @param responseLocalEthernet
     */
    public void setResponseLocalEthernet(org.tempuri.ResponseLocalEthernet responseLocalEthernet) {
        this.responseLocalEthernet = responseLocalEthernet;
    }


    /**
     * Gets the responseSite2020 value for this ArrResultAgilController.
     * 
     * @return responseSite2020
     */
    public org.tempuri.ResponseSite2020 getResponseSite2020() {
        return responseSite2020;
    }


    /**
     * Sets the responseSite2020 value for this ArrResultAgilController.
     * 
     * @param responseSite2020
     */
    public void setResponseSite2020(org.tempuri.ResponseSite2020 responseSite2020) {
        this.responseSite2020 = responseSite2020;
    }


    /**
     * Gets the responseSubnetQ2020 value for this ArrResultAgilController.
     * 
     * @return responseSubnetQ2020
     */
    public org.tempuri.ResponseSubnetQ2020 getResponseSubnetQ2020() {
        return responseSubnetQ2020;
    }


    /**
     * Sets the responseSubnetQ2020 value for this ArrResultAgilController.
     * 
     * @param responseSubnetQ2020
     */
    public void setResponseSubnetQ2020(org.tempuri.ResponseSubnetQ2020 responseSubnetQ2020) {
        this.responseSubnetQ2020 = responseSubnetQ2020;
    }


    /**
     * Gets the responseSubnetQ2020B value for this ArrResultAgilController.
     * 
     * @return responseSubnetQ2020B
     */
    public org.tempuri.ResponseSubnetQ2020B getResponseSubnetQ2020B() {
        return responseSubnetQ2020B;
    }


    /**
     * Sets the responseSubnetQ2020B value for this ArrResultAgilController.
     * 
     * @param responseSubnetQ2020B
     */
    public void setResponseSubnetQ2020B(org.tempuri.ResponseSubnetQ2020B responseSubnetQ2020B) {
        this.responseSubnetQ2020B = responseSubnetQ2020B;
    }


    /**
     * Gets the subnetsL12 value for this ArrResultAgilController.
     * 
     * @return subnetsL12
     */
    public org.tempuri.SubnetsL12 getSubnetsL12() {
        return subnetsL12;
    }


    /**
     * Sets the subnetsL12 value for this ArrResultAgilController.
     * 
     * @param subnetsL12
     */
    public void setSubnetsL12(org.tempuri.SubnetsL12 subnetsL12) {
        this.subnetsL12 = subnetsL12;
    }


    /**
     * Gets the responseAllDevice value for this ArrResultAgilController.
     * 
     * @return responseAllDevice
     */
    public org.tempuri.ResponseAllDevice getResponseAllDevice() {
        return responseAllDevice;
    }


    /**
     * Sets the responseAllDevice value for this ArrResultAgilController.
     * 
     * @param responseAllDevice
     */
    public void setResponseAllDevice(org.tempuri.ResponseAllDevice responseAllDevice) {
        this.responseAllDevice = responseAllDevice;
    }


    /**
     * Gets the responseLostAr2020 value for this ArrResultAgilController.
     * 
     * @return responseLostAr2020
     */
    public org.tempuri.ResponseLostAr2020 getResponseLostAr2020() {
        return responseLostAr2020;
    }


    /**
     * Sets the responseLostAr2020 value for this ArrResultAgilController.
     * 
     * @param responseLostAr2020
     */
    public void setResponseLostAr2020(org.tempuri.ResponseLostAr2020 responseLostAr2020) {
        this.responseLostAr2020 = responseLostAr2020;
    }


    /**
     * Gets the getSiteHealtInfo2020 value for this ArrResultAgilController.
     * 
     * @return getSiteHealtInfo2020
     */
    public org.tempuri.GetSiteHealtInfo2020 getGetSiteHealtInfo2020() {
        return getSiteHealtInfo2020;
    }


    /**
     * Sets the getSiteHealtInfo2020 value for this ArrResultAgilController.
     * 
     * @param getSiteHealtInfo2020
     */
    public void setGetSiteHealtInfo2020(org.tempuri.GetSiteHealtInfo2020 getSiteHealtInfo2020) {
        this.getSiteHealtInfo2020 = getSiteHealtInfo2020;
    }


    /**
     * Gets the responseAppAqmWorstn2020 value for this ArrResultAgilController.
     * 
     * @return responseAppAqmWorstn2020
     */
    public org.tempuri.ResponseAppAqmWorstn2020 getResponseAppAqmWorstn2020() {
        return responseAppAqmWorstn2020;
    }


    /**
     * Sets the responseAppAqmWorstn2020 value for this ArrResultAgilController.
     * 
     * @param responseAppAqmWorstn2020
     */
    public void setResponseAppAqmWorstn2020(org.tempuri.ResponseAppAqmWorstn2020 responseAppAqmWorstn2020) {
        this.responseAppAqmWorstn2020 = responseAppAqmWorstn2020;
    }


    /**
     * Gets the outGetAppStatistics2020 value for this ArrResultAgilController.
     * 
     * @return outGetAppStatistics2020
     */
    public org.tempuri.OutGetAppStatistics2020 getOutGetAppStatistics2020() {
        return outGetAppStatistics2020;
    }


    /**
     * Sets the outGetAppStatistics2020 value for this ArrResultAgilController.
     * 
     * @param outGetAppStatistics2020
     */
    public void setOutGetAppStatistics2020(org.tempuri.OutGetAppStatistics2020 outGetAppStatistics2020) {
        this.outGetAppStatistics2020 = outGetAppStatistics2020;
    }


    /**
     * Gets the responseHub value for this ArrResultAgilController.
     * 
     * @return responseHub
     */
    public org.tempuri.ResponseHub getResponseHub() {
        return responseHub;
    }


    /**
     * Sets the responseHub value for this ArrResultAgilController.
     * 
     * @param responseHub
     */
    public void setResponseHub(org.tempuri.ResponseHub responseHub) {
        this.responseHub = responseHub;
    }


    /**
     * Gets the responseGet2020 value for this ArrResultAgilController.
     * 
     * @return responseGet2020
     */
    public org.tempuri.ResponseCpuUt2020 getResponseGet2020() {
        return responseGet2020;
    }


    /**
     * Sets the responseGet2020 value for this ArrResultAgilController.
     * 
     * @param responseGet2020
     */
    public void setResponseGet2020(org.tempuri.ResponseCpuUt2020 responseGet2020) {
        this.responseGet2020 = responseGet2020;
    }


    /**
     * Gets the responseGetalarm value for this ArrResultAgilController.
     * 
     * @return responseGetalarm
     */
    public org.tempuri.ResponseGetalarm getResponseGetalarm() {
        return responseGetalarm;
    }


    /**
     * Sets the responseGetalarm value for this ArrResultAgilController.
     * 
     * @param responseGetalarm
     */
    public void setResponseGetalarm(org.tempuri.ResponseGetalarm responseGetalarm) {
        this.responseGetalarm = responseGetalarm;
    }


    /**
     * Gets the responseGetBasicInformation value for this ArrResultAgilController.
     * 
     * @return responseGetBasicInformation
     */
    public org.tempuri.ResponseGetBasicInformation getResponseGetBasicInformation() {
        return responseGetBasicInformation;
    }


    /**
     * Sets the responseGetBasicInformation value for this ArrResultAgilController.
     * 
     * @param responseGetBasicInformation
     */
    public void setResponseGetBasicInformation(org.tempuri.ResponseGetBasicInformation responseGetBasicInformation) {
        this.responseGetBasicInformation = responseGetBasicInformation;
    }


    /**
     * Gets the responseGetVPNID value for this ArrResultAgilController.
     * 
     * @return responseGetVPNID
     */
    public org.tempuri.ResponseGetVPNID getResponseGetVPNID() {
        return responseGetVPNID;
    }


    /**
     * Sets the responseGetVPNID value for this ArrResultAgilController.
     * 
     * @param responseGetVPNID
     */
    public void setResponseGetVPNID(org.tempuri.ResponseGetVPNID responseGetVPNID) {
        this.responseGetVPNID = responseGetVPNID;
    }


    /**
     * Gets the responseSecurityPolice2020 value for this ArrResultAgilController.
     * 
     * @return responseSecurityPolice2020
     */
    public org.tempuri.ResponseSecurityPolice2020 getResponseSecurityPolice2020() {
        return responseSecurityPolice2020;
    }


    /**
     * Sets the responseSecurityPolice2020 value for this ArrResultAgilController.
     * 
     * @param responseSecurityPolice2020
     */
    public void setResponseSecurityPolice2020(org.tempuri.ResponseSecurityPolice2020 responseSecurityPolice2020) {
        this.responseSecurityPolice2020 = responseSecurityPolice2020;
    }


    /**
     * Gets the responseAllTenants2020 value for this ArrResultAgilController.
     * 
     * @return responseAllTenants2020
     */
    public org.tempuri.ResponseAllTenants2020 getResponseAllTenants2020() {
        return responseAllTenants2020;
    }


    /**
     * Sets the responseAllTenants2020 value for this ArrResultAgilController.
     * 
     * @param responseAllTenants2020
     */
    public void setResponseAllTenants2020(org.tempuri.ResponseAllTenants2020 responseAllTenants2020) {
        this.responseAllTenants2020 = responseAllTenants2020;
    }


    /**
     * Gets the responseUsageDisk2020 value for this ArrResultAgilController.
     * 
     * @return responseUsageDisk2020
     */
    public org.tempuri.ResponseUsageDisk2020 getResponseUsageDisk2020() {
        return responseUsageDisk2020;
    }


    /**
     * Sets the responseUsageDisk2020 value for this ArrResultAgilController.
     * 
     * @param responseUsageDisk2020
     */
    public void setResponseUsageDisk2020(org.tempuri.ResponseUsageDisk2020 responseUsageDisk2020) {
        this.responseUsageDisk2020 = responseUsageDisk2020;
    }


    /**
     * Gets the responseMemoryDev2020 value for this ArrResultAgilController.
     * 
     * @return responseMemoryDev2020
     */
    public org.tempuri.ResponseMemoryDev2020 getResponseMemoryDev2020() {
        return responseMemoryDev2020;
    }


    /**
     * Sets the responseMemoryDev2020 value for this ArrResultAgilController.
     * 
     * @param responseMemoryDev2020
     */
    public void setResponseMemoryDev2020(org.tempuri.ResponseMemoryDev2020 responseMemoryDev2020) {
        this.responseMemoryDev2020 = responseMemoryDev2020;
    }


    /**
     * Gets the responseTemperature2020 value for this ArrResultAgilController.
     * 
     * @return responseTemperature2020
     */
    public org.tempuri.ResponseTemperature2020 getResponseTemperature2020() {
        return responseTemperature2020;
    }


    /**
     * Sets the responseTemperature2020 value for this ArrResultAgilController.
     * 
     * @param responseTemperature2020
     */
    public void setResponseTemperature2020(org.tempuri.ResponseTemperature2020 responseTemperature2020) {
        this.responseTemperature2020 = responseTemperature2020;
    }


    /**
     * Gets the outGetDevice_v2020 value for this ArrResultAgilController.
     * 
     * @return outGetDevice_v2020
     */
    public org.tempuri.OutGetDevice_v2020 getOutGetDevice_v2020() {
        return outGetDevice_v2020;
    }


    /**
     * Sets the outGetDevice_v2020 value for this ArrResultAgilController.
     * 
     * @param outGetDevice_v2020
     */
    public void setOutGetDevice_v2020(org.tempuri.OutGetDevice_v2020 outGetDevice_v2020) {
        this.outGetDevice_v2020 = outGetDevice_v2020;
    }


    /**
     * Gets the dashboardInfoIMaster value for this ArrResultAgilController.
     * 
     * @return dashboardInfoIMaster
     */
    public org.tempuri.OutGetDashboardIMaster getDashboardInfoIMaster() {
        return dashboardInfoIMaster;
    }


    /**
     * Sets the dashboardInfoIMaster value for this ArrResultAgilController.
     * 
     * @param dashboardInfoIMaster
     */
    public void setDashboardInfoIMaster(org.tempuri.OutGetDashboardIMaster dashboardInfoIMaster) {
        this.dashboardInfoIMaster = dashboardInfoIMaster;
    }


    /**
     * Gets the responseGetListQoS value for this ArrResultAgilController.
     * 
     * @return responseGetListQoS
     */
    public org.tempuri.ResponseGetListQoS getResponseGetListQoS() {
        return responseGetListQoS;
    }


    /**
     * Sets the responseGetListQoS value for this ArrResultAgilController.
     * 
     * @param responseGetListQoS
     */
    public void setResponseGetListQoS(org.tempuri.ResponseGetListQoS responseGetListQoS) {
        this.responseGetListQoS = responseGetListQoS;
    }


    /**
     * Gets the outConsumosAltan value for this ArrResultAgilController.
     * 
     * @return outConsumosAltan
     */
    public org.tempuri.OutConsumosAltanPro getOutConsumosAltan() {
        return outConsumosAltan;
    }


    /**
     * Sets the outConsumosAltan value for this ArrResultAgilController.
     * 
     * @param outConsumosAltan
     */
    public void setOutConsumosAltan(org.tempuri.OutConsumosAltanPro outConsumosAltan) {
        this.outConsumosAltan = outConsumosAltan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrResultAgilController)) return false;
        ArrResultAgilController other = (ArrResultAgilController) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idResult == other.getIdResult() &&
            this.result == other.getResult() &&
            ((this.resultDescription==null && other.getResultDescription()==null) || 
             (this.resultDescription!=null &&
              this.resultDescription.equals(other.getResultDescription()))) &&
            ((this.tokens==null && other.getTokens()==null) || 
             (this.tokens!=null &&
              java.util.Arrays.equals(this.tokens, other.getTokens()))) &&
            ((this.responseTenant2020==null && other.getResponseTenant2020()==null) || 
             (this.responseTenant2020!=null &&
              this.responseTenant2020.equals(other.getResponseTenant2020()))) &&
            ((this.responseDevice2020==null && other.getResponseDevice2020()==null) || 
             (this.responseDevice2020!=null &&
              this.responseDevice2020.equals(other.getResponseDevice2020()))) &&
            ((this.responseLostDevice2020==null && other.getResponseLostDevice2020()==null) || 
             (this.responseLostDevice2020!=null &&
              this.responseLostDevice2020.equals(other.getResponseLostDevice2020()))) &&
            ((this.responseOK==null && other.getResponseOK()==null) || 
             (this.responseOK!=null &&
              this.responseOK.equals(other.getResponseOK()))) &&
            ((this.responseSiteTemplate==null && other.getResponseSiteTemplate()==null) || 
             (this.responseSiteTemplate!=null &&
              this.responseSiteTemplate.equals(other.getResponseSiteTemplate()))) &&
            ((this.responsechangePassword==null && other.getResponsechangePassword()==null) || 
             (this.responsechangePassword!=null &&
              this.responsechangePassword.equals(other.getResponsechangePassword()))) &&
            ((this.getSiteforUpdates==null && other.getGetSiteforUpdates()==null) || 
             (this.getSiteforUpdates!=null &&
              this.getSiteforUpdates.equals(other.getGetSiteforUpdates()))) &&
            ((this.reponseIDTenantforDelete==null && other.getReponseIDTenantforDelete()==null) || 
             (this.reponseIDTenantforDelete!=null &&
              this.reponseIDTenantforDelete.equals(other.getReponseIDTenantforDelete()))) &&
            ((this.responseVPNService==null && other.getResponseVPNService()==null) || 
             (this.responseVPNService!=null &&
              this.responseVPNService.equals(other.getResponseVPNService()))) &&
            ((this.responseSubnet==null && other.getResponseSubnet()==null) || 
             (this.responseSubnet!=null &&
              this.responseSubnet.equals(other.getResponseSubnet()))) &&
            ((this.responseWanlinksTemplate==null && other.getResponseWanlinksTemplate()==null) || 
             (this.responseWanlinksTemplate!=null &&
              this.responseWanlinksTemplate.equals(other.getResponseWanlinksTemplate()))) &&
            ((this.responseWanlinksTemplate2==null && other.getResponseWanlinksTemplate2()==null) || 
             (this.responseWanlinksTemplate2!=null &&
              this.responseWanlinksTemplate2.equals(other.getResponseWanlinksTemplate2()))) &&
            ((this.responseSITEID==null && other.getResponseSITEID()==null) || 
             (this.responseSITEID!=null &&
              this.responseSITEID.equals(other.getResponseSITEID()))) &&
            ((this.responseVPNServiceGet==null && other.getResponseVPNServiceGet()==null) || 
             (this.responseVPNServiceGet!=null &&
              this.responseVPNServiceGet.equals(other.getResponseVPNServiceGet()))) &&
            ((this.responseLocalEthernet==null && other.getResponseLocalEthernet()==null) || 
             (this.responseLocalEthernet!=null &&
              this.responseLocalEthernet.equals(other.getResponseLocalEthernet()))) &&
            ((this.responseSite2020==null && other.getResponseSite2020()==null) || 
             (this.responseSite2020!=null &&
              this.responseSite2020.equals(other.getResponseSite2020()))) &&
            ((this.responseSubnetQ2020==null && other.getResponseSubnetQ2020()==null) || 
             (this.responseSubnetQ2020!=null &&
              this.responseSubnetQ2020.equals(other.getResponseSubnetQ2020()))) &&
            ((this.responseSubnetQ2020B==null && other.getResponseSubnetQ2020B()==null) || 
             (this.responseSubnetQ2020B!=null &&
              this.responseSubnetQ2020B.equals(other.getResponseSubnetQ2020B()))) &&
            ((this.subnetsL12==null && other.getSubnetsL12()==null) || 
             (this.subnetsL12!=null &&
              this.subnetsL12.equals(other.getSubnetsL12()))) &&
            ((this.responseAllDevice==null && other.getResponseAllDevice()==null) || 
             (this.responseAllDevice!=null &&
              this.responseAllDevice.equals(other.getResponseAllDevice()))) &&
            ((this.responseLostAr2020==null && other.getResponseLostAr2020()==null) || 
             (this.responseLostAr2020!=null &&
              this.responseLostAr2020.equals(other.getResponseLostAr2020()))) &&
            ((this.getSiteHealtInfo2020==null && other.getGetSiteHealtInfo2020()==null) || 
             (this.getSiteHealtInfo2020!=null &&
              this.getSiteHealtInfo2020.equals(other.getGetSiteHealtInfo2020()))) &&
            ((this.responseAppAqmWorstn2020==null && other.getResponseAppAqmWorstn2020()==null) || 
             (this.responseAppAqmWorstn2020!=null &&
              this.responseAppAqmWorstn2020.equals(other.getResponseAppAqmWorstn2020()))) &&
            ((this.outGetAppStatistics2020==null && other.getOutGetAppStatistics2020()==null) || 
             (this.outGetAppStatistics2020!=null &&
              this.outGetAppStatistics2020.equals(other.getOutGetAppStatistics2020()))) &&
            ((this.responseHub==null && other.getResponseHub()==null) || 
             (this.responseHub!=null &&
              this.responseHub.equals(other.getResponseHub()))) &&
            ((this.responseGet2020==null && other.getResponseGet2020()==null) || 
             (this.responseGet2020!=null &&
              this.responseGet2020.equals(other.getResponseGet2020()))) &&
            ((this.responseGetalarm==null && other.getResponseGetalarm()==null) || 
             (this.responseGetalarm!=null &&
              this.responseGetalarm.equals(other.getResponseGetalarm()))) &&
            ((this.responseGetBasicInformation==null && other.getResponseGetBasicInformation()==null) || 
             (this.responseGetBasicInformation!=null &&
              this.responseGetBasicInformation.equals(other.getResponseGetBasicInformation()))) &&
            ((this.responseGetVPNID==null && other.getResponseGetVPNID()==null) || 
             (this.responseGetVPNID!=null &&
              this.responseGetVPNID.equals(other.getResponseGetVPNID()))) &&
            ((this.responseSecurityPolice2020==null && other.getResponseSecurityPolice2020()==null) || 
             (this.responseSecurityPolice2020!=null &&
              this.responseSecurityPolice2020.equals(other.getResponseSecurityPolice2020()))) &&
            ((this.responseAllTenants2020==null && other.getResponseAllTenants2020()==null) || 
             (this.responseAllTenants2020!=null &&
              this.responseAllTenants2020.equals(other.getResponseAllTenants2020()))) &&
            ((this.responseUsageDisk2020==null && other.getResponseUsageDisk2020()==null) || 
             (this.responseUsageDisk2020!=null &&
              this.responseUsageDisk2020.equals(other.getResponseUsageDisk2020()))) &&
            ((this.responseMemoryDev2020==null && other.getResponseMemoryDev2020()==null) || 
             (this.responseMemoryDev2020!=null &&
              this.responseMemoryDev2020.equals(other.getResponseMemoryDev2020()))) &&
            ((this.responseTemperature2020==null && other.getResponseTemperature2020()==null) || 
             (this.responseTemperature2020!=null &&
              this.responseTemperature2020.equals(other.getResponseTemperature2020()))) &&
            ((this.outGetDevice_v2020==null && other.getOutGetDevice_v2020()==null) || 
             (this.outGetDevice_v2020!=null &&
              this.outGetDevice_v2020.equals(other.getOutGetDevice_v2020()))) &&
            ((this.dashboardInfoIMaster==null && other.getDashboardInfoIMaster()==null) || 
             (this.dashboardInfoIMaster!=null &&
              this.dashboardInfoIMaster.equals(other.getDashboardInfoIMaster()))) &&
            ((this.responseGetListQoS==null && other.getResponseGetListQoS()==null) || 
             (this.responseGetListQoS!=null &&
              this.responseGetListQoS.equals(other.getResponseGetListQoS()))) &&
            ((this.outConsumosAltan==null && other.getOutConsumosAltan()==null) || 
             (this.outConsumosAltan!=null &&
              this.outConsumosAltan.equals(other.getOutConsumosAltan())));
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
        _hashCode += new Long(getIdResult()).hashCode();
        _hashCode += getResult();
        if (getResultDescription() != null) {
            _hashCode += getResultDescription().hashCode();
        }
        if (getTokens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseTenant2020() != null) {
            _hashCode += getResponseTenant2020().hashCode();
        }
        if (getResponseDevice2020() != null) {
            _hashCode += getResponseDevice2020().hashCode();
        }
        if (getResponseLostDevice2020() != null) {
            _hashCode += getResponseLostDevice2020().hashCode();
        }
        if (getResponseOK() != null) {
            _hashCode += getResponseOK().hashCode();
        }
        if (getResponseSiteTemplate() != null) {
            _hashCode += getResponseSiteTemplate().hashCode();
        }
        if (getResponsechangePassword() != null) {
            _hashCode += getResponsechangePassword().hashCode();
        }
        if (getGetSiteforUpdates() != null) {
            _hashCode += getGetSiteforUpdates().hashCode();
        }
        if (getReponseIDTenantforDelete() != null) {
            _hashCode += getReponseIDTenantforDelete().hashCode();
        }
        if (getResponseVPNService() != null) {
            _hashCode += getResponseVPNService().hashCode();
        }
        if (getResponseSubnet() != null) {
            _hashCode += getResponseSubnet().hashCode();
        }
        if (getResponseWanlinksTemplate() != null) {
            _hashCode += getResponseWanlinksTemplate().hashCode();
        }
        if (getResponseWanlinksTemplate2() != null) {
            _hashCode += getResponseWanlinksTemplate2().hashCode();
        }
        if (getResponseSITEID() != null) {
            _hashCode += getResponseSITEID().hashCode();
        }
        if (getResponseVPNServiceGet() != null) {
            _hashCode += getResponseVPNServiceGet().hashCode();
        }
        if (getResponseLocalEthernet() != null) {
            _hashCode += getResponseLocalEthernet().hashCode();
        }
        if (getResponseSite2020() != null) {
            _hashCode += getResponseSite2020().hashCode();
        }
        if (getResponseSubnetQ2020() != null) {
            _hashCode += getResponseSubnetQ2020().hashCode();
        }
        if (getResponseSubnetQ2020B() != null) {
            _hashCode += getResponseSubnetQ2020B().hashCode();
        }
        if (getSubnetsL12() != null) {
            _hashCode += getSubnetsL12().hashCode();
        }
        if (getResponseAllDevice() != null) {
            _hashCode += getResponseAllDevice().hashCode();
        }
        if (getResponseLostAr2020() != null) {
            _hashCode += getResponseLostAr2020().hashCode();
        }
        if (getGetSiteHealtInfo2020() != null) {
            _hashCode += getGetSiteHealtInfo2020().hashCode();
        }
        if (getResponseAppAqmWorstn2020() != null) {
            _hashCode += getResponseAppAqmWorstn2020().hashCode();
        }
        if (getOutGetAppStatistics2020() != null) {
            _hashCode += getOutGetAppStatistics2020().hashCode();
        }
        if (getResponseHub() != null) {
            _hashCode += getResponseHub().hashCode();
        }
        if (getResponseGet2020() != null) {
            _hashCode += getResponseGet2020().hashCode();
        }
        if (getResponseGetalarm() != null) {
            _hashCode += getResponseGetalarm().hashCode();
        }
        if (getResponseGetBasicInformation() != null) {
            _hashCode += getResponseGetBasicInformation().hashCode();
        }
        if (getResponseGetVPNID() != null) {
            _hashCode += getResponseGetVPNID().hashCode();
        }
        if (getResponseSecurityPolice2020() != null) {
            _hashCode += getResponseSecurityPolice2020().hashCode();
        }
        if (getResponseAllTenants2020() != null) {
            _hashCode += getResponseAllTenants2020().hashCode();
        }
        if (getResponseUsageDisk2020() != null) {
            _hashCode += getResponseUsageDisk2020().hashCode();
        }
        if (getResponseMemoryDev2020() != null) {
            _hashCode += getResponseMemoryDev2020().hashCode();
        }
        if (getResponseTemperature2020() != null) {
            _hashCode += getResponseTemperature2020().hashCode();
        }
        if (getOutGetDevice_v2020() != null) {
            _hashCode += getOutGetDevice_v2020().hashCode();
        }
        if (getDashboardInfoIMaster() != null) {
            _hashCode += getDashboardInfoIMaster().hashCode();
        }
        if (getResponseGetListQoS() != null) {
            _hashCode += getResponseGetListQoS().hashCode();
        }
        if (getOutConsumosAltan() != null) {
            _hashCode += getOutConsumosAltan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrResultAgilController.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "arrResultAgilController"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResultDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Tokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTenant2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseTenant2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseTenant2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDevice2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseDevice2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseDevice2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseLostDevice2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseLostDevice2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseLostDevice2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseOK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseOK"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSiteTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSiteTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSiteTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsechangePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponsechangePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponsechangePassword"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSiteforUpdates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSiteforUpdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GetSiteforUpdates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reponseIDTenantforDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReponseIDTenantforDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReponseIDTenantforDelete"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseVPNService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseVPNService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseVPNService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSubnet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSubnet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSubnet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseWanlinksTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseWanlinksTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseWanlinksTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseWanlinksTemplate2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseWanlinksTemplate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseWanlinksTemplate2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSITEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSITEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSITEID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseVPNServiceGet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseVPNServiceGet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseVPNServiceGet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseLocalEthernet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseLocalEthernet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseLocalEthernet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSite2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSite2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSite2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSubnetQ2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSubnetQ2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSubnetQ2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSubnetQ2020B");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSubnetQ2020B"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSubnetQ2020B"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetsL12");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SubnetsL12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SubnetsL12"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseAllDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseAllDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseAllDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseLostAr2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseLostAr2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseLostAr2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSiteHealtInfo2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSiteHealtInfo2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GetSiteHealtInfo2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseAppAqmWorstn2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseAppAqmWorstn2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseAppAqmWorstn2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outGetAppStatistics2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OutGetAppStatistics2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutGetAppStatistics2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseHub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseHub"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGet2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGet2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseCpuUt2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGetalarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetalarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetalarm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGetBasicInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetBasicInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetBasicInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGetVPNID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetVPNID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetVPNID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSecurityPolice2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSecurityPolice2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseSecurityPolice2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseAllTenants2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseAllTenants2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseAllTenants2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseUsageDisk2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseUsageDisk2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseUsageDisk2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseMemoryDev2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseMemoryDev2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseMemoryDev2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTemperature2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseTemperature2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseTemperature2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outGetDevice_v2020");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OutGetDevice_v2020"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutGetDevice_v2020"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardInfoIMaster");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DashboardInfoIMaster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutGetDashboardIMaster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGetListQoS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetListQoS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseGetListQoS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outConsumosAltan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OutConsumosAltan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OutConsumosAltanPro"));
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
