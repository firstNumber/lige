package com.lyz.common.util;

public class MainStart {
	public static void main(String[] args) {
		Person person = new Person();
		person.function();
	}
}


class Person{
	void function(){
		System.out.println(getClass());
		
	}
}