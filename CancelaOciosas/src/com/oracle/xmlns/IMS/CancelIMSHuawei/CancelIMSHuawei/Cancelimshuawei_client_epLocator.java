/**
 * Cancelimshuawei_client_epLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei;

public class Cancelimshuawei_client_epLocator extends org.apache.axis.client.Service implements com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.Cancelimshuawei_client_ep {

    public Cancelimshuawei_client_epLocator() {
    }


    public Cancelimshuawei_client_epLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Cancelimshuawei_client_epLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CancelIMSHuawei_pt
    private java.lang.String CancelIMSHuawei_pt_address = "http://10.216.8.198:80/soa-infra/services/SalesForce/CancelIMSHuawei/cancelimshuawei_client_ep";

    public java.lang.String getCancelIMSHuawei_ptAddress() {
        return CancelIMSHuawei_pt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CancelIMSHuawei_ptWSDDServiceName = "CancelIMSHuawei_pt";

    public java.lang.String getCancelIMSHuawei_ptWSDDServiceName() {
        return CancelIMSHuawei_ptWSDDServiceName;
    }

    public void setCancelIMSHuawei_ptWSDDServiceName(java.lang.String name) {
        CancelIMSHuawei_ptWSDDServiceName = name;
    }

    public com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuawei getCancelIMSHuawei_pt() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CancelIMSHuawei_pt_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCancelIMSHuawei_pt(endpoint);
    }

    public com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuawei getCancelIMSHuawei_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuaweiBindingStub _stub = new com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuaweiBindingStub(portAddress, this);
            _stub.setPortName(getCancelIMSHuawei_ptWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCancelIMSHuawei_ptEndpointAddress(java.lang.String address) {
        CancelIMSHuawei_pt_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuawei.class.isAssignableFrom(serviceEndpointInterface)) {
                com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuaweiBindingStub _stub = new com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuaweiBindingStub(new java.net.URL(CancelIMSHuawei_pt_address), this);
                _stub.setPortName(getCancelIMSHuawei_ptWSDDServiceName());
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
        if ("CancelIMSHuawei_pt".equals(inputPortName)) {
            return getCancelIMSHuawei_pt();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "cancelimshuawei_client_ep");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "CancelIMSHuawei_pt"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CancelIMSHuawei_pt".equals(portName)) {
            setCancelIMSHuawei_ptEndpointAddress(address);
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
