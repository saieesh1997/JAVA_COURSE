import java.util.Scanner;

public class Assignment29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To check Whether Number is three digit or not
				int n;
				Scanner input = new Scanner(System.in);
				n = input.nextInt();
				if(n>=100 && n<=999) {
					System.out.println(n+": is a Three Digit number");
				}else {
					System.out.println(n+": is a not Three Digit number");
				}

	}

}
