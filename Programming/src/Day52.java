import java.util.Scanner;

public class Day52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find whether the number is prime or not 
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count =0;
		
		for (int i =1 ; i<=n ; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}

	}

}
