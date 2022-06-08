package com.syntax.class11;

public class Car {

	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int NoOfDoors;
	int HP;
	
	void moveForward() {
		System.out.println("Car moves forward");
	}
	void reverse() {
		System.out.println("Car goes in reverse");
	}
	
	public static void main(String[] args) {
		
		Car bmw=new Car();
		bmw.model="x6";
		bmw.make="BMW";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.HP=500;
		bmw.moveForward();
		bmw.reverse();
		
		
		Car lexus=new Car();
		lexus.make="Lexus";
		lexus.model="NX";
		lexus.color="White";
		lexus.moveForward();
		
	}
}
