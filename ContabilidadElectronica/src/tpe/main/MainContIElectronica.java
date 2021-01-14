package tpe.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import tpe.procesos.IniciaProcesos;

public class MainContIElectronica {

	static Properties prop;
	public static void main(String args[]) {
		if(args.length<1) {
			System.err.println("No se recibio parametro de entrada");
		}
		prop=new Properties();
		try {
			prop.load(new FileInputStream(new File(args[0])));
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			System.err.println("No se pudo cargar archivo properties");
			System.exit(0);
		}
		new IniciaProcesos(prop).inicia();
	}
}
