package W3_Practice_Programs;

/* Demonstration of a one-dimensional array */

class Array_1D {

	public static void main(String args[]) {

		int month[];

		month = new int[12];

		month[0] = 31;

		month[1] = 28;

		month[2] = 31;

		month[3] = 30;

		month[4] = 31;

		month[5] = 30;

		month[6] = 31;

		month[7] = 31;

		month[8] = 30;

		month[9] = 31;

		month[10] = 30;

		month[11] = 31;

		System.out.println("April has " + month[3] + " days.");

	}

}
