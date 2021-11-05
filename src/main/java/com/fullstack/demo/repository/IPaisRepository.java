package com.fullstack.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.demo.model.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer> {

}
