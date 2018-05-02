package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrintable{ //class name
	private int x, y; // variable

	UpPoint(int x, int y){this.x = x; this.y = y;} //constructor, 

	public String toString() // method name
	{
		return "x : " + x + "y : " + y; // return, what is difference to print? It looks like String umm... return is save value or string, print is show on screen right?
	}
}
