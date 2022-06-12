package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.to.GestorInventarioTo;

public interface IGestorInventarioService {

	public void ingresarProductoInventario(String nombreProducto, BigDecimal precioCompra, int cantidad, String codigoInventario);

	public List<GestorInventarioTo> consultar(LocalDateTime fechaInicio);

}
