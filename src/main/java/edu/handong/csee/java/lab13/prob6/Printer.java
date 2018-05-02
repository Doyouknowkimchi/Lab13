package edu.handong.csee.java.lab13.prob6;

public class Printer { //class name
	public static void print(Object object) // method name
	{
		String str = object.toString(); //set variable
		if(object instanceof CapitalPrintable) // condition of if method
			str = str.toUpperCase(); // set variable
		System.out.println(str); // show text
	}

}
