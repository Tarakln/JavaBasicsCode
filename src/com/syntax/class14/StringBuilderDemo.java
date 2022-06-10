package com.syntax.class14;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		//Both are classes used to store 
		//Strings and manipulate the characters
		
		String s=new String("hahahaha");
		System.out.println(s.toUpperCase());
		
		StringBuilder st=new StringBuilder("jajajaja");
		System.out.println(st.reverse());
		
		//But the difference is String is immutable(cannot be changed)
		//StringBuilder is mutable(can be changed)
		//when we make a lot of changes to a String, it creates multiple copies inside your memory
		//And it can be very slow because for every change in new variable is created
		//so if there are a lot of changes, use StringBuilder.
		
	}

}
