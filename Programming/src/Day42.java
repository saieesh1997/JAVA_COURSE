import java.util.Scanner;

public class Day42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check whether unicode is uppercase . lowercase or numbers. using ASCII values
		// A-Z=65-90 , a-z = 97 - 122 , 0-9 = 48 - 57
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if (n>=65 && n <=90) {
			System.out.println("Unicode is Uppercase");
			System.out.println((char)n);
		}else if (n>=97 && n <=122) {
			System.out.println("Unicode is Lowercase");
			System.out.println((char)n);
		}else if (n>=48 && n <=57) {
			System.out.println("Unicode is Numbers");
			System.out.println((char)n);
		}else {
			System.out.println("Unicode is not a uppercase , lowercase or Number");
		}

	}

}
