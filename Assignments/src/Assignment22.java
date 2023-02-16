import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if number is multiple of 2 or not
		int n;
		System.out.println("Enter the Number");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();
		if(n % 2 == 0) {
			System.out.println("Number is Divisible by 2");
		}else {
			System.out.println("Number is not Divisible by 2");
		}
		
		

	}

}
