package com.demorest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEmpleado")
	private Integer idEmpleado;
	
	@Column(name = "NombreEmpleado")
	private String nombreEmpleado;
	
	@Column(name = "ApellidoPaterno")
	private String apellidoPaterno;
	
	@Column(name = "ApellidoMaterno")
	private String apellidoMaterno;
	
	@ManyToOne
	@JoinColumn(name = "TipoDocumento", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(tipo_documento) references parametro(id_parametro)"))
	@JsonBackReference
	private Parametro parametro;
	
	@Column(name = "NumeroDocumento",length = 11)
	private String numeroDocumento;
	
	@ManyToOne
	@JoinColumn(name = "IdDistrito", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_distrito) references distrito(id_distrito)"))
	@JsonBackReference
	private Distrito distrito;
	
	@Column(name = "DireccionEmpleado")
	private String direccionEmpleado;
	
	@Column(name = "TelefonoEmpleado")
	private String telefonoEmpleado;
	
	@Column(name = "CorreoEmpleado")
	private String correoEmpleado;
	
	@Column(name = "EstadoRegistro")
	private Integer estadoRegistro;
	
	@Column(name = "UsuarioCreacion")
	private String usuarioCreacion;
	
	@Column(name = "FechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "UsuarioModificacion", nullable = true)
	private String usuarioModificacion;
	
	@Column(name = "fechaModificacion", nullable = true)
	private Date fechaModificacion;
	
	@PrePersist
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
