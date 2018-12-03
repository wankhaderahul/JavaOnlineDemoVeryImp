package com.rahul.SpringCoreAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.rahul.SpringCoreAnnotation")//Search by type
public class AppConfig {

	
	// if u r use @component in class and @ComponentScan in config class not need to define in bean
	/*@Bean
	public Samsang getPhone() {
		
		return new Samsang();
		
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		
		return new MobileProcessorImpl();
		
	}*/
	
}
