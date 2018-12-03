package com.rahul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoDiAutowiredApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(DemoDiAutowiredApplication.class, args);
	
	/*Alien a=new Alien();
	a.show();*/
	
	Alien a=context.getBean(Alien.class);
	a.show();
	
	
	}
}
