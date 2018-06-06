package com.lyz.common.mainstr;

public class MonKi {
	public static void main(String[] args) {
		int peachNumber = 1;
		for (int dayN = 7; dayN >= 1; dayN--) {
			peachNumber = (peachNumber + 1) * 2;
		}
		System.out.println(peachNumber);
	}
}
