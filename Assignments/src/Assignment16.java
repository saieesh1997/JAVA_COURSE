import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to find the area of the circle.
//		Formula: area = pi*r*r
//		Consider pi = 3.142
		
		float pi = 3.142f;
		System.out.println(pi);
		
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		
		float area = pi * radius * radius;
		System.out.println(area);

	}

}
