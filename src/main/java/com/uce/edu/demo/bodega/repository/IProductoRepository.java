package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {

	public Producto insertar(Producto p);

	public Producto consultar(String nombre);

	public void actualizar(Producto p);

	public void eliminar(String nombre);

}
