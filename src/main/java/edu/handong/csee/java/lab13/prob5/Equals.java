package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;

public class Equals { // class name
	public static boolean equals(int[][] m1, int[][] m2 ){ // boolean method
		int count = 0; // set variable
		if (m1.length != m2.length)	// condition of if method
			return false; //return false
		for (int i = 0; i < m1.length; i++) // condition of for method
		{
			for (int j = 0; j < m1[i].length; j++) // condition of for method
			{
				if (m1[i][j] != m2[i][j]) // condition of if method
					count++; // increase count
			}
		}
		if(count <= 3) // condition of if method
			return true; // true
		else
			return false; //false
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2 = 0; // set variable
		Scanner keyboard = new Scanner(System.in); // ready to get input from keyboard
		System.out.print("Enter row size(Maximum 5):"); // show text
		n1 = keyboard.nextInt(); // get input form keyboard
		System.out.print("Enter column size(Maximum 5):");// show text
		n2 = keyboard.nextInt(); // get input form keyboard
		int[][] m1 = new int [n1][n2]; // set m1
		System.out.print("Enter row size(Maximum 5):");
		n1 = keyboard.nextInt(); // get input form keyboard
		System.out.print("Enter column size(Maximum 5):");
		n2 = keyboard.nextInt(); // get input form keyboard
		int[][] m2 = new int [n1][n2]; //set m2
		System.out.print("Enter List1: "); // show text
		for (int i = 0; i < m1.length; i++) // condition of for method
			for (int j = 0; j < m1[i].length; j++) // condition of for method
				m1[i][j] = keyboard.nextInt(); // get input form keyboard
		System.out.print("Enter list2: ");// show text
		for (int i =0; i< m2.length; i++) // condition of for method
			for (int j = 0; j < m2[i].length; j++ ) // condition of for method
				m2[i][j] = keyboard.nextInt();// get input form keyboard

		for (int i = 0; i < m1.length; i++){ // condition of for method
			for (int j = 0; j < m1[i].length; j++) // condition of for method
				System.out.println(m1[i][j] + " "); // show text
			System.out.println(); // show text
		}
		System.out.println(); // show text

		if (equals(m1, m2)) // condition of if method
			System.out.println("The two arrays are approximately identiucal."); //show text
		else
			System.out.println("The two arrays are not identical"); //show text

	}

}

