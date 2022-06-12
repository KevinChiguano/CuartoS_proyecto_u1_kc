package com.uce.edu.demo.bodega.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {

	private List<Producto> productos;
	private LocalDateTime fechaInventario;
	private String codigo;

	@Override
	public String toString() {
		return "Inventario [productos=" + productos + ", fechaInventario=" + fechaInventario + ", codigo=" + codigo
				+ "]";
	}

	// SET y GET
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public LocalDateTime getFechaInventario() {
		return fechaInventario;
	}

	public void setFechaInventario(LocalDateTime fechaInventario) {
		this.fechaInventario = fechaInventario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
