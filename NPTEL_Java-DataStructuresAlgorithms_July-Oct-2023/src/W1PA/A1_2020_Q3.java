package W1PA;

public class A1_2020_Q3 {
	
	public static<T> void printArray(T[] input) {
		
		for(T t : input) {
			
			System.out.printf("%s ", t); 		
		}		
	}
	
	public static void main(String[] args) {
		
		Integer[]  A = {1,2,3,4,5};// Integer type to T is OK but not int type to T
		
		printArray(A);
		
	}
}

/* Ans: c) It will produce output: 1 2 3 4 5


*/
