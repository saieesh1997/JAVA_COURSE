import java.util.Scanner;

public class Day51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print the factors of N 
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}

	}

}
