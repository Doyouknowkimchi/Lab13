package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class Master {
	public void feed(Pet pet)
	{
		System.out.println("feed: " + pet.food());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cat_name, dog_name;

		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();

		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Enter the cat name and dog name: ");
		cat_name = Keyboard.next();
		dog_name = Keyboard.next();

		cat.setName(cat_name);
		cat.getName();
		master.feed(cat);

		dog.setName(dog_name);
		dog.getName();
		master.feed(dog);
	}

}
