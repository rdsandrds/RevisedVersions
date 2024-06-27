package com.app.demo5;

import java.util.Arrays;
import java.util.List;

public class Streamdemo {
	
	public static void main(String[] args) {

		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		boolean status1 = persons.stream().anyMatch(p -> p.country.equals("INDIA"));
		System.out.println("Any Indian Available ? :: " + status1);

		boolean status2 = persons.stream().anyMatch(p -> p.country.equals("CANADA"));
		System.out.println("Any Canadian Available ? :: " + status2);

		boolean status3 = persons.stream().allMatch(p -> p.country.equals("INDIA"));
		System.out.println("All Persons from India ? :: " + status3);

		boolean status4 = persons.stream().noneMatch(p -> p.country.equals("MEXICO"));
		System.out.println("No Persons from Mexico ? :: " + status4);

	}


}

class Person {

	String name;
	String country;

	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

}


