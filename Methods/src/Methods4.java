
public class Methods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum4 s1 = new Sum4();
		int result = s1.add(10, 10);
		System.out.println(result);

	}

}

class Sum4{
	
	int add(int a , int b) {
		int c = a+b;
		return c;
	}
}