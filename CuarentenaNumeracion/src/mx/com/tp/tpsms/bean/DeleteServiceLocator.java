/**
 * DeleteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.tp.tpsms.bean;

public class DeleteServiceLocator extends org.apache.axis.client.Service implements mx.com.tp.tpsms.bean.DeleteService {

    public DeleteServiceLocator() {
    }


    public DeleteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DeleteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DeletePort
    private java.lang.String DeletePort_address = "http://10.213.12.163:9901/Delete/DeleteService";

    public java.lang.String getDeletePortAddress() {
        return DeletePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DeletePortWSDDServiceName = "DeletePort";

    public java.lang.String getDeletePortWSDDServiceName() {
        return DeletePortWSDDServiceName;
    }

    public void setDeletePortWSDDServiceName(java.lang.String name) {
        DeletePortWSDDServiceName = name;
    }

    public mx.com.tp.tpsms.bean.Delete getDeletePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DeletePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDeletePort(endpoint);
    }

    public mx.com.tp.tpsms.bean.Delete getDeletePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.tp.tpsms.bean.DeletePortBindingStub _stub = new mx.com.tp.tpsms.bean.DeletePortBindingStub(portAddress, this);
            _stub.setPortName(getDeletePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDeletePortEndpointAddress(java.lang.String address) {
        DeletePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.tp.tpsms.bean.Delete.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.tp.tpsms.bean.DeletePortBindingStub _stub = new mx.com.tp.tpsms.bean.DeletePortBindingStub(new java.net.URL(DeletePort_address), this);
                _stub.setPortName(getDeletePortWSDDServiceName());
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
        if ("DeletePort".equals(inputPortName)) {
            return getDeletePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bean.tpsms.tp.com.mx/", "DeleteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bean.tpsms.tp.com.mx/", "DeletePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DeletePort".equals(portName)) {
            setDeletePortEndpointAddress(address);
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
