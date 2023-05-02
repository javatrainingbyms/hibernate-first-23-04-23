package com.ms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map1=new HashMap<>();
		map1.put("john", 25);
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("smith", 28);
		
		List<Map> list=new ArrayList<>();
		list.add(map1);
		list.add(map2);
		
		System.out.println(list);

		/*
		Map<String,String> map=new HashMap<>();
		
		map.put("mp", "bhopal");
		map.put("mh", "mumbai");
		map.put("rj", "jaipur");
		System.out.println(map);
		*/
		
	}
}
