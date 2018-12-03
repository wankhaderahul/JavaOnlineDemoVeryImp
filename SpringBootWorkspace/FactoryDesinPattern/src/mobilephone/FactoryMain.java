package mobilephone;

public class FactoryMain {
	
	public static void main(String[] args) {
		
		/*OSInterface obj= new AndroidClass();
		obj.spec();*/
		
		OperatingSystemFactory osf=new OperatingSystemFactory();//Define an interface for creating an object, but let subclasses decide which class to instantiate. 
		OSInterface os=osf.getInstance("Android");
		os.spec();
	}

}
