import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if numbers are divisible by 3 &5
		int n ;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("Number Divisible by 3 & 5");
		}else {
			System.out.println("Number not Divisible by 3 & 5"); 
		}
		
	}

}
