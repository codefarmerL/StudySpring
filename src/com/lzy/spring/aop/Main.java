package com.lzy.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
		Calculator cal = ctx.getBean("calculatorImpl",Calculator.class);
		int result = cal.add(1, 2);
		System.out.println("The result is " + result);
	}

}
