package tpe.procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat;
import tpe.entidades.DATOS;

public class CreaReporte {

	BufferedReader bfr=null;
	Map<String, DATOS> mapDatosReporte;
	String strLn;
	String strArr[];
	long count;
	DATOS datos;
	PrintWriter pwr;
	FileWriter fwr;
	
	
	public void iniciaProcesos() {
		cargaDatos();
		generaReporte();
	}
	
	public void generaReporte() {
		System.out.println("Generando archivo");
		double prom_descarga;
		double prom_vdescarga;
		try {
			fwr=new FileWriter("Z:/Data/TPE/AAA/Reportes/20200920/ReporteAAA_BRM_20200920_.txt");
			pwr=new PrintWriter(fwr);
			pwr.println("AAC_PACKAGE|ACCOUNT_NO|NAI|PRODUCTID|TIMELENGTH_SUM|INPUTBYTES_SUM|OUTPUTBYTES_SUM|MB_SUBIDOS|MB_DESCARGADOS|AVG(MB_DESCARGADOS)|AVG(MB/S)");
			for(Entry<String, DATOS> me : mapDatosReporte.entrySet()) {
				prom_descarga=(me.getValue().getMB_DESCARGADOS()/me.getValue().getCOUNT());
				prom_vdescarga=(me.getValue().getMB_DESCARGADOS()/me.getValue().getTIMELENGTH_SUM());
				datos=me.getValue();
				datos.setPROM_DOWNLOAD(prom_descarga);
				datos.setPROM_MBS(prom_vdescarga);
				pwr.print(datos.getAAC_PACKAGE());pwr.print("|");
//				pwr.print(datos.getAAC_SOURCE());pwr.print("|");
//				pwr.print(datos.getAAC_VENDOR());pwr.print("|");
				pwr.print(datos.getACCOUNT_NO());pwr.print("|");
				pwr.print(datos.getNAI());pwr.print("|");
//				pwr.print(datos.getNAS_PORT_ID());pwr.print("|");
				pwr.print(datos.getPRODUCTID());pwr.print("|");
//				pwr.print(datos.getPROMEDIO());pwr.print("|");
				pwr.print(datos.getTIMELENGTH_SUM());pwr.print("|");
				pwr.print(datos.getINPUTBYTES_SUM());pwr.print("|");
				pwr.print(datos.getOUTPUTBYTES_SUM());pwr.print("|");
				pwr.print(getTwoDecimals(datos.getMB_SUBIDOS()+""));pwr.print("|");
				pwr.print(getTwoDecimals(datos.getMB_DESCARGADOS()+""));pwr.print("|");
				pwr.print(getTwoDecimals(datos.getPROM_DOWNLOAD()+""));pwr.print("|");
				pwr.print(getTwoDecimals(datos.getPROM_MBS()+""));//pwr.print("|");
//				pwr.print(datos.getCOUNT());
				pwr.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pwr.close();
			try {
				fwr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void cargaDatos() {
		mapDatosReporte=new HashMap<String, DATOS>();
		System.out.println("Iniciando la lectura del archivo");
		count=0;
		try {
			bfr=new BufferedReader(new FileReader(new File("Z:/Data/TPE/AAA/Reportes/20200920/ReporteDescargaAAA_20200920_promedio.000")));
			System.out.println("Leyendo archivo 1");
			while((strLn=bfr.readLine())!=null) {
				cargaMapa(strLn);
			}
			bfr.close();
			bfr=new BufferedReader(new FileReader(new File("Z:/Data/TPE/AAA/Reportes/20200920/ReporteDescargaAAA_20200920_promedio.001")));
			System.out.println("Leyendo archivo 2");
			while((strLn=bfr.readLine())!=null) {
				cargaMapa(strLn);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.err.println(e.getMessage());
			System.out.println(strLn);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.err.println(e.getMessage());
			System.out.println(strLn);
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean esNumero(String var) {
		try {
			Float.parseFloat(var);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public void cargaMapa(String linea) {
		strArr=strLn.split("\\|");
		double timelength;
		long inputbytes;
		long outputbytes;
		double mb_up;
		double mb_down;
		long conteo;
		if(esNumero(strArr[7])) {
			datos=new DATOS();
			datos.setAAC_PACKAGE(strArr[0]);
			datos.setAAC_SOURCE(strArr[1]);
			datos.setAAC_VENDOR(strArr[2]);
			datos.setACCOUNT_NO(strArr[3]);
			datos.setNAI(strArr[4]);
			datos.setNAS_PORT_ID(strArr[5]);
			datos.setPRODUCTID(strArr[6]);
			datos.setPROMEDIO(Float.parseFloat(strArr[7]));
			datos.setFECHA(strArr[8]);
			datos.setHORA(strArr[9]);
			datos.setTIMELENGTH_SUM(Double.parseDouble(strArr[10]));
			datos.setINPUTBYTES_SUM(Long.parseLong(strArr[11]));
			datos.setOUTPUTBYTES_SUM(Long.parseLong(strArr[12]));
			datos.setMB_SUBIDOS(Double.parseDouble(strArr[13]));
			datos.setMB_DESCARGADOS(Double.parseDouble(strArr[14]));
			datos.setCOUNT(1);
			count++;
			if(count%1000000==0) {
				System.out.println(count+" lineas procesadas");
				System.out.println("Total de registros en mapa: "+mapDatosReporte.size());
			}
			if(datos.getMB_DESCARGADOS()>=datos.getPROMEDIO()) {
				if(mapDatosReporte.containsKey(datos.getACCOUNT_NO())) {
					timelength=mapDatosReporte.get(datos.getACCOUNT_NO()).getTIMELENGTH_SUM()+datos.getTIMELENGTH_SUM();
					inputbytes=mapDatosReporte.get(datos.getACCOUNT_NO()).getINPUTBYTES_SUM()+datos.getINPUTBYTES_SUM();
					outputbytes=mapDatosReporte.get(datos.getACCOUNT_NO()).getOUTPUTBYTES_SUM()+datos.getOUTPUTBYTES_SUM();
					mb_up=mapDatosReporte.get(datos.getACCOUNT_NO()).getMB_SUBIDOS()+datos.getMB_SUBIDOS();
					mb_down=mapDatosReporte.get(datos.getACCOUNT_NO()).getMB_DESCARGADOS()+datos.getMB_DESCARGADOS();
					conteo=mapDatosReporte.get(datos.getACCOUNT_NO()).getCOUNT()+1;
					
					datos.setTIMELENGTH_SUM(timelength);
					datos.setINPUTBYTES_SUM(inputbytes);
					datos.setOUTPUTBYTES_SUM(outputbytes);
					datos.setMB_SUBIDOS(mb_up);
					datos.setMB_DESCARGADOS(mb_down);
					datos.setCOUNT(conteo);
					mapDatosReporte.put(datos.getACCOUNT_NO(), datos);
				}else {
					mapDatosReporte.put(datos.getACCOUNT_NO(), datos);
				}
			}
		}
		
	}
	
	private String getTwoDecimals(String valor){
	    DecimalFormat df = new DecimalFormat("0.00");
	    return df.format(Double.parseDouble(valor));
	}
	
}
