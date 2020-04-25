package com.sxx.mapper;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.sxx.pojo.Academy;

public interface AcademyMapper {
	@Insert("insert into academy values(null,#{name},#{type})")
	int insertAcademy(Academy academy); 
}
