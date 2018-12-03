package com.factory;

public class FactoryMain {
	
	public static void main(String[] args) {
		//OSInterface os=new AndroidClass();// without Factory call interface
		
		Factory f=new Factory();
		OSInterface os=f.getInstance("IOS");
		os.spec();
	}

}
