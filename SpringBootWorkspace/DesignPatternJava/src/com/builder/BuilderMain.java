package com.builder;

public class BuilderMain {
	
	public static void main(String[] args) {
		
		PhoneBuilder pb=new PhoneBuilder().setBattery(3100).setRam(2);
		pb.getPhone();
		System.out.println(pb);
		
	}

}
