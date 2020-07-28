package com.demo.creadorDeOraciones.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Catalogo {
	ArrayList<Palabras> lista;
	ArrayList<Verbos> listaVerbos;
	
	
	public ArrayList<Palabras> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Palabras> lista) {
		this.lista = lista;
	}

	public Catalogo() {
		super();
		this.lista = new ArrayList<Palabras>();
		
		this.lista.add(new Palabras("esfera"));
		this.lista.add(new Palabras("mujer"));
		this.lista.add(new Palabras("bosque"));
		this.lista.add(new Palabras("elefante"));
		this.lista.add(new Palabras("piano"));
		this.lista.add(new Palabras("niña"));
		this.lista.add(new Palabras("última"));
		this.lista.add(new Palabras("habitación"));
		this.lista.add(new Palabras("libro"));
		this.lista.add(new Palabras("profundidad"));
		this.lista.add(new Palabras("cielo"));
		this.lista.add(new Palabras("mandarina"));
		this.lista.add(new Palabras("pino"));
		this.lista.add(new Palabras("nicaragua"));
		this.lista.add(new Palabras("zumbido"));
		this.lista.add(new Palabras("colibrí"));
		this.lista.add(new Palabras("guitarra"));
		this.lista.add(new Palabras("cárcel"));
		this.lista.add(new Palabras("capital"));
		this.lista.add(new Palabras("océano"));
		
		this.listaVerbos = new ArrayList<Verbos>();
		
		this.listaVerbos.add(new Verbos("rompió"));
		this.listaVerbos.add(new Verbos("tronó"));
		this.listaVerbos.add(new Verbos("pintó"));
		this.listaVerbos.add(new Verbos("carcomió"));
		this.listaVerbos.add(new Verbos("filmó"));
		this.listaVerbos.add(new Verbos("dibujó"));
		this.listaVerbos.add(new Verbos("señaló"));
		this.listaVerbos.add(new Verbos("bailó"));
		this.listaVerbos.add(new Verbos("descifró"));
		this.listaVerbos.add(new Verbos("cayó"));
		this.listaVerbos.add(new Verbos("celó"));
		this.listaVerbos.add(new Verbos("mató"));
		this.listaVerbos.add(new Verbos("encendió"));
		this.listaVerbos.add(new Verbos("apagó"));
		this.listaVerbos.add(new Verbos("nadó"));
		this.listaVerbos.add(new Verbos("desató"));
		this.listaVerbos.add(new Verbos("encerró"));
		this.listaVerbos.add(new Verbos("reflexionó"));
		this.listaVerbos.add(new Verbos("liberó"));
		this.listaVerbos.add(new Verbos("recorrió"));

		
	}
	
	public String elegirUna() {
		Random generador;
		generador = new Random();
		
		int index = generador.nextInt(this.lista.size());
		
		Palabras palabra1 = lista.get(index);
				
		return palabra1.getNombre();
	}
	
	public String elegirVerbo() {
		Random generador;
		generador = new Random();
		
		int index = generador.nextInt(this.listaVerbos.size());
		
		Verbos palabra2 = listaVerbos.get(index);
				
		return palabra2.getNombre();
	}


	public Boolean borrar(Palabras palabra) {
		Iterator<Palabras> it = this.lista.iterator();
		Boolean flag = false;

		while(it.hasNext()&& !flag) {
			Palabras p = it.next();
			
			if(p.getNombre().equals(palabra.getNombre())) {
				it.remove();
				flag=true;
			}
		}
		
		return flag;
	}
	
	public String agregar(String palabra) {
		this.lista.add(new Palabras(palabra));
		return palabra;
	}

}
