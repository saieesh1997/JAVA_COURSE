import java.util.Scanner;

public class Day43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if n =5 print all the even numbers from 1 to 5
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {	
			if(i % 2 ==0) {
				System.out.println(i);
			}
		}

	}

}
