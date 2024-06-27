package com.app.demo5;
import java.util.*;

public class Hashtables {
	
	public static void main(String[] args) {
		Hashtable<String,String> ht1 = new Hashtable<String, String>();
		ht1.put("item1","value1");
		ht1.put("item2","value");
		Enumeration<String> em = ht1.keys();
		while(em.hasMoreElements()) {
			String key = (String)em.nextElement();
			System.out.println(key + "/" + ht1.get(key));
		}
		
	}
	
	

}
