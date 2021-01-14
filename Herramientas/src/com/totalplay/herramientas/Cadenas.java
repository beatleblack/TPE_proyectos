package com.totalplay.herramientas;

import java.util.Formatter;

public class Cadenas {
	
	private Formatter fmt;

	public static void main(String args[]) {
		System.out.println(new Cadenas().rellenaDerecha("*", "samuel adrian", 50));
	}
	
	public boolean isNull(String cadena) {
		if(cadena==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public String rellenaDerecha(String caracter,String cadena,int posiciones) {
		
		StringBuilder stb=new StringBuilder();
		fmt = new Formatter(stb);
		System.out.println(fmt.format("%"+posiciones+"s", cadena).toString());
		
		return cadena.format("%-"+posiciones+"s").replace(" ", caracter);
		
	}
}
