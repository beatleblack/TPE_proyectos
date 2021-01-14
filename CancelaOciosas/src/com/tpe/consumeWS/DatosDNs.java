package com.tpe.consumeWS;

public class DatosDNs {
	
	private String cuenta;
	private String numeroSerie;
	private String dn;
	private String tipo;
	private int estatus;
	
	public DatosDNs() {
		
	}
	public DatosDNs(String cuenta,String numeroSerie) {
		this.setCuenta(cuenta);
		this.setNumeroSerie(numeroSerie);
	}
	public DatosDNs(String cuenta,String numeroSerie,String dn) {
		this.setCuenta(cuenta);
		this.setNumeroSerie(numeroSerie);
		this.dn=dn;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

}
