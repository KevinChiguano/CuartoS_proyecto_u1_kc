package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Estudiante;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula ma) {
		// TODO Auto-generated method stub
		//Aqui se realiza la insercion en la base de datos
		System.out.println("Se ha insertado la matricula: "+ ma);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la matricula: "+ numero);

		Matricula ma = new Matricula();
		ma.setNumero(numero);
		
		return ma;
	}

	@Override
	public void actualizar(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la matricula: "+ ma);

		
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la matricula: "+ numero);

		
	}
	

}
