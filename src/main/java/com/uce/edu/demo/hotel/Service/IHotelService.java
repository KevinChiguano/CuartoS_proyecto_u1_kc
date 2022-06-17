package com.uce.edu.demo.hotel.Service;

import com.uce.edu.demo.hotel.modelo.Hotel;

public interface IHotelService {

	public void insertar(Hotel h);

	public void actualizar(Hotel h);

	public Hotel buscar(String nombre);

	public void eliminar(String nombre);

}
