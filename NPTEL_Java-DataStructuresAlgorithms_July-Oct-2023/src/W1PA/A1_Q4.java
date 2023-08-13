package W1PA;

public class A1_Q4 {
	
	static void DemoMethod(int ...v) {
		
		for(int i : v) {
			
			System.out.print(i + " ");
			
		}
		
	}	

	public static void main(String[] args) {
		
		DemoMethod(9, 5, 4);
		
		DemoMethod(7);
	}

}

// Output: 9 5 4 7
