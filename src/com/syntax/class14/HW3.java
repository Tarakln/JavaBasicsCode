package com.syntax.class14;

public class HW3 {
	
	boolean palindrome(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev=sb.toString();
		if(str.equalsIgnoreCase(rev)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		HW3 word=new HW3();
		System.out.println(word.palindrome("abcdcba"));
		
	}

}
