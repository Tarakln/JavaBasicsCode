package com.syntax.class14;

public class MethodsDemo4 {
	
	int sumNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	//write a method that takes a String and
	//an int and prints out that String on the console
	//that many times
	void printManyTimes(String str, int times){
		for(int i=1; i<=times; i++) {
			System.out.println(str);
		}
	}
	
	
	public static void main(String[] args) {
		MethodsDemo4 md=new MethodsDemo4();
		System.out.println(md.sumNumbers(10, 10));
	
		md.printManyTimes("Java", 3);
	}

}
