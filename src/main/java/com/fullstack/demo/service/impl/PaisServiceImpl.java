package com.fullstack.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.demo.model.Pais;
import com.fullstack.demo.repository.IPaisRepository;
import com.fullstack.demo.service.IPaisService;

@Service
public class PaisServiceImpl implements IPaisService{
	
	@Autowired
	IPaisRepository repo;

	@Override
	public List<Pais> listar() {
		return repo.findAll();		
	}

	@Override
	public Pais registrar(Pais pais) {
		// TODO Auto-generated method stub
		return repo.save(pais);
	}

	@Override
	public Pais actualizar(Pais pais) {
		// TODO Auto-generated method stub
		return repo.save(pais);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
	}

	@Override
	public Pais listarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}
}
