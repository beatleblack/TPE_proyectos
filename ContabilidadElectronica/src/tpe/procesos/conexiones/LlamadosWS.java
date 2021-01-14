package tpe.procesos.conexiones;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Properties;

import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;
import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import mc_style.functions.soap.sap.document.sap_com.Zbn_zffi_ce_act_uuid_ingStub;
import mc_style.functions.soap.sap.document.sap_com.ZefiCeDoctoFiscalIng;
import mc_style.functions.soap.sap.document.sap_com.ZefiCeDoctoRelIng;
import mc_style.functions.soap.sap.document.sap_com.ZefiCeDoctoIng;

public class LlamadosWS {
	ZefiCeDoctoFiscalIng []doctofiscaling=new ZefiCeDoctoFiscalIng[1];
	ZefiCeDoctoFiscalIng objFiscaling;
	ZefiCeDoctoRelIng []doctoreling=new ZefiCeDoctoRelIng[1];
	ZefiCeDoctoRelIng objToreling;
	ZefiCeDoctoIng doctoing;
	StringHolder exMensaje;
	IntHolder exRetorno;
	StringBuilder stbXML;
	Zbn_zffi_ce_act_uuid_ingStub objWs;
	URL url;
	Properties prop;
	Logger log;
	
	public LlamadosWS(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(LlamadosWS.class);
	}
	
