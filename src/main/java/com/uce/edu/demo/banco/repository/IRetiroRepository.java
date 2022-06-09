package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void insertar(Retiro r);

	public void eliminar(String numeroCuenta);

	public void actualizar(String numeroCuenta);

	public Retiro buscar(String numeroCuenta);

}
