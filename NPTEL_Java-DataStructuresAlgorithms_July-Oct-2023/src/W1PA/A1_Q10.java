package W1PA;

class MyGenericClass<T extends Number>{ // only sub types of Number like 
	//Integer, Double, Float etc used and not String or other data types.
	
	private T data;
	
	public MyGenericClass(T data){
		
		this.data = data;
		
	}
	
	public Double Square() {
		
		return data.doubleValue() * data.doubleValue();
	}	
}
public class A1_Q10 {

	public static void main(String[] args) {
		
		MyGenericClass<Integer> IntegerObj = new MyGenericClass<>(5);
		
		//MyGenericClass<String> StringObj = new MyGenericClass<>("Hello"); // compilation error - type mismatch error.
		
		// Ans to Q-10: Program will not compile due to a type mismatch error.

		Double result1 = IntegerObj.Square();
		
		//Double result2 = StringObj.Square();
		
		System.out.println(result1);
		
		//System.out.println(result2);
	}

}

// Output: 25.0

Ans to Q-10: Program will not compile due to a type mismatch error.
