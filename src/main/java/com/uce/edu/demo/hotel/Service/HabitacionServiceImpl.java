package com.uce.edu.demo.hotel.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.hotel.Repository.IHabitacionRepository;
import com.uce.edu.demo.hotel.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	IHabitacionRepository habitacionRepository;

	@Override
	public void insertar(Habitacion ha) {
		// TODO Auto-generated method stub
		this.habitacionRepository.insertar(ha);
	}

	@Override
	public Habitacion buscar(String numero) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.buscar(numero);
	}

	@Override
	public void actualizar(Habitacion ha) {
		// TODO Auto-generated method stub
		this.habitacionRepository.actualizar(ha);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.habitacionRepository.eliminar(numero);
	}

}
