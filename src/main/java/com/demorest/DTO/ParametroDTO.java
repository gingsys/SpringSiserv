package com.demorest.DTO;

public class ParametroDTO {
	
	private Integer IdParametro;
	private String NombreParametro;
	
		public ParametroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParametroDTO(Integer idParametro, String nombreParametro) {
		super();
		IdParametro = idParametro;
		NombreParametro = nombreParametro;
	}
	
	public Integer getIdParametro() {
		return IdParametro;
	}
	public void setIdParametro(Integer idParametro) {
		IdParametro = idParametro;
	}
	public String getNombreParametro() {
		return NombreParametro;
	}
	public void setNombreParametro(String nombreParametro) {
		NombreParametro = nombreParametro;
	}
	
}
