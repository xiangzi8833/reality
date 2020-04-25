package com.sxx;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.sxx.mapper.ElcouMapper;
import com.sxx.pojo.Elcou;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:/properties/elcou.properties")
public class TestElcou {
	@Autowired
	private Elcou elcou;
	@Autowired
	private ElcouMapper elcouMapper;
	
	@Test
	public void testfindAll() {
		List<Elcou> elcouList = elcouMapper.findAll();
		System.out.println(elcouList);
	}
}
