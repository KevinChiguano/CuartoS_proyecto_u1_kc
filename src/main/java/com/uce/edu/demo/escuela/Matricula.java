package com.uce.edu.demo.escuela;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula {

	@Autowired
	private Estudiante estudiante;
	@Autowired
	private Materia materia;
	
	private LocalDateTime fechaMatricula;
	
	
	public String matricular(LocalDateTime fechaMatricula,String nombre,String apellido, int edad,
			String nombreMateria,int horas, String aula) {
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setEdad(edad);
		
		this.materia.setNombre(nombreMateria);
		this.materia.setNumerohoras(horas);
		this.materia.setAula(aula);
		
		//Setear atributos de matricula
		this.fechaMatricula = fechaMatricula;
		
		return "Matricula exitosa";
	}
	
	// SET y GET
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	

}
