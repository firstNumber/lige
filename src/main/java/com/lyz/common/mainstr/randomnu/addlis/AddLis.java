package com.lyz.common.mainstr.randomnu.addlis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddLis {
	public static void main(String[] args) {
		List<String> userList = new ArrayList<>();
		String[] userid = { "aa", "bb", "cc" };
		String[] userid2 = { "dd", "ee", "ff" };
		Collections.addAll(userList, userid);
		Collections.addAll(userList, userid2);

		for (String s : userList) {
			System.out.print(s + "\t");
		}
	}
}
