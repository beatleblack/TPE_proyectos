package com.tpe.procesos;

import java.io.File;
import java.util.Map.Entry;

public class IniciaProcesos {

	public void inicia() {
		for(File f : new ListaArchivos().getFiles("Z:/Data/TPE/B4C/proc/bkup/2020-10-01/")) {
			System.out.println(f.getAbsolutePath());
		}
		
	}
}
