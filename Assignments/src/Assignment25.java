import java.util.Scanner;

public class Assignment25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To Check whether number ends with 2 zeros
		
		int n ;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n % 100 == 0) {
			System.out.println("Number ends with 2 zeros");
		}else {
			System.out.println("Number doesnot ends with 2 zeros"); 
		}

	}

}
