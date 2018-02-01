package com.lyz.common.mainstr.amoic;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LisAm {
	public static void main(String[] args) {
		List<Point> points = new ArrayList<>();// 这是所有点
		class Pair implements Comparable<Pair> {
			public Point one;
			public Point two;
			private double distance = -1;

			public Pair(Point one, Point two) {
				this.one = one;
				this.two = two;
				distance();
			}

			private void distance() {
				// 计算距离
			}

			public int compareTo(Pair pair) {
				if (Math.abs(pair.distance - this.distance) <= 10e-6) {
					return 0;
				} else if (pair.distance > this.distance) {
					return -1;
				} else {
					return 1;
				}

			}
		}
		List pairs = new ArrayList<>();
		for (int i = 0, j = 1, l = points.size(); i < l; i++, j++) {
			for (int k = j; k < l; k++) {
				pairs.add(new Pair(points.get(i), points.get(k)));
			}
		}
		Collections.sort(pairs);
	}
}
