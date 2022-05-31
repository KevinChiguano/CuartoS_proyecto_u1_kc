package com.uce.edu.demo.escuela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Traslado {

	//DI por metodo SET
	private Estudiante estudiante; //Colocar a su metodo set @Autowired
	private String escuela;
	
	public String trasladar(String nombre, String apellido, int edad, String escuela) {
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setEdad(edad);
		
		this.escuela = escuela;
		
		return "Traslado exitoso";
	}

	//SET y GET
	public Estudiante getEstudiante() {
		return estudiante;
	}

	@Autowired
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

}
