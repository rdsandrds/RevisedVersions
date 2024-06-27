package com.app.demo5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {
	
	public static void main(String[] args) {

		String[ ] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };

		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names) {
			if ( p.test(name) ) {
				System.out.println(name);
			}
		}
		
		/*
		 * Predicate<String> p1 = name-> name.charAt(0)=='A'; for(String name : names) {
		 * if(p.test(name)) { System.out.println(name)); } }
		 */
		List<Integer> arr = Arrays.asList(1,2,3);
	}


}
