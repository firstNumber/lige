package com.lyz.common.util.teard;

public class ThreadTest implements Runnable {
	public volatile  String orderNumber ="零零零零零零零零零零";
	@Override
	public void run() {
		System.out.println(orderNumber);
	}

}
