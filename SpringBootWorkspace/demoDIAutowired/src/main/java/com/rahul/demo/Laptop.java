package com.rahul.demo;

import org.springframework.stereotype.Component;

//@Component("lap1") //use for @Qualifier searching by 'Name'
@Component //use for @Autowired searching by 'Type'
public class Laptop {
	
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	
	public void display() {
		System.out.println("In Laptop");
	}

}
