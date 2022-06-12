package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioRepository {

	public void insertar(Inventario in);

	public Inventario consultar(LocalDateTime fechaInventario);

	public void actualizar(Inventario in);

	public void eliminar(String codigo);

}
