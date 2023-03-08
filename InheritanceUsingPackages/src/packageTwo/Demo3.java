package packageTwo;

import packageOne.Demo1;

public class Demo3 extends Demo1 {
	
	public void display() {
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c); default modifiers are only visible inside class
//		System.out.println(d); Private variables cannot be accessed in any class
		
	}

}
