package com.tpe.procesos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CFU_Main {

	static Properties prop;
	public static void main(String[] args) {
		if(args.length<2) {
			System.err.println("ERROR_1000: No se recibieron los parametros de entrada.");
			System.exit(0);
		}
		prop=new Properties();
		try {
			prop.load(new FileInputStream(new File(args[0])));
			prop.setProperty("FECHA", args[1]);
			new Inicia(prop).proceso();
		} catch (IOException e) {
			System.err.println("No se pudo cargar archivo properties");
			System.exit(0);
		}
	}
}
