package w1pp;

class SwapTest2 {	

	public static <T> void swap(T x, T y){

		T t;

		t = x;

		x = y;

		y = t;
		
		System.out.println("x = " + x + "  " + "y = " + y);

	 }

	public static void main(String args[]){

		Double x = new Double(99.9999);

		Double y = new Double(66.6666);

		System.out.println("x = " + x + "  " + "y = " + y);

		swap(x, y);

		// System.out.println("x = " + x + "  " + "y = " + y);

	 }
}
