package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos " + t);

	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza la transferencia" + t);
	}

	@Override
	public void eliminar(String numeroCuentaOrigen, String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina la transferencia de la cuenta " + numeroCuentaOrigen + " \na la cuenta "
				+ numeroCuentaDestino);
	}

	@Override
	public Transferencia buscar(String numeroCuentaOrigen, String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		Transferencia t = new Transferencia();
		t.setFechaTransferencia(LocalDateTime.now());
		t.setNumeroCuentaOrigen(numeroCuentaOrigen);
		t.setNumeroCuentaDestino(numeroCuentaDestino);
		t.setMontoTransferir(new BigDecimal(20));
		return t;
	}

}
