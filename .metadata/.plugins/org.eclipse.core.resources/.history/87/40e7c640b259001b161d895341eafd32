/**
 * TpPro2020Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TpPro2020Locator extends org.apache.axis.client.Service implements org.tempuri.TpPro2020 {

    public TpPro2020Locator() {
    }


    public TpPro2020Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TpPro2020Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TpPro2020Soap
    private java.lang.String TpPro2020Soap_address = "http://10.213.4.17/TpUniversal/TpPro2020.asmx";

    public java.lang.String getTpPro2020SoapAddress() {
        return TpPro2020Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TpPro2020SoapWSDDServiceName = "TpPro2020Soap";

    public java.lang.String getTpPro2020SoapWSDDServiceName() {
        return TpPro2020SoapWSDDServiceName;
    }

    public void setTpPro2020SoapWSDDServiceName(java.lang.String name) {
        TpPro2020SoapWSDDServiceName = name;
    }

    public org.tempuri.TpPro2020Soap getTpPro2020Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TpPro2020Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTpPro2020Soap(endpoint);
    }

    public org.tempuri.TpPro2020Soap getTpPro2020Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.TpPro2020SoapStub _stub = new org.tempuri.TpPro2020SoapStub(portAddress, this);
            _stub.setPortName(getTpPro2020SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTpPro2020SoapEndpointAddress(java.lang.String address) {
        TpPro2020Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.TpPro2020Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.TpPro2020SoapStub _stub = new org.tempuri.TpPro2020SoapStub(new java.net.URL(TpPro2020Soap_address), this);
                _stub.setPortName(getTpPro2020SoapWSDDServiceName());
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
        if ("TpPro2020Soap".equals(inputPortName)) {
            return getTpPro2020Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "TpPro2020");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "TpPro2020Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TpPro2020Soap".equals(portName)) {
            setTpPro2020SoapEndpointAddress(address);
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
