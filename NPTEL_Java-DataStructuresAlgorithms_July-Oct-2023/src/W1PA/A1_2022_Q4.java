package W1PA;

public class A1_2022_Q4 {
	
	public static void swap(int x, int y) {
		
		int temp;
		
		temp = x;
		
		x = y;
		
		y = temp;
		
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		
		int x = 100;
		
		int y = 10;
		
		swap(x, y);
	}
}

/*
 
10 100
  
 */
