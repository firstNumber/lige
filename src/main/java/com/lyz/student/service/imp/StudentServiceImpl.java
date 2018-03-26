package com.lyz.student.service.imp;

import org.springframework.stereotype.Service;

import com.lyz.common.mq.send.Rabbit;
import com.lyz.common.mq.util.RabbitQueue;
import com.lyz.student.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Override
	public void queryStudent() {
		Rabbit.send(RabbitQueue.LIGE_RABBITMQ, "我是一个MQ!!!!!");
	}

	@Override
	public void updateboxleng() {
		for (int i = 0; i < 10; i++) {
			try {
				updateboxleng2();
			} catch (Exception ex) {
				System.out.println("错了");
			}
		}
	}

	@Override
	public void updateboxleng2() {
		try {
			// update 1;
			// update 2;
		} catch (Exception ex) {
			throw ex;
		}

	}

}
