package com.uce.edu.demo.hotel.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.hotel.Repository.IHotelRepository;
import com.uce.edu.demo.hotel.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	IHotelRepository hotelRepository;

	@Override
	public void insertar(Hotel h) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(h);
	}

	@Override
	public void actualizar(Hotel h) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(h);
	}

	@Override
	public Hotel buscar(String nombre) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscar(nombre);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminar(nombre);
	}
	
	

}
