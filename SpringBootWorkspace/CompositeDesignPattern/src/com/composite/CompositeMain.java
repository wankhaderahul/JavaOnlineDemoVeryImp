package com.composite;

public class CompositeMain {

	public static void main(String[] args) {

    Component hd=new Leaf("HardDrive", 5000);
    Component mouse=new Leaf("Mouse", 500);
    Component monitor=new Leaf("Monitor", 8000);
    Component ram=new Leaf("Ram", 3000);
    Component cpu=new Leaf("CPU", 9000);
    
    
    Composite ph=new Composite("Periferial");
    Composite cabinet=new Composite("Cabinet");
    Composite mb=new Composite("Mother Board");
    Composite computer=new Composite("Computer");
    
    mb.addComponent(cpu);
    mb.addComponent(ram);
    
    ph.addComponent(mouse);
    ph.addComponent(monitor);
    cabinet.addComponent(hd);
    cabinet.addComponent(mb);
    
    
    computer.addComponent(ph);
    computer.addComponent(cabinet);
    
    //ph.showPrice();
    //computer.showPrice();
    cabinet.showPrice();
    

	}

}
