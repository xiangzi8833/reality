package com.sxx.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	private Integer id;
	@Value("${course.name}")
	private String name;
	@Value("${course.hour}")
	private Integer hour;
	@Value("${course.credit}")
	private Double credit;
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", hour=" + hour + ", credit=" + credit + "]";
	}
	
	
}
