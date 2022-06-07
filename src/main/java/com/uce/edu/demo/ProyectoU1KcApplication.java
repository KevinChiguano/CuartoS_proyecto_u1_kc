package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1KcApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1723344567");		
		
		
		//Materia
		Materia m = new Materia();
		m.setNombre("Matematica");
		m.setSemestre("1");
		
		Materia m1 = new Materia();
		m1.setNombre("Calculo");
		m1.setSemestre("2");
		
		this.materiaService.ingresarMateria(m);
		this.materiaService.actualizarMateria(m);
		this.materiaService.buscarPorNombre("Matematica");
		this.materiaService.borrarMateria("Matematica");
		
		List<Materia> materias = new ArrayList<Materia>();
		materias.add(m);
		materias.add(m1);
		
		System.out.println();
		
		//Matricula
		Matricula ma = new Matricula();
		ma.setEstudiante(e);
		ma.setMateria(materias);
		ma.setNumero("123");
		
		this.matriculaService.ingresarMatricula(ma);
		this.matriculaService.actualizarMatricula(ma);
		this.matriculaService.buscarPorNumero("123");
		this.matriculaService.borrarMatricula("123");
		
	}

}
