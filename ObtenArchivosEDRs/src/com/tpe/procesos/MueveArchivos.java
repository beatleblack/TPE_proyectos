package com.tpe.procesos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.tpe.conexiones.DB_procesos;
import com.tpe.procesos.entidades.ARCHIVO;


public class MueveArchivos {
	
	Properties prop;
	Logger log;
	File flSource;
	File flDest;
	File dir;
	File fl;
	String[] ficheros;
	ARCHIVO archivo;
	DB_procesos objBD;
	ArrayList<ARCHIVO> directorio;
	
	public MueveArchivos(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(MueveArchivos.class);
	}
	
	public void mueve(ArrayList<ARCHIVO> arrArchivos,String flujo) {
		objBD=new DB_procesos(prop);
		for(int i=0;i<arrArchivos.size();i++) {
			archivo=arrArchivos.get(i);
			log.debug(archivo.getFl().getName());
			flSource=archivo.getFl();
			flDest=new File(prop.getProperty(flujo+"_RUTA_FIN")+archivo.getFl().getName());
			archivo.setIdEstatus(2);
			try {
				FileUtils.moveFile(flSource, flDest);
				objBD.actualizaRegistro(archivo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error("Error al mover archivo a ruta final: "+e.getMessage());
			}
		}
		
	}
	
	public void validaDirectorio(String flujo) {
		dir=new File(prop.getProperty(flujo+"_RUTA_DESCARGA"));
		ficheros=dir.list();
		if(ficheros==null) {
			log.info("No existen archivos por mover a la ruta final.");
		}else {
			directorio=new ArrayList<ARCHIVO>();
			for(int i=0;i<ficheros.length;i++) {
				archivo=new ARCHIVO();
				fl=new File(prop.getProperty(flujo+"_RUTA_DESCARGA")+ficheros[i]);
				if(fl.isDirectory()) {
					log.info("Omitiendo directorio: "+fl.getName());
				}else {
					archivo.setIdEstatus(2);
					archivo.setFl(fl);
					directorio.add(archivo);
					log.debug(archivo.getFl().getAbsolutePath());
					log.debug(archivo.getIdEstatus());
				}
			}
			mueve(directorio, flujo);
		}
	}
}
