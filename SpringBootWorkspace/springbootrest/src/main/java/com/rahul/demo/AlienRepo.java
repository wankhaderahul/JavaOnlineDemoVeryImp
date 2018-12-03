package com.rahul.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	List<Alien> findByName(String name);

}
