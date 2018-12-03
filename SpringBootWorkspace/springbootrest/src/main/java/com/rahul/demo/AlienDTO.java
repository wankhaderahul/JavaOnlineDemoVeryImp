package com.rahul.demo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AlienDTO {

	List<Integer> alienList;
	
	List<Alien> listAliens =new ArrayList<Alien>();

	@Override
	public String toString() {
		return "AlienDTO [alienList=" + alienList + ", listAliens=" + listAliens + "]";
	}

	public List<Integer> getAlienList() {
		return alienList;
	}

	public void setAlienList(List<Integer> alienList) {
		this.alienList = alienList;
	}

	public List<Alien> getListAliens() {
		return listAliens;
	}

	public void setListAliens(List<Alien> listAliens) {
		this.listAliens = listAliens;
	}
	
	
}
