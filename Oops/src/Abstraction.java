import java.util.Scanner;

abstract class Shape{
	int area;
	
	abstract void acceptInput();
	abstract void calcArea();
	abstract void dispArea();
}


 class Square extends Shape{
	int side;
	@Override
	void acceptInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		side = scan.nextInt();
	}

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		area = side * side ;
	}

	@Override
	void dispArea() {
		// TODO Auto-generated method stub
		System.out.println(area);
	}
	
}
 
class Rectangle extends Shape{
	int length , breadth;
	@Override
	void acceptInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter length and breadth");
		Scanner scan = new Scanner(System.in);
		length = scan.nextInt();
		breadth = scan.nextInt();
		
	}

	@Override
	void calcArea() {
		// TODO Auto-generated method stub
		area = length * breadth ;
	}

	@Override
	void dispArea() {
		// TODO Auto-generated method stub
		System.out.println(area);
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Rectangle();
		
		s.acceptInput();
		s.calcArea();
		s.dispArea();
	}

}
