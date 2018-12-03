package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private String bShopName;
	
	List<Book> books=new ArrayList<>();

	public String getbShopName() {
		return bShopName;
	}

	public void setbShopName(String bShopName) {
		this.bShopName = bShopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [bShopName=" + bShopName + ", books=" + books + "]";
	}
	
	
	public void loadBooks() {
		
		for(int i=1; i<=10;i++) {
			
			Book b=new Book();
			b.setBid(i);
			b.setBname(" Books"+i);
			getBooks().add(b);
			
		}
	}

	
	//shallow cloning --> Exact copy of obj
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/

	//Deep cloning -->exact copy of original obj
	@Override
	protected BookShop clone() throws CloneNotSupportedException {

      BookShop bs=new BookShop();
      
      for(Book b:books) {
    	  bs.getBooks().add(b);
      }
		return bs;
	}
	
	
}
