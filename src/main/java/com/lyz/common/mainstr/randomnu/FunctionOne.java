package com.lyz.common.mainstr.randomnu;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionOne {
	private static final Logger logger = LoggerFactory.getLogger(FunctionOne.class);
	private static final String FORMAT_STR = "00000";
	private static final DecimalFormat df = new DecimalFormat(FORMAT_STR);
	private static long begin = 0;

	/** 生成18位msgid */
	public static String msgid18() {
		long ttt = System.currentTimeMillis() + 100000000000L;
		long ran = begin++ % 99999;
		if (ran == 0) {
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				logger.error("", e);
			}
			ttt = System.currentTimeMillis() + 100000000000L;
		}
		return ttt + df.format(ran);
	}

	public static void main(String[] args) {
		System.out.println(msgid18());
	}

	public static void test() {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < 1000000000; i++) {
			String msgid = msgid18();
			// System.out.println( msgid );
			if (!set.add(msgid)) {
				System.out.println("重复数据........");
			}

		}
	}
}
