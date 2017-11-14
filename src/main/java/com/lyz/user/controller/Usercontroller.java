package com.lyz.user.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyz.common.util.JsonUtil;
import com.lyz.user.model.Carbox;
import com.lyz.user.service.CarboxService;

@Controller
@RequestMapping("/order")
public class Usercontroller {
	@Autowired
	CarboxService carboxService;
	
	@RequestMapping(value="hospitalInfo" , method=RequestMethod.GET)
	@ResponseBody
	public String hospitalInfo(HttpServletRequest request){
		Carbox model = new Carbox();
		model.setBoxLength(11);
		model.setCreateTime(new Date());
		carboxService.create(model);
		
//		return JsonUtil.toJson(model);
		
		
		carboxService.newRedis();
		return "index";
	} 
}
