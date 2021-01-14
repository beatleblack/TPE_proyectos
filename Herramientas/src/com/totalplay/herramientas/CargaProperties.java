package com.totalplay.herramientas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;
public class CargaProperties {

	Properties prop;
	InputStream inSt;
	
	public Properties getProps(String propFileName){
		try {
			prop=new Properties();
//			inSt=getClass().getClassLoader().getResourceAsStream(propFileName);
			prop.load(new FileInputStream(propFileName));
			return prop;
		} catch(IOException e){
			System.err.println("Error en: "+e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Error en: "+e.getMessage());
			e.printStackTrace();
			e.getCause();
		}
		return prop;
		
	}
	
}
