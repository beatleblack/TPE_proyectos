/**
 * TpPro2020Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface TpPro2020Soap extends java.rmi.Remote {

    /**
     * Consultar Tokens Agile 2020
     */
    public org.tempuri.ArrResultAgilController generateTokens2020(java.lang.String username, java.lang.String oldpassword) throws java.rmi.RemoteException;

    /**
     * Crear tenant Agile 2020
     */
    public org.tempuri.ArrResultAgilController createTenant2020(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException;

    /**
     * Borrar tenant Agile 2020
     */
    public org.tempuri.ArrResultAgilController deleteTenant2020(java.lang.String user) throws java.rmi.RemoteException;

    /**
     * Crear sitio Agile 2020
     */
    public org.tempuri.ArrResultAgilController createSite2020(java.lang.String username, java.lang.String password, java.lang.String nameHUB, java.lang.String deviceID, java.lang.String deviceType, java.lang.String esn) throws java.rmi.RemoteException;

    /**
     * Crear sitio Agile 2020
     */
    public org.tempuri.ArrResultAgilController changePassDevice2020(java.lang.String username, java.lang.String password, java.lang.String SITEID, java.lang.String pwd) throws java.rmi.RemoteException;

    /**
     * Borrar sitio Agile 2020
     */
    public org.tempuri.ArrResultAgilController deleteSite2020(java.lang.String user, java.lang.String pass, java.lang.String ids) throws java.rmi.RemoteException;

    /**
     * Borrar AR Agile 2020
     */
    public org.tempuri.ArrResultAgilController deleteAr2020(java.lang.String user, java.lang.String pass, java.lang.String ids) throws java.rmi.RemoteException;

    /**
     * Crear tenant Agile 2020
     */
    public org.tempuri.ArrResultAgilController[] pruebita(int a) throws java.rmi.RemoteException;

    /**
     * Delete tenant Agile 2020
     */
    public org.tempuri.ArrResultAgilController[] borrar() throws java.rmi.RemoteException;

    /**
     * Pruebas SQL
     */
    public org.tempuri.T100 getTenantInBD(java.lang.String tenant) throws java.rmi.RemoteException;

    /**
     * Pruebas SQL
     */
    public org.tempuri.A100[] getARInBD(long t100ID, java.lang.String a100ID) throws java.rmi.RemoteException;

    /**
     * Consulta Las Alarmas de Un Dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController getAlarmDevice2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta Las Alarmas de Un Dispositivo 2020 Con usuario y password
     */
    public org.tempuri.ArrResultAgilController getAlarmDevice2020_UP(java.lang.String usuario, java.lang.String password, java.lang.String strIdDevice) throws java.rmi.RemoteException;

    /**
     * Consulta La Salud de Los 5 Peores Sitios2020
     */
    public org.tempuri.ArrResultAgilController getSiteHealthInfo2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta La Salud de Los 5 Peores Sitios Con usuario y Password
     */
    public org.tempuri.ArrResultAgilController getSiteHealthInfo_UP(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Consulta el Top 5 de Aplicaciones de una cuenta en AC
     */
    public org.tempuri.ArrResultAgilController getGlobalAppListStatistics2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta el Top 5 de Aplicaciones de una cuenta en AC con Usuario
     * y Password
     */
    public org.tempuri.ArrResultAgilController getGlobalAppListStatistics2020_UP(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Consulta Aqm de apps de una cuenta en AC
     */
    public org.tempuri.ArrResultAgilController getGlobalAppAqmWorstn2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta Aqm de apps de una cuenta en AC con Usuario y Password
     */
    public org.tempuri.ArrResultAgilController getGlobalAppAqmWorstn2020(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Consulta las Security Politicas en AC 2020
     */
    public org.tempuri.ArrResultAgilController getSecurityPolicies2020(java.lang.String user, java.lang.String pass, java.lang.String strIdVpn) throws java.rmi.RemoteException;

    /**
     * Consulta VPN ID 2020
     */
    public org.tempuri.ArrResultAgilController getVPN2020(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException;

    /**
     * Consulta Informacion Uso del CPU de un Dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController getCpuUtilization2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta Informacion Uso del CPU de un Dispositivo 2020 User
     * y Password
     */
    public org.tempuri.ArrResultAgilController getCpuUtilization2020(java.lang.String user, java.lang.String pass, java.lang.String strIdDevice) throws java.rmi.RemoteException;

    /**
     * Consulta La Memoria De Un Dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController getMemoryDevice2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta La Memoria De Un Dispositivo 2020 User y Password
     */
    public org.tempuri.ArrResultAgilController getMemoryDevice2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException;

    /**
     * Consulta de Temperatura de un Dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController getTemperature2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta de Temperatura de un Dispositivo 2020 Usuario y Password
     */
    public org.tempuri.ArrResultAgilController getTemperature2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException;

    /**
     * Consulta Espacio de Disco Usado de un Dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController getDiskSpaceUsage2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta Espacio de Disco Usado de un Dispositivo 2020 Usuario
     * y Password
     */
    public org.tempuri.ArrResultAgilController getDiskSpaceUsage2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException;

    /**
     * Consulta Informacion Basica de un Dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController getBasicInformation2020(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consulta Informacion Basica de un Dispositivo 2020 Usuario
     * y Password
     */
    public org.tempuri.ArrResultAgilController getBasicInformation2020(java.lang.String strGetTenant, java.lang.String strGetPWD, java.lang.String strIdDevice) throws java.rmi.RemoteException;

    /**
     * Consulta si existe un dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController isExistDevice2020(java.lang.String user, java.lang.String pass, java.lang.String snAr) throws java.rmi.RemoteException;

    /**
     * Valida un dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController validEsnInAc_2020(java.lang.String snAr) throws java.rmi.RemoteException;

    /**
     * Valida un dispositivo 2020
     */
    public org.tempuri.ArrResultAgilController changeDeviceAllStandard(java.lang.String strIdCustumer, java.lang.String strOldDevSN, java.lang.String strOldIdModel, java.lang.String strNewDevSN, java.lang.String strNewIdModel) throws java.rmi.RemoteException;

    /**
     * Elimina un AR y lo resta del inventario
     */
    public org.tempuri.ArrResultAgilController deleteDevice2020AgileDB(java.lang.String ar, java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * AddonQoS
     */
    public org.tempuri.ArrResultAgilController addonQoS(java.lang.String strIdCustomer, org.tempuri.AddonQosV2020[] arrQos) throws java.rmi.RemoteException;

    /**
     * Get Info QoS
     */
    public org.tempuri.ArrResultAgilController getInfoQoS(java.lang.String strIdCustomer) throws java.rmi.RemoteException;

    /**
     * Consumos Altán
     */
    public org.tempuri.ArrResultAgilController consumosAltanTpPro(java.lang.String fechaInicio, java.lang.String fechaFin, java.lang.String esnAr) throws java.rmi.RemoteException;
}
