package com.fullstack.demo.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.fullstack.demo.model.Persona;

public interface IPersonaService {
	
	List<Persona> listar();

	Persona registrar(Persona persona);

	Persona actualizar(Persona persona);

	void eliminar(Integer codigo);

	Persona listarPorId(Integer codigo);
	
	Page<Persona> listPageable(Pageable pageable);
}
