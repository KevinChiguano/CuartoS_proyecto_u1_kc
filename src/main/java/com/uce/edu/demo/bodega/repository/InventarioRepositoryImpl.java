package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario in) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el inventario: "+in);
	}

	@Override
	public Inventario consultar(LocalDateTime fechaInventario) {
		// TODO Auto-generated method stub
		
		Inventario inventario = new Inventario();
		
		List<Producto> listaProductos = new ArrayList<>();

		Producto produ1 = new Producto();
		produ1.setNombre("Arroz");
		produ1.setPrecioCompra(new BigDecimal(1.20).setScale(2, RoundingMode.HALF_UP));
		produ1.setPrecioVenta(new BigDecimal(1.46).setScale(2, RoundingMode.HALF_UP));
		produ1.setCantidad(20);
		produ1.setFechaIngreso(LocalDateTime.of(2022, 10, 5, 10, 30, 23));

		listaProductos.add(produ1);

		Producto produ2 = new Producto();
		produ2.setNombre("Pan");
		produ2.setPrecioCompra(new BigDecimal(0.50).setScale(2, RoundingMode.HALF_UP));
		produ2.setPrecioVenta(new BigDecimal(0.61).setScale(2, RoundingMode.HALF_UP));
		produ2.setCantidad(10);
		produ2.setFechaIngreso(LocalDateTime.of(2022, 10, 5, 12, 40));

		listaProductos.add(produ2);
		
		inventario.setCodigo("123");
		inventario.setFechaInventario(LocalDateTime.of(2022, 10, 20, 18, 50, 30));
		inventario.setProductos(listaProductos);
		
		return inventario;
	}

	@Override
	public void actualizar(Inventario in) {
		// TODO Auto-generated method stub
		System.out.println("Inventario actualizado: "+in);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el inventario con el codigo: "+codigo);
	}



}
