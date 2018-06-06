package com.lyz.common.mainstr;

import java.util.Calendar;
import java.util.Date;

public class TestOne {
	public static void main(String[] args) {
		// String time = "2015/10/21 13:20";// 获取制定日期时间戳
		// Date date1 = null;
		// try {
		// date1 = new SimpleDateFormat("yyyy/MM/dd").parse(time);
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		// long Timestamp = date1.getTime();
		// System.out.println(Timestamp + "获取制定日期时间戳");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 16);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Date date = calendar.getTime();
		System.out.println(date);

		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(new Date());
		calendar2.set(Calendar.HOUR_OF_DAY, 17);
		calendar2.set(Calendar.MINUTE, 0);
		calendar2.set(Calendar.SECOND, 0);
		Date date2 = calendar2.getTime();
		System.out.println(date2);
		Date orgin = new Date();
		if (orgin.after(date) && orgin.before(date2)) {
			System.out.println("12");
		} else {
			System.out.println("33");
		}

	}
}
