package com.totalplay.herramientas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Fechas {
	
	private Date horaFin;
	private Date hora;
	private Date horaCompara;
	DateFormat formato=null;
	Properties prop=null;
	Logger log;
	
	public Fechas(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(Fechas.class);
	}
	
//	public static void main(String arg[]) {
//		new Fechas().booleanComparaFechas("yyyyMMddHHmmss", "20190510131214", "20190510121213");
//		System.out.println(new Fechas().booleanEntreFechas("yyyyMMddHHmmss", "20190510131214", "20190510151213","20190510111213"));
//		System.out.println(new Fechas().restaFechas("yyyyMMddHHmmss", "20190515151313", "20190515141313"));
//	}
	
	public String sumaSegundos(String formatoFecha,String fecha,int seg){
		try {
			formato=new SimpleDateFormat(formatoFecha);
			SimpleDateFormat fechaCadena=new SimpleDateFormat(formatoFecha);
			hora=formato.parse(fecha);
			Calendar calen= Calendar.getInstance();
			calen.setTime(hora);
			calen.add(Calendar.SECOND, +seg);
			horaFin=calen.getTime();
			return fechaCadena.format(horaFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage());
			return fecha;
		}catch (Exception e) {
			log.error(e.getMessage());
			return fecha;
		}finally {
			hora=null;
			horaFin=null;
		}
	}
	
	public String sumaMinutos(String formatoFecha,String fecha,int min){
		try {
			formato=new SimpleDateFormat(formatoFecha);
			SimpleDateFormat fechaCadena=new SimpleDateFormat(formatoFecha);
			hora=formato.parse(fecha);
			Calendar calen= Calendar.getInstance();
			calen.setTime(hora);
			calen.add(Calendar.MINUTE, +min);
			horaFin=calen.getTime();
			return fechaCadena.format(horaFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			return fecha;
		}catch (Exception e) {
			log.error(e.getMessage());
			return fecha;
		}finally {
			hora=null;
			horaFin=null;
		}
	}
	
	public String sumaHoras(String formatoFecha,String fecha,int horas){
		try {
			formato=new SimpleDateFormat(formatoFecha);
			SimpleDateFormat fechaCadena=new SimpleDateFormat(formatoFecha);
			hora=formato.parse(fecha);
			Calendar calen= Calendar.getInstance();
			calen.setTime(hora);
			calen.add(Calendar.HOUR_OF_DAY, +horas);
			horaFin=calen.getTime();
			return fechaCadena.format(horaFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage());
			return fecha;
		}catch (Exception e) {
			log.error(e.getMessage());
			return fecha;
		}finally {
			hora=null;
			horaFin=null;
		}
	}
	
	public boolean comparaHoras(String formatoFecha,String fecha1,String fecha2){
		try {
			formato=new SimpleDateFormat(formatoFecha);
			hora=formato.parse(fecha1);
			horaFin=formato.parse(fecha2);
			Calendar calen= Calendar.getInstance();
			calen.setTime(hora);
			horaFin=calen.getTime();
			if(hora.before(horaFin)){
				System.out.println(fecha1+" es menor que "+fecha2);
			}else if(horaFin.before(hora)){
				System.out.println(fecha2+" es menor que "+fecha1);
			}else {
				System.out.println("Fechas iguales");
			}
			return hora.before(horaFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage());
		}catch (Exception e) {
			log.error(e.getMessage());
		}finally {
			hora=null;
			horaFin=null;
		}
		System.out.println("Retorna ultimo");
		return false;
	}
	
	/**
	 * 
	 * @param formatoFecha
	 * @return la fecha de hoy en el formato deseado, puede retornar hasta los milisegundos de la solicitud.
	 */
	public String getToday(String formatoFecha){
		Calendar calendar = Calendar.getInstance();
        Date date=new Date();
        calendar.setTime(date);
        SimpleDateFormat formato=new SimpleDateFormat(formatoFecha);
        return formato.format(calendar.getTime());
	}
	
	public String regresaDiaHoy(){
		Calendar calendar = Calendar.getInstance();
        Date date=new Date();
        calendar.setTime(date);
        SimpleDateFormat formato=new SimpleDateFormat("dd");
        return formato.format(calendar.getTime());
	}
	
	public String regresaDiaAño(){
		Calendar calendar = Calendar.getInstance();
        Date date=new Date();
        calendar.setTime(date);
        SimpleDateFormat formato=new SimpleDateFormat("D");
        return formato.format(calendar.getTime());
	}
	
	public String regresaDiasMes(){
		Calendar calendar = Calendar.getInstance();
        Date date=new Date();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH)+"";
	}
	
	public boolean booleanComparaFechas(String formatoFecha,String fechaA,String fechaB) {
		try {
			formato=new SimpleDateFormat(formatoFecha);
			hora=formato.parse(fechaA);
			horaFin=formato.parse(fechaB);
			if(hora.before(horaFin)) {
				return true;
			}else {
				return false;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage()+"FechaA: "+fechaA+"; FechaB: "+fechaB);
		}catch (Exception e) {
			log.error(e.getMessage()+"FechaA: "+fechaA+"; FechaB: "+fechaB);
		}
		return false;
	}
	
	public boolean booleanEntreFechas(String formatoFecha,String fechaA,String fechaB,String fechaCompara) {
		try {
			formato=new SimpleDateFormat(formatoFecha);
			hora=formato.parse(fechaA);
			horaFin=formato.parse(fechaB);
			horaCompara=formato.parse(fechaCompara);
			if(horaCompara.after(hora) && horaCompara.before(horaFin)) {
				return true;
			}else {
				return false;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage()+"FechaA: "+fechaA+"; FechaB: "+fechaB+"; FechaCompara:"+fechaCompara);
		}catch (Exception e) {
			log.error(e.getMessage()+"FechaA: "+fechaA+"; FechaB: "+fechaB+"; FechaCompara:"+fechaCompara);
		}
		return false;
	}
	
	/**
	 * 
	 * @param formatoFecha
	 * @param minuendo 
	 * @param sustraendo
	 * @return Retorna el valor absoluto en segundos de la diferencia de fechas.
	 */
	public long restaFechas(String formatoFecha,String minuendo,String sustraendo) {
		formato=new SimpleDateFormat(formatoFecha);
		try {
			hora=formato.parse(minuendo);
			horaFin=formato.parse(sustraendo);
			return java.lang.Math.abs((horaFin.getTime()-hora.getTime())/1000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			return 0;
		}catch (Exception e) {
			log.error(e.getMessage());
			return 0;
		}
	}
}
