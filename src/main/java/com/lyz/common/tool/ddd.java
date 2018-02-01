package com.lyz.common.tool;

import java.io.InputStream;

public class ddd {
	public void a() {

		System.out.println(Thread.currentThread().getContextClassLoader().getResource("/").getPath());
		InputStream templateInputStream = getClass().getClassLoader()
				.getResourceAsStream("com/lyz/common/tool/scaffold/template/Model.txt");
		System.out.println(templateInputStream);

	}
}
