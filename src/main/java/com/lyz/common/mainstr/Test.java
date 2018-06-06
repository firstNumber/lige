package com.lyz.common.mainstr;

public class Test {
	public static void main(String[] args) {
		Happy a = new Happy();
		Thread ta = new Thread(a);
		ta.start();
		System.out.println(ta.getName());
		Thread tb = new Thread(a);
		tb.start();
	}
}

class Happy implements Runnable {
	private int x;
	private int y;

	@Override
	public void run() {
		x++;
		y++;
		System.out.println(this.getClass().getName());
		System.out.println("x=" + x + "     y=" + y);
	}

}
