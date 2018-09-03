package com.lyz.common.mainstr;

import java.util.Random;

public class FunctionHight {

	public static void main(String[] args) {
		System.out.println(FunctionHight.CreateNoncestr());
	}

	public static String CreateNoncestr() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String res = "";
		for (int i = 0; i < 16; i++) {
			Random rd = new Random();
			res += chars.charAt(rd.nextInt(chars.length() - 1));
		}
		return res;
	}

}
