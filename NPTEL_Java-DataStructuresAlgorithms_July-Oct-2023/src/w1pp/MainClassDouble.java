package w1pp;

class SpecificArrayDouble { //Example 3.1: Program to handle an array of integers

 // Declaring an array of integer numbers

	double a[];

 // Constructor to load the array

	SpecificArrayDouble(double a[]) {

	this.a = a;

	}
	
 // Method to print the array elements

	void printDouble() {

		for(double x : a)

		System.out.print(x + " ");

	}

//Method to reverse the array elements

	void reverseDouble() {	 

		int j = a.length;

		for (int i=0; i<j; i++) {

			double temp;

			temp = a[i];

			a[i] = a[j-1];

			a[j-1] = temp;

			j--;

		} // End of for loop

	} // end of method

} // end of class

class MainClassDouble {
	
	public static void main(String[] args) {

		//This class use the class SpecificArrayInt to manipulate data in it
	
		double b[] = {1.1,2.22,3.333,4.4444,5.55555};
	
		SpecificArrayDouble c = new SpecificArrayDouble(b);

		c.printDouble();

		c.reverseDouble();
	
		System.out.println();

		c.printDouble();
	
	}  

}

/*
Output

1.1 2.22 3.333 4.4444 5.55555 
5.55555 4.4444 3.333 2.22 1.1 

*/
