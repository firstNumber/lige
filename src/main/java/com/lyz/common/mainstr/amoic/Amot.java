package com.lyz.common.mainstr.amoic;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Amot {
	public static void main(String[] args) {
		AtomicInteger index = new AtomicInteger(0);
		List<Point> points = new ArrayList<>();// 这是所有点
		// List<Point> copy = Lists.newArrayList(points);
		// class Pair implements Comparable<Pair> {
		// public Point one;
		// public Point two;
		// private double distance = -1;
		//
		// public Pair(Point one, Point two) {
		// this.one = one;
		// this.two = two;
		// distance();
		// }
		//
		// private void distance() {
		// // 计算距离
		// }

		// public int compareTo(Pair pair) {
		// // return Math.abs(pair.distance - this.distance) <= 10e-6;
		// }
	}
	// Lists pairs=points.stream().flatMap((p1)->{
	// copy.remove(index.getAndIncrement());
	// return copy.stream().map((p2)->{new Pair(p1,p2)});
	// }).collect(Lists::newArrayList,
	// (List pairs,Pair p)->{
	// pairs.add(p);
	// },(Pair p1,Pair p2)->{});
	// Collections.sort(pairs);
	// }
}
