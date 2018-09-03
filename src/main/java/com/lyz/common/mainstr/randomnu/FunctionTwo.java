package com.lyz.common.mainstr.randomnu;

import java.util.Random;

public class FunctionTwo {

	public static void main(String[] args) {
		Random t = new Random();
		int b = 0;
		int a = t.nextInt(64);
		int c = t.nextInt(32);
		int d = t.nextInt(16);
		int e = t.nextInt(8);
		a = a << 13;
		c = c << 13;
		d = d << 13;
		e = e << 13;
		b = a + c + d + e;
		System.out.println(b);
		System.out.println(1 << 13);
	}

}
