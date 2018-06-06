package com.lyz.common.mainstr;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name = "123";
	private Integer age;
	private List<String> s = new ArrayList<>();

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getS() {
		return s;
	}

	public void setS(List<String> s) {
		this.s = s;
	}

}
