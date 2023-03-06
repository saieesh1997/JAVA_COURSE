
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		System.out.println(t.x);
		System.out.println(t.y);
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.fun2();
		

	}

}

class Test{
	static int a , b;
	static void fun1() {
		System.out.println("Static Method");
	}
	
	int x , y;
	void fun2() {
		System.out.println("Instance Method");
	}
	
	Test(){
		System.out.println("Default Constructot");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
}
