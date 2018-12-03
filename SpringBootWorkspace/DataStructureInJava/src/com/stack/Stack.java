package com.stack;

//Abstract Data Type -->LIFO 
//i.e -->  Plate put one into one-->Features :- Push(add element) POP(delete element), PEAK(find the element) --> one entry point

public class Stack {
	
	int stack[]=new int[5];
	int top=0;
	public void push(int data) {
		if(top==4) {
			System.out.println("Stack is full");
		}
	
	stack[top]=data;
	top++;
	//System.out.println(top);
	}
	
	public void peak() {
		
		for(int n:stack) {
			System.out.println(n +" ");
		}
	}
	
	public int pop() {
		
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
		
	}
	
	public int size() {
		return top;
		
	}
	
	public boolean isEmpty() {
		return top<=0;
		
	}

}
