package org.tempuri;

public class TpPro2020SoapProxy implements org.tempuri.TpPro2020Soap {
  private String _endpoint = null;
  private org.tempuri.TpPro2020Soap tpPro2020Soap = null;
  
  public TpPro2020SoapProxy() {
    _initTpPro2020SoapProxy();
  }
  
  public TpPro2020SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTpPro2020SoapProxy();
  }
  
  private void _initTpPro2020SoapProxy() {
    try {
      tpPro2020Soap = (new org.tempuri.TpPro2020Locator()).getTpPro2020Soap();
      if (tpPro2020Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tpPro2020Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tpPro2020Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tpPro2020Soap != null)
      ((javax.xml.rpc.Stub)tpPro2020Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.TpPro2020Soap getTpPro2020Soap() {
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap;
  }
  
  public org.tempuri.ArrResultAgilController generateTokens2020(java.lang.String username, java.lang.String oldpassword) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.generateTokens2020(username, oldpassword);
  }
  
  public org.tempuri.ArrResultAgilController createTenant2020(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.createTenant2020(user, pass);
  }
  
  public org.tempuri.ArrResultAgilController deleteTenant2020(java.lang.String user) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.deleteTenant2020(user);
  }
  
  public org.tempuri.ArrResultAgilController createSite2020(java.lang.String username, java.lang.String password, java.lang.String nameHUB, java.lang.String deviceID, java.lang.String deviceType, java.lang.String esn) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.createSite2020(username, password, nameHUB, deviceID, deviceType, esn);
  }
  
  public org.tempuri.ArrResultAgilController changePassDevice2020(java.lang.String username, java.lang.String password, java.lang.String SITEID, java.lang.String pwd) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.changePassDevice2020(username, password, SITEID, pwd);
  }
  
  public org.tempuri.ArrResultAgilController deleteSite2020(java.lang.String user, java.lang.String pass, java.lang.String ids) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.deleteSite2020(user, pass, ids);
  }
  
  public org.tempuri.ArrResultAgilController deleteAr2020(java.lang.String user, java.lang.String pass, java.lang.String ids) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.deleteAr2020(user, pass, ids);
  }
  
  public org.tempuri.ArrResultAgilController[] pruebita(int a) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.pruebita(a);
  }
  
  public org.tempuri.ArrResultAgilController[] borrar() throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.borrar();
  }
  
  public org.tempuri.T100 getTenantInBD(java.lang.String tenant) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getTenantInBD(tenant);
  }
  
  public org.tempuri.A100[] getARInBD(long t100ID, java.lang.String a100ID) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getARInBD(t100ID, a100ID);
  }
  
  public org.tempuri.ArrResultAgilController getAlarmDevice2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getAlarmDevice2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getAlarmDevice2020_UP(java.lang.String usuario, java.lang.String password, java.lang.String strIdDevice) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getAlarmDevice2020_UP(usuario, password, strIdDevice);
  }
  
  public org.tempuri.ArrResultAgilController getSiteHealthInfo2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getSiteHealthInfo2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getSiteHealthInfo_UP(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getSiteHealthInfo_UP(usuario, password);
  }
  
  public org.tempuri.ArrResultAgilController getGlobalAppListStatistics2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getGlobalAppListStatistics2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getGlobalAppListStatistics2020_UP(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getGlobalAppListStatistics2020_UP(usuario, password);
  }
  
  public org.tempuri.ArrResultAgilController getGlobalAppAqmWorstn2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getGlobalAppAqmWorstn2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getGlobalAppAqmWorstn2020(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getGlobalAppAqmWorstn2020(usuario, password);
  }
  
  public org.tempuri.ArrResultAgilController getSecurityPolicies2020(java.lang.String user, java.lang.String pass, java.lang.String strIdVpn) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getSecurityPolicies2020(user, pass, strIdVpn);
  }
  
  public org.tempuri.ArrResultAgilController getVPN2020(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getVPN2020(user, pass);
  }
  
  public org.tempuri.ArrResultAgilController getCpuUtilization2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getCpuUtilization2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getCpuUtilization2020(java.lang.String user, java.lang.String pass, java.lang.String strIdDevice) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getCpuUtilization2020(user, pass, strIdDevice);
  }
  
  public org.tempuri.ArrResultAgilController getMemoryDevice2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getMemoryDevice2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getMemoryDevice2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getMemoryDevice2020(strGetTenant, strGetPWD, strIdDevice);
  }
  
  public org.tempuri.ArrResultAgilController getTemperature2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getTemperature2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getTemperature2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getTemperature2020(strGetTenant, strGetPWD, strIdDevice);
  }
  
  public org.tempuri.ArrResultAgilController getDiskSpaceUsage2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getDiskSpaceUsage2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getDiskSpaceUsage2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getDiskSpaceUsage2020(strGetTenant, strGetPWD, strIdDevice);
  }
  
  public org.tempuri.ArrResultAgilController getBasicInformation2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getBasicInformation2020(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController getBasicInformation2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getBasicInformation2020(strGetTenant, strGetPWD, strIdDevice);
  }
  
  public org.tempuri.ArrResultAgilController isExistDevice2020(java.lang.String user, java.lang.String pass, java.lang.String snAr) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.isExistDevice2020(user, pass, snAr);
  }
  
  public org.tempuri.ArrResultAgilController validEsnInAc_2020(java.lang.String snAr) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.validEsnInAc_2020(snAr);
  }
  
  public org.tempuri.ArrResultAgilController changeDeviceAllStandard(java.lang.String strIdCustumer, java.lang.String strOldDevSN, java.lang.String strOldIdModel, java.lang.String strNewDevSN, java.lang.String strNewIdModel) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.changeDeviceAllStandard(strIdCustumer, strOldDevSN, strOldIdModel, strNewDevSN, strNewIdModel);
  }
  
  public org.tempuri.ArrResultAgilController deleteDevice2020AgileDB(java.lang.String ar, java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.deleteDevice2020AgileDB(ar, strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController addonQoS(java.lang.String strIdCustomer, org.tempuri.AddonQosV2020[] arrQos) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.addonQoS(strIdCustomer, arrQos);
  }
  
  public org.tempuri.ArrResultAgilController getInfoQoS(java.lang.String strIdCustomer) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.getInfoQoS(strIdCustomer);
  }
  
  public org.tempuri.ArrResultAgilController consumosAltanTpPro(java.lang.String fechaInicio, java.lang.String fechaFin, java.lang.String esnAr) throws java.rmi.RemoteException{
    if (tpPro2020Soap == null)
      _initTpPro2020SoapProxy();
    return tpPro2020Soap.consumosAltanTpPro(fechaInicio, fechaFin, esnAr);
  }
  
  
}