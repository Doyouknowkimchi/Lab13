package edu.handong.csee.java.lab13.prob1;

public class InstanceOf { //class name

	public static void whatFriend(Friend friend) //method name
	{
		if(friend instanceof ClassFriend)  // condition of if
			((ClassFriend)
					friend).classFriend(); //  method implement
		else if(friend instanceof SchoolFriend) // condition
			((SchoolFriend) // 
					friend).schoolFriend(); // method implement
		else 
			friend.justFriend(); // method implement

	}

}
