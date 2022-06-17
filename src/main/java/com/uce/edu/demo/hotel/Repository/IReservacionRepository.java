package com.uce.edu.demo.hotel.Repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.hotel.modelo.Reservacion;

public interface IReservacionRepository {

	public void insertar(Reservacion r);

	public List<Reservacion> buscar(LocalDateTime fechaInicio);

	public void actualizar(Reservacion r);

	public void elimiar(String numero);

}
