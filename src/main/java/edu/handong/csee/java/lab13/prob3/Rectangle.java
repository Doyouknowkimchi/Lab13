package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape { // method name
	private double length; // variable
	private double width; // variable
	public Rectangle(double length, double width) // constructor
	{
		this.length = length; //set length
		this.width = width; //set width
	}
	public double area() // method name
	{
		return length * width; // set expression
	}
	public double perimeter() // method name
	{
		return 2*(length+width); // set expression
	}
	public double get_length() // method name
	{
		return length; // return length
	}
	public double get_width() // set method
	{
		return width; // return length
	}
}

