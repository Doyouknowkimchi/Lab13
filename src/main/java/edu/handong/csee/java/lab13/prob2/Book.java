package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int idCount = 0; //variable
	private String bookName; //variable
	private int id; // variable
	public Book(String name) // constructor
	{
		this.bookName = name; // set name
		idCount++; // plus id count
		id = idCount; // set id
	}
	public String toString() //method name
	{
		return ("\n\tId: " + id + "\n\tbook name: " + bookName); // show id, book name
	}
	public void show() //method name
	{
		System.out.println("<<<BOOK>>>" + this.toString()); // show book name
	}
}
