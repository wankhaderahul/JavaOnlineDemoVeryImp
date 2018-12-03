package mobilephone;

/*The factory petter uses polymorphism, dependency injection and Inversion of control.
 *  The stated purpose of the Factory Patterns is: Define an interface for creating an object, 
 *  but let subclasses decide which class to instantiate. 
 *  Factory Method lets a class defer instantiation to subclasses.
 *  
 *  Factory DP loosely coupled
*/
public class OperatingSystemFactory {
	
	public OSInterface getInstance(String str) {
		
		if(str.equals("Android")) {
			return new AndroidClass();
		}
		else if(str.equals("IOS")) {
			return new IOSClass();
		}
		else {
			return new MicrosoftClass();
		}
	}

}
