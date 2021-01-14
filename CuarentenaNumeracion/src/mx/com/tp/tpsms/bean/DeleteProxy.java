package mx.com.tp.tpsms.bean;

public class DeleteProxy implements mx.com.tp.tpsms.bean.Delete {
  private String _endpoint = null;
  private mx.com.tp.tpsms.bean.Delete delete = null;
  
  public DeleteProxy() {
    _initDeleteProxy();
  }
  
  public DeleteProxy(String endpoint) {
    _endpoint = endpoint;
    _initDeleteProxy();
  }
  
  private void _initDeleteProxy() {
    try {
      delete = (new mx.com.tp.tpsms.bean.DeleteServiceLocator()).getDeletePort();
      if (delete != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)delete)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)delete)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (delete != null)
      ((javax.xml.rpc.Stub)delete)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.com.tp.tpsms.bean.Delete getDelete() {
    if (delete == null)
      _initDeleteProxy();
    return delete;
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteSuscriptor(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteSuscriptor(arg0, arg1);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteDevice(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, mx.com.tp.tpsms.bean.DeviceVO arg2) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteDevice(arg0, arg1, arg2);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO cancelSuscriptor(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.cancelSuscriptor(arg0, arg1);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteDeviceOTT(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, mx.com.tp.tpsms.bean.DeviceOttVO arg2) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteDeviceOTT(arg0, arg1, arg2);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteProfile(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteProfile(arg0, arg1, arg2);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteBundle(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteBundle(arg0, arg1, arg2);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteCircle(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteCircle(arg0, arg1, arg2);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO removeCircle(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.removeCircle(arg0, arg1);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO clearDNSubscriber(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.clearDNSubscriber(arg0, arg1);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO cleanSubscriber(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.cleanSubscriber(arg0, arg1, arg2);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteBundleProvider(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteBundleProvider(arg0, arg1, arg2, arg3);
  }
  
  public mx.com.tp.tpsms.bean.ResponseVO deleteAddonByBundleAmzon(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (delete == null)
      _initDeleteProxy();
    return delete.deleteAddonByBundleAmzon(arg0, arg1, arg2, arg3);
  }
  
  
}