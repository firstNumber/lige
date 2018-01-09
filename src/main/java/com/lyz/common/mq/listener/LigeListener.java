package com.lyz.common.mq.listener;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

import com.lyz.common.mq.receive.MQReceiveHandler;
import com.lyz.common.util.JsonUtil;

@Service("ligeListener")
public class LigeListener extends MQReceiveHandler {
	private static Logger logger = Logger.getLogger(LigeListener.class);

	@Override
	public void doBusi(Message message) {
		String dto = JsonUtil.toBean(message.getBody(), String.class);
		System.out.println(dto);
	}

}
