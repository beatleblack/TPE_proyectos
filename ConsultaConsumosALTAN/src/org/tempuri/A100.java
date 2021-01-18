/**
 * A100.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class A100  implements java.io.Serializable {
    private long a100_ID;

    private long a100_T100_ID;

    private java.lang.String a100_DEV_ESN;

    private java.lang.String a100_DEV_NAME;

    private java.lang.String a100_DEV_ID;

    private java.lang.String a100_DEV_MODEL;

    private int a100_DEV_STATUS;

    private java.lang.String a100_TEMPSITE_NAME;

    private java.lang.String a100_TEMPSITE_ID;

    private java.lang.String a100_TEMPLATE_NAME;

    private java.lang.String a100_TEMPLATE_ID;

    private java.lang.String a100_SITE_NAME;

    private java.lang.String a100_SITE_ID;

    private int a100_SITE_SPEED;

    private java.lang.String a100_SITE_TYPE;

    private java.lang.String a100_LINK_NAME;

    private java.lang.String a100_LINK_ID;

    private java.lang.String a100_PROFILE_NAME;

    private java.lang.String a100_PROFILE_ID;

    private java.lang.String a100_IMGVNF_NAME;

    private java.lang.String a100_IMGVNF_ID;

    private int a100_STATUS_NFV;

    private java.lang.String a100_PROVEEDOR;

    private java.lang.String a100_IPADDR;

    private java.lang.String a100_IPGETWAY;

    private java.lang.String a100_MASK;

    private java.lang.String a100_GP_IPDNS;

    private java.lang.String a100_GP_IPPOOL;

    private int a100_ACCESS_INTERNET;

    private java.lang.String a100_ACCESS_BANDWIDTH;

    private java.lang.String a100_TLT_IDCUSTOMER;

    private int a100_PROCESSED;

    private java.util.Calendar a100_DATE;

    private java.lang.String a100_SERIAL_ONT;

    private java.lang.String a100_SERIAL_HSU;

    private java.lang.String a100_SERIAL_4G;

    public A100() {
    }

    public A100(
           long a100_ID,
           long a100_T100_ID,
           java.lang.String a100_DEV_ESN,
           java.lang.String a100_DEV_NAME,
           java.lang.String a100_DEV_ID,
           java.lang.String a100_DEV_MODEL,
           int a100_DEV_STATUS,
           java.lang.String a100_TEMPSITE_NAME,
           java.lang.String a100_TEMPSITE_ID,
           java.lang.String a100_TEMPLATE_NAME,
           java.lang.String a100_TEMPLATE_ID,
           java.lang.String a100_SITE_NAME,
           java.lang.String a100_SITE_ID,
           int a100_SITE_SPEED,
           java.lang.String a100_SITE_TYPE,
           java.lang.String a100_LINK_NAME,
           java.lang.String a100_LINK_ID,
           java.lang.String a100_PROFILE_NAME,
           java.lang.String a100_PROFILE_ID,
           java.lang.String a100_IMGVNF_NAME,
           java.lang.String a100_IMGVNF_ID,
           int a100_STATUS_NFV,
           java.lang.String a100_PROVEEDOR,
           java.lang.String a100_IPADDR,
           java.lang.String a100_IPGETWAY,
           java.lang.String a100_MASK,
           java.lang.String a100_GP_IPDNS,
           java.lang.String a100_GP_IPPOOL,
           int a100_ACCESS_INTERNET,
           java.lang.String a100_ACCESS_BANDWIDTH,
           java.lang.String a100_TLT_IDCUSTOMER,
           int a100_PROCESSED,
           java.util.Calendar a100_DATE,
           java.lang.String a100_SERIAL_ONT,
           java.lang.String a100_SERIAL_HSU,
           java.lang.String a100_SERIAL_4G) {
           this.a100_ID = a100_ID;
           this.a100_T100_ID = a100_T100_ID;
           this.a100_DEV_ESN = a100_DEV_ESN;
           this.a100_DEV_NAME = a100_DEV_NAME;
           this.a100_DEV_ID = a100_DEV_ID;
           this.a100_DEV_MODEL = a100_DEV_MODEL;
           this.a100_DEV_STATUS = a100_DEV_STATUS;
           this.a100_TEMPSITE_NAME = a100_TEMPSITE_NAME;
           this.a100_TEMPSITE_ID = a100_TEMPSITE_ID;
           this.a100_TEMPLATE_NAME = a100_TEMPLATE_NAME;
           this.a100_TEMPLATE_ID = a100_TEMPLATE_ID;
           this.a100_SITE_NAME = a100_SITE_NAME;
           this.a100_SITE_ID = a100_SITE_ID;
           this.a100_SITE_SPEED = a100_SITE_SPEED;
           this.a100_SITE_TYPE = a100_SITE_TYPE;
           this.a100_LINK_NAME = a100_LINK_NAME;
           this.a100_LINK_ID = a100_LINK_ID;
           this.a100_PROFILE_NAME = a100_PROFILE_NAME;
           this.a100_PROFILE_ID = a100_PROFILE_ID;
           this.a100_IMGVNF_NAME = a100_IMGVNF_NAME;
           this.a100_IMGVNF_ID = a100_IMGVNF_ID;
           this.a100_STATUS_NFV = a100_STATUS_NFV;
           this.a100_PROVEEDOR = a100_PROVEEDOR;
           this.a100_IPADDR = a100_IPADDR;
           this.a100_IPGETWAY = a100_IPGETWAY;
           this.a100_MASK = a100_MASK;
           this.a100_GP_IPDNS = a100_GP_IPDNS;
           this.a100_GP_IPPOOL = a100_GP_IPPOOL;
           this.a100_ACCESS_INTERNET = a100_ACCESS_INTERNET;
           this.a100_ACCESS_BANDWIDTH = a100_ACCESS_BANDWIDTH;
           this.a100_TLT_IDCUSTOMER = a100_TLT_IDCUSTOMER;
           this.a100_PROCESSED = a100_PROCESSED;
           this.a100_DATE = a100_DATE;
           this.a100_SERIAL_ONT = a100_SERIAL_ONT;
           this.a100_SERIAL_HSU = a100_SERIAL_HSU;
           this.a100_SERIAL_4G = a100_SERIAL_4G;
    }


    /**
     * Gets the a100_ID value for this A100.
     * 
     * @return a100_ID
     */
    public long getA100_ID() {
        return a100_ID;
    }


    /**
     * Sets the a100_ID value for this A100.
     * 
     * @param a100_ID
     */
    public void setA100_ID(long a100_ID) {
        this.a100_ID = a100_ID;
    }


    /**
     * Gets the a100_T100_ID value for this A100.
     * 
     * @return a100_T100_ID
     */
    public long getA100_T100_ID() {
        return a100_T100_ID;
    }


    /**
     * Sets the a100_T100_ID value for this A100.
     * 
     * @param a100_T100_ID
     */
    public void setA100_T100_ID(long a100_T100_ID) {
        this.a100_T100_ID = a100_T100_ID;
    }


    /**
     * Gets the a100_DEV_ESN value for this A100.
     * 
     * @return a100_DEV_ESN
     */
    public java.lang.String getA100_DEV_ESN() {
        return a100_DEV_ESN;
    }


    /**
     * Sets the a100_DEV_ESN value for this A100.
     * 
     * @param a100_DEV_ESN
     */
    public void setA100_DEV_ESN(java.lang.String a100_DEV_ESN) {
        this.a100_DEV_ESN = a100_DEV_ESN;
    }


    /**
     * Gets the a100_DEV_NAME value for this A100.
     * 
     * @return a100_DEV_NAME
     */
    public java.lang.String getA100_DEV_NAME() {
        return a100_DEV_NAME;
    }


    /**
     * Sets the a100_DEV_NAME value for this A100.
     * 
     * @param a100_DEV_NAME
     */
    public void setA100_DEV_NAME(java.lang.String a100_DEV_NAME) {
        this.a100_DEV_NAME = a100_DEV_NAME;
    }


    /**
     * Gets the a100_DEV_ID value for this A100.
     * 
     * @return a100_DEV_ID
     */
    public java.lang.String getA100_DEV_ID() {
        return a100_DEV_ID;
    }


    /**
     * Sets the a100_DEV_ID value for this A100.
     * 
     * @param a100_DEV_ID
     */
    public void setA100_DEV_ID(java.lang.String a100_DEV_ID) {
        this.a100_DEV_ID = a100_DEV_ID;
    }


    /**
     * Gets the a100_DEV_MODEL value for this A100.
     * 
     * @return a100_DEV_MODEL
     */
    public java.lang.String getA100_DEV_MODEL() {
        return a100_DEV_MODEL;
    }


    /**
     * Sets the a100_DEV_MODEL value for this A100.
     * 
     * @param a100_DEV_MODEL
     */
    public void setA100_DEV_MODEL(java.lang.String a100_DEV_MODEL) {
        this.a100_DEV_MODEL = a100_DEV_MODEL;
    }


    /**
     * Gets the a100_DEV_STATUS value for this A100.
     * 
     * @return a100_DEV_STATUS
     */
    public int getA100_DEV_STATUS() {
        return a100_DEV_STATUS;
    }


    /**
     * Sets the a100_DEV_STATUS value for this A100.
     * 
     * @param a100_DEV_STATUS
     */
    public void setA100_DEV_STATUS(int a100_DEV_STATUS) {
        this.a100_DEV_STATUS = a100_DEV_STATUS;
    }


    /**
     * Gets the a100_TEMPSITE_NAME value for this A100.
     * 
     * @return a100_TEMPSITE_NAME
     */
    public java.lang.String getA100_TEMPSITE_NAME() {
        return a100_TEMPSITE_NAME;
    }


    /**
     * Sets the a100_TEMPSITE_NAME value for this A100.
     * 
     * @param a100_TEMPSITE_NAME
     */
    public void setA100_TEMPSITE_NAME(java.lang.String a100_TEMPSITE_NAME) {
        this.a100_TEMPSITE_NAME = a100_TEMPSITE_NAME;
    }


    /**
     * Gets the a100_TEMPSITE_ID value for this A100.
     * 
     * @return a100_TEMPSITE_ID
     */
    public java.lang.String getA100_TEMPSITE_ID() {
        return a100_TEMPSITE_ID;
    }


    /**
     * Sets the a100_TEMPSITE_ID value for this A100.
     * 
     * @param a100_TEMPSITE_ID
     */
    public void setA100_TEMPSITE_ID(java.lang.String a100_TEMPSITE_ID) {
        this.a100_TEMPSITE_ID = a100_TEMPSITE_ID;
    }


    /**
     * Gets the a100_TEMPLATE_NAME value for this A100.
     * 
     * @return a100_TEMPLATE_NAME
     */
    public java.lang.String getA100_TEMPLATE_NAME() {
        return a100_TEMPLATE_NAME;
    }


    /**
     * Sets the a100_TEMPLATE_NAME value for this A100.
     * 
     * @param a100_TEMPLATE_NAME
     */
    public void setA100_TEMPLATE_NAME(java.lang.String a100_TEMPLATE_NAME) {
        this.a100_TEMPLATE_NAME = a100_TEMPLATE_NAME;
    }


    /**
     * Gets the a100_TEMPLATE_ID value for this A100.
     * 
     * @return a100_TEMPLATE_ID
     */
    public java.lang.String getA100_TEMPLATE_ID() {
        return a100_TEMPLATE_ID;
    }


    /**
     * Sets the a100_TEMPLATE_ID value for this A100.
     * 
     * @param a100_TEMPLATE_ID
     */
    public void setA100_TEMPLATE_ID(java.lang.String a100_TEMPLATE_ID) {
        this.a100_TEMPLATE_ID = a100_TEMPLATE_ID;
    }


    /**
     * Gets the a100_SITE_NAME value for this A100.
     * 
     * @return a100_SITE_NAME
     */
    public java.lang.String getA100_SITE_NAME() {
        return a100_SITE_NAME;
    }


    /**
     * Sets the a100_SITE_NAME value for this A100.
     * 
     * @param a100_SITE_NAME
     */
    public void setA100_SITE_NAME(java.lang.String a100_SITE_NAME) {
        this.a100_SITE_NAME = a100_SITE_NAME;
    }


    /**
     * Gets the a100_SITE_ID value for this A100.
     * 
     * @return a100_SITE_ID
     */
    public java.lang.String getA100_SITE_ID() {
        return a100_SITE_ID;
    }


    /**
     * Sets the a100_SITE_ID value for this A100.
     * 
     * @param a100_SITE_ID
     */
    public void setA100_SITE_ID(java.lang.String a100_SITE_ID) {
        this.a100_SITE_ID = a100_SITE_ID;
    }


    /**
     * Gets the a100_SITE_SPEED value for this A100.
     * 
     * @return a100_SITE_SPEED
     */
    public int getA100_SITE_SPEED() {
        return a100_SITE_SPEED;
    }


    /**
     * Sets the a100_SITE_SPEED value for this A100.
     * 
     * @param a100_SITE_SPEED
     */
    public void setA100_SITE_SPEED(int a100_SITE_SPEED) {
        this.a100_SITE_SPEED = a100_SITE_SPEED;
    }


    /**
     * Gets the a100_SITE_TYPE value for this A100.
     * 
     * @return a100_SITE_TYPE
     */
    public java.lang.String getA100_SITE_TYPE() {
        return a100_SITE_TYPE;
    }


    /**
     * Sets the a100_SITE_TYPE value for this A100.
     * 
     * @param a100_SITE_TYPE
     */
    public void setA100_SITE_TYPE(java.lang.String a100_SITE_TYPE) {
        this.a100_SITE_TYPE = a100_SITE_TYPE;
    }


    /**
     * Gets the a100_LINK_NAME value for this A100.
     * 
     * @return a100_LINK_NAME
     */
    public java.lang.String getA100_LINK_NAME() {
        return a100_LINK_NAME;
    }


    /**
     * Sets the a100_LINK_NAME value for this A100.
     * 
     * @param a100_LINK_NAME
     */
    public void setA100_LINK_NAME(java.lang.String a100_LINK_NAME) {
        this.a100_LINK_NAME = a100_LINK_NAME;
    }


    /**
     * Gets the a100_LINK_ID value for this A100.
     * 
     * @return a100_LINK_ID
     */
    public java.lang.String getA100_LINK_ID() {
        return a100_LINK_ID;
    }


    /**
     * Sets the a100_LINK_ID value for this A100.
     * 
     * @param a100_LINK_ID
     */
    public void setA100_LINK_ID(java.lang.String a100_LINK_ID) {
        this.a100_LINK_ID = a100_LINK_ID;
    }


    /**
     * Gets the a100_PROFILE_NAME value for this A100.
     * 
     * @return a100_PROFILE_NAME
     */
    public java.lang.String getA100_PROFILE_NAME() {
        return a100_PROFILE_NAME;
    }


    /**
     * Sets the a100_PROFILE_NAME value for this A100.
     * 
     * @param a100_PROFILE_NAME
     */
    public void setA100_PROFILE_NAME(java.lang.String a100_PROFILE_NAME) {
        this.a100_PROFILE_NAME = a100_PROFILE_NAME;
    }


    /**
     * Gets the a100_PROFILE_ID value for this A100.
     * 
     * @return a100_PROFILE_ID
     */
    public java.lang.String getA100_PROFILE_ID() {
        return a100_PROFILE_ID;
    }


    /**
     * Sets the a100_PROFILE_ID value for this A100.
     * 
     * @param a100_PROFILE_ID
     */
    public void setA100_PROFILE_ID(java.lang.String a100_PROFILE_ID) {
        this.a100_PROFILE_ID = a100_PROFILE_ID;
    }


    /**
     * Gets the a100_IMGVNF_NAME value for this A100.
     * 
     * @return a100_IMGVNF_NAME
     */
    public java.lang.String getA100_IMGVNF_NAME() {
        return a100_IMGVNF_NAME;
    }


    /**
     * Sets the a100_IMGVNF_NAME value for this A100.
     * 
     * @param a100_IMGVNF_NAME
     */
    public void setA100_IMGVNF_NAME(java.lang.String a100_IMGVNF_NAME) {
        this.a100_IMGVNF_NAME = a100_IMGVNF_NAME;
    }


    /**
     * Gets the a100_IMGVNF_ID value for this A100.
     * 
     * @return a100_IMGVNF_ID
     */
    public java.lang.String getA100_IMGVNF_ID() {
        return a100_IMGVNF_ID;
    }


    /**
     * Sets the a100_IMGVNF_ID value for this A100.
     * 
     * @param a100_IMGVNF_ID
     */
    public void setA100_IMGVNF_ID(java.lang.String a100_IMGVNF_ID) {
        this.a100_IMGVNF_ID = a100_IMGVNF_ID;
    }


    /**
     * Gets the a100_STATUS_NFV value for this A100.
     * 
     * @return a100_STATUS_NFV
     */
    public int getA100_STATUS_NFV() {
        return a100_STATUS_NFV;
    }


    /**
     * Sets the a100_STATUS_NFV value for this A100.
     * 
     * @param a100_STATUS_NFV
     */
    public void setA100_STATUS_NFV(int a100_STATUS_NFV) {
        this.a100_STATUS_NFV = a100_STATUS_NFV;
    }


    /**
     * Gets the a100_PROVEEDOR value for this A100.
     * 
     * @return a100_PROVEEDOR
     */
    public java.lang.String getA100_PROVEEDOR() {
        return a100_PROVEEDOR;
    }


    /**
     * Sets the a100_PROVEEDOR value for this A100.
     * 
     * @param a100_PROVEEDOR
     */
    public void setA100_PROVEEDOR(java.lang.String a100_PROVEEDOR) {
        this.a100_PROVEEDOR = a100_PROVEEDOR;
    }


    /**
     * Gets the a100_IPADDR value for this A100.
     * 
     * @return a100_IPADDR
     */
    public java.lang.String getA100_IPADDR() {
        return a100_IPADDR;
    }


    /**
     * Sets the a100_IPADDR value for this A100.
     * 
     * @param a100_IPADDR
     */
    public void setA100_IPADDR(java.lang.String a100_IPADDR) {
        this.a100_IPADDR = a100_IPADDR;
    }


    /**
     * Gets the a100_IPGETWAY value for this A100.
     * 
     * @return a100_IPGETWAY
     */
    public java.lang.String getA100_IPGETWAY() {
        return a100_IPGETWAY;
    }


    /**
     * Sets the a100_IPGETWAY value for this A100.
     * 
     * @param a100_IPGETWAY
     */
    public void setA100_IPGETWAY(java.lang.String a100_IPGETWAY) {
        this.a100_IPGETWAY = a100_IPGETWAY;
    }


    /**
     * Gets the a100_MASK value for this A100.
     * 
     * @return a100_MASK
     */
    public java.lang.String getA100_MASK() {
        return a100_MASK;
    }


    /**
     * Sets the a100_MASK value for this A100.
     * 
     * @param a100_MASK
     */
    public void setA100_MASK(java.lang.String a100_MASK) {
        this.a100_MASK = a100_MASK;
    }


    /**
     * Gets the a100_GP_IPDNS value for this A100.
     * 
     * @return a100_GP_IPDNS
     */
    public java.lang.String getA100_GP_IPDNS() {
        return a100_GP_IPDNS;
    }


    /**
     * Sets the a100_GP_IPDNS value for this A100.
     * 
     * @param a100_GP_IPDNS
     */
    public void setA100_GP_IPDNS(java.lang.String a100_GP_IPDNS) {
        this.a100_GP_IPDNS = a100_GP_IPDNS;
    }


    /**
     * Gets the a100_GP_IPPOOL value for this A100.
     * 
     * @return a100_GP_IPPOOL
     */
    public java.lang.String getA100_GP_IPPOOL() {
        return a100_GP_IPPOOL;
    }


    /**
     * Sets the a100_GP_IPPOOL value for this A100.
     * 
     * @param a100_GP_IPPOOL
     */
    public void setA100_GP_IPPOOL(java.lang.String a100_GP_IPPOOL) {
        this.a100_GP_IPPOOL = a100_GP_IPPOOL;
    }


    /**
     * Gets the a100_ACCESS_INTERNET value for this A100.
     * 
     * @return a100_ACCESS_INTERNET
     */
    public int getA100_ACCESS_INTERNET() {
        return a100_ACCESS_INTERNET;
    }


    /**
     * Sets the a100_ACCESS_INTERNET value for this A100.
     * 
     * @param a100_ACCESS_INTERNET
     */
    public void setA100_ACCESS_INTERNET(int a100_ACCESS_INTERNET) {
        this.a100_ACCESS_INTERNET = a100_ACCESS_INTERNET;
    }


    /**
     * Gets the a100_ACCESS_BANDWIDTH value for this A100.
     * 
     * @return a100_ACCESS_BANDWIDTH
     */
    public java.lang.String getA100_ACCESS_BANDWIDTH() {
        return a100_ACCESS_BANDWIDTH;
    }


    /**
     * Sets the a100_ACCESS_BANDWIDTH value for this A100.
     * 
     * @param a100_ACCESS_BANDWIDTH
     */
    public void setA100_ACCESS_BANDWIDTH(java.lang.String a100_ACCESS_BANDWIDTH) {
        this.a100_ACCESS_BANDWIDTH = a100_ACCESS_BANDWIDTH;
    }


    /**
     * Gets the a100_TLT_IDCUSTOMER value for this A100.
     * 
     * @return a100_TLT_IDCUSTOMER
     */
    public java.lang.String getA100_TLT_IDCUSTOMER() {
        return a100_TLT_IDCUSTOMER;
    }


    /**
     * Sets the a100_TLT_IDCUSTOMER value for this A100.
     * 
     * @param a100_TLT_IDCUSTOMER
     */
    public void setA100_TLT_IDCUSTOMER(java.lang.String a100_TLT_IDCUSTOMER) {
        this.a100_TLT_IDCUSTOMER = a100_TLT_IDCUSTOMER;
    }


    /**
     * Gets the a100_PROCESSED value for this A100.
     * 
     * @return a100_PROCESSED
     */
    public int getA100_PROCESSED() {
        return a100_PROCESSED;
    }


    /**
     * Sets the a100_PROCESSED value for this A100.
     * 
     * @param a100_PROCESSED
     */
    public void setA100_PROCESSED(int a100_PROCESSED) {
        this.a100_PROCESSED = a100_PROCESSED;
    }


    /**
     * Gets the a100_DATE value for this A100.
     * 
     * @return a100_DATE
     */
    public java.util.Calendar getA100_DATE() {
        return a100_DATE;
    }


    /**
     * Sets the a100_DATE value for this A100.
     * 
     * @param a100_DATE
     */
    public void setA100_DATE(java.util.Calendar a100_DATE) {
        this.a100_DATE = a100_DATE;
    }


    /**
     * Gets the a100_SERIAL_ONT value for this A100.
     * 
     * @return a100_SERIAL_ONT
     */
    public java.lang.String getA100_SERIAL_ONT() {
        return a100_SERIAL_ONT;
    }


    /**
     * Sets the a100_SERIAL_ONT value for this A100.
     * 
     * @param a100_SERIAL_ONT
     */
    public void setA100_SERIAL_ONT(java.lang.String a100_SERIAL_ONT) {
        this.a100_SERIAL_ONT = a100_SERIAL_ONT;
    }


    /**
     * Gets the a100_SERIAL_HSU value for this A100.
     * 
     * @return a100_SERIAL_HSU
     */
    public java.lang.String getA100_SERIAL_HSU() {
        return a100_SERIAL_HSU;
    }


    /**
     * Sets the a100_SERIAL_HSU value for this A100.
     * 
     * @param a100_SERIAL_HSU
     */
    public void setA100_SERIAL_HSU(java.lang.String a100_SERIAL_HSU) {
        this.a100_SERIAL_HSU = a100_SERIAL_HSU;
    }


    /**
     * Gets the a100_SERIAL_4G value for this A100.
     * 
     * @return a100_SERIAL_4G
     */
    public java.lang.String getA100_SERIAL_4G() {
        return a100_SERIAL_4G;
    }


    /**
     * Sets the a100_SERIAL_4G value for this A100.
     * 
     * @param a100_SERIAL_4G
     */
    public void setA100_SERIAL_4G(java.lang.String a100_SERIAL_4G) {
        this.a100_SERIAL_4G = a100_SERIAL_4G;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof A100)) return false;
        A100 other = (A100) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.a100_ID == other.getA100_ID() &&
            this.a100_T100_ID == other.getA100_T100_ID() &&
            ((this.a100_DEV_ESN==null && other.getA100_DEV_ESN()==null) || 
             (this.a100_DEV_ESN!=null &&
              this.a100_DEV_ESN.equals(other.getA100_DEV_ESN()))) &&
            ((this.a100_DEV_NAME==null && other.getA100_DEV_NAME()==null) || 
             (this.a100_DEV_NAME!=null &&
              this.a100_DEV_NAME.equals(other.getA100_DEV_NAME()))) &&
            ((this.a100_DEV_ID==null && other.getA100_DEV_ID()==null) || 
             (this.a100_DEV_ID!=null &&
              this.a100_DEV_ID.equals(other.getA100_DEV_ID()))) &&
            ((this.a100_DEV_MODEL==null && other.getA100_DEV_MODEL()==null) || 
             (this.a100_DEV_MODEL!=null &&
              this.a100_DEV_MODEL.equals(other.getA100_DEV_MODEL()))) &&
            this.a100_DEV_STATUS == other.getA100_DEV_STATUS() &&
            ((this.a100_TEMPSITE_NAME==null && other.getA100_TEMPSITE_NAME()==null) || 
             (this.a100_TEMPSITE_NAME!=null &&
              this.a100_TEMPSITE_NAME.equals(other.getA100_TEMPSITE_NAME()))) &&
            ((this.a100_TEMPSITE_ID==null && other.getA100_TEMPSITE_ID()==null) || 
             (this.a100_TEMPSITE_ID!=null &&
              this.a100_TEMPSITE_ID.equals(other.getA100_TEMPSITE_ID()))) &&
            ((this.a100_TEMPLATE_NAME==null && other.getA100_TEMPLATE_NAME()==null) || 
             (this.a100_TEMPLATE_NAME!=null &&
              this.a100_TEMPLATE_NAME.equals(other.getA100_TEMPLATE_NAME()))) &&
            ((this.a100_TEMPLATE_ID==null && other.getA100_TEMPLATE_ID()==null) || 
             (this.a100_TEMPLATE_ID!=null &&
              this.a100_TEMPLATE_ID.equals(other.getA100_TEMPLATE_ID()))) &&
            ((this.a100_SITE_NAME==null && other.getA100_SITE_NAME()==null) || 
             (this.a100_SITE_NAME!=null &&
              this.a100_SITE_NAME.equals(other.getA100_SITE_NAME()))) &&
            ((this.a100_SITE_ID==null && other.getA100_SITE_ID()==null) || 
             (this.a100_SITE_ID!=null &&
              this.a100_SITE_ID.equals(other.getA100_SITE_ID()))) &&
            this.a100_SITE_SPEED == other.getA100_SITE_SPEED() &&
            ((this.a100_SITE_TYPE==null && other.getA100_SITE_TYPE()==null) || 
             (this.a100_SITE_TYPE!=null &&
              this.a100_SITE_TYPE.equals(other.getA100_SITE_TYPE()))) &&
            ((this.a100_LINK_NAME==null && other.getA100_LINK_NAME()==null) || 
             (this.a100_LINK_NAME!=null &&
              this.a100_LINK_NAME.equals(other.getA100_LINK_NAME()))) &&
            ((this.a100_LINK_ID==null && other.getA100_LINK_ID()==null) || 
             (this.a100_LINK_ID!=null &&
              this.a100_LINK_ID.equals(other.getA100_LINK_ID()))) &&
            ((this.a100_PROFILE_NAME==null && other.getA100_PROFILE_NAME()==null) || 
             (this.a100_PROFILE_NAME!=null &&
              this.a100_PROFILE_NAME.equals(other.getA100_PROFILE_NAME()))) &&
            ((this.a100_PROFILE_ID==null && other.getA100_PROFILE_ID()==null) || 
             (this.a100_PROFILE_ID!=null &&
              this.a100_PROFILE_ID.equals(other.getA100_PROFILE_ID()))) &&
            ((this.a100_IMGVNF_NAME==null && other.getA100_IMGVNF_NAME()==null) || 
             (this.a100_IMGVNF_NAME!=null &&
              this.a100_IMGVNF_NAME.equals(other.getA100_IMGVNF_NAME()))) &&
            ((this.a100_IMGVNF_ID==null && other.getA100_IMGVNF_ID()==null) || 
             (this.a100_IMGVNF_ID!=null &&
              this.a100_IMGVNF_ID.equals(other.getA100_IMGVNF_ID()))) &&
            this.a100_STATUS_NFV == other.getA100_STATUS_NFV() &&
            ((this.a100_PROVEEDOR==null && other.getA100_PROVEEDOR()==null) || 
             (this.a100_PROVEEDOR!=null &&
              this.a100_PROVEEDOR.equals(other.getA100_PROVEEDOR()))) &&
            ((this.a100_IPADDR==null && other.getA100_IPADDR()==null) || 
             (this.a100_IPADDR!=null &&
              this.a100_IPADDR.equals(other.getA100_IPADDR()))) &&
            ((this.a100_IPGETWAY==null && other.getA100_IPGETWAY()==null) || 
             (this.a100_IPGETWAY!=null &&
              this.a100_IPGETWAY.equals(other.getA100_IPGETWAY()))) &&
            ((this.a100_MASK==null && other.getA100_MASK()==null) || 
             (this.a100_MASK!=null &&
              this.a100_MASK.equals(other.getA100_MASK()))) &&
            ((this.a100_GP_IPDNS==null && other.getA100_GP_IPDNS()==null) || 
             (this.a100_GP_IPDNS!=null &&
              this.a100_GP_IPDNS.equals(other.getA100_GP_IPDNS()))) &&
            ((this.a100_GP_IPPOOL==null && other.getA100_GP_IPPOOL()==null) || 
             (this.a100_GP_IPPOOL!=null &&
              this.a100_GP_IPPOOL.equals(other.getA100_GP_IPPOOL()))) &&
            this.a100_ACCESS_INTERNET == other.getA100_ACCESS_INTERNET() &&
            ((this.a100_ACCESS_BANDWIDTH==null && other.getA100_ACCESS_BANDWIDTH()==null) || 
             (this.a100_ACCESS_BANDWIDTH!=null &&
              this.a100_ACCESS_BANDWIDTH.equals(other.getA100_ACCESS_BANDWIDTH()))) &&
            ((this.a100_TLT_IDCUSTOMER==null && other.getA100_TLT_IDCUSTOMER()==null) || 
             (this.a100_TLT_IDCUSTOMER!=null &&
              this.a100_TLT_IDCUSTOMER.equals(other.getA100_TLT_IDCUSTOMER()))) &&
            this.a100_PROCESSED == other.getA100_PROCESSED() &&
            ((this.a100_DATE==null && other.getA100_DATE()==null) || 
             (this.a100_DATE!=null &&
              this.a100_DATE.equals(other.getA100_DATE()))) &&
            ((this.a100_SERIAL_ONT==null && other.getA100_SERIAL_ONT()==null) || 
             (this.a100_SERIAL_ONT!=null &&
              this.a100_SERIAL_ONT.equals(other.getA100_SERIAL_ONT()))) &&
            ((this.a100_SERIAL_HSU==null && other.getA100_SERIAL_HSU()==null) || 
             (this.a100_SERIAL_HSU!=null &&
              this.a100_SERIAL_HSU.equals(other.getA100_SERIAL_HSU()))) &&
            ((this.a100_SERIAL_4G==null && other.getA100_SERIAL_4G()==null) || 
             (this.a100_SERIAL_4G!=null &&
              this.a100_SERIAL_4G.equals(other.getA100_SERIAL_4G())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getA100_ID()).hashCode();
        _hashCode += new Long(getA100_T100_ID()).hashCode();
        if (getA100_DEV_ESN() != null) {
            _hashCode += getA100_DEV_ESN().hashCode();
        }
        if (getA100_DEV_NAME() != null) {
            _hashCode += getA100_DEV_NAME().hashCode();
        }
        if (getA100_DEV_ID() != null) {
            _hashCode += getA100_DEV_ID().hashCode();
        }
        if (getA100_DEV_MODEL() != null) {
            _hashCode += getA100_DEV_MODEL().hashCode();
        }
        _hashCode += getA100_DEV_STATUS();
        if (getA100_TEMPSITE_NAME() != null) {
            _hashCode += getA100_TEMPSITE_NAME().hashCode();
        }
        if (getA100_TEMPSITE_ID() != null) {
            _hashCode += getA100_TEMPSITE_ID().hashCode();
        }
        if (getA100_TEMPLATE_NAME() != null) {
            _hashCode += getA100_TEMPLATE_NAME().hashCode();
        }
        if (getA100_TEMPLATE_ID() != null) {
            _hashCode += getA100_TEMPLATE_ID().hashCode();
        }
        if (getA100_SITE_NAME() != null) {
            _hashCode += getA100_SITE_NAME().hashCode();
        }
        if (getA100_SITE_ID() != null) {
            _hashCode += getA100_SITE_ID().hashCode();
        }
        _hashCode += getA100_SITE_SPEED();
        if (getA100_SITE_TYPE() != null) {
            _hashCode += getA100_SITE_TYPE().hashCode();
        }
        if (getA100_LINK_NAME() != null) {
            _hashCode += getA100_LINK_NAME().hashCode();
        }
        if (getA100_LINK_ID() != null) {
            _hashCode += getA100_LINK_ID().hashCode();
        }
        if (getA100_PROFILE_NAME() != null) {
            _hashCode += getA100_PROFILE_NAME().hashCode();
        }
        if (getA100_PROFILE_ID() != null) {
            _hashCode += getA100_PROFILE_ID().hashCode();
        }
        if (getA100_IMGVNF_NAME() != null) {
            _hashCode += getA100_IMGVNF_NAME().hashCode();
        }
        if (getA100_IMGVNF_ID() != null) {
            _hashCode += getA100_IMGVNF_ID().hashCode();
        }
        _hashCode += getA100_STATUS_NFV();
        if (getA100_PROVEEDOR() != null) {
            _hashCode += getA100_PROVEEDOR().hashCode();
        }
        if (getA100_IPADDR() != null) {
            _hashCode += getA100_IPADDR().hashCode();
        }
        if (getA100_IPGETWAY() != null) {
            _hashCode += getA100_IPGETWAY().hashCode();
        }
        if (getA100_MASK() != null) {
            _hashCode += getA100_MASK().hashCode();
        }
        if (getA100_GP_IPDNS() != null) {
            _hashCode += getA100_GP_IPDNS().hashCode();
        }
        if (getA100_GP_IPPOOL() != null) {
            _hashCode += getA100_GP_IPPOOL().hashCode();
        }
        _hashCode += getA100_ACCESS_INTERNET();
        if (getA100_ACCESS_BANDWIDTH() != null) {
            _hashCode += getA100_ACCESS_BANDWIDTH().hashCode();
        }
        if (getA100_TLT_IDCUSTOMER() != null) {
            _hashCode += getA100_TLT_IDCUSTOMER().hashCode();
        }
        _hashCode += getA100_PROCESSED();
        if (getA100_DATE() != null) {
            _hashCode += getA100_DATE().hashCode();
        }
        if (getA100_SERIAL_ONT() != null) {
            _hashCode += getA100_SERIAL_ONT().hashCode();
        }
        if (getA100_SERIAL_HSU() != null) {
            _hashCode += getA100_SERIAL_HSU().hashCode();
        }
        if (getA100_SERIAL_4G() != null) {
            _hashCode += getA100_SERIAL_4G().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(A100.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "A100"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_T100_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_T100_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_DEV_ESN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_DEV_ESN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_DEV_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_DEV_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_DEV_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_DEV_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_DEV_MODEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_DEV_MODEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_DEV_STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_DEV_STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_TEMPSITE_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_TEMPSITE_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_TEMPSITE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_TEMPSITE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_TEMPLATE_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_TEMPLATE_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_TEMPLATE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_TEMPLATE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_SITE_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_SITE_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_SITE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_SITE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_SITE_SPEED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_SITE_SPEED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_SITE_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_SITE_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_LINK_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_LINK_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_LINK_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_LINK_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_PROFILE_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_PROFILE_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_PROFILE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_PROFILE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_IMGVNF_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_IMGVNF_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_IMGVNF_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_IMGVNF_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_STATUS_NFV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_STATUS_NFV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_PROVEEDOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_PROVEEDOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_IPADDR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_IPADDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_IPGETWAY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_IPGETWAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_MASK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_MASK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_GP_IPDNS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_GP_IPDNS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_GP_IPPOOL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_GP_IPPOOL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_ACCESS_INTERNET");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_ACCESS_INTERNET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_ACCESS_BANDWIDTH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_ACCESS_BANDWIDTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_TLT_IDCUSTOMER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_TLT_IDCUSTOMER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_PROCESSED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_PROCESSED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_SERIAL_ONT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_SERIAL_ONT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_SERIAL_HSU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_SERIAL_HSU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a100_SERIAL_4G");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A100_SERIAL_4G"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
