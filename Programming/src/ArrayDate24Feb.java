import java.util.Scanner;

public class ArrayDate24Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the missing number in array of integer
		

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar = new int[n];
		for(int i = 0 ; i <= ar.length-1 ; i++) {
			ar[i]=scan.nextInt();
		}
		int max = 11;
		int sum = max*(max+1)/2;
		//Maximum is the largest number in  the array
		System.out.println(sum);
		int arrayElementSum = arraySum(ar);
		int missNumber = sum - arrayElementSum;
		System.out.println(missNumber);

	}

	 static int arraySum(int[] ar) {
		// TODO Auto-generated method stub
		 int sum = 0;
		 for (int i = 0; i < ar.length; i++) {
			
			sum = sum + ar[i];
//			System.out.println(sum);
		}
		 return sum;
	}

}
