/**
 * CancelIMSHuawei.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei;

public interface CancelIMSHuawei extends java.rmi.Remote {
    public void process(com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessLogin login, java.lang.String account, java.lang.String company, java.lang.String serialNumber, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessTroncalesDns[] troncales, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns[] analogo, int rollBack, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultId, javax.xml.rpc.holders.StringHolder resultDescription, com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.holders.ProcessResponseDnsErrorArrayHolder dnsError) throws java.rmi.RemoteException;
}
