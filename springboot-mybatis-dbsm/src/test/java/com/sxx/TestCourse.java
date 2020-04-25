package com.sxx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sxx.mapper.CourseMapper;
import com.sxx.pojo.Course;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestCourse {
	@Autowired
	private Course course;
	@Autowired
	private CourseMapper courseMapper;
	@Test
	public void test1() {
		System.out.println(course);
	}
	@Test
	public void testInsert() {
		courseMapper.insertCourse(course);
		System.out.println("入库成功");
	}
}
