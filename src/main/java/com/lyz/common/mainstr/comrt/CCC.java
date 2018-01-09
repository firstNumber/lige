package com.lyz.common.mainstr.comrt;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CCC {

	public static void main(String[] args) {
		People p = new People();
		p.price = new BigDecimal("98.3");

		People p2 = new People();
		p2.price = new BigDecimal("95.2");
		List<People> pList = new ArrayList<>();
		pList.add(p);
		pList.add(p2);

		Collections.sort(pList, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				return o1.price.compareTo(o2.price);
			}
		});

		for (People people : pList) {
			System.out.println(people.price);
		}

	}

}
