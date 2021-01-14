package mc_style.functions.soap.sap.document.sap_com;

public class ZSD_ZFFI_CE_ACT_UUID_INGProxy implements mc_style.functions.soap.sap.document.sap_com.ZSD_ZFFI_CE_ACT_UUID_ING {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.ZSD_ZFFI_CE_ACT_UUID_ING zSD_ZFFI_CE_ACT_UUID_ING = null;
  
  public ZSD_ZFFI_CE_ACT_UUID_INGProxy() {
    _initZSD_ZFFI_CE_ACT_UUID_INGProxy();
  }
  
  public ZSD_ZFFI_CE_ACT_UUID_INGProxy(String endpoint) {
    _endpoint = endpoint;
    _initZSD_ZFFI_CE_ACT_UUID_INGProxy();
  }
  
  private void _initZSD_ZFFI_CE_ACT_UUID_INGProxy() {
    try {
      zSD_ZFFI_CE_ACT_UUID_ING = (new mc_style.functions.soap.sap.document.sap_com.Zsn_zffi_ce_act_uuid_ingLocator()).getzbn_zffi_ce_act_uuid_ing();
      if (zSD_ZFFI_CE_ACT_UUID_ING != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zSD_ZFFI_CE_ACT_UUID_ING)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zSD_ZFFI_CE_ACT_UUID_ING)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zSD_ZFFI_CE_ACT_UUID_ING != null)
      ((javax.xml.rpc.Stub)zSD_ZFFI_CE_ACT_UUID_ING)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.ZSD_ZFFI_CE_ACT_UUID_ING getZSD_ZFFI_CE_ACT_UUID_ING() {
    if (zSD_ZFFI_CE_ACT_UUID_ING == null)
      _initZSD_ZFFI_CE_ACT_UUID_INGProxy();
    return zSD_ZFFI_CE_ACT_UUID_ING;
  }
  
  public void zffiCeActUuidIng(mc_style.functions.soap.sap.document.sap_com.ZefiCeDoctoFiscalIng[] imDoctofiscal, mc_style.functions.soap.sap.document.sap_com.ZefiCeDoctoRelIng[] imDoctorel, mc_style.functions.soap.sap.document.sap_com.ZefiCeDoctoIng imDoctosap, javax.xml.rpc.holders.StringHolder exMensaje, javax.xml.rpc.holders.IntHolder exRetorno) throws java.rmi.RemoteException{
    if (zSD_ZFFI_CE_ACT_UUID_ING == null)
      _initZSD_ZFFI_CE_ACT_UUID_INGProxy();
    zSD_ZFFI_CE_ACT_UUID_ING.zffiCeActUuidIng(imDoctofiscal, imDoctorel, imDoctosap, exMensaje, exRetorno);
  }
  
  
}