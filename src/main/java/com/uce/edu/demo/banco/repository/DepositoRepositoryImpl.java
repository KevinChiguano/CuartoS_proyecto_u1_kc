package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el deposito: " + d);
	}

	@Override
	public void eliminarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el deposito de la cuenta: " + numeroCuentaDestino);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuentaDestino) {

		Deposito d = new Deposito();
		d.setNumeroCuentaDestino(numeroCuentaDestino);
		d.setFecha(LocalDateTime.now());
		d.setMonto(new BigDecimal(20));

		return d;
	}

}
