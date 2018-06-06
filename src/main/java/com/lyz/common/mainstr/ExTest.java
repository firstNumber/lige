package com.lyz.common.mainstr;

public class ExTest {

	public static void main(String[] args) {

	}

	public static void method() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出问题了");
		}
		System.out.println("over");
	}
}
