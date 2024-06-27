package com.app.demo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemo {
	
	public static void main(String[] args) {

		// Approach-1
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
		
		Stream<Integer> stream02 = Stream.of(1,2,4);

		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Robert");
		names.add("Orlen");
		
		Stream<String> s23 = names.stream();

		// Approach-2
		Stream<String> stream2 = names.stream();
		
		
		
		List<Integer> list = Arrays.asList(66, 32, 45, 12, 20);
		
		list.stream().filter(i-> i>20).forEach(i-> System.out.println(i));
		System.out.println("==============================================");
		
		List<String> namess = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");


		namess.stream().filter(i->i.startsWith("A")).forEach(i->System.out.println(i));
		System.out.println("==============================================");
		
		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot");

		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");

		List<List<String>> courses = Arrays.asList(javacourses, uicourses);
		
		//courses.stream().forEach(c -> System.out.println(c));
		
		Stream<String> fms = courses.stream().flatMap(s -> s.stream());
		
		
		
		fms.forEach(c -> System.out.println(c));
		
		System.out.println("==============================================");
		
		List<String> javacourses1 = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");

		javacourses1.stream().limit(3).forEach(c -> System.out.println(c));
		System.out.println("==============================================");
		
		javacourses.stream().limit(2).forEach(c->System.out.println(c));
		System.out.println("==============================================");

		javacourses1.stream().skip(3).forEach(c -> System.out.println(c));
		System.out.println("==============================================");

		List<String> names1 = Arrays.asList("raja", "rani", "raja", "rani", "guru");
		names1.stream().distinct().forEach(name -> System.out.println(name));

		
		


	}


}
