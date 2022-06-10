package com.syntax.class13;

public class Task2 {
	
	public static void main(String[] args) {
		
		String str="AdbuKJkJ1265%$#@";
		System.out.println(str.replaceAll("[^A-z0-9]","").length());
		
	}

}
