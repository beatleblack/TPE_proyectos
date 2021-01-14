package com.tpe.procesos;

import java.util.ArrayList;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.tpe.procesos.entidades.ARCHIVO;
import com.tpe.conexiones.SFTPconexion;

public class IniciaProcesos {

	Properties prop;
	Logger log;
	String flujo;
	ArrayList<ARCHIVO> arrArchivos;
	
	public IniciaProcesos(Properties prop, String flujo) {
		this.prop=prop;
		this.flujo=flujo;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(IniciaProcesos.class);
	}
	
	public void iniciaProceso(String caso) {
		log.info("Inicia el proceso para obtener EDRs de: "+flujo);
		SFTPconexion objJSCH=new SFTPconexion(prop, flujo);
		log.debug("Objeto objJSCH iniciado");
//		objJSCH.listaArchivosSFTP();
		if(caso.equals("1")) {
			arrArchivos=objJSCH.listaArchivosSFTP();
		}else {
			arrArchivos=objJSCH.obtenArchivosGeneral();
		}
		log.debug("Regresaaaa");
		if(arrArchivos==null) {
			log.info("No se recibieron archivos");
		}else {
			log.info("Total de archivos descargados.."+arrArchivos.size());
		}
		log.info("Moviendo archivos a directorio final: ");
//		new MueveArchivos(prop).mueve(arrArchivos,flujo);
		new MueveArchivos(prop).validaDirectorio(flujo);
	}
}
