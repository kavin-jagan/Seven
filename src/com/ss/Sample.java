 package com.ss;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();
		
		
		
		li.add(20);
		li.add(30);
		li.add(50);
		
		
		System.out.println("Iterate using normal for loop");
		for (int i =0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
			
		}
		
		System.out.println("Iterate usuing enchanced for loop Cristiano");
	
		for (Integer x : li) {
			System.out.println(x);
		}
		
		
		
		
		
	}

}
