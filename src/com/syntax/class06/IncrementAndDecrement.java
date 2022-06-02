package com.syntax.class06;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int x=10;
		
		x=x+1; //also same as below
		x+=1;
		
		System.out.println(x);
		
		x++; //increments value of a variable by 1
		System.out.println(x);
		
		x--; //decrements value of a variable by 1
		System.out.println(x);
		
		//increments and decrement operators work only with variables not numbers
		//example:
		// 10++; is invalid
		
		int num=100;
		num++;
		System.out.println(num);
		
	}
}
