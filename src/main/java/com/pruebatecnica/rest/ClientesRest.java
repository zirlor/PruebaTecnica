package com.pruebatecnica.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.dao.ClientesDAO;
import com.pruebatecnica.modelos.Clientes;

@RestController
@RequestMapping("v1/clientes")
public class ClientesRest 
{
	@Autowired
	public ClientesDAO clientesDao;
	
	//Metodos HTTP - Clientes
	
	@PostMapping("/post")
	public void Post(@RequestBody Clientes clientes)
	{
		clientesDao.save(clientes);
	}
	@GetMapping("/get")
	private List<Clientes> Get()
	{
		return clientesDao.findAll();
	}
	@DeleteMapping("/delete/{id}")
	private void Delete(@PathVariable("id") Integer id)
	{
		clientesDao.deleteById(id);
	}	
	@PutMapping("/put")
	private void Pust(@RequestBody Clientes empresa)
	{
		clientesDao.save(empresa);
	}
}
