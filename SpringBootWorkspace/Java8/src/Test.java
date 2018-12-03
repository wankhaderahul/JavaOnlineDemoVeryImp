//Method Reference practice


interface Parcer{
	
	String parcer(String str);
}

class StringPracer{
	
	public static String convert(String str) {
		
		if(str.length()<=3) {
			str=str.toUpperCase();
		}
		
		else {
			
			str=str.toLowerCase();
		}
		
		return str;
		
		
	}
	
}

class MyPrinters{
	
	public void print(String str,Parcer p) {
		
		str=p.parcer(str);
		System.out.println(str);
	}
}

public class Test {

	public static void main(String[] args) {

   String str="abc";
   
   MyPrinters mp=new MyPrinters();
   
   //print using anomyous inner class
   mp.print(str,new Parcer() {
	
	@Override
	public String parcer(String str) {
		// TODO Auto-generated method stub
		return StringParser.convert(str);
	}
});
   
   //using lambda expression
   mp.print(str, s->StringParser.convert(s));
   
   
   //using method reference
   mp.print(str, StringParser::convert);
   
   //call only interface using lambda expression
   mp.print(str,(s)->{
	   
	   s="call only parcer interfaceS";
	   
	   System.out.println(s);
   
 
   
   return s;
   
   });
   
   
	}

}
