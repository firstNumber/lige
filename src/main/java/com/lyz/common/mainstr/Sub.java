package com.lyz.common.mainstr;

public class Sub {

	public static void main(String[] args) {
		// String number = "123.456";
		// String intNumber = number.substring(0, );
		// System.out.println(intNumber);
		String a = "123.1km";
		if (a.indexOf(".") != -1) {
			System.out.println(a.substring(0, a.indexOf(".") + 2) + "km");
		}

		// String number = "123.456";
		// System.out.println(number.split(".")[0]);

	}

}
