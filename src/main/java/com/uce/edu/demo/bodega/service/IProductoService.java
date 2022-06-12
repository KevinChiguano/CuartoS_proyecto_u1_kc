package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {

	public Producto ingresarProducto(String nombre, BigDecimal precioCompra, BigDecimal precioVenta, int cantidad);

	public void eliminarProducto(String nombre);

	public Producto consultarProducto(String nombre);

	public void actualizarProducto(Producto p);

}
