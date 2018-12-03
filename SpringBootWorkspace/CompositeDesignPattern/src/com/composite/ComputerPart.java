package com.composite;

import java.util.ArrayList;
import java.util.List;

interface Component{
	
	void showPrice();
}


class Leaf implements Component {
	
	String name;
	int price;
	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public void showPrice() {
		System.out.println(name +" : " + price);
		
	}
	
	
}

class Composite implements Component {
	
	String name;
	
	List<Component > components=new ArrayList<>();
	
	public void addComponent(Component component) {
		
		components.add(component);
	}

	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		
		for(Component c:components) {
			c.showPrice();
		}
		
	}
	
	
	
	
}

public class ComputerPart {

}
