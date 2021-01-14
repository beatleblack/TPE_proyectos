package com.tpe.procesos;

import java.io.File;
import java.util.ArrayList;

public class ListaArchivos {

	public ListaArchivos() {

	}
	
	ArrayList<File> arrFl;
	File fl;
	File ruta;
	String [] files;
	int count;
	
	public ArrayList<File> getFiles(String path){
		try {
			arrFl=new ArrayList<File>();
			ruta=new File(path);
			files=ruta.list();
			System.out.println("Archivos en arreglo: "+files.length);
			count=0;
			for(String f : files) {
				count++;
				fl=new File(path+f);
				System.out.println(f);
				arrFl.add(fl);
			}
			return arrFl;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
