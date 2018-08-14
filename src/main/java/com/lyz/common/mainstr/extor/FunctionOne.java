package com.lyz.common.mainstr.extor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FunctionOne {

	public static void main(String[] args) {
		ExecutorService exs = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			exs.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("============" + index);
				}
			});
		}
		System.out.println("-----------------------------");
		ExecutorService exs2 = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			exs2.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("+++++++++++++" + index);
				}
			});
		}
	}
}
