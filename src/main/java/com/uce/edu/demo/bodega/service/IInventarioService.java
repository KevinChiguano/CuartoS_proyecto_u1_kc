package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {

	public void realizarInventario(String codigoInventario, List<Producto> producto);

	public Inventario consultarInventario(LocalDateTime fechaInventario, String codigo);

	public void eliminarInventario(String codigoInventario);

	public void actualizarInventario(Inventario in);

}
