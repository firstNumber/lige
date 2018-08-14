package com.lyz.common.mainstr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ToListjson {
	public static void main(String[] args) {
		// TestJson t = new TestJson();
		// t.setCreateTime(new Date());
		// t.setStr("str");
		// t.setDoub(123d);
		// t.setInte(1);
		// t.setBigd(new BigDecimal("34355"));
		//
		// TestJson t2 = new TestJson();
		// t.setCreateTime(new Date());
		// t.setStr("str2");
		// t.setDoub(12322d);
		// t.setInte(1);
		// t.setBigd(new BigDecimal("123"));
		//
		//
		//
		// List<TestJson> list = new ArrayList<TestJson>();
		// list.add(t);
		// list.add(t2);
		// String listStr = JsonUtil.toJson(list);
		// System.out.println(listStr);
		System.out.println(unRepeatSixCode());

	}

	public static String unRepeatSixCode() {
		String sixChar = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
		Date date = new Date();
		String time = sdf.format(date);
		for (int i = 0; i < time.length() / 2; i++) {
			String singleChar;
			String x = time.substring(i * 2, (i + 1) * 2);
			int b = Integer.parseInt(x);
			if (b < 10) {
				singleChar = Integer.toHexString(Integer.parseInt(x));
			} else if (b >= 10 && b < 36) {
				singleChar = String.valueOf((char) (Integer.parseInt(x) + 55));
			} else {
				singleChar = String.valueOf((char) (Integer.parseInt(x) + 61));
			}
			sixChar = sixChar + singleChar;

		}
		System.out.println("生成一个6位不可重复的字符编码是：" + sixChar);
		return sixChar;

	}
}
