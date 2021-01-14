/**
 * InfoCuenta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta;

public interface InfoCuenta extends java.rmi.Remote {
    public void process(com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.ProcessLogin login, java.lang.String acountNo, javax.xml.rpc.holders.StringHolder idResult, javax.xml.rpc.holders.StringHolder result, javax.xml.rpc.holders.StringHolder resultDes, com.oracle.xmlns.SalesForce11g.InfoCuenta.InfoCuenta.holders.ProcessResponseAcountDescHolder acountDesc) throws java.rmi.RemoteException;
}
