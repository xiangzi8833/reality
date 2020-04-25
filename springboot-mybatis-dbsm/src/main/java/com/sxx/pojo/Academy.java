package com.sxx.pojo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.experimental.Accessors;

@Component
@Accessors(chain=true)//链式加载
@Data
public class Academy {
	private Integer id;
	private String name;
	private String type;
	/*
	 * public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	*/
	
	
}
