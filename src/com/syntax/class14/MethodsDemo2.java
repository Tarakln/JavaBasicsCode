package com.syntax.class14;

public class MethodsDemo2 {
	
	void print() {
		for(int i=0; i<5;i++) {
			System.out.println("Tara is great");
		}
	}
		void printManyTimes(int times) {
			for(int i=0; i<times;i++) {
				System.out.println("Tara is great");
			}
	}
	public static void main(String[] args) {
		
		MethodsDemo2 md=new MethodsDemo2(); // Creating the object of a class
		//md.print();
		md.printManyTimes(5);
	}
	
}
