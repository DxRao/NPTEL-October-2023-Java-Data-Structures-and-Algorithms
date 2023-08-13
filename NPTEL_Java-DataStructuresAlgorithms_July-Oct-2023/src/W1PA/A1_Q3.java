package W1PA;

public class A1_Q3 {
	
	public static <T> void printArray(T[] input) {
		
		for(T t : input) {
			System.out.printf("%s ", t);
			
		}
	}

	public static void main(String[] args) {
		
		Integer[] A = {5, 4, 3, 2, 1};
		
		printArray(A);	

	}

}

// Output: 5 4 3 2 1
