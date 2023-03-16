
public class ExceptionTypeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		int a = 5;
		int b = 0;
		fun1(a,b);
		System.out.println("Main Stopped");
	}
	
	static void fun1(int a , int b) {
		System.out.println("Fun 1 started");
		fun2(a,b);
		System.out.println("Fun 1 stopped");
	}
	
	static void fun2(int a , int b) {
		System.out.println("Fun 2 started");
		fun3(a,b);
		System.out.println("Fun 2 stopped");
	
	}
	
	static void fun3(int a , int b) {
		System.out.println("Fun 3 started");
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println(e);
			System.err.println(e);
//			e.printStackTrace();
		}
		System.out.println("Fun 3 stopped");
		
		
	
	}

}
