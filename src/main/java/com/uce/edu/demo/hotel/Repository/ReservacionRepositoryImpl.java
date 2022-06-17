package com.uce.edu.demo.hotel.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.hotel.modelo.Habitacion;
import com.uce.edu.demo.hotel.modelo.Hotel;
import com.uce.edu.demo.hotel.modelo.Reservacion;

@Repository
public class ReservacionRepositoryImpl implements IReservacionRepository{

	@Override
	public void insertar(Reservacion r) {
		// TODO Auto-generated method stub
		System.out.println("Se realizo la reservacion: "+r);
	}

	@Override
	public List<Reservacion> buscar(LocalDateTime fechaInicio) {
		// TODO Auto-generated method stub
		
		Hotel h = new Hotel();
		h.setNombre("Kumaru");
		h.setDireccion("Av. 6 de Diciembre");
		h.setTelefono("593 2 223 3333");
		
		Habitacion ha = new Habitacion();
		ha.setNumeroHabitacion("001");
		ha.setPrecioHabitacion(new BigDecimal(25));
		
		Habitacion ha1 = new Habitacion();
		ha1.setNumeroHabitacion("002");
		ha1.setPrecioHabitacion(new BigDecimal(25));
		
		List<Reservacion> reservacion = new ArrayList<>();
		Reservacion reservacion1 = new Reservacion();
		reservacion1.setHabitacion(ha);
		reservacion1.setHotel(h);
		
		Reservacion reservacion2 = new Reservacion();
		reservacion2.setHabitacion(ha1);
		reservacion2.setHotel(h);
		
		reservacion.add(reservacion1);
		reservacion.add(reservacion2);
		
		return reservacion;
	}

	@Override
	public void actualizar(Reservacion r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo la reservacion: "+r);
	}

	@Override
	public void elimiar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la reservacion numero: "+numero);
	}

}
