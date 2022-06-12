package com.uce.edu.demo.bodega.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GestorInventarioTo {

	private String nombreProducto;
	private int cantidad;
	private BigDecimal precioVenta;
	private LocalDateTime fechaIngreso;

	// SET y GET
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "GestorInventarioTo [nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precioVenta="
				+ precioVenta + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	

}
