
public class ExceptionTypeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack overflow error
		
		fun(0);

	}
	
	static void fun(int i) {
		System.out.println(i);
		fun(i+1);
	}

}
