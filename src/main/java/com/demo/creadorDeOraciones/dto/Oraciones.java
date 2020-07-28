package com.demo.creadorDeOraciones.dto;

public class Oraciones {

	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String generarNueva() {
		Catalogo cat = new Catalogo();
		
		Oraciones oracion = new Oraciones();
		
		oracion.setNombre(cat.elegirUna() + " " + cat.elegirVerbo() + " " + cat.elegirUna());
		
		return oracion.getNombre();
	}
}
