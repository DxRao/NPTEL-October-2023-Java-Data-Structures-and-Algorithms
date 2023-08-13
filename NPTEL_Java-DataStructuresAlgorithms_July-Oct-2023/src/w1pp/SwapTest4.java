package w1pp;

class Person {

	String name;

	Double marks;

	Person(String name, Double	 marks) {

		this.name = name;
 
		this.marks = marks;

	}

}

public class SwapTest4{

	public static  void swap(Person x, Person y){

		Person t;

		t = x;

		x = y;

		y = t;
 
		System.out.println("P1 Name = " + x.name + " " + "P1 Marks = " + x.marks);
 
		System.out.println("P2 Name = " + y.name + " " + "P2 Marks = " + y.marks);

 }

	public static void main(String args[]){

		Person p1 = new Person("Sumit", 99.9);

		Person p2 = new Person("Rahul", 66.6);

		System.out.println("P1 Name = " + p1.name + " " + "P1 Marks = " + p1.marks);
 
		System.out.println("P2 Name = " + p2.name + " " + "P2 Marks = " + p2.marks);


		swap(p1, p2);
 
		// System.out.println("Name = " + p1.name + " " + "Marks = " + p1.marks);
 
		// System.out.println("Name = " + p2.name + " " + "Marks = " + p2.marks);
 
	}

}

 