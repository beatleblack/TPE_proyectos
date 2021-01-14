package com.tpe.procesos;

public class Contadores {

	private long llamadas;
	private long segundos;
	private long minutos;
	public long getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(long llamadas) {
		this.llamadas = llamadas;
	}
	public long getSegundos() {
		return segundos;
	}
	public void setSegundos(long segundos) {
		this.segundos = segundos;
	}
	public long getMinutos() {
		return minutos;
	}
	public void setMinutos(long minutos) {
		this.minutos = minutos;
	}
}
