package w1pp;

class GenericClass <T> { //Example 3.4: Defining a generic class

 // Two elements ( x and t) of generic type T is defined below

	private T x;

 // Constructor

	public GenericClass(T t) {

		x = t;

	}

 // Print the T-type value for an object

	public void printData() {

		System.out.println (x);

	}

 } // This completes the definition of a simple generic class GenericClass<T>



//The driver class is defined below, which creates different types of arrays.

class GenericClassTest {

	public static void main( String args[] ) {

 // A data with the member as String

		GenericClass<String> a = new GenericClass<String> ("Java");

		a.printData();

 // A data with the member as integer value

		GenericClass<Integer> b = new GenericClass<Integer> (123);

		b.printData();

 // A data with the member as float value

		GenericClass<Double> c = new GenericClass<Double> (3.142);

		c.printData();

	}

}

/*

Output

Java
123
3.142

*/