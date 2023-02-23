import java.util.Scanner;

public class Day41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check whether number is multiple of 3,5 or multiple of both 3 & 5
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n % 3 == 0 && n % 5 == 0 ) {
			System.out.println("Multiple of Both 3 & 5");
		}else if(n % 3 == 0) {
			System.out.println("Multiple of 3");
		}else if(n % 5 == 0) {
			System.out.println("Multiple of 5");
		}
		else {
			System.out.println("Not a multiple of 3 & 5!");
		}

	}

}
