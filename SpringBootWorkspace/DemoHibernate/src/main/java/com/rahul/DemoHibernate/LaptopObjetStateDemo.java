package com.rahul.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LaptopObjetStateDemo {
	
	@Id
	private int lid;
	private String brand;
	private int price;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int i) {
		this.price = i;
	}
	@Override
	public String toString() {
		return "LaptopObjetStateDemo [lid=" + lid + ", brand=" + brand + ", price=" + price + "]";
	}

	
	
}
