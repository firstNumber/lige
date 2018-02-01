package com.lyz.cabox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyz.cabox.service.CarboxService;

@Controller
@RequestMapping("/carbox")
public class CarboxController {

	@Autowired
	private CarboxService carboxService;

	@RequestMapping(value = "/updatebox.action", method = RequestMethod.GET)
	@ResponseBody
	public String updatebox() {
		carboxService.updateBoxleng();
		return "1";
	}

	@RequestMapping(value = "/updatebox2.action", method = RequestMethod.GET)
	@ResponseBody
	public String updatebox2() {
		carboxService.updateBoxleng2();
		return "2";
	}

}
