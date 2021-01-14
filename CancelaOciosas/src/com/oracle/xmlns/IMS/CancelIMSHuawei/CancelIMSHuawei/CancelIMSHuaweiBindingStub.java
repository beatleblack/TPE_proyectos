/**
 * CancelIMSHuaweiBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei;

public class CancelIMSHuaweiBindingStub extends org.apache.axis.client.Stub implements com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuawei {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>process>Login"), com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessLogin.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "SerialNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Troncales"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>process>Troncales"), com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDns[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Dns"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Analogo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>process>Analogo"), com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Dns"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "RollBack"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "ResultId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "ResultDescription"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "DnsError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>processResponse>DnsError"), com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessResponseDnsError[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public CancelIMSHuaweiBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CancelIMSHuaweiBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CancelIMSHuaweiBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>>>process>Troncales>Dns>DID");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDnsDID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>>process>Analogo>Dns");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>>process>Troncales>Dns");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>process>Analogo");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>>process>Analogo>Dns");
            qName2 = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Dns");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>process>Login");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>process>Troncales");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDns[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>>process>Troncales>Dns");
            qName2 = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Dns");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", ">>processResponse>DnsError");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessResponseDnsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void process(com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessLogin login, java.lang.String account, java.lang.String company, java.lang.String serialNumber, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDns[] troncales, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns[] analogo, int rollBack, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultId, javax.xml.rpc.holders.StringHolder resultDescription, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.holders.ProcessResponseDnsErrorArrayHolder dnsError) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("process");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login, account, company, serialNumber, troncales, analogo, new java.lang.Integer(rollBack)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Result"));
            } catch (java.lang.Exception _exception) {
                result.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "Result")), java.lang.String.class);
            }
            try {
                resultId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "ResultId"));
            } catch (java.lang.Exception _exception) {
                resultId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "ResultId")), java.lang.String.class);
            }
            try {
                resultDescription.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "ResultDescription"));
            } catch (java.lang.Exception _exception) {
                resultDescription.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "ResultDescription")), java.lang.String.class);
            }
            try {
                dnsError.value = (com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessResponseDnsError[]) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "DnsError"));
            } catch (java.lang.Exception _exception) {
                dnsError.value = (com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessResponseDnsError[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/IMS/CancelIMSHuawei/CancelIMSHuawei", "DnsError")), com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessResponseDnsError[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
