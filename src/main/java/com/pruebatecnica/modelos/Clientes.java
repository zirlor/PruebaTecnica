package com.pruebatecnica.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes 
{
	@Id
	private Integer id_cliente;
	@Column
	private String nombre;
	@Column
	private Integer id_empresan;
	@Column
	private Date creacion;
	@Column
	private Date modificacion;
	@Column
	private String usuario;
	
	// gets y sets
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId_empresan() {
		return id_empresan;
	}
	public void setId_empresan(Integer id_empresan) {
		this.id_empresan = id_empresan;
	}
	public Date getCreacion() {
		return creacion;
	}
	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}
	public Date getModificacion() {
		return modificacion;
	}
	public void setModificacion(Date modificacion) {
		this.modificacion = modificacion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
