
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(10,20,30);
		c.disp2();

	}

}

class Parent {
	int x;
	static int y;
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	{
		x = 50;
		System.out.println("Instance block parent");
	}
	
	Parent(){
		System.out.println("Parent Constructor Called");
	}
	
	static{
		System.out.println("Static Block 1 parent");
	}
	
	Parent (int x , int y){
		System.out.println("Parent Constructor 2");
	}
}

class Child extends Parent{
	int a ;
	static int b;
	void disp2() {
		display();
		System.out.println(a);
		System.out.println(b);
	}
	
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Child static Block 1");
	}
	
	{
		System.out.println("Child Instance Block 2");
	}
	
	Child (int a , int x , int y){
		x = x;
		this.y = y;
		System.out.println("CHild Constructor");
	}
}

