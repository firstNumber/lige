package com.lyz.common.mainstr.annotion;

import java.lang.reflect.Method;

public class TestOne {

	public static void main(String[] args) throws ClassNotFoundException {
		// Class a = Class.forName(UserLogn.class.getName());
		Method[] method = UserLogn.class.getMethods();
		System.out.println(method);
		RoleAuth roleAuth = method[0].getAnnotation(RoleAuth.class);
		System.out.println(roleAuth);

	}

}
