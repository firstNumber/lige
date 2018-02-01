package com.lyz.common.mainstr.re;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class srac {
	public static void main(String[] args) {
		Student s = new Student();
		s.setBatchNum("B1");
		s.setName("小明");
		Student s2 = new Student();
		s2.setBatchNum("B2");
		s2.setName("唐嫣");
		List<Student> sList = new ArrayList<Student>();
		sList.add(s);
		sList.add(s2);
		Iterator<Student> it = sList.iterator();
		while (it.hasNext()) {
			Student x = it.next();
			if (x.getBatchNum().equals("B1")) {
				it.remove();
				System.out.println(x.toString());
			}
			System.out.println(x.toString());
		}
		System.out.println(sList.size());

		// System.out.println(sList.size());
		// List<String> sList = new ArrayList<>();
		// sList.add("B1");
		// sList.add("B2");
		// if (sList.contains("B1")) {
		// sList.remove("B1");
		// }
		// System.out.println(sList.toString());
		// int cout = 0;
		// for (Student student : sList) {
		// ++cout;
		// if (student.getBatchNum().equals("B1")) {
		// sList.remove(student);
		// System.out.println(student.toString());
		// }
		// System.out.println(cout);
		// }

	}
}
