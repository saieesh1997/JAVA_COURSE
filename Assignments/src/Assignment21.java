import java.util.Scanner;

public class Assignment21 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4; 
		System.out.println("Enter the Number?");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		if(n % 2 == 0) 
		{
			System.out.println(n+" : is a Even Number");
		}
		else 
		{
			System.out.println(n+" : is a Odd Number");
		}

	}

}
