package w1pp;

class GenericArray<T> { //Example 3.5: Defining a generic class to process arrays with any data types

 //Declaring an array, which should store any type T of data

 private T b[];

 public GenericArray(T x[]) { // Define a constructor

 b = x;

 }

 T getData(int i) { // To return the element stored in the i-th place in the array

 return b[i];

 }


 void printData() { // A generic method to print the elements in array b
	 
	 int k = b.length;
	 
	 for(int i = 0; i < k; i++) {

	 System.out.print(getData(i) + " "); // Print the i-th element in b

	 System.out.println(); // Print a new line

	 }
 
 }



//Generic method to reversed the order of elements in array b

void reverseArray () {

 int front = 0, rear = b.length-1;

 T temp;

 while( front < rear) {

temp = b[rear];

 b[rear] = b[front];

 b[front] = temp;

 front++; rear--;

 }

 }

}

public class GenericArrayProcessTest {

	public static void main(String[] args) {
		
		// A data with the member as String
				
				String s[] = {"JAVA", "Python"};
				
				GenericClass k = new GenericClass(s);

				k.printData();
				
				//k.reverseArray();
				
				k.printData();

		 // A data with the member as integer value
				
				int i[] = {1, 2};				
				
				GenericClass b = new GenericClass(i);

				b.printData();
				
				//b.reverseArray();
				
				b.printData();

		 // A data with the member as float value
				
				double d[] = {3.142, 3.456, 6.666, 7.777};
				
				GenericClass c = new GenericClass (d);

				c.printData();
				
				//c.reverseArray();
				
				c.printData();
	}

}
