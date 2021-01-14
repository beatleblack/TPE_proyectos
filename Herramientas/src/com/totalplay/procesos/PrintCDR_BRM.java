package com.totalplay.procesos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.totalplay.entidades.CDR_BRM;

public class PrintCDR_BRM {

	private FileWriter fwr=null;
	private PrintWriter pwr=null;
	Logger log;
	
	public PrintCDR_BRM(String flLog){
		PropertyConfigurator.configure(flLog);
		log=Logger.getLogger(PrintCDR_BRM.class);
	}
	
	public void printCDR(String rutaArchivo,ArrayList<CDR_BRM> arrCdr) {
		System.out.println(arrCdr.size());
	try {
		fwr=new FileWriter(rutaArchivo);
		pwr=new PrintWriter(fwr);
		System.out.println("Imprimiendo archivo: "+rutaArchivo);
		for(int i=0;i<arrCdr.size();i++) {
			pwr.print(arrCdr.get(i).getTipodeCDR());
			pwr.print("N");
			pwr.print(String.format("%10s",arrCdr.get(i).getNumeroOrigen()));
			pwr.print(String.format("%24s",arrCdr.get(i).getNumeroDest()));
			pwr.print(String.format("%25s",arrCdr.get(i).getNumeroDest()));
			pwr.print(arrCdr.get(i).getFechainicio());
			pwr.print(arrCdr.get(i).getFechafin());
			pwr.print(arrCdr.get(i).getHoradeinicio());
			pwr.print(arrCdr.get(i).getHorafin());
			pwr.print(String.format("%6s",arrCdr.get(i).getDuracion()));
			pwr.print(String.format("%16s", arrCdr.get(i).getRuouteOut()));
			pwr.print(String.format("%16s", arrCdr.get(i).getRuouteIn()));
			pwr.print(String.format("%5s", arrCdr.get(i).getRuouteOutNum()).replace(" ", "0"));
			pwr.print(String.format("%5s", arrCdr.get(i).getRuouteInNum()).replace(" ", "0"));
			pwr.print(String.format("%3s",arrCdr.get(i).getNir()));
			pwr.print(String.format("%3s",arrCdr.get(i).getIdd()));
			pwr.print(String.format("%3s",arrCdr.get(i).getIdo()));
			pwr.print(String.format("%3s",arrCdr.get(i).getAsl()));
			pwr.print(String.format("%4s",arrCdr.get(i).getModalidad()));
			pwr.print(String.format("%10s",arrCdr.get(i).getCentralOrigen()));
			pwr.print(String.format("%2s",arrCdr.get(i).getRedTotalplay()));
			pwr.print(String.format("%1s",arrCdr.get(i).getEsPortado()));
			pwr.print(String.format("%50s",arrCdr.get(i).getPoblacion()));
			pwr.print(String.format("%3s",arrCdr.get(i).getTipodeTrafico()));
			pwr.print(String.format("%24s",arrCdr.get(i).getNumeroC()));
			pwr.print(String.format("%1s",arrCdr.get(i).getSentidoLlamada()));
			pwr.print(String.format("%5s",arrCdr.get(i).getUtc()));
			pwr.print(String.format("%6s",arrCdr.get(i).getClaveTelefonica()));
			pwr.print(String.format("%50s", arrCdr.get(i).getPoblacion()));
			pwr.println();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		log.error("ERROR:5001 No se pudo generar archivo: "+e.getMessage());
	}finally {
		try {
			fwr.close();
			pwr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("ERROR:5002 No se pudo cerrar archivo: "+e.getMessage());
		}
	}
	}
}
