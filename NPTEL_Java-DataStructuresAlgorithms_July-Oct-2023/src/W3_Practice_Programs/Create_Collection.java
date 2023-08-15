package W3_Practice_Programs;

import java.util.ArrayList;

public class Create_Collection {
	
	// Creating a simple collection

	/* The following program illustrate the use of the simple constructor to declare a collection. */

	public static void main(String[] args){

		// Creating an ArrayList of String

		ArrayList<String> animals = new ArrayList<String>();

		// Adding new elements to the ArrayList

		animals.add("Lion");

		animals.add("Tiger");

		animals.add("Cat");

		animals.add("Dog");

		// animals.add(2019); // The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)

		// This shows how an entire collection can be displayed

		System.out.println(animals); // [Lion, Tiger, Cat, Dog]

	}

}
