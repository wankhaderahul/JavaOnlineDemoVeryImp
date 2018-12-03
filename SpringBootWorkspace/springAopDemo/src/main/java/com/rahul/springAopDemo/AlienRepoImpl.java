package com.rahul.springAopDemo;

import org.springframework.stereotype.Component;

@Component
public class AlienRepoImpl implements AlienRepo{

	public void add() {
		System.out.println("Call add method in repo");
		
	}

}
