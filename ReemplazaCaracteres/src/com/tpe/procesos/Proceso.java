package com.tpe.procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class Proceso {

	
	Properties prop;
	BufferedReader bfr=null;
	File fl=null;
	PrintWriter pwr=null;
	FileWriter fwr=null;
	String strLn;
	String pwrLn;
	
	public Proceso() {
		
	}
	
	public void reemplazaCadena() {
		int count=0;
		try {
			bfr=new BufferedReader(new FileReader(new File("Z:/Data/TPE/AAA/Reportes/20200914/cuentasBRM_AAA.sql")));
			fwr=new FileWriter("Z:/Data/TPE/AAA/Reportes/20200914/cuentasBRM_AAA_insert.sql");
			pwr=new PrintWriter(fwr);
			while((strLn=bfr.readLine())!=null) {
				count++;
				pwrLn=strLn.replace(";,;", "\',\'").replace(",;", ",\'").replace(";);", "\');").replace("&", "");
				pwr.println(pwrLn);
				if(count%5000==0) {
					pwr.println("commit;");
					System.out.println("Lineas leidas: "+count);
				}
			}pwr.println("commit;");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pwr.close();
			try {
				fwr.close();
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void creaInsertEDRs() {
		
		try {
			String strArr[];
			int count=0;
			bfr=new BufferedReader(new FileReader(new File("Z:/Data/TPE/AAA/Reportes/ReportePruebaVelocidad_cuentas202009")));
			fwr=new FileWriter("Z:/Data/TPE/AAA/Reportes/ReportePruebaVelocidad_cuentas202009.sql");
			pwr=new PrintWriter(fwr);
			while((strLn=bfr.readLine())!=null){
				count++;
				strArr=strLn.split("\\|");
				pwr.println("INSERT INTO DPLPR.CONSUMOS_DATOS_AAA(IDCLIENTE,nas_port_id,productid,FECHA,BYTES_SUBIDOS,BYTES_DESCARGADOS)"
						+ " VALUES((select idcliente from DPLPR.TADPL_CLIENTESBRM where ACCOUNT_NO=\'"+strArr[0]+"\'),"
								+ "\'"+strArr[2]+"\',"
								+ "\'"+strArr[3]+"\',"
								+ " to_date(\'"+strArr[4]+"\',\'yyyyMMdd\'),"
								+ strArr[6]+","
								+strArr[7]
						+ ");");
				if(count%5000==0) {
					pwr.println("commit;");
					System.out.println("Lineas leidas: "+count);
				}
			}pwr.println("commit;");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
