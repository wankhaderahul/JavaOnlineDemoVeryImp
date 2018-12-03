package com.composite;

import java.util.ArrayList;
import java.util.List;

//obj structure of tree
interface Component{
	void showPrice();
}

class Leaf implements Component {
	
 private String name;
 private int price;
 
public Leaf(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}

@Override
public void showPrice() {
	System.out.println(name+" : "+price);
	
}
 
 
}

 class Composite implements Component {
	
	String name;

	public Composite(String name) {
		super();
		this.name = name;
	}
	
	
	List<Component> components=new ArrayList<>();
	
	public void addComponent(Component copmonent) {
		components.add(copmonent);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		
		for(Component c:components) {
			c.showPrice();
		}
		
	}

}
