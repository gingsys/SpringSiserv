package com.demorest.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.demorest.model.Distrito;

@Mapper
public interface DistritoRepository {

	@Select("CALL SP_ListarDistritos()")
	List<Distrito> findAll();
	
}
