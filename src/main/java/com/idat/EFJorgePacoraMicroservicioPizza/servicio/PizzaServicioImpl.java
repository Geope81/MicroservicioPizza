package com.idat.EFJorgePacoraMicroservicioPizza.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFJorgePacoraMicroservicioPizza.modelo.Pizza;
import com.idat.EFJorgePacoraMicroservicioPizza.repositorio.PizzaRepositorio;

@Service
public class PizzaServicioImpl implements PizzaServicio {
	
	@Autowired
	private PizzaRepositorio repositorio;

	@Override
	public List<Pizza> listarPizzas() {
		return repositorio.findAll();
	}

	@Override
	public void guardarPizzas(Pizza pizza) {
		repositorio.save(pizza);
		
	}

}
