package com.uce.edu.demo.hotel.Service;

import java.time.LocalDateTime;

import com.uce.edu.demo.hotel.modelo.Reservacion;

public interface IReservacionService {

	public Reservacion realizarReservacion(String numeroHabitacion);

	public void buscarReservacion(LocalDateTime fechaInicio);

}
