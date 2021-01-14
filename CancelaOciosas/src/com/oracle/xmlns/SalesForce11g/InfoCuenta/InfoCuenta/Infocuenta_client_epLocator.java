/**
 * Infocuenta_client_epLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta;

public class Infocuenta_client_epLocator extends org.apache.axis.client.Service implements com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.Infocuenta_client_ep {

    public Infocuenta_client_epLocator() {
    }


    public Infocuenta_client_epLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Infocuenta_client_epLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InfoCuenta_pt
    private java.lang.String InfoCuenta_pt_address = "http://10.216.8.40:80/soa-infra/services/SalesForce/InfoCuenta/infocuenta_client_ep";

    public java.lang.String getInfoCuenta_ptAddress() {
        return InfoCuenta_pt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InfoCuenta_ptWSDDServiceName = "InfoCuenta_pt";

    public java.lang.String getInfoCuenta_ptWSDDServiceName() {
        return InfoCuenta_ptWSDDServiceName;
    }

    public void setInfoCuenta_ptWSDDServiceName(java.lang.String name) {
        InfoCuenta_ptWSDDServiceName = name;
    }

    public com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuenta getInfoCuenta_pt() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InfoCuenta_pt_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInfoCuenta_pt(endpoint);
    }

    public com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuenta getInfoCuenta_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuentaBindingStub _stub = new com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuentaBindingStub(portAddress, this);
            _stub.setPortName(getInfoCuenta_ptWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInfoCuenta_ptEndpointAddress(java.lang.String address) {
        InfoCuenta_pt_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuenta.class.isAssignableFrom(serviceEndpointInterface)) {
                com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuentaBindingStub _stub = new com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.InfoCuentaBindingStub(new java.net.URL(InfoCuenta_pt_address), this);
                _stub.setPortName(getInfoCuenta_ptWSDDServiceName());
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
        if ("InfoCuenta_pt".equals(inputPortName)) {
            return getInfoCuenta_pt();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/InfoCuenta/InfoCuenta", "infocuenta_client_ep");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/InfoCuenta/InfoCuenta", "InfoCuenta_pt"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InfoCuenta_pt".equals(portName)) {
            setInfoCuenta_ptEndpointAddress(address);
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
