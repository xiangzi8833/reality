package com.sxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//主启动类
@SpringBootApplication
//为mapper接口创建代理对象
@MapperScan("com.sxx.mapper")
public class SpringBootRun {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRun.class, args);
	}
}
