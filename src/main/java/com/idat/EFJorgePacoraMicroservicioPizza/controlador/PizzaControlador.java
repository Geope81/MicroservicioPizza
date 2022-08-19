package com.idat.EFJorgePacoraMicroservicioPizza.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFJorgePacoraMicroservicioPizza.modelo.Pizza;
import com.idat.EFJorgePacoraMicroservicioPizza.servicio.PizzaServicio;

@Controller
@RequestMapping("/api/v1/pizza")
public class PizzaControlador {
	
	@Autowired
	private PizzaServicio servicio; 
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizzas() {
		return servicio.listarPizzas(); 
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizza) {
		servicio.guardarPizzas(pizza);
	}

}
