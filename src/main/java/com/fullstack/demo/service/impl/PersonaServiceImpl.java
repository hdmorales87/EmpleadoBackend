package com.fullstack.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fullstack.demo.model.Persona;
import com.fullstack.demo.repository.IPersonaRepository;
import com.fullstack.demo.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	IPersonaRepository repo;

	@Override
	public List<Persona> listar() {		
		return repo.findAll();		
	}

	@Override
	public Persona registrar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
	}

	@Override
	public Persona listarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public Page<Persona> listPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}

}
