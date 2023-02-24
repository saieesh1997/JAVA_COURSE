
public class Methods2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int result = c.add();
		System.out.println(result);

	}

}
class Calculator{
	int a =5;
	int b= 5;
	
	int add() {
		int c = a+b;
		return c;
	}
}