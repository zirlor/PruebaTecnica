package com.pruebatecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.modelos.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, Integer>
{

}
