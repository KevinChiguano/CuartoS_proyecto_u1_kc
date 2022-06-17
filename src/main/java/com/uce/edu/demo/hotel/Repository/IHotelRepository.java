package com.uce.edu.demo.hotel.Repository;

import com.uce.edu.demo.hotel.modelo.Hotel;

public interface IHotelRepository {

	public void insertar(Hotel h);

	public Hotel buscar(String nombre);

	public void eliminar(String nombre);

	public void actualizar(Hotel h);

}
