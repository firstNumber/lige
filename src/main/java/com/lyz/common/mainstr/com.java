package com.lyz.common.mainstr;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class com {
	public static void main(String[] args) {
		// Person person = new Person();
		//
		// List<String> a = new ArrayList<>();
		// a.add(null);
		// person.setS(a);
		//
		// System.out.println(JsonUtil.toJson(person));

		BigDecimal a = new BigDecimal("0.00");
		// String c = String.format("%.2f", a);
		// System.out.println(c);
		System.out.println(a.intValue() + "");

		BigDecimal setScale = a.setScale(2, RoundingMode.HALF_DOWN);
		System.out.println(setScale);
		// String c = number(a);
		// System.out.println(c);
	}

	public static String number(BigDecimal num) {
		DecimalFormat format = new DecimalFormat("0.00");
		String a = format.format(num);
		return a;
	}
}
