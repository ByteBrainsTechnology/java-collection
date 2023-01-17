package com.bytebrains.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ITDepartmentStudent {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Omkar", "IT");
		map.put("Rutik", "Computer");
		map.put("Priti", "Mechanical");
		map.put("Prakhar", "HR");
		map.put("Shradha", "Electric");
		map.put("Rajashree", "Finance");
		
		for(Map.Entry<String, String> entrySet : map.entrySet() ) {
			if(entrySet.getValue().equalsIgnoreCase("IT")) {
				System.out.println(entrySet.getKey() +" "+ entrySet.getValue());
			}
		}
	}
}
