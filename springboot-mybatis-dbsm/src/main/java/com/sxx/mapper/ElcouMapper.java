package com.sxx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sxx.pojo.Elcou;

public interface ElcouMapper {
	@Select("select * from elcou")
	List<Elcou> findAll();
}
