package com.lyz.common.mainstr.re;

public class Student {
	private String batchNum;
	private String name;

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [batchNum=" + batchNum + ", name=" + name + "]";
	}

}
