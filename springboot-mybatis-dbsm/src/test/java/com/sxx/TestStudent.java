package com.sxx;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sxx.mapper.StudentMapper;
import com.sxx.pojo.Student;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestStudent {
	@Autowired
	private StudentMapper studentMapper;
	/*@Test
	public void testInsert() {
		Student student = new Student();
		student.setName("张三").setGender("男").setBirthday("1992-10-14").setAcaId(1);
		studentMapper.insertStudent(student);
		System.out.println("success!");
	}*/
	
	@Test
	public void testFindAll() {
		List<Student> studentList = studentMapper.findAll();
		System.out.println(studentList);
	}
}
