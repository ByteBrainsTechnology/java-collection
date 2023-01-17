package com.bytebrains.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Ram", "Computer");  
		map.put("Ganesh", "IT"); 
		System.out.println(map.get("Ganesh"));
	}

}
