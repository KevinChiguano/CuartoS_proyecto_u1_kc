package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso el retiro: " + r);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el retiro de la cuenta: " + numeroCuenta);
	}

	@Override
	public void actualizar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el retiro de la cuenta: " + numeroCuenta);
	}

	@Override
	public Retiro buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		Retiro r = new Retiro();
		r.setFecha(LocalDateTime.now());
		r.setMonto(new BigDecimal(20));
		r.setNumeroCuenta(numeroCuenta);
		return r;
	}

}
