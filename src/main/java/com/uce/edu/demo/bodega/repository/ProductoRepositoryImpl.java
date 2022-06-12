package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public Producto insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso el producto: " + p);
		return p;
	}

	@Override
	public Producto consultar(String nombre) {
		// TODO Auto-generated method stub
		Producto produ1 = new Producto();
		produ1.setNombre("Arroz");
		produ1.setPrecioCompra(new BigDecimal(1.20).setScale(2, RoundingMode.HALF_UP));
		produ1.setPrecioVenta(new BigDecimal(1.46).setScale(2, RoundingMode.HALF_UP));
		produ1.setCantidad(20);
		produ1.setFechaIngreso(LocalDateTime.of(2022, 10, 5, 10, 30, 23));

		return produ1;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Producto actualizado: " + p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el producto: " + nombre);
	}

}
