package com.sxx.mapper;

import org.apache.ibatis.annotations.Insert;

import com.sxx.pojo.Course;

public interface CourseMapper {
	@Insert("insert into course values(null,#{name},#{hour},#{credit})")
	int insertCourse(Course course);
}
