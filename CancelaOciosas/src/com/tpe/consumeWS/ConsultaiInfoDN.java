package com.tpe.consumeWS;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Properties;

import javax.xml.rpc.Service;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.BPELGetInfoBRMBindingStub;
import com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.holders.ProcessResponseDatosClienteArrayHolder;
import com.oracle.xmlns.BRM.GetInfoBRM.BPELGetInfoBRM.holders.ProcessResponseResponseHolder;
import com.oracle.xmlns.SalesForce11g.GetService.GetService.GetServiceBindingStub;
import com.oracle.xmlns.SalesForce11g.GetService.GetService.ProcessLogin;
import com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseServicesArrayHolder;
import com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseVigenciaHolder;
import com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.CancelIMSHuaweiBindingStub;
import com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns;
import com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.holders.ProcessResponseDnsErrorArrayHolder;

public class ConsultaiInfoDN {
	
	ProcessResponseResponseHolder response=new ProcessResponseResponseHolder();
	ProcessResponseDatosClienteArrayHolder datos=new ProcessResponseDatosClienteArrayHolder();
	BPELGetInfoBRMBindingStub consultaBRM=null;
	GetServiceBindingStub consultaServicios=null;
	ProcessLogin login=null;
	ProcessAnalogoDns analogoDN=null;
	ProcessResponseDnsErrorArrayHolder dnsError=null;
	StringHolder idResult=new StringHolder();
	StringHolder result=new StringHolder();
	StringHolder resultDesc=new StringHolder();
	com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessLogin loginCancel
	=new com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessLogin();
	URL endpoint =null;
	Service service=null;
	Properties prop=null;
	Logger log=null;
	
	public ConsultaiInfoDN() {
		// TODO Auto-generated constructor stub
	}
	
	public ConsultaiInfoDN(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(ConsultaiInfoDN.class);
	}
	
	public String consultaBRMbpel(String dn) {
		try {
			String bpelgetinfobrm_client_ep_address = prop.getProperty("URL_GETINFOBRM");
			endpoint= new java.net.URL(bpelgetinfobrm_client_ep_address);
			consultaBRM = new BPELGetInfoBRMBindingStub(endpoint,service);
			consultaBRM.process("", "", dn, "", "", "", "", "", "", "", response, datos);
			if(response.value.getCode().trim().equals("0") && datos.value[0].getStatusCuenta().equals("10100")) {
				return datos.value[0].getAccountNo();
			}else {
				return null;
			}
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage()+"\t"+e.getCause());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage()+"\t"+e.getCause());

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage()+"\t"+e.getCause());

		}				
		return null;
	}
	

	public ProcessResponseServicesArrayHolder consultaServicios(String cuenta) {
		String bpel_getService =prop.getProperty("URL_GETSERVICE");
		login=new ProcessLogin();
		StringHolder account=new StringHolder();
		StringHolder creditLimitTV =new  StringHolder();
		StringHolder creditLimitTelephony=new  StringHolder();
		ProcessResponseVigenciaHolder vigencia=new ProcessResponseVigenciaHolder();
		ProcessResponseServicesArrayHolder services=new ProcessResponseServicesArrayHolder();
		try {
			URL endpoint= new URL(bpel_getService);
			consultaServicios=new GetServiceBindingStub(endpoint, service);
			login.setUserId("365728");
			login.setIp("");
			login.setPassword("OperacionesTP159$");
			consultaServicios.process(login, cuenta, 0, idResult, result, resultDesc, account, 
									  creditLimitTV, creditLimitTelephony,vigencia , services);
			
			return services;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage());
		}
		return null;
	}
	
	
	public String cancelaDNIMS(DatosDNs objDn) {
		log.debug("Inciando WS CANCELA");
		loginCancel.setUSER(prop.getProperty("USER_CANCELIMS"));
		loginCancel.setPASSWORD(prop.getProperty("PASS_CANCELIMS"));
		analogoDN =new ProcessAnalogoDns(objDn.getDn());
		com.oracle.xmlns.IMS.CancelIMSHuawei.CancelIMSHuawei.ProcessAnalogoDns[] analogo= {analogoDN};
		String urlCancelaIMS=prop.getProperty("URL_CANCELIMS");
		dnsError=new ProcessResponseDnsErrorArrayHolder();
		log.debug(objDn.getDn()+";"+objDn.getNumeroSerie()+";"+objDn.getCuenta());
		try {
			URL endpoint=new URL(urlCancelaIMS);
			CancelIMSHuaweiBindingStub cancelaIMS=new CancelIMSHuaweiBindingStub(endpoint, service);
			cancelaIMS.process(loginCancel, objDn.getCuenta(), "4", objDn.getNumeroSerie(), null, analogo, 1, result, idResult, resultDesc, dnsError);
			log.debug("Descipcion de la operacion: "+resultDesc.value);
			return result.value;
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Error en: "+e.getMessage());
		}
		return "1";
	}
	
}
