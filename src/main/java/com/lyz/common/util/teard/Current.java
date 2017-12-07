package com.lyz.common.util.teard;

import java.util.concurrent.atomic.AtomicLong;

public class Current {
	static AtomicLong counter = new AtomicLong(0);
	public static long addOne(){
		return counter.incrementAndGet();
	}
	
	public static void main(String[] args) {
		System.out.println(Current.addOne());
		for(int i =0; 0<10;i++){
			
		}
	
	}
}
