package com.lzy.spring.aop;

import org.aspectj.lang.JoinPoint;
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
		System.out.println("The method :" + methodName );
	}
}
