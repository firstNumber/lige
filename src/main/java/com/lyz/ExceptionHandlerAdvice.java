package com.lyz;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.lyz.common.exception.BusiException;
import com.lyz.common.util.MapUtil;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	@ExceptionHandler(value = BusiException.class)
	public ModelAndView exceptionHandler(HttpServletResponse response, BusiException e) throws Exception {
		return new ModelAndView(new MappingJackson2JsonView(), MapUtil.error("啦啦啦"));
	}
}
