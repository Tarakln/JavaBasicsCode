package com.syntax.class13;

public class Task6 {
	
	public static void main(String[] args) {
		
		String a="Hello";
		String b="Hi";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("The new a is "+a+" and the new b is "+b);
		
	}
	
}
