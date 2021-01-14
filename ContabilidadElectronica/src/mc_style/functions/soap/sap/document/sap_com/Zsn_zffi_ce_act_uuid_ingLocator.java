/**
 * Zsn_zffi_ce_act_uuid_ingLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Zsn_zffi_ce_act_uuid_ingLocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.Zsn_zffi_ce_act_uuid_ing {

    public Zsn_zffi_ce_act_uuid_ingLocator() {
    }


    public Zsn_zffi_ce_act_uuid_ingLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Zsn_zffi_ce_act_uuid_ingLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for zbn_zffi_ce_act_uuid_ing
    private java.lang.String zbn_zffi_ce_act_uuid_ing_address = "http://bnquasapfi.sistemasbo.corp:8003/sap/bc/srt/rfc/sap/zsd_zffi_ce_act_uuid_ing/800/zsn_zffi_ce_act_uuid_ing/zbn_zffi_ce_act_uuid_ing";

    public java.lang.String getzbn_zffi_ce_act_uuid_ingAddress() {
        return zbn_zffi_ce_act_uuid_ing_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String zbn_zffi_ce_act_uuid_ingWSDDServiceName = "zbn_zffi_ce_act_uuid_ing";

    public java.lang.String getzbn_zffi_ce_act_uuid_ingWSDDServiceName() {
        return zbn_zffi_ce_act_uuid_ingWSDDServiceName;
    }

    public void setzbn_zffi_ce_act_uuid_ingWSDDServiceName(java.lang.String name) {
        zbn_zffi_ce_act_uuid_ingWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.ZSD_ZFFI_CE_ACT_UUID_ING getzbn_zffi_ce_act_uuid_ing() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(zbn_zffi_ce_act_uuid_ing_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getzbn_zffi_ce_act_uuid_ing(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.ZSD_ZFFI_CE_ACT_UUID_ING getzbn_zffi_ce_act_uuid_ing(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Zbn_zffi_ce_act_uuid_ingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zbn_zffi_ce_act_uuid_ingStub(portAddress, this);
            _stub.setPortName(getzbn_zffi_ce_act_uuid_ingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setzbn_zffi_ce_act_uuid_ingEndpointAddress(java.lang.String address) {
        zbn_zffi_ce_act_uuid_ing_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.ZSD_ZFFI_CE_ACT_UUID_ING.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Zbn_zffi_ce_act_uuid_ingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zbn_zffi_ce_act_uuid_ingStub(new java.net.URL(zbn_zffi_ce_act_uuid_ing_address), this);
                _stub.setPortName(getzbn_zffi_ce_act_uuid_ingWSDDServiceName());
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
        if ("zbn_zffi_ce_act_uuid_ing".equals(inputPortName)) {
            return getzbn_zffi_ce_act_uuid_ing();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zsn_zffi_ce_act_uuid_ing");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zbn_zffi_ce_act_uuid_ing"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("zbn_zffi_ce_act_uuid_ing".equals(portName)) {
            setzbn_zffi_ce_act_uuid_ingEndpointAddress(address);
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
