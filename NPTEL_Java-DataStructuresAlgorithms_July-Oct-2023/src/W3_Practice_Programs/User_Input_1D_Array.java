package W3_Practice_Programs;

import java.util.*;

public class User_Input_1D_Array {
	
	public static void loadArray(int[] a) { // Actual size of the array
		
		int size; // Actual size of the array	

		 Scanner in = new Scanner(System.in); // To read from keyboard

		 System.out.print("Enter the size < 100: ");

		 size = in.nextInt(); // read a number
		 
		// Initialization of a 1D array with user input from keyboard	
		 
		 for(int i = 0; i < size; i++){

			 System.out.print("Enter "+ (i+1) + "th number: ");

			 a[i] = in.nextInt(); // Load the i-th entry
	 
		 }
		 
		 System.out.println( "Length of Array = " + a.length);
		 
		 System.out.println( "Size of Array = " + size);
		 
		 System.out.println("Array elements entered are: ");

		 	for(int i = 0; i < size; i++) {
			 
		 		System.out.print(a[i] + " "); // Display the array elements on the screen
		 	}
	}
	
	public static void main(String[] args) {
	
		 int[] a = new int [100]; // Declaring a 1D array of size 100 
	 
		 loadArray(a);

	}
}
