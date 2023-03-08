package packageOne;

public class Demo1 {
	
	public int a=5;
	protected int b;
			int c;
//	private int d;
			
			public void display() {
				System.out.println("Hello From Demo1");
				
			}

}

 class Demo2 extends Demo1{
	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}