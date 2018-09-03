package com.lyz.common.enumlei;

public class FunctionOne {
	public static void main(String[] args) {
		System.out.println(MerEnum.AUDIT_4.getCode());
		System.out.println(MerEnum.AUDIT_4.find("A4").getErrorMsg());
	}
}
