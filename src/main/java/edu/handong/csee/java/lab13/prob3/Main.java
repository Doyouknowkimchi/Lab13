package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;

public class Main { //class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2; // variable
		Scanner Keyboard = new Scanner(System.in); // set scanner
		
		System.out.println("Enter radius: "); // show text
		n1 = Keyboard.nextDouble(); // get input from keyboard
		Circle c1 = new Circle(n1); // set C1

		System.out.println("Radius: " + c1.get_radius()); //show text
		c1.display(); // implement method 
		
		System.out.println("Enter length and width: "); // 
		n1 = Keyboard.nextDouble();
		n2 = Keyboard.nextDouble();
		Rectangle r1 = new Rectangle(n1, n2);
		
		System.out.println("Length: "+ r1.get_length());
		System.out.println("width: "+ r1.get_width());
		r1.display();
	}

}
