package com.lyz.common.dynamic;

public enum DataSourceEnum {

	MASTER("master"),

	SLAVE("slave");

	public final String value;

	private DataSourceEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
