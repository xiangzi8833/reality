package com.sxx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.sxx.pojo.Student;

public interface StudentMapper {
	
	@Insert("insert into student values(null,#{name},#{gender},#{birthday},#{acaId})")
	int insertStudent(Student student);
	@Select("select * from student,academy where aca_id=academy.id;")
	List<Student> findAll();
}
