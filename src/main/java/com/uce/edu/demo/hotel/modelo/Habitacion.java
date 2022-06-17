package com.uce.edu.demo.hotel.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Habitacion {

	private String numeroHabitacion;
	private BigDecimal precioHabitacion;

	@Override
	public String toString() {
		return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", precioHabitacion=" + precioHabitacion + "]";
	}

	// SET y GET
	public String getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(String numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public BigDecimal getPrecioHabitacion() {
		return precioHabitacion;
	}

	public void setPrecioHabitacion(BigDecimal precioHabitacion) {
		this.precioHabitacion = precioHabitacion;
	}

}
