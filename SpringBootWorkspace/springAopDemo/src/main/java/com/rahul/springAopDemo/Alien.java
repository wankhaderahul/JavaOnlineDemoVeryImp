package com.rahul.springAopDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//AOP:-Aspect oriented programming
//cross cutting concert -->Aspect

@Component
public class Alien {
   
	@Autowired
	private AlienRepo repo;
	
	
	public AlienRepo getRepo() {
		return repo;
	}


	public void setRepo(AlienRepo repo) {
		this.repo = repo;
	}


	public void show() {
		
		/**
		 * suppose write before method use helper class
		 * i.e. 1)log file --> 2 line code
		 *      2)Security -->10 line
		 *      3)Transaction -->begin transaction
		 *      4)Transaction -->commit/terminated -->after business logic
		 * */
		//method u can write business logic
		
		System.out.println("I am Spring AOP ");
		repo.add();
	}
}
