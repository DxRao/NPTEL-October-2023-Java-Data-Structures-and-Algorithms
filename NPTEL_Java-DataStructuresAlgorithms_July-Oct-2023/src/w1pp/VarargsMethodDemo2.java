package w1pp;

class VarargsMethodDemo2 {
	
	//Example 2.8: varargs method using ellipsis

	static void varargsMethod2(int...v) { // same as int ... v and int ...v etc. All are acceptable syntax

		System.out.print("Number of args: " + v.length +" Elements: ");

		for(int x : v)

		System.out.print(x + " ");

		System.out.println();

 }

	public static void main(String args[]) {

		// Following arrays are created for test...

		int x[] = { 1, 3, 5, 7 };

		int y[] = { 2, 4};

		int z[] = { };

		varargsMethod2 (x); // Passed 4 values to the method
		
		varargsMethod2(6,7,8,9); // Acceptable

		varargsMethod2 (y); // Passed 2 values to the method

		varargsMethod2 (z); // Passed no argument to the method
		
		varargsMethod2(); // Acceptable

	}

}
