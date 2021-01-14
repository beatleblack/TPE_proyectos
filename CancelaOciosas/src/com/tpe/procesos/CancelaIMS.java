package com.tpe.procesos;

import java.sql.SQLException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.tpe.consumeWS.ConsultaiInfoDN;
import com.tpe.consumeWS.DatosDNs;

public class CancelaIMS {
	Properties prop=null;
	Logger log=null;
	ConsultaiInfoDN objCancela=null;
	ActualizaBDOciosas objActualiza=null;
	public CancelaIMS() {
	}

	public CancelaIMS(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(CancelaIMS.class);
	}
	
	public void iniciaCancelarIMS(Map<String, DatosDNs> mapDNs) {
		log.debug("Incia el cancelado");
		objCancela=new ConsultaiInfoDN(prop);
		objActualiza=new ActualizaBDOciosas(prop);
		for(Entry<String, DatosDNs>me:mapDNs.entrySet()) {
			if(objCancela.cancelaDNIMS(me.getValue()).equals("0")) {
				objActualiza.insertaDatos(me.getValue());
			}
		}
		try {
			objActualiza.dbConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
