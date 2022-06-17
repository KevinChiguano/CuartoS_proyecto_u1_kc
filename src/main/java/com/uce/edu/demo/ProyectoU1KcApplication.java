package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.to.GestorInventarioTo;
import com.uce.edu.demo.hotel.Service.IReservacionService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1KcApplication implements CommandLineRunner{
	
	@Autowired
	private IReservacionService reservacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KcApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println( this.reservacionService.realizarReservacion("002"));
		System.out.println("----------");
		System.out.println( this.reservacionService.realizarReservacion("111"));
	
	}

}
