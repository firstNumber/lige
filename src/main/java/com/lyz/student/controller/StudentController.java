package com.lyz.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyz.common.mq.send.Rabbit;
import com.lyz.common.mq.util.RabbitQueue;
import com.lyz.student.model.obj.Student;
import com.lyz.student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/querystutend.action", method = RequestMethod.GET)
	@ResponseBody
	public String querStudent(@ModelAttribute Student s) {
		// System.out.println(s.getUpdateTime());
		// System.out.println(s.getName());
		// System.out.println(updateTime);
		Rabbit.send(RabbitQueue.LIGE_RABBITMQ, "123213");

		return "hello";
	}
}
