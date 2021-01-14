package com.tpe.procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.Properties;
import com.totalplay.herramientas.Fechas;
import com.tpe.conexiones.BD_procesos;
import com.tpe.entidades.CDR_BRM;
import com.tpe.entidades.CDR_C5;

public class Inicia {

	Map<String, String> mapKey;
	Map<String, CDR_C5> mapCdr;
	Properties prop;
	BufferedReader bfr;
	File fl;
	PrintWriter pwr;
	FileWriter fwr;
	String strln;
	String strArr[];
	ArrayList<File> arrFl;
	CDR_C5 cdr;
	BD_procesos bdDPL;
	BD_procesos bdSAN;
	Logger log;
	ArrayList<CDR_BRM> cdrBRM;
	CDR_BRM brm;
	
	public Inicia(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(Inicia.class);
	}
	
	public void proceso() {
		bdDPL=new BD_procesos(prop,"DPL");
		bdSAN=new BD_procesos(prop,"SAN");
		cargaLlaves();
		imprimeCDRs();
	}
	
	public void cargaLlaves() {
		mapKey=new HashMap<String, String>();
		try {
			log.debug(prop.getProperty("PATH_FL_CFU") +"CFU_"+prop.getProperty("FECHA")+".data");
			bfr=new BufferedReader(new FileReader(new File(prop.getProperty("PATH_FL_CFU") +"CFU_"+prop.getProperty("FECHA")+".data")));
			while((strln=bfr.readLine())!=null) {
				mapKey.put(strln, strln);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void imprimeCDRs() {
		log.debug(prop.getProperty("PATH_ENTRADA")+prop.getProperty("FECHA"));
		arrFl=new ListaDirectorio().listaArchivos(prop.getProperty("PATH_ENTRADA")+prop.getProperty("FECHA")+"/");
		mapCdr=new HashMap<String, CDR_C5>();
		String llave;
		try {
			fwr=new FileWriter(prop.getProperty("PATH_ENTRADA")+prop.getProperty("FECHA")+"_FL_tmp.dat");
			pwr=new PrintWriter(fwr);
			for(File flTmp : arrFl) {
				bfr=new BufferedReader(new FileReader(flTmp));
				while((strln=bfr.readLine())!=null) {
					strArr=strln.split("\\|");
					if(mapKey.containsKey(strArr[19]) && strArr[0].equals("BYE")) {
						cdr=new CDR_C5();
						pwr.print(strArr[0]);pwr.print(";");
						pwr.print(strArr[2]);pwr.print(";");
						pwr.print(strArr[3]);pwr.print(";");
						pwr.print(strArr[2].substring(7));pwr.print(";");
						pwr.print(strArr[3].substring(7));pwr.print(";");
						pwr.print(strArr[5]);pwr.print(";");
						pwr.print(strArr[6]);pwr.print(";");
						pwr.print(strArr[5].replace(":", "").replace("-", "").replace(" ", ""));pwr.print(";");
						pwr.print(strArr[6].replace(":", "").replace("-", "").replace(" ", ""));pwr.print(";");
						pwr.print(strArr[9]);pwr.print(";");
						pwr.print(strArr[10]);pwr.print(";");
						pwr.print(strArr[11]);pwr.print(";");
						pwr.print(strArr[12]);pwr.print(";");
						pwr.print(strArr[13]);pwr.print(";");
						pwr.print(strArr[16]);pwr.print(";");
						pwr.print(strArr[17]);pwr.print(";");
						pwr.print(strArr[19]);pwr.print(";");
						pwr.print(strArr[20]);pwr.print(";");
						pwr.print(strArr[21]);pwr.print(";");
						pwr.println();
						cdr.setSIP(strArr[0]);
						cdr.setLIST_CALLING_PARTY_ADDRESS(strArr[2].substring(7));
						cdr.setCALLED_PARTY_ADDRESS(strArr[3].substring(7));
						cdr.setSERVICE_DELIVER_START_TIME_STAMP(strArr[5].replace(":", "").replace("-", "").replace(" ", ""));
						cdr.setSERVICE_DELIVER_END_TIME_STAMP(strArr[6].replace(":", "").replace("-", "").replace(" ", ""));
						cdr.setCAUSE_FOR_RECORD_CLOSING(Integer.parseInt(strArr[9]));
						cdr.setDURATION(Integer.parseInt(strArr[10]));
						cdr.setDIALLED_PARTY_ADDRESS(strArr[11]);
						cdr.setRINGING_DURATION(strArr[12]);
						cdr.setACCOUNTING_RECORD_TYPE(Integer.parseInt(strArr[16]));
						cdr.setROLE_NODE(Integer.parseInt(strArr[17]));
						cdr.setIMS_CHARGING_INDENTIFIER(strArr[19]);
						cdr.setDIVERSION_REASON(Integer.parseInt(strArr[20]));
						cdr.setUSER_AGENT_VALUE(strArr[21]);
						cdr.setESTATUS(0);
						llave=cdr.getIMS_CHARGING_INDENTIFIER()+cdr.getLIST_CALLING_PARTY_ADDRESS()+cdr.getSERVICE_DELIVER_END_TIME_STAMP();
						if(mapCdr.containsKey(llave)) {
							if(!mapCdr.get(llave).getCALLED_PARTY_ADDRESS().equals(cdr.getCALLED_PARTY_ADDRESS()) && mapCdr.get(llave).getESTATUS()==0) {
								if(mapCdr.get(llave).getROLE_NODE()==1 && cdr.getROLE_NODE()==0) {
									cdr.setLIST_CALLING_PARTY_ADDRESS(mapCdr.get(llave).getCALLED_PARTY_ADDRESS());
									cdr.setESTATUS(1);
									mapCdr.put(llave, cdr);
								}else if(mapCdr.get(llave).getROLE_NODE()==0 && cdr.getROLE_NODE()==1) {
									cdr.setLIST_CALLING_PARTY_ADDRESS(cdr.getCALLED_PARTY_ADDRESS());
									cdr.setCALLED_PARTY_ADDRESS(mapCdr.get(llave).getCALLED_PARTY_ADDRESS());
									cdr.setESTATUS(1);
									mapCdr.put(llave, cdr);
								}
							}
						}else {
							mapCdr.put(llave, cdr);
						}
					}
				}
				bfr.close();
			}
			try {
				pwr.close();
				fwr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fwr=new FileWriter(prop.getProperty("PATH_BRM")+"TMP_"+new Fechas(prop).getToday("yyyyMMddHHmmss")+".txt");
			pwr=new PrintWriter(fwr);
			System.out.println("Imprimiendo archivo final");
			cdrBRM=new ArrayList<CDR_BRM>();
			log.debug("Tama�o mapa CDRs: "+mapCdr.size());
			for(Entry<String, CDR_C5> me : mapCdr.entrySet()) {
				if(me.getValue().getESTATUS()==1 && me.getValue().getCALLED_PARTY_ADDRESS().length()>9 && me.getValue().getDURATION()>4) {
					brm=new CDR_BRM();
					String mod=bdSAN.consultaModalidad(me.getValue().getCALLED_PARTY_ADDRESS());
					String cta=bdDPL.consultaCuenta(me.getValue().getLIST_CALLING_PARTY_ADDRESS());
					pwr.print(me.getValue().getSIP());pwr.print(";");
					pwr.print(me.getValue().getLIST_CALLING_PARTY_ADDRESS());pwr.print(";");
					pwr.print(me.getValue().getCALLED_PARTY_ADDRESS());pwr.print(";");
					pwr.print(me.getValue().getSERVICE_DELIVER_START_TIME_STAMP());pwr.print(";");
					pwr.print(me.getValue().getSERVICE_DELIVER_END_TIME_STAMP());pwr.print(";");
					pwr.print(me.getValue().getDURATION());pwr.print(";");
					pwr.print(me.getValue().getIMS_CHARGING_INDENTIFIER());pwr.print(";");
					pwr.print(me.getValue().getESTATUS());pwr.print(";");
					pwr.print(mod);pwr.print(";");
					pwr.print(cta);
					pwr.println();
					
					brm.setTipodeCDR(cta);
					brm.setCDRCorrelacionado("N");
					brm.setNumeroOrigen(me.getValue().getLIST_CALLING_PARTY_ADDRESS());
					brm.setNumeroDest(me.getValue().getCALLED_PARTY_ADDRESS());
					brm.setNumeroDestFormato(me.getValue().getCALLED_PARTY_ADDRESS());
					brm.setFechainicio(me.getValue().getSERVICE_DELIVER_START_TIME_STAMP().substring(2,8));
					brm.setFechafin(me.getValue().getSERVICE_DELIVER_END_TIME_STAMP().substring(2,8));
					brm.setHoradeinicio(me.getValue().getSERVICE_DELIVER_START_TIME_STAMP().substring(8,14));
					brm.setHorafin(me.getValue().getSERVICE_DELIVER_END_TIME_STAMP().substring(8,14));
					brm.setDuracion(me.getValue().getDURATION());
					brm.setRuouteOut("");
					brm.setRuouteIn("");
					brm.setRuouteOutNum("");
					brm.setRuouteInNum("");
					brm.setNir("");
					brm.setIdd("");
					brm.setIdo("");
					brm.setAsl("");
					brm.setModalidad(mod);
					brm.setCentralOrigen("");
					brm.setRedTotalplay("");
					brm.setEsPortado("");
					brm.setPoblacion(" ");
					brm.setTipodeTrafico("");
					brm.setTipodeTrafico("LOC");
					brm.setNumeroC("");
					brm.setSentidoLlamada("S");
					brm.setUtc(prop.getProperty("UTC"));
					brm.setClaveTelefonica("");
					brm.setSession_id("");
					cdrBRM.add(brm);
					
				}
			}new PrintCDR_BRM().printCDR(prop.getProperty("PATH_BRM")+"BBRM_20"+prop.getProperty("FECHA")+new Fechas(prop).getToday("HHmmssSSS")+"CFU.txt", cdrBRM);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			try {
				pwr.close();
				fwr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
