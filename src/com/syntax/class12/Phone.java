package com.syntax.class12;

public class Phone {
	
	String model;
	String make;
	double screenSize;
	int RAM;
	int storage;
	int camera;
	
	void call() {
		System.out.println("calling someone");
	}
	void picture() {
		System.out.println("use my camera app to take pictures");
	}
	
	public static void main(String[] args) {
		
		Phone iPhone = new Phone();
		iPhone.make="Apple";
		iPhone.model="X";
		iPhone.screenSize=6.8;
		iPhone.RAM=12;
		iPhone.storage=286;
		iPhone.call();
	}

}
