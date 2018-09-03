package com.lyz.common.mainstr.afunction;

public class ArrMain {

	public static void main(String[] args) {
		TestArr a = new TestArr() {
			@Override
			public boolean call(int a) {
				return false;
			}
		};
	}

}
