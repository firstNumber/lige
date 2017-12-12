package com.lyz.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyz.student.model.obj.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping(value ="/querystutend.action" ,method=RequestMethod.GET )
	@ResponseBody
	public String querStudent(@ModelAttribute Student s){
		System.out.println(s.getUpdateTime());
		System.out.println(s.getName());
//		System.out.println(updateTime);
		return "hello";
	}
}
