/**
 * GetService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.SalesForce11g.GetService.GetService;

public interface GetService extends java.rmi.Remote {
    public void process(com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessLogin login, java.lang.String accountNo, int status, javax.xml.rpc.holders.StringHolder idResult, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultDesc, javax.xml.rpc.holders.StringHolder account, javax.xml.rpc.holders.StringHolder creditLimitTV, javax.xml.rpc.holders.StringHolder creditLimitTelephony, com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseVigenciaHolder vigencia, com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseServicesArrayHolder services) throws java.rmi.RemoteException;
}
