package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);

	public void eliminarTransferencia(String ctaOrigen, String ctaDestino);

	public Transferencia buscarTransferencia(String ctaOrigen, String ctraDestino);

	public void actualizarDeposito(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro);
}
