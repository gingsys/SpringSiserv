package com.demorest.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.demorest.DTO.ParametroDTO;


@Mapper
public interface ParametroRepository{	
	
	@Select("CALL SP_ListarParametroPorPadre(#{idParametroPadre})")
	List<ParametroDTO> buscarPorPadre(@Param("idParametroPadre") Integer idParametroPadre);

}
