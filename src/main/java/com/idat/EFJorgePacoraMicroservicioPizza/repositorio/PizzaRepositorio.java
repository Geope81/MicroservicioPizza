package com.idat.EFJorgePacoraMicroservicioPizza.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJorgePacoraMicroservicioPizza.modelo.Pizza;

@Repository
public interface PizzaRepositorio extends JpaRepository<Pizza, Integer>{

}
