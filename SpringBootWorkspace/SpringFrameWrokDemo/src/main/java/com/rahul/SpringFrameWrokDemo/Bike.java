package com.rahul.SpringFrameWrokDemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical{
	
	public void drive() {
		System.out.println(" bike driving");
	}

}
