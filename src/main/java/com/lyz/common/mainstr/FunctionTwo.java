package com.lyz.common.mainstr;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunctionTwo {

	public static void main(String[] args) {
		Set<Long> tim = new HashSet<>();
		tim.add(123L);
		long a = System.currentTimeMillis();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
		String c = sf.format(new Date());
		System.out.println(c);

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add(2, "f");
		System.out.println(list);

	}

}
