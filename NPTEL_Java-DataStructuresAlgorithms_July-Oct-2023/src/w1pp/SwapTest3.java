package w1pp;

class SwapTest3 {	

	public static <T> void swap(T x, T y){

		T t;

		t = x;

		x = y;

		y = t;
		
		System.out.println("x = " + x + "  " + "y = " + y);

	 }

	public static void main(String args[]){

		String x = new String("99");

		String y = new String("66");

		System.out.println("x = " + x + "  " + "y = " + y);

		swap(x, y);

		// System.out.println("x = " + x + "  " + "y = " + y);

	 }
}

