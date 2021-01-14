package com.tpe.consumeWS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.oracle.xmlns.SalesForce11g.GetService.GetService.holders.ProcessResponseServicesArrayHolder;
import com.totalplay.herramientas.Cadenas;
import com.tpe.consumeWS.ConsultaiInfoDN;

public class ArrayGetServices {

	Map<String, DatosDNs> mapDatosDNs=null;
	ArrayList<String> ArrDns=null;
	ProcessResponseServicesArrayHolder arrGetServices=null;
	private BufferedReader bfr;
	Properties prop=null;
	Logger log=null;
	DatosDNs objDn;
	
	public  ArrayGetServices() {
		
	}
	
	public  ArrayGetServices(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(ArrayGetServices.class);
	}
	
	public String getSerialNumber(String cuenta) {
		log.debug("Consultando NumeroSerie");
		arrGetServices=new ConsultaiInfoDN(prop).consultaServicios(cuenta);
		try {
			for(int i=0;i<arrGetServices.value.length;i++) {
				if(arrGetServices.value[i].getService().equalsIgnoreCase("IP")) {
					if(arrGetServices.value[i].getSerialNumber().startsWith("48575443") 
							|| arrGetServices.value[i].getSerialNumber().startsWith("ZTEG")) {
						return arrGetServices.value[i].getSerialNumber();
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage());
			return null;
			
		}
		return null;	
	}
	
	public static void main(String args[]) {
		new ArrayGetServices().proceso();
	}
	
	public Map<String, DatosDNs> proceso() {
		log.info("Iniciando el llenado de mapa con valores del DN");
		String strLn;
		mapDatosDNs=new HashMap<>();
		String strArr[]=null;
		int count=0;
		try {
			bfr = new BufferedReader(new FileReader(new File(prop.getProperty("ARCHIVO_LINEAS"))));
			while((strLn=bfr.readLine())!=null){
				objDn=new DatosDNs();
				count++;
				if(count%100==0) {
					System.out.println("Total de lineas leidas: "+count);
				}
				strArr=strLn.split(";");
				objDn.setCuenta(strArr[1]);
				objDn.setTipo(strArr[2]);
				objDn.setDn(strArr[0]);
				objDn.setNumeroSerie(getSerialNumber(strArr[1]));
				if(new Cadenas().isNull(objDn.getNumeroSerie())) {
					log.warn("Omitiendo DN: ["+objDn.getDn()+":"+objDn.getCuenta()+":"+objDn.getNumeroSerie()+":"+objDn.getTipo()+"].");
				}else {
					mapDatosDNs.put(strArr[0], objDn);
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapDatosDNs;
	}
	
	public boolean isObjectNull(ProcessResponseServicesArrayHolder obj) {
		if(obj==null) {
			return true;
		}else {
			return false;
		}
	}
}
