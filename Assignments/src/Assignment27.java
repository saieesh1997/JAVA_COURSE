import java.util.Scanner;

public class Assignment27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check Whether Number multiple 3,5,7
		int n ;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if(n%5==0) {
			System.out.println("Number is multiple of 5");
		}else if(n%3==0) {
			System.out.println("Number is multiple of 3");
		}else if(n%7==0) {
			System.out.println("Number is multiple of 7");
		}
		else {
			System.out.println("Number is not divisible 3 , 5 , 7");
		}
	}

}
