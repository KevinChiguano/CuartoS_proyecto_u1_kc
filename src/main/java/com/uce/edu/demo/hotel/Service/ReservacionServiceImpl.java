package com.uce.edu.demo.hotel.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.hotel.Repository.IHotelRepository;
import com.uce.edu.demo.hotel.Repository.IReservacionRepository;
import com.uce.edu.demo.hotel.modelo.Habitacion;
import com.uce.edu.demo.hotel.modelo.Hotel;
import com.uce.edu.demo.hotel.modelo.Reservacion;

@Service
public class ReservacionServiceImpl implements IReservacionService{
	
	@Autowired
	private IHotelRepository hotelRepository;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	@Autowired
	private IReservacionRepository reservacionRepository;
	
	@Autowired
	private Hotel hotel;
	
	@Autowired
	private Habitacion habitacion;
	

	@Override
	public Reservacion realizarReservacion(String numeroHabitacion) {
		// TODO Auto-generated method stub
		if(hotel.getNombre() == null) {
			hotel = new Hotel();
			hotel.setNombre("Kumaru");
			hotel.setDireccion("Av. 6 de Diciembre");
			hotel.setTelefono("593 2 223 3333");
		}
		
		habitacion = this.habitacionService.buscar(numeroHabitacion);
		String numReservacion = String.valueOf((int)Math.floor(Math.random()*10+1));
		Reservacion reservacion = new Reservacion();
		reservacion.setHabitacion(habitacion);
		reservacion.setHotel(hotel);
		reservacion.setNumeroReservacion(numReservacion);
		reservacion.setFecha(LocalDateTime.now());
		
		return reservacion;
		
	}

	@Override
	public void buscarReservacion(LocalDateTime fechaInicio) {
		// TODO Auto-generated method stub
		this.reservacionRepository.buscar(fechaInicio);
	}


}
