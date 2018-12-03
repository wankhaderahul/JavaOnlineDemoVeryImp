package com.stack;

public class Runner {
	
	public static void main(String[] args) {
	
		//fixed size stack
		
		Stack s=new Stack();
		s.push(15);
		s.push(8);
		s.push(10);
		
		System.out.println("deleted : "+s.pop());
		
		s.peak();
		System.out.println("size is : "+ s.size());
		System.out.println(" is empty :"+s.isEmpty());
	
		
		//dynamic size stack
		DynamicStackorArray ds=new DynamicStackorArray();
		ds.push(15);
		ds.push(30);
		ds.push(40);
		//ds.push(50);
		
		
		ds.peak();
		ds.pop();
		ds.peak();
		
	}

}
