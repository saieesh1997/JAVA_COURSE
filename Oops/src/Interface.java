interface Calculator{
	void add();
	void sub();
	
}

class DevOne implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a =5 ;
		int b=5;
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a =5 ;
		int b=5;
		System.out.println(a-b);
	}
	
	public void mul() {
		int a =5 ;
		int b=5;
		System.out.println(a*b);
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new DevOne();
		c.add();
		c.sub();
	

	}

}
