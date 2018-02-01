package com.lyz.common.mainstr.trre;

public class Treesame {

	public static void main(String[] args) {
		// Truck truck = new Truck();
		// truck.setWeight(1000000);
		// truck.setVolume(3000000);
		//
		// Truck truck2 = new Truck();
		// truck2.setWeight(1000000);
		// truck2.setVolume(7000000);
		//
		// Truck truck3 = new Truck();
		// truck3.setWeight(1250000);
		// truck3.setVolume(5500000);
		//
		// TreeMap<Truck, Integer> map = new TreeMap<Truck, Integer>();
		// map.put(truck, 0);
		// map.put(truck2, 0);
		// map.put(truck3, 0);
		// Truck truck10 = new Truck();
		// truck10.setWeight(1000000);
		//
		// Truck tep = map.tailMap(truck10).firstKey();
		// System.out.println(tep.getWeight());
		// System.out.println(tep.getVolume());
		//
		// Truck truck12 = new Truck();
		// truck12.setWeight(1000000);
		//
		// TreeMap<Truck, Integer> map2 = new TreeMap<Truck, Integer>();
		//
		//
		//
		// Truck key = null;
		// Integer integ = null;
		//
		// Iterator iter = map.entrySet().iterator();
		// while (iter.hasNext()) {
		// Map.Entry entry = (Map.Entry) iter.next();
		// // 获取key
		// key = (Truck) entry.getKey();
		// System.out.println(key);
		// // 获取value
		// integ = (Integer) entry.getValue();
		// System.out.println(integ);
		// }

		// Integer a = null;
		// try {
		// if (a > 0) {
		//
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// System.out.println(e);
		// }
		// Ssage ssage = new Ssage();
		// ssage.a();

		final ThreadLocal<Integer> locallog = new ThreadLocal<Integer>();
		locallog.set(1);
		if (1 == locallog.get()) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}

	}

}
