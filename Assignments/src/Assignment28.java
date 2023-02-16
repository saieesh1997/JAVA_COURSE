import java.util.Scanner;

public class Assignment28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check Whether Number is two digit or not
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n>9 && n<=99) {
			System.out.println(n+": is a Two Digit number");
		}else {
			System.out.println(n+": is a not Two Digit number");
		}

	}

}
