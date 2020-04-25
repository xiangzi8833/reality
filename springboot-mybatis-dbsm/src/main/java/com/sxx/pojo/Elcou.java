package com.sxx.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:/properties/elcou.properties")
@ConfigurationProperties(prefix="elcou")
public class Elcou {
	private Integer stuId;
	private Integer couId;
	private Integer score;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public Integer getCouId() {
		return couId;
	}
	public void setCouId(Integer couId) {
		this.couId = couId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Elcou [stuId=" + stuId + ", couId=" + couId + ", score=" + score + "]";
	}
	
}
