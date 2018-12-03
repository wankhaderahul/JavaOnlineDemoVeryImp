package com.phone;

public class BuilderMain {
public static void main(String[] args) {
	
	
	Phone ph=new PhoneBuilder().setOs("Android").setRam(2).getPhone();//create object of required parameters  
	System.out.println(ph);
}
	
}
