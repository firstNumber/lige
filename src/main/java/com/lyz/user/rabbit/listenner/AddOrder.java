package com.lyz.user.rabbit.listenner;

import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.common.mq.receive.MQReceiveHandler;
import com.lyz.common.mq.util.RabbitQueue;
import com.lyz.common.util.JsonUtil;
import com.lyz.user.model.Carbox;
import com.lyz.user.model.obj.CarBoxDto;
import com.lyz.user.service.CarboxService;

@Service("addOrderListener")
public class AddOrder extends MQReceiveHandler {
	@Autowired
	CarboxService carboxService;
	@Override
	protected void doBusi(Message message) {
		String queueName = message.getMessageProperties().getConsumerQueue();
		if (RabbitQueue.LIGE_RABBITMQ.toString().equals(queueName)) {
			CarBoxDto carboxdto = new CarBoxDto();
			System.out.println(message.getBody());
			carboxdto = JsonUtil.toBean(message.getBody(), CarBoxDto.class);
		}
	}

}
