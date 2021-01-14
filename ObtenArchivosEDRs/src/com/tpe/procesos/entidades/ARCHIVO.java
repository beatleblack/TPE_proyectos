package com.tpe.procesos.entidades;

import java.io.File;

public class ARCHIVO {
	private File fl;
	private String flujo;
	private String estatus;
	private int idFlujo;
	private int idEstatus;
	
	
	public File getFl() {
		return fl;
	}
	public void setFl(File fl) {
		this.fl = fl;
	}
	public String getFlujo() {
		return flujo;
	}
	public void setFlujo(String flujo) {
		this.flujo = flujo;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public int getIdFlujo() {
		return idFlujo;
	}
	public void setIdFlujo(int idFlujo) {
		this.idFlujo = idFlujo;
	}
	public int getIdEstatus() {
		return idEstatus;
	}
	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}
	
}
