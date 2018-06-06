package com.lyz.common.mainstr.fan;

import java.util.ArrayList;
import java.util.List;

public class TestM {

	public static void main(String[] args) {
		TmsOrderBatchObj batch = new TmsOrderBatchObj();
		TmsStoreObj store = new TmsStoreObj();
		store.setAddress("阿拉蕾");
		List<TmsStoreObj> a = new ArrayList<>();
		a.add(store);
		batch.setOrderShortList(a);
		System.out.println(batch);

		CAndB c = new CAndB();
		List<CAndB> b = new ArrayList<>();
		b.add(c);
		batch.setOrderShortList(b);
		System.out.println(batch);

	}

}
