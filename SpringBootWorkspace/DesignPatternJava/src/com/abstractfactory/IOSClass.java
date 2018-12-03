package com.abstractfactory;

public class IOSClass implements OperatingSystemInterface {

	private final String OSNAME;
	
	
	
	public IOSClass() {
		
		OSNAME = "IOS";
	}



	@Override
	public String getOSName() {
		
		return OSNAME;
	}

}
