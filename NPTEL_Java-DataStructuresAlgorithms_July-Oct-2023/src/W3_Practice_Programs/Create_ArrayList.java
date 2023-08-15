package W3_Practice_Programs;

import java.util.*;

public class Create_ArrayList {

// Creating an ArrayList object with an existing collection

// Creating an ArrayList from another collection using the ArrayList(Collection c) constructor.


	public static void main(String[] args){

		// Creating a collection first. Let it be with the simple method

		ArrayList<Integer> aList = new ArrayList<Integer>(); //Declaring aList as a collection

		aList.add(2); // Adding elements into the aList collection

		aList.add(3);

		aList.add(5);

		aList.add(7);

		aList.add(11);

		// Creating another collection initially with aList collection

		ArrayList<Integer> numbers = new ArrayList<Integer>(aList);

		numbers.add(13); // Add two more numbers into the numbers collection

		numbers.add(17);
		
		// Now, you have two collections: aList and numbers.

		System.out.println(aList); // [2, 3, 5, 7, 11]
		
		System.out.println(numbers); // [2, 3, 5, 7, 11, 13, 17]


	}

}
