package com.lyz.common.util;

import com.lyz.common.util.teard.ThreadTest;

public class MainStart {
	public static void main(String[] args) throws InterruptedException {
		ThreadTest test0 = new ThreadTest();
		new Thread(test0,"线程1").start();
		ThreadTest test = new ThreadTest();
		test.orderNumber ="一一一一一一";
		new Thread(test,"线程2").start();
		
		ThreadTest test1 = new ThreadTest();
		test1.orderNumber ="二二二二二二";
		new Thread(test1,"线程3").start();
		
	}
}
