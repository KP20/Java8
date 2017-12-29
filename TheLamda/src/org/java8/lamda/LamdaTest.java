package org.java8.lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaTest {

	public static void main(String[] args) {
		
		
		List<String> ls = new ArrayList<>();
		ls.add("PK");
		ls.add("Nam");
		ls.add("SSK");
		ls.add("Ravs");
		
		
		ls.sort((e1,e2)->e1.compareToIgnoreCase(e2));
		ls.forEach(System.out::println); 
		System.out.println(ls);
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(50);
		li.add(25);
		li.sort((e1,e2)->e1.compareTo(e2));
		System.out.println(li);
		
		 Processor stringProcessor = (String str) -> str.length();
		    String name = "Java Lambda";
		    int length = stringProcessor.getStringLength(name);
		    System.out.println(length);
	}	
		
		@FunctionalInterface
		interface Processor {
		  int getStringLength(String str);
		}
		
	}
	
	
	

