package com.demorest.model;


public class Distrito{
	
	private Integer IdDistrito;	
	private String NombreDistrito;
	
	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(Integer IdDistrito, String NombreDistrito) {
		super();
		this.IdDistrito = IdDistrito;
		this.NombreDistrito = NombreDistrito;
	}
	
	public Integer getIdDistrito() {
		return IdDistrito;
	}
	public void setIdDistrito(Integer IdDistrito) {
		this.IdDistrito = IdDistrito;
	}
	public String getNombreDistrito() {
		return NombreDistrito;
	}
	public void setNombreDistrito(String NombreDistrito) {
		this.NombreDistrito = NombreDistrito;
	}
	

}
