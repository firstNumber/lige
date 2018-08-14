package com.lyz.common.mainstr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FunctionThird {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date a = format.parse("2018-07-23 17:12:31");
		Date b = format.parse("2018-07-23 16:33:47");
		int nexTime = 180;
		long zbTime = (a.getTime() - b.getTime()) / 1000 / nexTime;
		System.out.println(zbTime);
		double maxTrace = zbTime * 0.5;
		if (maxTrace > 10) {
			System.out.println(maxTrace);
		}

	}
}
