package com.uce.edu.demo.hotel.modelo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Reservacion {

	private String numeroReservacion;
	private LocalDateTime fecha;
	private Hotel hotel;
	private Habitacion habitacion;
	

	@Override
	public String toString() {
		return "Reservacion [numeroReservacion=" + numeroReservacion + ", fecha=" + fecha + ", \nhotel=" + hotel
				+ ", \nhabitacion=" + habitacion + "]";
	}

	// SET y GET
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public String getNumeroReservacion() {
		return numeroReservacion;
	}

	public void setNumeroReservacion(String numeroReservacion) {
		this.numeroReservacion = numeroReservacion;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	

}
