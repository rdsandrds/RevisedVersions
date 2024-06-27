package com.app.demo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListt {
	
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		
		
		 arr1.add("rsd1");
		 arr1.add("rsd2");
		 arr1.add("rsd3");
		 arr1.add("rsd4");
		 arr1.add("rsd5");
		 
		 arr1.stream().filter(i->i.endsWith("2")).forEach(i->System.out.println(i));
		 
		 System.out.println(arr1);
		 
		 Iterator  e = arr1.iterator();
		 while(e.hasNext()) {
			 String s = (String)e.next();
			 System.out.println(s);
			 
		 }
		 
		 
		 LinkedList<String> ls1 = new LinkedList<String>();
		 ls1.add("item1");
		 ls1.add("item2");
		 ls1.add("item3");
		 ls1.add("item4");
		 ls1.add("item5");
		 ls1.add("item6");
		 ls1.add("item7");
		 ls1.add("item8");
		 ls1.add("item9");
		 ls1.add("item10");
		 ls1.add("item11");
		 ls1.add("item12");
		 ls1.add("item13");
		 ls1.add("item14");
		 ls1.add("item15");
		 ls1.add("item16");
		 ls1.add("item17");
		 ls1.add("item18");
		 ls1.add("item19");
		 
		 System.out.println(ls1);
		 
		 ListIterator<String> lt1 =  ls1.listIterator();
		 while(lt1.hasNext()) {
			 System.out.println(lt1.next());
		 }
		 
	
		
	}

}
