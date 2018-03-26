package com.lyz.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestPerson {
	// public String name="啊啊啊啊";
	public static void main(String[] args) {
		// Calendar c = Calendar.getInstance();
		// c.set(Calendar.HOUR_OF_DAY, "2018-03-06");
		// c.set(Calendar.MINUTE, 0);
		// c.set(Calendar.SECOND, 0);
		// Date maxDate = c.getTime();
		// c.add(Calendar.DATE, -1);
		// Date minDate = c.getTime();
		//
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sf.parse("2018-03-05 14:10:07");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.DATE, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		date = calendar.getTime();
		System.out.println(sf.format(date));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		date = calendar.getTime();
		System.out.println(sf.format(date));
	}
}
