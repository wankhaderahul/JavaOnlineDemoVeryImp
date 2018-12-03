//Abstract pratice

/*interface Interface{
	
	
	public void show();
}

abstract class Animal implements Interface{
	
	int i=10;
	final int j=20;
	public abstract void eat();
	public void sleap() {
		System.out.println(" In Z sleap");
	}
}


class Dog extends Animal{
	
	public void barking() {
		
		System.out.println(" dog barking");
		super.i=30;
		System.out.println(" i : "+i+ " j : "+j);
	}

	@Override
	public void eat() {
		System.out.println(" dog eating chicken");
	}

	@Override
	public void show() {
		System.out.println(" dog show");
		
	}
}

class Cow extends Animal{
	
	
	public void mooning() {
		
		System.out.println(" cow mooning");
	}

	@Override
	public void eat() {
		System.out.println(" cow eating grass");
		
	}

	@Override
	public void show() {
		System.out.println(" cow show");
		
	}
}

public class A0_Test {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		       dog.eat();
		       dog.sleap();
		       dog.barking();
		       dog.show();
		       
		       
		Cow  cow=new Cow();
		
            cow.eat();
            cow.sleap();
            cow.mooning();
            cow.show();
		       
		
	}
	
}*/


// Interface practice
/*interface I{
	
	 int i=10;
	
	void show();
	
	//void show1();//function interface only one declare method if use need use lambda expression
	
	default void add(){
		System.out.println("Default method I in add");
		
	}
	
	static void sub(){
	System.out.println("static method I in sub");
	}
	
}


interface J{
	
	//int i=20;
	void display();
	
	//1.8 default method
	default void add(){
		System.out.println("Default J in add");
		
	}
}


class KImpl implements I,J{

	@Override
	public void display() {
		System.out.println("In J Impl display ...");
		//i=30; //ambiguity problem
		System.out.println("static final veriable i : "+i);
		
	}

	@Override
	public void show() {
		System.out.println("In I Impl show ...");
		
	}

	@Override
	public void add() {
		
		I.super.add();
		J.super.add();
	}
	
}


public class A0_Test {

	public static void main(String[] args) {
		KImpl obj=new KImpl();
		obj.show();
		obj.display();
		obj.add();
		
		
		// Lambda Expression create objet of Interface
		I obj1=()->{
			int i=10;
			int j=20;
			int result=i+j;
			System.out.println("create object i using Lambda "+result);
			
		};
		obj1.show();
		obj1.add();
       
		J obj3=()->{
			
			System.out.println("create object J using Lambda ");
			
		};
		obj3.display();
		obj3.add();
		
		
		//// call static method
		  I.sub();
		
		//Anonymous Inner class
		I obj2=new I()
				{

					@Override
					public void show() {
						System.out.println(" In I Anonymous Inner class");
						
					}
			
				};
				obj2.show();
	}

}
*/

//Interface real time example

/*interface Shape{
	
	
	void display();
	
	double area();
	
}

class Rectangle implements Shape{
	
	int lengh,width;
	
	Rectangle(int length, int width){
		
		this.lengh=length;
		this.width=width;
	}

	@Override
	public void display() {
		System.out.println("****\n* *\n* *\n****"); 
		
	}

	@Override
	public double area() {
		
		return (double)lengh*width;
	}
	
}
	
  class Circle implements Shape{
	
	double pi = 3.14;
	int radius;
	
	public Circle(int radius ) {
		this.radius=radius;
	}

	@Override
	public void display() {
		System.out.println("O"); // :P
		
	}

	@Override
	public double area() {
		
		return (double)((pi*radius*radius)/2);
	}
}


public class A0_Test {

	public static void main(String[] args) {
		
		Shape r=new Rectangle(4, 4);
		r.display();
	int rr=	(int) r.area();
	System.out.println(rr);
		
		Shape c=new Circle(5);
		c.display();
		int rrr=(int)c.area();
		System.out.println(rrr);
		
	}
	}*/

//Lamdba Expression using thread

/*public class A0_Test {

	public static void main(String[] args) throws Exception {
		
		Thread t1=new Thread(() ->{
				for(int i=0;i<=5;i++) {
					System.out.println("Hi");
					try {Thread.sleep(1000);} catch (Exception e) {}
				}
				
			}
		);
		
		Thread t2=new Thread(()->
		{
			for(int j=0;j<=5;j++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {}
				
			}
		}
				
				);
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("bye");
		
		
	}
}*/


// Lambda expression Using comparable

/*public class A0_Test {

	public static void main(String[] args) throws Exception {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(404);
		list.add(908);
		list.add(639);
		list.add(265);
		
		//using Anonymous inner class
		Comparator<Integer> c1=new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				if(i%10>j%10) {
					return 1;
				}
				else
				return -1;
			}
		};
		
		//Using Lambda
		Comparator<Integer> c=(i,j)->i%10>j%10?1:-1;
		Collections.sort(list, c);
		
		//Using LAmbda direct put Collections
		
		Collections.sort(list, (i,j)->1%10>j%10?1:-1);
		
		for(Integer i:list) {
			if(i==265) {
				continue;
			}
		System.out.println(i);
	}
		
		
		
	}
	}
*/

//Lambda expression Using User interface

/*interface Interface{
	
	//public int add(int i, int j);
	
	public int sub();
} 

public class A0_Test {

	public static void main(String[] args) throws Exception {
		
		 Interface i=new Interface() {
			public int add(int i, int j) {
			return i+j;
			}
		};
	int result=	i.add(5, 6);
		System.out.println(" result :"+result);
		
		Interface i1=(k,j) -> k+j;
	
		int result1=i1.add(10, 11);
			System.out.println(" result1 :"+result1);
			
		
		Interface i2=()->{
			int i=7;
			int j=5;
			int result=i-j;
			System.out.println(result);
			return result;
			
		};
		i2.sub();
	}
}
*/

//1.8 interface 


interface I{
	
	void show();
	
	default void defaultMethod() {
		
		System.out.println(" In Interface I defaultMethod()");
	}
	
static void statictMethod() {
		
	System.out.println(" In Interface I statictMethod()");
	}
}

interface J{
	
	void show();
	
  default void defaultMethod() {
		
		System.out.println(" In Interface J defaultMethod()");
	}
  
  static void statictMethod() {
		
		System.out.println(" In Interface J statictMethod()");
	}
}





interface K extends I,J{

	

	
	@Override
	default void defaultMethod() {
		// TODO Auto-generated method stub
		I.super.defaultMethod();
		J.super.defaultMethod();
	}
	
}

class C implements I,J{
	
	
	
	public void show() {
		
		System.out.println(" In class A show()");
	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		I.super.defaultMethod();
		J.super.defaultMethod();
	}
}

class CCC implements K{

	@Override
	public void show() {
		System.out.println(" in class CCC show() override I & J Interface");
		
	}
	
}

public class A0_Test {

	public static void main(String[] args) throws Exception {
		
		I i=new C();
		i.show();
		i.defaultMethod();
		I.statictMethod();
		J.statictMethod();
		
		K k=()->{System.out.println(" Using Lambda in K Interface call Show()");
			
		};
		k.show();
		k.defaultMethod();
		
		
		K kk=new CCC();
		kk.show();
		kk.defaultMethod();
		
		
	}
}
