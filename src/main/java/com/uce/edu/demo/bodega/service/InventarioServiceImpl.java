package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void realizarInventario(String codigoInventario, List<Producto> producto) {
		// TODO Auto-generated method stub
		Inventario in = new Inventario();
		in.setCodigo(codigoInventario);
		in.setProductos(producto);
		in.setFechaInventario(LocalDateTime.now());
		
		this.iInventarioRepository.insertar(in);
	}

	@Override
	public Inventario consultarInventario(LocalDateTime fechaInventario, String codigo) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.consultar(fechaInventario);
	}

	@Override
	public void eliminarInventario(String codigo) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(codigo);
	}

	@Override
	public void actualizarInventario(Inventario in) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(in);
	}

}
