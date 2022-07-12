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

import com.pruebatecnica.dao.DireccionesDAO;
import com.pruebatecnica.modelos.Direcciones;

@RestController
@RequestMapping("v1/direcciones")
public class DireccionesRest 
{
	@Autowired
	public DireccionesDAO direccionesDao;
	
	//Metodos HTTP - Direcciones
	
	@PostMapping("/post")
	public void Post(@RequestBody Direcciones direcciones)
	{
		direccionesDao.save(direcciones);
	}	
	@GetMapping("/get")
	private List<Direcciones> Get()
	{
		return direccionesDao.findAll();
	}	
	@DeleteMapping("/delete/{id}")
	private void Delete(@PathVariable("id") Integer id)
	{
		direccionesDao.deleteById(id);
	}	
	@PutMapping("/put")
	private void Pust(@RequestBody Direcciones direcciones)
	{
		direccionesDao.save(direcciones);
	}
}
