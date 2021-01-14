/**
 * Delete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.tp.tpsms.bean;

public interface Delete extends java.rmi.Remote {
    public mx.com.tp.tpsms.bean.ResponseVO deleteSuscriptor(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO deleteDevice(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, mx.com.tp.tpsms.bean.DeviceVO arg2) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO cancelSuscriptor(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO deleteDeviceOTT(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, mx.com.tp.tpsms.bean.DeviceOttVO arg2) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO deleteProfile(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO deleteBundle(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO deleteCircle(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO removeCircle(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO clearDNSubscriber(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO cleanSubscriber(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO deleteBundleProvider(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public mx.com.tp.tpsms.bean.ResponseVO deleteAddonByBundleAmzon(mx.com.tp.tpsms.bean.UserVO arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
}
