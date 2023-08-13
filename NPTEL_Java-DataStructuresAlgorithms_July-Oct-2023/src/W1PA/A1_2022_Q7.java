package W1PA;

class A1_2022_Q7<T> {
	
	void genericPrint(T t) { // T t parameter/ missing in Q-7
		
		System.out.println(t);		
	}
	
	public static void main(String[] args) {
		
	;	A1_2022_Q7 obj = new A1_2022_Q7();
		
		obj.genericPrint("Hi");
		
		obj.genericPrint(1000);
	}
}

/*

Hi
1000

*/
