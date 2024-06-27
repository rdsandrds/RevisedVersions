package com.app.demo5;

import java.util.ArrayList;
import java.util.Collections;

public class NumbersSort1 {
	
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		
		al.forEach(i-> System.out.println(i));

		System.out.println("Before Sort :: " + al);

		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1);

		System.out.println("After Sort :: " + al);
	}


}
