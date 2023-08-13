package W1PA;

public final class A1_2020_Q14 {
	
	public static<T>  min(T x, T y){ // return type T for the method is missing
		
		return x > y ? y : x; // operator > is undefined for the argument type(s) T, T
		
	}

	public static void main(String[] args) {
		
		Integer a = new Integer(5);
		
		Integer b = new Integer(9);
		
		min(a, b);
	}
}

// Ans: a) compiler error
