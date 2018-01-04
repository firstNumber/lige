package com.lyz.common.mainstr.ins;

import java.math.BigDecimal;

import com.lyz.common.mainstr.model.TestJson;

public class Mapins {

	public static void main(String[] args) {
//		Map map = new HashMap<String, Object>();
//		map.put("a", "小明");
//		Object o = map;
//	
//		System.out.println(o.toString());
//		if(o instanceof Map){
//			System.out.println("啦啦啦啦啦啦啦啦");
//		}
//		System.out.println(o.getClass().isAssignableFrom(Map.class));
		
		BigDecimal totalm =  new BigDecimal(0.00001*1000);
//		System.out.println(totalm.doubleValue());
//		double a = 0.0001*1000;
//		System.out.println(a);
		
//		BigDecimal amt = new BigDecimal(1.1);
//        BigDecimal[] results = amt.divideAndRemainder(BigDecimal.valueOf(1));
//        System.out.println(results[0]);
//        System.out.println(results[1]);
		
//		long a = 1245;
//		System.out.println(a/1000);
//	

		TestJson a  = new TestJson();
		a.setStr(19.12345601f);
		 System.out.println(a.str);
		
	}

}
