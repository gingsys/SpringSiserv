package com.demorest.model;

import java.util.Date;

public class Cliente{
	
	
	private Integer idCliente;
	
	private String nombreCliente;
	
	private String apellidoPaterno;
	
	private Parametro parametro;
	
	private String numeroDocumento;
	
	private Distrito distrito;
	
	
	private String direccionCliente;
	
	
	private String telefonoCliente;
	
	
	private String correoCliente;
	
	
	private Integer estadoRegistro;
	
	
	private String usuarioCreacion;
	
	
	private Date fechaCreacion;
	
	
	private String usuarioModificacion;
	
	
	private Date fechaModificacion;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(Integer idCliente, String nombreCliente, String apellidoPaterno, 
			String numeroDocumento, String direccionCliente, String telefonoCliente,
			String correoCliente, Integer estadoRegistro, String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroDocumento = numeroDocumento;
		this.direccionCliente = direccionCliente;
		this.telefonoCliente = telefonoCliente;
		this.correoCliente = correoCliente;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Cliente(Integer idCliente, String nombreCliente, String apellidoPaterno, Parametro parametro,
			String numeroDocumento, String direccionCliente, String telefonoCliente,
			String correoCliente, Integer estadoRegistro, String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoPaterno = apellidoPaterno;
		this.parametro = parametro;
		this.numeroDocumento = numeroDocumento;
		this.direccionCliente = direccionCliente;
		this.telefonoCliente = telefonoCliente;
		this.correoCliente = correoCliente;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Cliente(Integer idCliente, String nombreCliente, String apellidoPaterno, Parametro parametro,
			String numeroDocumento, Distrito distrito,String direccionCliente, String telefonoCliente,
			String correoCliente, Integer estadoRegistro, String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoPaterno = apellidoPaterno;
		this.parametro = parametro;
		this.numeroDocumento = numeroDocumento;
		this.distrito = distrito;
		this.direccionCliente = direccionCliente;
		this.telefonoCliente = telefonoCliente;
		this.correoCliente = correoCliente;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public Parametro getParametro() {
		return parametro;
	}
	public void setTipoDocumento(Parametro parametro) {
		this.parametro = parametro;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Distrito getDistrito() {
		return distrito;
	}
	public void setIdDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getCorreoCliente() {
		return correoCliente;
	}
	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
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
		
}
