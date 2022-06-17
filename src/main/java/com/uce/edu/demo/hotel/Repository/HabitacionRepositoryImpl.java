package com.uce.edu.demo.hotel.Repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.hotel.modelo.Habitacion;

@Repository
public class HabitacionRepositoryImpl implements IHabitacionRepository{

	@Override
	public void insertar(Habitacion ha) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto la habitacion: "+ha);
	}

	@Override
	public Habitacion buscar(String numeroHabitacion) {
		// TODO Auto-generated method stub
		Habitacion ha = new Habitacion();
		ha.setNumeroHabitacion(numeroHabitacion);
		ha.setPrecioHabitacion(new BigDecimal(25));
		return ha;
	}

	@Override
	public void eliminar(String numeroHabitacion) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la habitacion: "+numeroHabitacion);
	}

	@Override
	public void actualizar(Habitacion ha) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo la habitacion: "+ha);
	}

}
