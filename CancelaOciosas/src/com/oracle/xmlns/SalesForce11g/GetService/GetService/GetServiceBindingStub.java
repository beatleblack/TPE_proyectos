/**
 * GetServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.SalesForce11g.GetService.GetService;

public class GetServiceBindingStub extends org.apache.axis.client.Stub implements com.oracle.xmlns.SalesForce11g.GetService.GetService.GetService {
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", ">>process>Login"), com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessLogin.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "AccountNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "IdResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "ResultDesc"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Account"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "CreditLimitTV"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "CreditLimitTelephony"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Vigencia"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", ">>processResponse>Vigencia"), com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseVigencia.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Services"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", ">>processResponse>Services"), com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseServices[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public GetServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GetServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GetServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", ">>process>Login");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", ">>processResponse>Services");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", ">>processResponse>Vigencia");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseVigencia.class;
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

    public void process(com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessLogin login, java.lang.String accountNo, int status, javax.xml.rpc.holders.StringHolder idResult, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultDesc, javax.xml.rpc.holders.StringHolder account, javax.xml.rpc.holders.StringHolder creditLimitTV, javax.xml.rpc.holders.StringHolder creditLimitTelephony, com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseVigenciaHolder vigencia, com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseServicesArrayHolder services) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login, accountNo, new java.lang.Integer(status)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idResult.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "IdResult"));
            } catch (java.lang.Exception _exception) {
                idResult.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "IdResult")), java.lang.String.class);
            }
            try {
                result.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Result"));
            } catch (java.lang.Exception _exception) {
                result.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Result")), java.lang.String.class);
            }
            try {
                resultDesc.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "ResultDesc"));
            } catch (java.lang.Exception _exception) {
                resultDesc.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "ResultDesc")), java.lang.String.class);
            }
            try {
                account.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Account"));
            } catch (java.lang.Exception _exception) {
                account.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Account")), java.lang.String.class);
            }
            try {
                creditLimitTV.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "CreditLimitTV"));
            } catch (java.lang.Exception _exception) {
                creditLimitTV.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "CreditLimitTV")), java.lang.String.class);
            }
            try {
                creditLimitTelephony.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "CreditLimitTelephony"));
            } catch (java.lang.Exception _exception) {
                creditLimitTelephony.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "CreditLimitTelephony")), java.lang.String.class);
            }
            try {
                vigencia.value = (com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseVigencia) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Vigencia"));
            } catch (java.lang.Exception _exception) {
                vigencia.value = (com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseVigencia) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Vigencia")), com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseVigencia.class);
            }
            try {
                services.value = (com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseServices[]) _output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Services"));
            } catch (java.lang.Exception _exception) {
                services.value = (com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseServices[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://xmlns.oracle.com/SalesForce11g/GetService/GetService", "Services")), com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessResponseServices[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
