package edu.handong.csee.java.lab13.prob2;

public class Main { //class name

	public static void main(String[] args) { // method name
		// TODO Auto-generated method stub
		Book book = new Book("Simple Book"); // make variable book
		Science science = new Science("Hello Physics", "ScienceWorld"); // make science
		History history1 = new History("What is history", "E.H.Carr" ); // make history
		book.show(); // method of book
		science.show(); //method of science
		history1.show(); // method of history

	}

}
