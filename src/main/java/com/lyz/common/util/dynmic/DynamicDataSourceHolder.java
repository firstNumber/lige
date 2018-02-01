package com.lyz.common.util.dynmic;

import com.lyz.common.dynamic.DataSourceEnum;

public class DynamicDataSourceHolder {
	private static final ThreadLocal<DataSourceEnum> holder = new ThreadLocal<DataSourceEnum>();

	public static void putDataSourceKey(DataSourceEnum key) {
		holder.set(key);
	}

	public static DataSourceEnum getDataSourceKey() {
		return holder.get();
	}

	public static void remove() {
		holder.remove();
	}

}
