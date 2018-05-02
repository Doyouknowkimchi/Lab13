package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape { //class name
	private double radius; // variable
	public Circle(double r) //constructor
	{
		radius = r; // set radius value
	}
	
	public double area() { // method name
		return Math.PI * Math.pow(radius, 2); // a formula
	}
	
	public double perimeter() //method name
	{
		return 2.0 * Math.PI * radius; // formula
	}
	public double get_radius() //method name
	{
		return radius; // show radius
	}
}