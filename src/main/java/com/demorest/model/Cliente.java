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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdCliente")
	private Integer idCliente;
	
	@Column(name = "NombreCliente")
	private String nombreCliente;
	
	@Column(name = "ApellidoPaterno")
	private String apellidoPaterno;
	
	@ManyToOne
	@JoinColumn(name = "TipoDocumento", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(tipo_documento) references parametro(id_parametro)"))
	@JsonBackReference
	private Parametro parametro;
	
	@Column(name = "NumeroDocumento")
	private String numeroDocumento;
	
	@ManyToOne
	@JoinColumn(name = "IdDistrito", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_distrito) references distrito(id_distrito)"))
	@JsonBackReference
	private Distrito distrito;
	
	@Column(name = "DireccionCliente")
	private String direccionCliente;
	
	@Column(name = "TelefonoCliente")
	private String telefonoCliente;
	
	@Column(name = "CorreoCliente")
	private String correoCliente;
	
	@Column(name = "EstadoRegistro")
	private Integer estadoRegistro;
	
	@Column(name = "UsuarioCreacion")
	private String usuarioCreacion;
	
	@Column(name = "FechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "UsuarioModificacion", nullable = true)
	private String usuarioModificacion;
	
	@Column(name = "FechaModificacion", nullable = true)
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
