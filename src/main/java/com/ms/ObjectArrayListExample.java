package com.ms;

import java.util.ArrayList;
import java.util.List;

public class ObjectArrayListExample {

	public static void main(String[] args) {
		
		//I wish to store name and age of one student in an array, what will be my array type?
		
		Object ar1[]= {"amit",20};
		Object ar2[]= {"john",25};
		Object ar3[]= {"pankaj",30};
		
		List<Object[]> list=new ArrayList<>();
		list.add(ar1); list.add(ar2); list.add(ar3);
		
		for(Object ar[]:list) {
			for(Object item:ar) {
				System.out.println(item);
			}
			System.out.println("_______________________");
		}
		
		
		
	}

}
