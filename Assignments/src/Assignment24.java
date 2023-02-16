import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check whether number divisible by 10 and number ends with single 0
		int n ;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n % 10 == 0) {
			System.out.println("Number Divisible by 10");
		}else {
			System.out.println("Number not Divisible by 10"); 
		}

	}

}
