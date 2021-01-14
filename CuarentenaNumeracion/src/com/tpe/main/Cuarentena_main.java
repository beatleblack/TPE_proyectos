package com.tpe.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.tpe.procesos.Procesos;

/**
 * 
 * @author Samuel Villalva
 * Version 1.0 2020-12-08
 *
 */
public class Cuarentena_main {
	
	static Properties prop;

	public static void main(String[] args) {
		if(args.length<1) {
			System.err.println("No se recibio parametro de entrada.");
			System.exit(0);
		}
		File fl=new File(args[0]);
		if(!fl.exists()) {
			System.err.println("Archivo properties no existe");
			System.exit(0);
		}
		prop=new Properties();
		try {
			prop.load(new FileInputStream(fl));
			new Procesos(prop).inicia();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
