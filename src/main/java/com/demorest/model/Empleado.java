package com.demorest.model;

import java.io.Serializable;
import java.util.Date;

public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idEmpleado;
	
	private String nombreEmpleado;
	
	private String apellidoPaterno;
	
	private String apellidoMaterno;
	
	private Parametro parametro;
	
	private String numeroDocumento;
	
	private Distrito distrito;
	
	private String direccionEmpleado;
	
	private String telefonoEmpleado;
	
	private String correoEmpleado;
	
	private Integer estadoRegistro;
	
	private String usuarioCreacion;
	
	private Date fechaCreacion;
	
	private String usuarioModificacion;
	
	private Date fechaModificacion;
	
	
	public void prePersist() {
		this.fechaCreacion = new Date();
	}
	
		public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(Integer idEmpleado, String nombreEmpleado, String apellidoPaterno, String apellidoMaterno,
			String numerodocumento,  String direccionEmpleado,
			String telefonoEmpleado, String correoEmpleado, Integer estadoRegistro, String usuarioCreacion,
			Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numeroDocumento = numerodocumento;
		this.direccionEmpleado = direccionEmpleado;
		this.telefonoEmpleado = telefonoEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Empleado(Integer idEmpleado, String nombreEmpleado, String apellidoPaterno, String apellidoMaterno,
			Parametro parametro ,String numeroDocumento,  String direccionEmpleado,
			String telefonoEmpleado, String correoEmpleado, Integer estadoRegistro, String usuarioCreacion,
			Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.parametro = parametro;
		this.numeroDocumento = numeroDocumento;
		this.direccionEmpleado = direccionEmpleado;
		this.telefonoEmpleado = telefonoEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Empleado(Integer idEmpleado, String nombreEmpleado, String apellidoPaterno, String apellidoMaterno,
			Parametro parametro ,String numeroDocumento, Distrito distrito ,String direccionEmpleado,
			String telefonoEmpleado, String correoEmpleado, Integer estadoRegistro, String usuarioCreacion,
			Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.parametro = parametro;
		this.numeroDocumento = numeroDocumento;
		this.distrito = distrito;
		this.direccionEmpleado = direccionEmpleado;
		this.telefonoEmpleado = telefonoEmpleado;
		this.correoEmpleado = correoEmpleado;
		this.estadoRegistro = estadoRegistro;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Parametro getParametro() {
		return parametro;
	}
	public void setParametro(Parametro parametro) {
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
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}
	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}
	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}
	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}
	public String getCorreoEmpleado() {
		return correoEmpleado;
	}
	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
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
	public Date getFechaCrecion() {
		return fechaCreacion;
	}
	public void setFechaCrecion(Date fechaCrecion) {
		this.fechaCreacion = fechaCrecion;
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
