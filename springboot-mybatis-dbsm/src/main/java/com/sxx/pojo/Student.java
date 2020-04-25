package com.sxx.pojo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.experimental.Accessors;

@Component
@Data
@Accessors(chain=true)
public class Student {
	private Integer id;
	private String name;
	private String gender;
	private String birthday;
	private Integer acaId;
}
