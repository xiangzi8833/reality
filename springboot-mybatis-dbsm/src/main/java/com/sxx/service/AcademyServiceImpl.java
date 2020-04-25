package com.sxx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxx.mapper.AcademyMapper;
import com.sxx.pojo.Academy;
@Service
public class AcademyServiceImpl implements AcademyService {
	@Autowired
	private AcademyMapper academyMapper;
	@Override
	public int insertAcademy(Academy academy) {
		
		return academyMapper.insertAcademy(academy);
	}

}
