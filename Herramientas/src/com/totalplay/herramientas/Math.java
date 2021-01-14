package com.totalplay.herramientas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Math {
	/**
	 * esNumero, retorna verdadero si el valor recibido es un número como maximo de tipo doble
	 * @param val, espera cadena a validar.
	 * @return 
	 */
	
	public static void main(String arg[]){
		System.out.println(new Math().formatoMoneda(23333));
	}
	public static boolean esDouble(String val){
		try {
			Double.parseDouble(val);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public static boolean esEntero(String val) {
		try {
			Long.parseLong(val);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public String formatoMoneda(double numero) {
		if(numero<1 && numero>-1) {
			DecimalFormatSymbols separador=new DecimalFormatSymbols();
			separador.setDecimalSeparator('.');
			DecimalFormat formato=new DecimalFormat("0.00",separador);
			return formato.format(numero)+"";
		}else if(numero==0){
			return "0.00";
		}else {
			DecimalFormatSymbols separador=new DecimalFormatSymbols();
			separador.setDecimalSeparator('.');
			DecimalFormat formato=new DecimalFormat("#,###.00",separador);
			return formato.format(numero)+"";
		}
	}
}
