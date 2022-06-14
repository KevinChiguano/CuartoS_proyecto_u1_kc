package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	// Como la logica de CuentaBancariaService no hace nadaz
	// Si puedo Inyectar el CuentaBancariaRepository
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;

	@Autowired
	private ITransferenciaRepository iTransferenciaService;
	
	

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());

		this.iTransferenciaService.insertar(t);

	}

	@Override
	public void eliminarTransferencia(String ctaOrigen, String ctaDestino) {
		this.iTransferenciaService.eliminar(ctaOrigen, ctaDestino);
	}

	@Override
	public void actualizarDeposito(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.iTransferenciaService.actualizar(t);
	}

	@Override
	public Transferencia buscarTransferencia(String ctaOrigen, String ctraDestino) {
		// TODO Auto-generated method stub
		return this.iTransferenciaService.buscar(ctaOrigen, ctraDestino);

	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		//No hay ninguna logica de negocio
		return this.iTransferenciaService.consultar(cuenta, fechaInicio, fechaRetiro);
	}

}
