package com.lzy.spring.aop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectJ {
	
	@Pointcut("execution(* com.lzy.spring.aop.*.*(..))")
	public void declarePointCut() {}
	
	@Before("declarePointCut()")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object [] args = joinPoint.getArgs();
		System.out.println("The method :" + methodName + " start with " + Arrays.asList(args));
	}
	
	@After("declarePointCut()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object [] args = joinPoint.getArgs();
		System.out.println("The method :" + methodName + " end with " + Arrays.asList(args));
	}
}
