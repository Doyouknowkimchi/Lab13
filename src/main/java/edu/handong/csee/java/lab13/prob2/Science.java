package edu.handong.csee.java.lab13.prob2;

public class Science extends Book { // class name , it inherit Book
	private String publisher; // variable
	public Science(String name, String publisher) //constructor
	{
		super(name); // method of Book
		this.publisher = publisher; // set publisher
	}
	public String toString() //method name
	{
		return super.toString() + "\n\tpublisher: " + publisher; // show publisher
	}
	public void show() // method name
	{
		System.out.println("<<<Science>>>" + this.toString()); // show Science
	}
	
}
