package com.lyz.common.mainstr;

import com.lyz.common.mq.send.Rabbit;
import com.lyz.common.mq.util.RabbitQueue;

public class hello {

	public static void main(String[] args) {
		// double d = 39.955296;
		// System.out.println((int) d);

		Rabbit.send(RabbitQueue.LIGE_RABBITMQ, "我是第一个 Mq.");
	}

}
