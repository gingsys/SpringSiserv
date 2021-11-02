package com.demorest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "parametro")
public class Parametro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdParametro")
	private Integer idParametro;
	
	@Column(nullable = true, name = "IdParametroPadre")
	private Integer idParametroPadre;
	
	@Column(name = "NombreParametro")
	private String nombreParametro;
	
	@Column(name = "EstadoRegistro")
	private Integer estadoRegistro;
	
	@Column(name = "UsuarioCreacion")
	private String usuarioCreacion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaCreacion")
	private Date fechaCreacion;
	
	@Column(nullable = true, name = "UsuarioModificacion")
	private String usuarioModificacion;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = true, name = "FechaModificacion")
	private Date fechaModificacion;
	
	@OneToMany(mappedBy = "parametro")
	private Collection<Empleado> itemsEmpleado = new ArrayList<>();
	
	@OneToMany(mappedBy = "parametro")
	private Collection<Cliente> itemsCliente = new ArrayList<>();
	
	public Parametro(Parametro parametro) {
		this(parametro.getIdParametro(),parametro.getIdParametroPadre(),parametro.getNombreParametro(),
				parametro.getEstadoRegistro(),parametro.getUsuarioCreacion(),parametro.getFechaCreacion(),
				parametro.getUsuarioModificacion(),parametro.getFechaModificacion());
		
	}
	
	public Parametro() {}

	public Parametro(Integer idParametro, Integer idParametroPadre, String nombreParametro, Integer estadoRegistro,
			String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
		super();
		this.idParametro = idParametro;
		this.idParametroPadre = idParametroPadre;
		this.nombreParametro = nombreParametro;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Parametro(Integer idParametro, Integer idParametroPadre, String nombreParametro, Integer estadoRegistro,
			String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Collection<Empleado> itemsEmpleado) {
		super();
		this.idParametro = idParametro;
		this.idParametroPadre = idParametroPadre;
		this.nombreParametro = nombreParametro;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.itemsEmpleado = itemsEmpleado;
	}
	
	public Parametro(Integer idParametro, Integer idParametroPadre, String nombreParametro, Integer estadoRegistro,
			String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Collection<Empleado> itemsEmpleado, Collection<Cliente> itemsCliente) {
		super();
		this.idParametro = idParametro;
		this.idParametroPadre = idParametroPadre;
		this.nombreParametro = nombreParametro;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.itemsEmpleado = itemsEmpleado;
		this.itemsCliente = itemsCliente;
	}
	
	
	@PrePersist
	public void prePersist() {
		fechaCreacion=new Date();
	}	
		
	public Integer getIdParametro() {
		return idParametro;
	}
	public void setIdParametro(Integer idParametro) {
		this.idParametro = idParametro;
	}
	public Integer getIdParametroPadre() {
		return idParametroPadre;
	}
	public void setIdParametroPadre(Integer idParametroPadre) {
		this.idParametroPadre = idParametroPadre;
	}
	public String getNombreParametro() {
		return nombreParametro;
	}
	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}
	public Integer getEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(Integer estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	
	public Collection<Empleado> getItemsEmpleado(){
		return itemsEmpleado;
	}
	public void setItemsEmpleado(Collection<Empleado> itemsEmpleado) {
		this.itemsEmpleado = itemsEmpleado;
	}
	public Collection<Cliente> getItemsCliente(){
		return itemsCliente;
	}
	public void setItemsCliente(Collection<Cliente> itemsCliente) {
		this.itemsCliente = itemsCliente;
	}
	
}
