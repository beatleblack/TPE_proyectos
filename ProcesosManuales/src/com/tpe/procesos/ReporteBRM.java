package com.tpe.procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReporteBRM {

	public static void main(String args[]) {
		try {
			BufferedReader bfr=new BufferedReader(new FileReader(new File("Z:/Data/TPE/Procesos/Conteo202008.txt")));
			String strLn;
			String strArr[];
			long segundos;
			long minutos;
			long tmpLlamadas;
			long tmpSegundos;
			long tmpMinutos;
			String llave;
			Map<String, Contadores> mapReporte=new HashMap<String, Contadores>();
			Contadores cont;
			while((strLn=bfr.readLine())!=null) {
				strArr=strLn.split(";");
				llave=strArr[1]+";"+strArr[0]; 
				segundos=Integer.parseInt(strArr[2]);
				minutos=(segundos/60)+1;
				cont=new Contadores();
				cont.setLlamadas(1);
				cont.setSegundos(segundos);
				cont.setMinutos(minutos);
				if(mapReporte.containsKey(llave)) {
					tmpLlamadas=mapReporte.get(llave).getLlamadas();
					tmpSegundos=mapReporte.get(llave).getSegundos();
					tmpMinutos=mapReporte.get(llave).getMinutos();
					cont.setLlamadas(tmpLlamadas+1);
					cont.setSegundos(tmpSegundos+segundos);
					cont.setMinutos(tmpMinutos+minutos);
					mapReporte.put(llave, cont);
				}else {
					mapReporte.put(llave,cont);
				}
				
			}
			System.out.println("Reporte");
			for(Entry<String, Contadores> me : mapReporte.entrySet()) {
				System.out.print(me.getKey());
				System.out.print(";");
				System.out.print(me.getValue().getLlamadas()+";");
				System.out.print(me.getValue().getSegundos()+";");
				System.out.print(me.getValue().getMinutos());
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
