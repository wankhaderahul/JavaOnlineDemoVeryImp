package com.rahul.demorest;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Alien {
	private int id;
	private String nama;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}*/
	/*public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", nama=" + nama + "]";
	}
	

}
