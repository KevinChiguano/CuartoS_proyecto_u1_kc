package com.uce.edu.demo.hotel.Repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.hotel.modelo.Hotel;

@Repository
public class HotelRepositoryImpl implements IHotelRepository{

	@Override
	public void insertar(Hotel h) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso el hotel: "+h);
	}

	@Override
	public Hotel buscar(String nombre) {
		// TODO Auto-generated method stub
		Hotel h = new Hotel();
		h.setNombre(nombre);
		h.setDireccion("Av. 6 de Diciembre");
		h.setTelefono("593 2 223 3333");
		return h;
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Hotel "+nombre+" eliminado");
	}

	@Override
	public void actualizar(Hotel h) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el hotel: "+h);
		
	}

}
