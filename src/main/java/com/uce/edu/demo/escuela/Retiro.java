package com.uce.edu.demo.escuela;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Retiro {

	private Estudiante estudiante;
	private Materia materia;
	private LocalDateTime fechaRetiro;
	
	//2) DI por constructor
	public Retiro(Estudiante estudiante, Materia materia) {
		this.estudiante = estudiante;
		this.materia = materia;
	}
	
	public String retirar(LocalDateTime fechaRetiro,String nombre,String apellido, int edad,
			String nombreMateria,int horas, String aula) {
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setEdad(edad);
		
		this.materia.setNombre(nombreMateria);
		this.materia.setNumerohoras(horas);
		this.materia.setAula(aula);
		
		//Setear atributos de matricula
		this.fechaRetiro = fechaRetiro;
		
		return "Retiro exitoso";
	}

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
