import java.util.Scanner;

public class Day46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the table of a number like 5 * 1 = 5
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i =1 ; i<=10 ; i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
