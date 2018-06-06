package com.lyz.common.mainstr;

import java.util.ArrayList;
import java.util.List;

public class LiContain {
	public static void main(String[] args) {
		Persion p = new Persion();
		p.setName("杨幂");

		Persion p3 = new Persion();
		p3.setName("杨幂");
		List<Persion> list = new ArrayList<>();
		list.add(p);
		list.add(p3);

		Persion p2 = new Persion();
		p2.setName("杨幂");
		List<Persion> list2 = new ArrayList<>();
		list2.add(p2);

		for (int i = 0; i < list.size(); i++) {
			if (list.contains(list.get(i))) {
				System.out.println("213123");
			}
		}

	}
}
