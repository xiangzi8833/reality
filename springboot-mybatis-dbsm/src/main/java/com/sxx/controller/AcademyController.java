package com.sxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sxx.pojo.Academy;
import com.sxx.service.AcademyService;

@Controller
public class AcademyController {
	@Autowired
	private AcademyService academyService;
	
	@RequestMapping("/insertAcademy")
	@ResponseBody
	public int insertAcademy(Academy academy) {
		return academyService.insertAcademy(academy);
	}
}
