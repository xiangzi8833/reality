package com.sxx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sxx.controller.AcademyController;
import com.sxx.mapper.AcademyMapper;
import com.sxx.pojo.Academy;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestAcademy {
	@Autowired
	private AcademyMapper academyMapper;
	
	@Autowired
	private AcademyController academyController;	
	//测试整合Mybatis,mapper
	
	@Test
	public void testInsert() {
		Academy academy = new Academy();
		//academy.setId(2);
		academy.setName("经管学院");
		academy.setType("文科");
		academyMapper.insertAcademy(academy);
		System.out.println("入库成功");
	}
	
	//测试lombok,controller
	@Test
	public void testInsert2() {
		Academy academy = new Academy();
		academy.setName("建工学院").setType("工科");
		academyController.insertAcademy(academy);
		System.out.println("入库成功");
	}
}
