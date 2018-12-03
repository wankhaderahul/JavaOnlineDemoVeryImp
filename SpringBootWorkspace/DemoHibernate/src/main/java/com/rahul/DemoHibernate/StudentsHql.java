package com.rahul.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentsHql {
	
	@Id
	private int rollno;
	private String name;
	private int marks;
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
	@Override
	public String toString() {
		return "StudentsHql [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	
}
