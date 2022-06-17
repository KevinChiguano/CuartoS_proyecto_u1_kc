package com.uce.edu.demo.hotel.Service;

import com.uce.edu.demo.hotel.modelo.Habitacion;

public interface IHabitacionService {

	public void insertar(Habitacion ha);

	public Habitacion buscar(String numero);

	public void actualizar(Habitacion ha);

	public void eliminar(String numero);

}
