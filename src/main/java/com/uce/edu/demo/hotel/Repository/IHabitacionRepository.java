package com.uce.edu.demo.hotel.Repository;

import com.uce.edu.demo.hotel.modelo.Habitacion;

public interface IHabitacionRepository {

	public void insertar(Habitacion ha);

	public Habitacion buscar(String numeroHabitacion);

	public void eliminar(String numeroHabitacion);

	public void actualizar(Habitacion ha);

}
