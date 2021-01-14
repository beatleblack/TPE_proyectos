package com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM;

public class BPELGetInfoBRMProxy implements com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRM {
  private String _endpoint = null;
  private com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRM bPELGetInfoBRM = null;
  
  public BPELGetInfoBRMProxy() {
    _initBPELGetInfoBRMProxy();
  }
  
  public BPELGetInfoBRMProxy(String endpoint) {
    _endpoint = endpoint;
    _initBPELGetInfoBRMProxy();
  }
  
  private void _initBPELGetInfoBRMProxy() {
    try {
      bPELGetInfoBRM = (new com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.Bpelgetinfobrm_client_epLocator()).getBPELGetInfoBRM_pt();
      if (bPELGetInfoBRM != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bPELGetInfoBRM)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bPELGetInfoBRM)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bPELGetInfoBRM != null)
      ((javax.xml.rpc.Stub)bPELGetInfoBRM)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRM getBPELGetInfoBRM() {
    if (bPELGetInfoBRM == null)
      _initBPELGetInfoBRMProxy();
    return bPELGetInfoBRM;
  }
  
  public void process(java.lang.String name, java.lang.String lastName, java.lang.String dnTotalplay, java.lang.String accountNo, java.lang.String emailAddress, java.lang.String esn, java.lang.String mac, java.lang.String rfc, java.lang.String razonSocial, java.lang.String representanteLegal, com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.holders.ProcessResponseResponseHolder response, com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.holders.ProcessResponseDatosClienteArrayHolder datosCliente) throws java.rmi.RemoteException{
    if (bPELGetInfoBRM == null)
      _initBPELGetInfoBRMProxy();
    bPELGetInfoBRM.process(name, lastName, dnTotalplay, accountNo, emailAddress, esn, mac, rfc, razonSocial, representanteLegal, response, datosCliente);
  }
  
  
}