package com.demorest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "distrito")
public class Distrito implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDistrito;
	
	@Column(name = "nombredistrito")
	private String nombreDistrito;
	
	@OneToMany(mappedBy = "distrito")
	private Collection<Empleado> itemsEmpleado = new ArrayList<Empleado>();
	
	@OneToMany(mappedBy = "distrito")
	private Collection<Cliente> itemsCliente = new ArrayList<Cliente>();
		
	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(Integer idDistrito, String nombreDistrito) {
		super();
		this.idDistrito = idDistrito;
		this.nombreDistrito = nombreDistrito;
	}
	
	public Distrito(Integer idDistrito, String nombreDistrito, Collection<Empleado> itemsEmpleado) {
		super();
		this.idDistrito = idDistrito;
		this.nombreDistrito = nombreDistrito;
		this.itemsEmpleado = itemsEmpleado;
	}
	
	public Distrito(Integer idDistrito, String nombreDistrito, Collection<Empleado> itemsEmpleado, Collection<Cliente> itemsCliente) {
		super();
		this.idDistrito = idDistrito;
		this.nombreDistrito = nombreDistrito;
		this.itemsEmpleado = itemsEmpleado;
		this.itemsCliente = itemsCliente;
	}
	
	public Integer getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(Integer idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getNombreDistrito() {
		return nombreDistrito;
	}
	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}
	
	
	public Collection<Empleado> getEmpleado(){
		return itemsEmpleado;
	}
	public void setItemsEmpleado(Collection<Empleado> itemsEmpleado) {
		this.itemsEmpleado = itemsEmpleado;
	}
	public Collection<Cliente> getClienteo(){
		return itemsCliente;
	}
	public void setItemsCliente(Collection<Cliente> itemsCliente) {
		this.itemsCliente = itemsCliente;
	}

}
