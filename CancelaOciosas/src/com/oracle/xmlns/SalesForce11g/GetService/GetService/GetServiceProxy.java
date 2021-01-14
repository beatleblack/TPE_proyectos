package com.oracle.xmlns.SalesForce11g.GetService.GetService;

public class GetServiceProxy implements com.oracle.xmlns.SalesForce11g.GetService.GetService.GetService {
  private String _endpoint = null;
  private com.oracle.xmlns.SalesForce11g.GetService.GetService.GetService getService = null;
  
  public GetServiceProxy() {
    _initGetServiceProxy();
  }
  
  public GetServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetServiceProxy();
  }
  
  private void _initGetServiceProxy() {
    try {
      getService = (new com.oracle.xmlns.SalesForce11g.GetService.GetService.Getservice_client_epLocator()).getGetService_pt();
      if (getService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getService != null)
      ((javax.xml.rpc.Stub)getService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.oracle.xmlns.SalesForce11g.GetService.GetService.GetService getGetService() {
    if (getService == null)
      _initGetServiceProxy();
    return getService;
  }
  
  public void process(com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessLogin login, java.lang.String accountNo, int status, javax.xml.rpc.holders.StringHolder idResult, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultDesc, javax.xml.rpc.holders.StringHolder account, javax.xml.rpc.holders.StringHolder creditLimitTV, javax.xml.rpc.holders.StringHolder creditLimitTelephony, com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseVigenciaHolder vigencia, com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseServicesArrayHolder services) throws java.rmi.RemoteException{
    if (getService == null)
      _initGetServiceProxy();
    getService.process(login, accountNo, status, idResult, result, resultDesc, account, creditLimitTV, creditLimitTelephony, vigencia, services);
  }
  
  
}