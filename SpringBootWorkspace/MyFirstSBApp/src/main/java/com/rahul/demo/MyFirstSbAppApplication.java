package com.rahul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//@ComponentScan({ "com.rahul.demo", "controller", "service"})
//@ComponentScan(basePackages = {"com.rahul.demo"})
public class MyFirstSbAppApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyFirstSbAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSbAppApplication.class, args);
	}
}
