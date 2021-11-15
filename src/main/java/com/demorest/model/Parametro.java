package com.demorest.model;

import java.util.Date;

public class Parametro {
	
	private Integer IdParametro;
	private Integer IdParametroPadre;
	private String NombreParametro;
	private Integer EstadoRegistro;
	private String UsuarioCreacion;
	private Date FechaCreacion;
	private String UsuarioModificacion;
	private Date FechaModificacion;
	
	public Parametro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parametro(Integer idParametro, Integer idParametroPadre, String nombreParametro, Integer estadoRegistro,
			String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
		super();
		IdParametro = idParametro;
		IdParametroPadre = idParametroPadre;
		NombreParametro = nombreParametro;
		EstadoRegistro = estadoRegistro;
		UsuarioCreacion = usuarioCreacion;
		FechaCreacion = fechaCreacion;
		UsuarioModificacion = usuarioModificacion;
		FechaModificacion = fechaModificacion;
	}
	
	public Integer getIdParametro() {
		return IdParametro;
	}
	public void setIdParametro(Integer idParametro) {
		IdParametro = idParametro;
	}
	public Integer getIdParametroPadre() {
		return IdParametroPadre;
	}
	public void setIdParametroPadre(Integer idParametroPadre) {
		IdParametroPadre = idParametroPadre;
	}
	public String getNombreParametro() {
		return NombreParametro;
	}
	public void setNombreParametro(String nombreParametro) {
		NombreParametro = nombreParametro;
	}
	public Integer getEstadoRegistro() {
		return EstadoRegistro;
	}
	public void setEstadoRegistro(Integer estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}
	public String getUsuarioCreacion() {
		return UsuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		UsuarioCreacion = usuarioCreacion;
	}
	public Date getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	public String getUsuarioModificacion() {
		return UsuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		UsuarioModificacion = usuarioModificacion;
	}
	public Date getFechaModificacion() {
		return FechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		FechaModificacion = fechaModificacion;
	}	
	
}
