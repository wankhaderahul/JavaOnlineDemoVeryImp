package com.rahul.SpringFrameWrokDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical {
	
	@Autowired
	private Tyre tyre; 
	
	public void drive() {
		
		System.out.println(" car driving "+"= Tyre object "+tyre);
	}

}
