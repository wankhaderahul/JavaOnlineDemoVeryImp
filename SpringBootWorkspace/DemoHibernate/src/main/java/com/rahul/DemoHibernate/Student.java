package com.rahul.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
    
	@Id
	private int rollno;
	private String name;
	private int marks;
	
	/*@OneToOne //use only one table
	private Laptop laptop;*/
	
	/*@OneToMany(mappedBy="student")
	private List<Laptop>laptopList =new ArrayList<Laptop>(); */
	
	@ManyToMany(mappedBy="studentList",cascade = CascadeType.ALL,fetch = FetchType.EAGER)//by default LAZY loading --> LAZY fetch only particular obj -->EAGER fetch all relational mapping data
	private List<Laptop>laptopListManyToMany =new ArrayList<Laptop>(); 
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	
/*	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	
	
	/*public List<Laptop> getLaptopList() {
		return laptopList;
	}
	public void setLaptopList(List<Laptop> laptopList) {
		this.laptopList = laptopList;
	}*/
	
	
	public List<Laptop> getLaptopListManyToMany() {
		return laptopListManyToMany;
	}
	public void setLaptopListManyToMany(List<Laptop> laptopListManyToMany) {
		this.laptopListManyToMany = laptopListManyToMany;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", laptopListManyToMany="
				+ laptopListManyToMany + "]";
	}
	
	
	
	
	
	
}
