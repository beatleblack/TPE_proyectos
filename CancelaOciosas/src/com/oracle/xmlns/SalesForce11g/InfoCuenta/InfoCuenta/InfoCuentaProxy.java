package com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta;

public class InfoCuentaProxy implements com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuenta {
  private String _endpoint = null;
  private com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuenta infoCuenta = null;
  
  public InfoCuentaProxy() {
    _initInfoCuentaProxy();
  }
  
  public InfoCuentaProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfoCuentaProxy();
  }
  
  private void _initInfoCuentaProxy() {
    try {
      infoCuenta = (new com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.Infocuenta_client_epLocator()).getInfoCuenta_pt();
      if (infoCuenta != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infoCuenta)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infoCuenta)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infoCuenta != null)
      ((javax.xml.rpc.Stub)infoCuenta)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuenta getInfoCuenta() {
    if (infoCuenta == null)
      _initInfoCuentaProxy();
    return infoCuenta;
  }
  
  public void process(com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.ProcessLogin login, java.lang.String acountNo, javax.xml.rpc.holders.StringHolder idResult, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultDes, com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.holders.ProcessResponseAcountDescHolder acountDesc) throws java.rmi.RemoteException{
    if (infoCuenta == null)
      _initInfoCuentaProxy();
    infoCuenta.process(login, acountNo, idResult, result, resultDes, acountDesc);
  }
  
  
}