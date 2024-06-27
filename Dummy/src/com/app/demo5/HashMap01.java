package com.app.demo5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	
	public static void main(String[] args) {
		
		HashMap<String,String> hm1 = new HashMap<String,String>();
		
		hm1.put("01", "Data1");
		hm1.put("02", "Data2");
		hm1.put("03", "Data3");
		hm1.put("04", "Data4");
		hm1.put("05", "Data5");
		hm1.put("06", "Data6");
		hm1.put("07", "Data7");
		hm1.put("08", "Data8");
		
		Set set = hm1.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry mapentry = (Map.Entry) itr.next();
			
			System.out.println(mapentry.getKey()+ "/" + mapentry.getValue());
			
		}
		
	}
}
