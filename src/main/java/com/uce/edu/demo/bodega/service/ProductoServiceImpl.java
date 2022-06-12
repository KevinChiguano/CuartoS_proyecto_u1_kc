package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;

	
	@Override
	public Producto consultarProducto(String nombre) {
		// TODO Auto-generated method stub
		return iProductoRepository.consultar(nombre);
	}


	@Override
	public Producto ingresarProducto(String nombre, BigDecimal precioCompra, BigDecimal precioVenta, int cantidad) {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setPrecioCompra(precioCompra);
		producto.setPrecioVenta(precioVenta);
		producto.setCantidad(cantidad);
		producto.setFechaIngreso(LocalDateTime.now());
		
		return this.iProductoRepository.insertar(producto);
	}

	@Override
	public void eliminarProducto(String nombre) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(nombre);
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}	

}
