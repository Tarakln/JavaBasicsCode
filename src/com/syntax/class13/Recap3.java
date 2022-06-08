package com.syntax.class13;

public class Recap3 {
	
	public static void main(String[] args) {
		
		//from the string, get the part which stars from # and ends with #
		String str="I am #confused#";
		System.out.println(str.substring(5));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4)); //2 included, 4 excluded
		System.out.println(str.substring(0,1)); //0 included, 1 excluded

		str="Asghar is great";
		System.out.println(str.substring(0, 6));
		
	}

}
