
public class Passbyvalue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calc c = new calc();
		int num1 = 5;
		int num2 = 10;
		
		int result = c.add(num1, num2);
		System.out.println(result);

	}

}

class calc{
	int c ;
	int add(int a , int b) {
		c = a+b;
		return c;
	}
}
