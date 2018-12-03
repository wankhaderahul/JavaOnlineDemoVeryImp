package com.prototype;

public class PrototypeMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs=new BookShop();
		bs.setbShopName("Novelty");
		bs.loadBooks();
		//System.out.println(bs);
		
		
		BookShop bs1=(BookShop) bs.clone();
		bs.getBooks().remove(3);
		bs1.setbShopName("A1");
		
		System.out.println(bs);
		System.out.println(bs1); // it will give u same obj clone obj
	}

}
