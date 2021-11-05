package com.fullstack.demo.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.demo.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer>{

	Page<Persona> findAll(Pageable pageable);
	

}
