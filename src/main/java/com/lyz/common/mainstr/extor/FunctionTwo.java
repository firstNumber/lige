package com.lyz.common.mainstr.extor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FunctionTwo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date(Long.valueOf("1535904000000"));
		System.out.println(sf.format(d));
	}
}
