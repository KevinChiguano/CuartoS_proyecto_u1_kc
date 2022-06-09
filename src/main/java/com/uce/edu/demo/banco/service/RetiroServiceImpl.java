package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private IRetiroRepository retiroRepository;

	@Autowired
	private ICuentaBancariaService bancariaService;

	@Override
	public void realizarRetiro(String numeroCuenta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaBancaria = this.bancariaService.buscar(numeroCuenta);
		BigDecimal saldoFinal = ctaBancaria.getSaldo().subtract(monto);
		ctaBancaria.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaBancaria);

		Retiro retiro = new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setMonto(monto);
		retiro.setNumeroCuenta(numeroCuenta);
		this.retiroRepository.insertar(retiro);

	}

	@Override
	public void actualizarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(numeroCuenta);
	}

	@Override
	public Retiro buscarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numeroCuenta);
	}

	@Override
	public void eliminarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numeroCuenta);

	}

}
