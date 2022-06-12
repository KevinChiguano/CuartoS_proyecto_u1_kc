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
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.to.GestorInventarioTo;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1KcApplication implements CommandLineRunner{
	
	/*@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IRetiroService retiroServie;*/
	
	@Autowired
	private IGestorInventarioService gestorInventarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KcApplication.class, args);
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		
		//this.iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		//this.depositoService.realizarDeposito("14", new BigDecimal(50));
		//this.retiroServie.realizarRetiro("14", new BigDecimal(40));
		
		//Insertar productos al inventario
		this.gestorInventarioService.ingresarProductoInventario("Leche", new BigDecimal(0.80), 20,"001");
		this.gestorInventarioService.ingresarProductoInventario("Pan", new BigDecimal(0.50), 10,"001");
		this.gestorInventarioService.ingresarProductoInventario("Huevos", new BigDecimal(0.20), 10,"001");
		this.gestorInventarioService.ingresarProductoInventario("Azucar", new BigDecimal(0.45), 28,"001");
		this.gestorInventarioService.ingresarProductoInventario("Sal", new BigDecimal(0.30), 13,"001");
		
		//Consultar productos en el inventario
		System.out.println("\nReporte del inventario");
		for(GestorInventarioTo g : this.gestorInventarioService.consultar(LocalDateTime.of(2021, 10, 10, 5, 55, 30))) {
			System.out.println(g);
		}
		
	}

}
