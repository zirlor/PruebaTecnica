package com.pruebatecnica.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa 
{
	@Id
	private Integer id_empresa;	
	@Column
	private String nombre;	
	@Column
	private Integer id_direccion;
	
	// gets y sets
	public Integer getId_empresa() 
	{
		return id_empresa;
	}
	public void setId_empresa(Integer id_empresa) 
	{
		this.id_empresa = id_empresa;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public Integer getId_direccion() 
	{
		return id_direccion;
	}
	public void setId_direccion(Integer id_direccion) 
	{
		this.id_direccion = id_direccion;
	}
}
