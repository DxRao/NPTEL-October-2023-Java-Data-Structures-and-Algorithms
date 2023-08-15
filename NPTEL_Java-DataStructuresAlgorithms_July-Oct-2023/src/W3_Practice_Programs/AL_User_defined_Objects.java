package W3_Practice_Programs;

import java.util.ArrayList;

	//	Creating an ArrayList object with user defined objects

class Person {
	
	private String name;

	private int age;

	public Person(String name, int age){

		this.name = name;

		this.age = age;
	}

	public void printData() {

		System.out.println(name + " " + age);
	}
}

public class AL_User_defined_Objects{

	public static void main(String[] args) {

		// Declaring pList as a collection of type Person of capacity 5

		ArrayList<Person> pList = new ArrayList<Person>(5);

		pList.add(new Person("Ram", 25));

		Person p2 = new Person("Sita", 22);	 // Create a new object

		pList.add(p2); // add the object

		pList.add(new Person("John", 34));

		pList.add(p2); // Duplicate entry is allowed

		pList.add(new Person("Rahim", 29)); 

		pList.add(new Person("Lilly", 24)); // Six objects are added

		// No issue to accommodate, list grows dynamically
		
		//System.out.println(pList); // Doesn't work

		pList.forEach(p -> p.printData());	// Another way to access each object and print in a class

	}
}

/*
  
Ram 25
Sita 22
John 34
Sita 22
Rahim 29
Lilly 24 
  
 
*/
