package com.abstractfactory;

public class AndroidClass  implements OperatingSystemInterface{
	
	private final String OSNAME;

	public AndroidClass() {
		
		OSNAME = "ANDROID";
	}

	@Override
	public String getOSName() {
		
		return OSNAME;
	}

	

}
