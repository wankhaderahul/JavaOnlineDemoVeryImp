package com.composite;



public class CompositeMain {

	public static void main(String[] args) {


		Component hd=new Leaf("HardDrive", 5000);
		Component mouse=new Leaf("Mouse", 500);
		Component moniter=new Leaf("Moniter", 9000);
		Component ram=new Leaf("RAM", 7000);
		Component cpu=new Leaf("CPU", 8000);
		
		Composite ph=new Composite("Periferial");
	    Composite cabinet=new Composite("Cabinet");
	    Composite mb=new Composite("Mother Board");
	    Composite computer=new Composite("Computer");
	    
	    mb.addComponent(cpu);
	    mb.addComponent(ram);
	    
	    cabinet.addComponent(mb);
	    cabinet.addComponent(hd);
	    
	    ph.addComponent(mouse);
	    ph.addComponent(moniter);
	    
	    computer.addComponent(ph);
	    computer.addComponent(cabinet);
	    
	    computer.showPrice();
	    ph.showPrice();
	}

}
