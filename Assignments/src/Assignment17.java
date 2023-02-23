import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Total Surface Area Of Cylinder
		//Write a program to calculate total surface area of a cylinder
		//Formula: 2 * pi* r*(r+h)
		
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int h = scan.nextInt();
		float pi = 3.142f;
		float result = 2 * pi * r *(r+h);
		System.out.println(result);

	}

}
