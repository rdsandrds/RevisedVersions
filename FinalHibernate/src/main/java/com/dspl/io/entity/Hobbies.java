package com.dspl.io.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Hobbies {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "hobbies_gen")
	@SequenceGenerator(name = "hobbies_gen" , initialValue = 1001 , allocationSize = 1 , sequenceName = "hobbies_gen")
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hobbies [id=" + id + ", name=" + name + "]";
	}
	
}
