package com.adapter;

public class AdapterMain {

	public static void main(String[] args) {
     
		Pen p=new Adapter();
		
		AssignmentWriter aw=new AssignmentWriter();
		aw.setPen(p);
		aw.assigmnetWrite("tried to write assigment");

	}

}
