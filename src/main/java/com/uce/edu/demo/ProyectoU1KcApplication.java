package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.escuela.Matricula;
import com.uce.edu.demo.escuela.Retiro;
import com.uce.edu.demo.escuela.Traslado;

@SpringBootApplication
public class ProyectoU1KcApplication implements CommandLineRunner{
	
	//DI por atributo
//	@Autowired
//	private CitaMedica cita;
	
//	@Autowired
//	private CitaMedica2 cita;

	//DI por atributo
	@Autowired
	private Matricula matricula1;
	
	@Autowired
	private Retiro retiro1;
	
	@Autowired
	private Traslado traslado1;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto con Spring Framework");
//		
//		String respuesta = this.cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
//		System.out.println(respuesta);
		
		
		String res = this.matricula1.matricular(LocalDateTime.now(), "Juan", "Burgos", 15, "Matematica", 14, "A-001");
		System.out.println(res);
		
		res = this.retiro1.retirar(LocalDateTime.now(), "Juan", "Burgos", 15, "Matematica", 14, "A-001");
		System.out.println(res);
		
		res = this.traslado1.trasladar("Juan", "Burgos", 15, "Liceo Empresarial");
		System.out.println(res);
		
	}

}
