package tpe.main;

import java.util.Properties;

import tpe.procesos.CreaReporte;

public class MainAAA_reporte {

	static Properties
	public static void main(String args[]) {
		if(args.length<1) {
			System.err.println("No se recibió parametro de entrada.");
			System.exit(0);
		}
		new CreaReporte().iniciaProcesos();
	}
}
