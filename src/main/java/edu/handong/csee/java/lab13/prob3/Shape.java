package edu.handong.csee.java.lab13.prob3;

public abstract class Shape { //class name
	public abstract double area(); // variable
	public abstract double perimeter(); //variable
	public void display() //method name
	{
		System.out.println("Area: " + area() + "\nPerimeter: " + perimeter() + "\n"); //show text
	}
}
