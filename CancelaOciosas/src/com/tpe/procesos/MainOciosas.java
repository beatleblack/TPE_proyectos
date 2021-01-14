package com.tpe.procesos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.tpe.consumeWS.ArrayGetServices;

public class MainOciosas {

	static Properties prop=null;
	static Logger log;
	static Map<String, String> mapDNsDPL=null;
	static Map<String, String> mapDNsOciosas=null;
	static Map<String, ConsultaBRM> mapDNsBRM=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1) {
			System.err.println("No se recibio parametro de entrada.");
			System.exit(0);
		}
		prop=new Properties();
		File cofigProp=new File(args[0]);
		try {
			prop.load(new FileInputStream(cofigProp));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(MainOciosas.class);
//		new ConsultaDNs().iniciaProceso(prop);
//		mapDNsBRM =new ConsultaBRM(prop).obtenClientesBRM();
//		log.info("Clientes en consulta de BRM: "+mapDNsBRM.size());
//		mapDNsOciosas=new ConsultaDNs(prop).consultaOciosas();
//		log.info("DNs actualizados en base de ociosas: "+mapDNsOciosas.size());
		new CancelaIMS(prop).iniciaCancelarIMS(new ArrayGetServices(prop).proceso());
//		mapDNsDPL=new ConsultaDNs(prop).consultaDNsDPL();
//		log.info("DNs con llamadas: "+mapDNsDPL.size());
	}
}
