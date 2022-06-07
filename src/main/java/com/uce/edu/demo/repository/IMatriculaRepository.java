package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {

	// CRUD

	// C: crear/insertar
	public void insertar(Matricula ma);

	// R: leer/buscar
	public Matricula buscar(String apellido);

	// U: actualizar
	public void actualizar(Matricula ma);

	// D: eliminar
	public void eliminar(String cedula);

}
