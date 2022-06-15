package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void crearMatricula(Matricula ma);

	public Matricula buscarPorNumero(String numero);

	public void actualizarMatricula(Matricula ma);

	public void borrarMatricula(String numero);
	
}
