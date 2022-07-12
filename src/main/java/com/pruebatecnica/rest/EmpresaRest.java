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

import com.pruebatecnica.dao.EmpresaDAO;
import com.pruebatecnica.modelos.Empresa;

@RestController
@RequestMapping("v1/empresa")
public class EmpresaRest 
{
	@Autowired
	public EmpresaDAO empresaDao;
	
	//Metodos HTTP - Empresa
	
	@PostMapping("/post")
	public void Post(@RequestBody Empresa empresa)
	{
		empresaDao.save(empresa);
	}	
	@GetMapping("/get")
	private List<Empresa> Get()
	{
		return empresaDao.findAll();
	}	
	@DeleteMapping("/delete/{id}")
	private void Delete(@PathVariable("id") Integer id)
	{
		empresaDao.deleteById(id);
	}	
	@PutMapping("/put")
	private void Pust(@RequestBody Empresa empresa)
	{
		empresaDao.save(empresa);
	}
}
