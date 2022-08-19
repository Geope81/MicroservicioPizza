package com.idat.EFJorgePacoraMicroservicioPizza.servicio;

import java.util.List;

import com.idat.EFJorgePacoraMicroservicioPizza.modelo.Pizza;

public interface PizzaServicio {
	
	public List<Pizza> listarPizzas();
	public void guardarPizzas(Pizza pizza);

}
