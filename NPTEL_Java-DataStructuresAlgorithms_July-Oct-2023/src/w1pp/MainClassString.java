package w1pp;

class SpecificArrayString { //Example 3.1: Program to handle an array of integers

 // Declaring an array of integer numbers

	String a[];

 // Constructor to load the array

	SpecificArrayString(String a[]) {

	this.a = a;

	}
	
 // Method to print the array elements

	void printString() {

		for(String x : a)

		System.out.print(x + " ");

	}

//Method to reverse the array elements

	void reverseString() {	 

		int j = a.length;

		for (int i=0; i<j; i++) {

			String temp;

			temp = a[i];

			a[i] = a[j-1];

			a[j-1] = temp;

			j--;

		} // End of for loop

	} // end of method

} // end of class

class MainClassString {
	
	public static void main(String[] args) {

		//This class use the class SpecificArrayInt to manipulate data in it
	
		String b[] = {"Hello", "Hi", "Namasthe","India"};
	
		SpecificArrayString c = new SpecificArrayString(b);

		c.printString();

		c.reverseString();
	
		System.out.println();

		c.printString();
	
	}  

}

/*
Output

Hello Hi Namasthe India 
India Namasthe Hi Hello 

*/
