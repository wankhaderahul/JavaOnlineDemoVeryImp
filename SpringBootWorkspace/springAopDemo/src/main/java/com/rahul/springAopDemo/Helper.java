package com.rahul.springAopDemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Advice -->what --> Before, After,
//Pointcut ->when

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

	@Before("execution(public void show())")
	public void log() {
		
		System.out.println(" called show() method before");
	}

	@After("execution(public void show())")
    public void security() {
		
		System.out.println(" Security");
	}

public void transactional() {
	
	System.out.println(" Bigin Transaction");
}
}
