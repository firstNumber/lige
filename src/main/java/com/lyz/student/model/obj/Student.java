package com.lyz.student.model.obj;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class Student {
//	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updateTime;
	
	private String name;

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
