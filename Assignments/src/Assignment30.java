import java.util.Scanner;

public class Assignment30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check Whether Number is three digit and Multiple of
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n>=100 && n<=999 ) {
			System.out.println(n+": is a Three Digit number");
		}else {
			System.out.println(n+": is not a Three Digit number");
		}
			
		if( n%10==0 ) {
			System.out.println(n+": is a  Multiple of 10");
		}else {
			System.out.println(n+": is a not a Multiple of 10");
		}

	}

}
