/**
 * Bpelgetinfobrm_client_epLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM;

public class Bpelgetinfobrm_client_epLocator extends org.apache.axis.client.Service implements com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.Bpelgetinfobrm_client_ep {

    public Bpelgetinfobrm_client_epLocator() {
    }


    public Bpelgetinfobrm_client_epLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Bpelgetinfobrm_client_epLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BPELGetInfoBRM_pt
    private java.lang.String BPELGetInfoBRM_pt_address = "http://10.216.8.198:80/soa-infra/services/TotalPlayProcessBPEL/GetInfoBRM/bpelgetinfobrm_client_ep";

    public java.lang.String getBPELGetInfoBRM_ptAddress() {
        return BPELGetInfoBRM_pt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BPELGetInfoBRM_ptWSDDServiceName = "BPELGetInfoBRM_pt";

    public java.lang.String getBPELGetInfoBRM_ptWSDDServiceName() {
        return BPELGetInfoBRM_ptWSDDServiceName;
    }

    public void setBPELGetInfoBRM_ptWSDDServiceName(java.lang.String name) {
        BPELGetInfoBRM_ptWSDDServiceName = name;
    }

    public com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRM getBPELGetInfoBRM_pt() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BPELGetInfoBRM_pt_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBPELGetInfoBRM_pt(endpoint);
    }

    public com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRM getBPELGetInfoBRM_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRMBindingStub _stub = new com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRMBindingStub(portAddress, this);
            _stub.setPortName(getBPELGetInfoBRM_ptWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBPELGetInfoBRM_ptEndpointAddress(java.lang.String address) {
        BPELGetInfoBRM_pt_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRM.class.isAssignableFrom(serviceEndpointInterface)) {
                com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRMBindingStub _stub = new com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRMBindingStub(new java.net.URL(BPELGetInfoBRM_pt_address), this);
                _stub.setPortName(getBPELGetInfoBRM_ptWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BPELGetInfoBRM_pt".equals(inputPortName)) {
            return getBPELGetInfoBRM_pt();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "bpelgetinfobrm_client_ep");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/BRM/GetInfoBRM/BPELGetInfoBRM", "BPELGetInfoBRM_pt"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BPELGetInfoBRM_pt".equals(portName)) {
            setBPELGetInfoBRM_ptEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
