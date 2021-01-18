/**
 * AddonQoSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddonQoSResponse  implements java.io.Serializable {
    private org.tempuri.ArrResultAgilController addonQoSResult;

    public AddonQoSResponse() {
    }

    public AddonQoSResponse(
           org.tempuri.ArrResultAgilController addonQoSResult) {
           this.addonQoSResult = addonQoSResult;
    }


    /**
     * Gets the addonQoSResult value for this AddonQoSResponse.
     * 
     * @return addonQoSResult
     */
    public org.tempuri.ArrResultAgilController getAddonQoSResult() {
        return addonQoSResult;
    }


    /**
     * Sets the addonQoSResult value for this AddonQoSResponse.
     * 
     * @param addonQoSResult
     */
    public void setAddonQoSResult(org.tempuri.ArrResultAgilController addonQoSResult) {
        this.addonQoSResult = addonQoSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddonQoSResponse)) return false;
        AddonQoSResponse other = (AddonQoSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addonQoSResult==null && other.getAddonQoSResult()==null) || 
             (this.addonQoSResult!=null &&
              this.addonQoSResult.equals(other.getAddonQoSResult())));
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
        if (getAddonQoSResult() != null) {
            _hashCode += getAddonQoSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddonQoSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddonQoSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addonQoSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddonQoSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "arrResultAgilController"));
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
