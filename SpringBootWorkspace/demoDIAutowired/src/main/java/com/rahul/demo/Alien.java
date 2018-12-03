package com.rahul.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	
	
	//@Qualifier("lap1") //use for @Qualifier searching by 'Name'- @Component("lap1") need @Autowired also when you use @Qualifier
	@Autowired //use for @Autowired searching by 'Type'@Component
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println(" Object created ....");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
	public void show() {
		System.out.println(" In show");
		laptop.display();
	}
	

}
