package com.lyz.common.util.dynmic;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceAspect {
	private transient Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Around("")
	public void switchDataSource(ProceedingJoinPoint point ){
		
		Method method = ((MethodSignature)point.getSignature()).getMethod();
		
	}
}
