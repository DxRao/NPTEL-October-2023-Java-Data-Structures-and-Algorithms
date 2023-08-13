package W1PA;

class Demo<T>{
	
	T t;
	
	Demo(T t){
		
		this.t = t;		
	}
	
	public T DemoMethod() {
		
		return this.t;		
	}	
}

public class A1_2020_Q7 {

	public static void main(String[] args) {
	
		Demo<Integer> i = new Demo<>(5);
		
		System.out.println(i.DemoMethod());
		
		Demo<Double> f = new Demo<>(14.6);
		
		System.out.println(f.DemoMethod());

	}

}

/*
  
5
14.6
 
 */
