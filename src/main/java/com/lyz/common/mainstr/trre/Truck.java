package com.lyz.common.mainstr.trre;

public class Truck implements Comparable<Truck> {
	private int weight;
	private int volume;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int compareTo(Truck o) {
		int ret = 0;
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				if (weight > o.weight) {
					ret = 1;
				}
				if (weight < o.weight) {
					ret = -1;
				}
			}
			if (i == 1) {
				if (volume > o.volume) {
					ret = 1;
				}
				if (volume < o.volume) {
					ret = -1;
				}
			}
			if (0 != ret) {
				break;
			}
		}
		return ret;
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", volume=" + volume + "]";
	}

}
