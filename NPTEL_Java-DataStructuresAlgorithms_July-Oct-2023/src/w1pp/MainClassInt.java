package w1pp;

class SpecificArrayInt { //Example 3.1: Program to handle an array of integers

 // Declaring an array of integer numbers

	int a[];

 // Constructor to load the array

	SpecificArrayInt(int a[]) {

	this.a = a;

	}
	
 // Method to print the array elements

	void printInt() {

		for(int x : a)

		System.out.print(x + " ");

	}

//Method to reverse the array elements

	void reverseInt() {	 

		int j = a.length;

		for (int i=0; i<j; i++) {

			int temp;

			temp = a[i];

			a[i] = a[j-1];

			a[j-1] = temp;

			j--;

		} // End of for loop

	} // end of method

} // end of class

class MainClassInt {
	
	public static void main(String[] args) {

		//This class use the class SpecificArrayInt to manipulate data in it
	
		int b[] = {1,2,3,4,5};
	
		SpecificArrayInt c = new SpecificArrayInt(b);

		c.printInt();

		c.reverseInt();
	
		System.out.println();

		c.printInt();
	
	}  

}

/*
Output
1 2 3 4 5 
5 4 3 2 1
*/
