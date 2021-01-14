package com.tpe.procesos;

import java.io.File;
import java.util.ArrayList;

public class ListaDirectorio {

	ArrayList<File> arrFl;
	
	public ArrayList<File> listaArchivos(String path){
		System.out.println(path);
		arrFl=new ArrayList<File>();
		File dir=new File(path);
		File fl;
		String fls[]=dir.list();
		for(String tmp : fls) {
			fl=new File(path+tmp);
			if(fl.isFile()) {
				arrFl.add(fl);
			}
		}
		System.out.println("Archivos consultados: "+arrFl.size());
		return arrFl;
	}
}
