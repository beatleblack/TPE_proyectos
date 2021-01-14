package com.tpe.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.totalplay.herramientas.Math;
import com.tpe.procesos.IniciaProcesos;
public class MainObtenEDRs {
	
	static Properties prop;

	public static void main(String[] args) {
		if(args.length<3) {
			System.err.println("ERROR_1000: No se recibieron los parametros de entrada.");
			System.exit(0);
		}
		prop=new Properties();
		try {
			prop.load(new FileInputStream(new File(args[0])));
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			System.err.println("No se pudo cargar archivo properties");
			System.exit(0);
		}
		System.out.println("Valor 1: ["+args[0]+"]");
		System.out.println("Valor 2: ["+args[1]+"]");
		System.out.println("Valor 3: ["+args[2]+"]");
		if(!Math.esEntero(args[2])) {
			System.err.println("El segundo valor debe de ser [1] o [2]");
			System.exit(0);
		}else if(args[2].equals("1") || args[2].equals("2") ){
			new IniciaProcesos(prop, args[1]).iniciaProceso(args[2]);
			System.exit(0);
		}else {
			System.err.println("El segundo valor debe de ser [1] o [2]");
			System.exit(0);
		}
		
	}
}
