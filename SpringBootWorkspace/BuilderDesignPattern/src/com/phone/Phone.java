package com.phone;

public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double screeSize;
	private int battery;
	
	
	public Phone(String os, int ram, String processor, double screeSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screeSize = screeSize;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screeSize=" + screeSize
				+ ", battery=" + battery + "]";
	}
	
	
	

}