	public StringHolder callWSingresos(ZefiCeDoctoFiscalIng Fiscaling,ZefiCeDoctoRelIng Toreling,ZefiCeDoctoIng doctoing,String respuesta) {
		log.debug("Consumiendo WS");
		this.objFiscaling=Fiscaling;
		this.objToreling=Toreling;
		this.doctoing=doctoing;
		stbXML=new StringBuilder();
		log.info("XML enviado...");
		printImDoctoFiscal();
		log.info(".....\n"+stbXML.toString());
		exMensaje=new StringHolder();
		exRetorno=new IntHolder();
		try {
			
			log.debug(prop.getProperty("URL_INGRESOS"));
			url=new URL(prop.getProperty("URL_INGRESOS"));
			objWs=new Zbn_zffi_ce_act_uuid_ingStub(url, null);
			doctofiscaling[0]= Fiscaling;
			doctoreling[0]=Toreling;
			objWs.setUsername(prop.getProperty("USER_WS"));
			objWs.setPassword(prop.getProperty("PASSWORD_WS"));
			objWs.zffiCeActUuidIng(doctofiscaling, doctoreling, doctoing, exMensaje, exRetorno);
			log.info("<ExMensaje>"+exMensaje.value+"</ExMensaje>");
			return exMensaje;
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	public void printImDoctoFiscal() {
		stbXML.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:sap-com:document:sap:soap:functions:mc-style\">\r\n");
		stbXML.append("\t<soapenv:Header/>\r\n");
		stbXML.append("\t<soapenv:Body>\r\n");
		stbXML.append("\t\t<urn:ZffiCeActUuidIng>\r\n");
		stbXML.append("\t\t\t <ImDoctofiscal>\r\n" );
		stbXML.append("\t\t\t\t<item>\r\n");
		stbXML.append("\t\t\t\t\t<Clasiffiscal>"+objFiscaling.getClasiffiscal()+"</Clasiffiscal>\n");
		stbXML.append("\t\t\t\t\t<Nocliente>"+objFiscaling.getNocliente()+"</Nocliente>\n");
		stbXML.append("\t\t\t\t\t<CtaMayor>"+objFiscaling.getCtaMayor()+"</CtaMayor>\n");
		stbXML.append("\t\t\t\t\t<RfcEmisor>"+objFiscaling.getRfcEmisor()+"</RfcEmisor>\n");
		stbXML.append("\t\t\t\t\t<RfcReceptor>"+objFiscaling.getRfcReceptor()+"</RfcReceptor>\n");
		stbXML.append("\t\t\t\t\t<Compfiscal>"+objFiscaling.getCompfiscal()+"</Compfiscal>\n");
		stbXML.append("\t\t\t\t\t<Compfiscalasoc>"+objFiscaling.getCompfiscalasoc()+"</Compfiscalasoc>\n");
		stbXML.append("\t\t\t\t\t<Fechacompfiscal>"+objFiscaling.getFechacompfiscal()+"</Fechacompfiscal>\n");
		stbXML.append("\t\t\t\t\t<Totalcompfiscal>"+objFiscaling.getTotalcompfiscal()+"</Totalcompfiscal>\n");
		stbXML.append("\t\t\t\t\t<Subtotalcompfiscal>"+objFiscaling.getSubtotalcompfiscal()+"</Subtotalcompfiscal>\n");
		stbXML.append("\t\t\t\t\t<Tipocompfiscal>"+objFiscaling.getTipocompfiscal()+"</Tipocompfiscal>\n");
		stbXML.append("\t\t\t\t\t<Uuid>"+objFiscaling.getUuid()+"</Uuid>\n");
		stbXML.append("\t\t\t\t\t<Cfdserie>"+objFiscaling.getCfdserie()+"</Cfdserie>\n");
		stbXML.append("\t\t\t\t\t<Cfdnumfolio>"+objFiscaling.getCfdnumfolio()+"</Cfdnumfolio>\n");
		stbXML.append("\t\t\t\t\t<Taxid>"+objFiscaling.getTaxid()+"</Taxid>\n");
		stbXML.append("\t\t\t\t\t<Pedimento>"+objFiscaling.getPedimento()+"</Pedimento>\n");
		stbXML.append("\t\t\t\t\t<Cove>"+objFiscaling.getCove()+"</Cove>\n");
		stbXML.append("\t\t\t\t\t<Contrato>"+objFiscaling.getContrato()+"</Contrato>\n");
		stbXML.append("\t\t\t\t\t<Gendoctofiscal1>"+objFiscaling.getGendoctofiscal1()+"</Gendoctofiscal1>\n");
		stbXML.append("\t\t\t\t\t<Gendoctofiscal2>"+objFiscaling.getGendoctofiscal2()+"</Gendoctofiscal2>\n");
		stbXML.append("\t\t\t\t\t<Gendoctofiscal3>"+objFiscaling.getGendoctofiscal3()+"</Gendoctofiscal3>\n");
		stbXML.append("\t\t\t\t\t<Gendoctofiscal4>"+objFiscaling.getGendoctofiscal4()+"</Gendoctofiscal4>\n");
		stbXML.append("\t\t\t\t\t<Gendoctofiscal5>"+objFiscaling.getGendoctofiscal5()+"</Gendoctofiscal5>\n");
		stbXML.append("\t\t\t\t\t<Gendecdoctofiscal1>"+objFiscaling.getGendecdoctofiscal1()+"</Gendecdoctofiscal1>\n");
		stbXML.append("\t\t\t\t\t<Gendecdoctofiscal2>"+objFiscaling.getGendecdoctofiscal2()+"</Gendecdoctofiscal2>\n");
		stbXML.append("\t\t\t\t</item>\r\n");
		stbXML.append("\t\t\t</ImDoctofiscal>\r\n" );
		stbXML.append("\t\t\t<ImDoctorel>\r\n" );
		stbXML.append("\t\t\t\t<item>\r\n");
		stbXML.append("\t\t\t\t\t<Ejerciciodoctorel>"+objToreling.getEjerciciodoctorel()+"</Ejerciciodoctorel>\n");
		stbXML.append("\t\t\t\t\t<Sociedaddoctorel>"+objToreling.getSociedaddoctorel()+"</Sociedaddoctorel>\n");
		stbXML.append("\t\t\t\t\t<Doctosapdoctorel>"+objToreling.getDoctosapdoctorel()+"</Doctosapdoctorel>\n");
		stbXML.append("\t\t\t\t\t<Foliosatelite>"+objToreling.getFoliosatelite()+"</Foliosatelite>\n");
		stbXML.append("\t\t\t\t\t<Totaldoctorel>"+objToreling.getTotaldoctorel()+"</Totaldoctorel>\n");
		stbXML.append("\t\t\t\t\t<Tipodoctorel>"+objToreling.getTipodoctorel()+"</Tipodoctorel>\n");
		stbXML.append("\t\t\t\t\t<Gendoctorel1>"+objToreling.getGendoctorel1()+"</Gendoctorel1>\n");
		stbXML.append("\t\t\t\t\t<Gendoctorel2>"+objToreling.getGendoctorel2()+"</Gendoctorel2>\n");
		stbXML.append("\t\t\t\t\t<Gendoctorel3>"+objToreling.getGendoctorel3()+"</Gendoctorel3>\n");
		stbXML.append("\t\t\t\t</item>\r\n");
		stbXML.append("\t\t\t</ImDoctorel>\r\n" );
		stbXML.append("\t\t\t<ImDoctosap>\r\n" );
		stbXML.append("\t\t\t\t\t<Ejerciciocxc>"+doctoing.getEjerciciocxc()+"</Ejerciciocxc>\n");
		stbXML.append("\t\t\t\t\t<Sociedadcxc>"+doctoing.getSociedadcxc()+"</Sociedadcxc>\n");
		stbXML.append("\t\t\t\t\t<Doctosapcxc>"+doctoing.getDoctosapcxc()+"</Doctosapcxc>\n");
		stbXML.append("\t\t\t\t\t<Satelite>"+doctoing.getSatelite()+"</Satelite>\n");
		stbXML.append("\t\t\t\t\t<Moneda>"+doctoing.getMoneda()+"</Moneda>\n");
		stbXML.append("\t\t\t\t\t<Tipocambio>"+doctoing.getTipocambio()+"</Tipocambio>\n");
		stbXML.append("\t\t\t</ImDoctosap>\r\n" );
		stbXML.append("\t\t</urn:ZffiCeActUuidIng>\r\n");
		stbXML.append("\t</soapenv:Body>\r\n");
		stbXML.append("\t</soapenv:Header/>\r\n");
	}
}
