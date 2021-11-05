package com.fullstack.demo.service;

import java.util.List;

import com.fullstack.demo.model.Pais;

public interface IPaisService {
	List<Pais> listar();

	Pais registrar(Pais pais);

	Pais actualizar(Pais pais);

	void eliminar(Integer codigo);

	Pais listarPorId(Integer codigo);
}
