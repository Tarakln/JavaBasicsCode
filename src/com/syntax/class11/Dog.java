package com.syntax.class11;

public class Dog {
	
	//attributes how the object looks like
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;
	
	//used to show behavior of the object
	void bark() {
		System.out.println("Dog barks");
	}
	void walks() {
		System.out.println("Dog walks");
	}
	void eat() {
		System.out.println("Dog likes to eat bone");
	}
	
	public static void main(String[] args) {
		
		Dog coco= new Dog(); //creating an object and storing it in a variable
		//new Dog() is how we create an object
		
		coco.name="Coco";
		coco.age=6;
		coco.weight=10;
		coco.color="brown";
		coco.height=2.6;
		coco.breed="Pomeranian";
		coco.bark();
		
	}
	

}
