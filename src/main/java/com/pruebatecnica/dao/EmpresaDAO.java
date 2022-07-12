package com.pruebatecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.modelos.Empresa;

public interface EmpresaDAO extends JpaRepository<Empresa, Integer>
{
	
}
