package com.demorest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "parametro")
public class Parametro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdParametro;
	
	@Column(nullable = true)
	private Integer IdParametroPadre;
	
	@Column
	private String NombreParametro;
	
	@Column
	private Integer EstadoRegistro;
	
	@Column
	private String UsuarioCreacion;
	
	@Temporal(TemporalType.DATE)
	private Date FechaCreacion;
	
	@Column(nullable = true)
	private String UsuarioModificacion;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date FechaModificacion;
	
	public Parametro(Parametro parametro) {
		this(parametro.getIdParametro(),parametro.getIdParametroPadre(),parametro.getNombreParametro(),
				parametro.getEstadoRegistro(),parametro.getUsuarioCreacion(),parametro.getFechaCreacion(),
				parametro.getUsuarioModificacion(),parametro.getFechaModificacion());
		
	}
	
	public Parametro() {}

	public Parametro(Integer idParametro, Integer idParametroPadre, String nombreParametro, Integer estadoRegistro,
			String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
		super();
		this.IdParametro = idParametro;
		this.IdParametroPadre = idParametroPadre;
		this.NombreParametro = nombreParametro;
		this.EstadoRegistro = estadoRegistro;
		this.UsuarioCreacion = usuarioCreacion;
		this.FechaCreacion = fechaCreacion;
		this.UsuarioModificacion = usuarioModificacion;
		this.FechaModificacion = fechaModificacion;
	}
	
	@PrePersist
	public void prePersist() {
		FechaCreacion=new Date();
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
