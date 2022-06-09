package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);

	public void actualizar(Transferencia t);

	public void eliminar(String numeroCuentaOrigen, String numeroCuentaDestino);

	public Transferencia buscar(String numeroCuentaOrigen, String numeroCuentaDestino);

}
