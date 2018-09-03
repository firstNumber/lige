package com.lyz.common.mainstr.afunction;

public class FunctionOne {

	public static void main(String[] args) {
		System.out.println(SuperClass.value);
	}

}

class SuperClass {
	static {
		System.out.println("--superClass init--");
	}
	public static final int value = 123;
}

class SubClass {
	static {
		System.out.println("--subClass init--");
	}
}
