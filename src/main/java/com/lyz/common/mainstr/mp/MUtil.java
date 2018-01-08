package com.lyz.common.mainstr.mp;

import java.util.HashMap;
import java.util.Map;

public class MUtil {
	public static void main(String[] args) {
		Map<String, Object> on = new HashMap<String, Object>();
		on.put("1", "唐嫣");
		on.put("2", "杨幂");
		for (String key : on.keySet()) {
			System.out.println("key:" + key + "\t values:" + on.get(key));
		}

		for (Map.Entry<String, Object> entry : on.entrySet()) {
			System.out.println("key:" + entry.getKey() + "\tvalues:" + entry.getValue());
		}

	}
}
