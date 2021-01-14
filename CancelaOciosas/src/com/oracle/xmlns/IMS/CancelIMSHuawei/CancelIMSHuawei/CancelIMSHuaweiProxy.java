package com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei;

public class CancelIMSHuaweiProxy implements com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuawei {
  private String _endpoint = null;
  private com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuawei cancelIMSHuawei = null;
  
  public CancelIMSHuaweiProxy() {
    _initCancelIMSHuaweiProxy();
  }
  
  public CancelIMSHuaweiProxy(String endpoint) {
    _endpoint = endpoint;
    _initCancelIMSHuaweiProxy();
  }
  
  private void _initCancelIMSHuaweiProxy() {
    try {
      cancelIMSHuawei = (new com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.Cancelimshuawei_client_epLocator()).getCancelIMSHuawei_pt();
      if (cancelIMSHuawei != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cancelIMSHuawei)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cancelIMSHuawei)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cancelIMSHuawei != null)
      ((javax.xml.rpc.Stub)cancelIMSHuawei)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuawei getCancelIMSHuawei() {
    if (cancelIMSHuawei == null)
      _initCancelIMSHuaweiProxy();
    return cancelIMSHuawei;
  }
  
  public void process(com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessLogin login, java.lang.String account, java.lang.String company, java.lang.String serialNumber, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDns[] troncales, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns[] analogo, int rollBack, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultId, javax.xml.rpc.holders.StringHolder resultDescription, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.holders.ProcessResponseDnsErrorArrayHolder dnsError) throws java.rmi.RemoteException{
    if (cancelIMSHuawei == null)
      _initCancelIMSHuaweiProxy();
    cancelIMSHuawei.process(login, account, company, serialNumber, troncales, analogo, rollBack, result, resultId, resultDescription, dnsError);
  }
  
  
}