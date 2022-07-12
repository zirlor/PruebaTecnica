package com.pruebatecnica.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Direcciones 
{	
	@Id
	private Integer id_direccion;
	@Column
	private Integer id_cliente;
	@Column
	private String direccion;
	
	// gets y sets
	public Integer getId_direccion() {
		return id_direccion;
	}
	public void setId_direccion(Integer id_direccion) {
		this.id_direccion = id_direccion;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
