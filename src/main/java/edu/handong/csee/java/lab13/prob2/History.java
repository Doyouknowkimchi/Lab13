package edu.handong.csee.java.lab13.prob2;

public class History extends Book { // class name, it inherit Book 
	private String author; //variable
	public History(String name, String author) // constructor
	{
		super(name); // constructor
		this.author = author; // set Author
	}
	public String toString() //method name
	{
		return super.toString()+ "\n\tauthor: " + author; // show author
	}
	public void show() { // method name
		System.out.println("<<<History>>>" + this.toString()); //show history
	}
}
