package com.lyz.common.mainstr;

import java.util.ArrayList;
import java.util.List;

public class Sub {

	public static void main(String[] args) {
		// String number = "123.456";
		// String intNumber = number.substring(0, );
		// System.out.println(intNumber);
		// String a = "123.1km";
		// if (a.indexOf(".") != -1) {
		// System.out.println(a.substring(0, a.indexOf(".") + 2) + "km");
		// }
		// String number = "123.456";
		// System.out.println(number.split(".")[0]);
		// Md5Hash md5Hash = new Md5Hash("159109953561234", "1236");
		// System.out.println(md5Hash.toHex());
		//
		// System.out.println(UUID.randomUUID().toString().replace("-",
		// "").substring(0, 16));
		// }
		List<String> list = new ArrayList<String>() {
			{
				add("a");
				add("b");
			}
		};
		list.add(0, "c");
		for (String a : list) {
			System.out.println(a);
		}
	}

}
