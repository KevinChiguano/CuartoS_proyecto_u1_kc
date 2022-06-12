package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;
import com.uce.edu.demo.bodega.to.GestorInventarioTo;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService{
	
	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IInventarioService iInventarioService;
	
	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void ingresarProductoInventario(String nombreProducto, BigDecimal precioCompra,int cantidad, String codigoInventario) {
		// TODO Auto-generated method stub
		BigDecimal ganancia = precioCompra.multiply(new BigDecimal(0.1));
		BigDecimal iva = precioCompra.multiply(new BigDecimal(0.12));
		BigDecimal precioVenta = (precioCompra.add(ganancia).add(iva)).setScale(2, RoundingMode.HALF_UP);
		precioCompra = precioCompra.setScale(2, RoundingMode.HALF_UP);
		List<Producto> producto = new ArrayList<>();
		producto.add(this.iProductoService.ingresarProducto(nombreProducto, precioCompra, precioVenta, cantidad));
		this.iInventarioService.realizarInventario(codigoInventario, producto);
		
	}

	@Override
	public List<GestorInventarioTo> consultar(LocalDateTime fechaInicio) {
		// TODO Auto-generated method stub
		Inventario inventario = this.iInventarioRepository.consultar(fechaInicio);
		List<Producto> productos = inventario.getProductos();
		List<GestorInventarioTo> listaFinal = new ArrayList<>();
		for(Producto p: productos) {
			GestorInventarioTo gestorTo = this.transformar(p);
			listaFinal.add(gestorTo);
		}
		
		return listaFinal;
	}
	
	private GestorInventarioTo transformar(Producto producto) {
		
		GestorInventarioTo gestorTo = new GestorInventarioTo();
		gestorTo.setNombreProducto(producto.getNombre());
		gestorTo.setPrecioVenta(producto.getPrecioVenta());
		gestorTo.setFechaIngreso(producto.getFechaIngreso());
		gestorTo.setCantidad(producto.getCantidad());
		
		return gestorTo;
		
	}

}
