package com.lyz.common.tool;

import java.io.InputStream;

public class ddd {
	public void a() {
		InputStream templateInputStream = getClass().getClassLoader()
				.getResourceAsStream("com/lyz/common/tool/scaffold/template/Model.txt");
		System.out.println(templateInputStream);
	}
}
