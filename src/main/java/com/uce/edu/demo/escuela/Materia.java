package com.uce.edu.demo.escuela;

import org.springframework.stereotype.Component;

//Poner metadata
@Component
public class Materia {

	private String nombre;
	private int numerohoras;
	private String aula;

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumerohoras() {
		return numerohoras;
	}

	public void setNumerohoras(int numerohoras) {
		this.numerohoras = numerohoras;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}
	
	

}
