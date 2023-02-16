import java.util.Scanner;

public class Assignment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // To check whether number ends with 5
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n%10 == 5) {
			System.out.println("Number ends with 5");
		}else {
			System.out.println("Number doesnot ends with 5");
		}
	}

}
