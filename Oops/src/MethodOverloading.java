

class Sum {
	void add(int a , int b){
		System.out.println("Method 1");
		System.out.println(a+b);
	}
	
	void add (float a , float b) {
		System.out.println("Method 2");
		System.out.println(a+b);
	}
	
	void add (int a , int b , int c) {
		System.out.println("Method 3");
		System.out.println(a+b+c);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s = new Sum();
		s.add(5, 9);
//		s.add(1,2,3);
//		s.add(3.2f, 3.2f);

	}

}
