package com.adapt;

public class AdapterMain {

	public static void main(String[] args) {
		
		//Pen p=(s)->System.out.println(s);
		
		Pen p=new PenAdapter();
		AssigmentWork aw=new AssigmentWork();
		aw.setPen(p);
		aw.writeAssignment("I am tried to write assigment");

	}

}
