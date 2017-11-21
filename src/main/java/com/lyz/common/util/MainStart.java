package com.lyz.common.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.CharUtils;

public class MainStart {
	public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {
		String nickName = "12葫";

		byte[] t = nickName.substring(0, 1).getBytes("UTF-8");
		for (byte tt : t) {
			System.out.println(tt);
		}
		System.out.println("====================");
		byte[] t1 = nickName.getBytes("UTF-8");
		for (int i = 0; i < t1.length;) {
			byte tt = t1[i];
			if (CharUtils.isAscii((char) tt)) {
				byte[] ba = new byte[1];
				ba[0] = tt;
				i++;
				String result = new String(ba);
				System.out.println("1个字节的字符");
				System.out.println("字符为：" + result);
			}
			if ((tt & 0xE0) == 0xC0) {
				byte[] ba = new byte[2];
				ba[0] = tt;
				ba[1] = t1[i + 1];
				i++;
				i++;
				String result = new String(ba);
				System.out.println("2个字节的字符");
				System.out.println("字符为：" + result);
			}
			if ((tt & 0xF0) == 0xE0) {
				byte[] ba = new byte[3];
				ba[0] = tt;
				ba[1] = t1[i + 1];
				ba[2] = t1[i + 2];
				i++;
				i++;
				i++;
				String result = new String(ba);
				System.out.println("3个字节的字符");
				System.out.println("字符为：" + result);
			}
			if ((tt & 0xF8) == 0xF0) {
				byte[] ba = new byte[4];
				ba[0] = tt;
				ba[1] = t1[i + 1];
				ba[2] = t1[i + 2];
				ba[3] = t1[i + 3];
				i++;
				i++;
				i++;
				i++;
				String result = new String(ba);
				System.out.println("4个字节的字符");
				System.out.println("字符为：" + result);
			}

		}
	}
}
