package com.syntax.class13;

public class Task3 {
	
	public static void main(String[] args) {
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		int sentence=0;
		for (int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='?') {
				sentence++;
				
			}
		}
		
	System.out.println(sentence);
	
	
	//OR
	String b="Is it saturday? Is it raining? Do we have a Java Class today?";
	System.out.println(b.split("[?!.]").length);
	
	}

}
