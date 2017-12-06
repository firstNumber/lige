package com.lyz.common.util;

public class MainStart {
	public static void main(String[] args) {
		final Test tt = new Test();
		final ThreadLocal<Integer> tl =new ThreadLocal<Integer>();
 		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				tt.a =0;
				tl.set(tt.a);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(tl.get());
				System.out.println("========="+tt.a);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				tt.a = 222;
				tl.set(tt.a);
				System.out.println(tl.get());
				System.out.println("========="+tt.a);
			}
		});
		
		t.start();
		t2.start();
		
		
	}
}


class Test{
	int a = 0;
}


