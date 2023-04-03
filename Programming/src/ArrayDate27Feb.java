import java.util.Scanner;

public class ArrayDate27Feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number of times each element present in array
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar = new int[n];
		for(int i = 0 ; i <= ar.length-1 ; i++) {
			ar[i]=scan.nextInt();
		}
		int Count=1;
		for(int i = 0 ; i < ar.length-1 ; i++) {
			if(ar[i]==ar[i+1]) {
				
				Count++;
			}
			else {
				System.out.println(ar[i]+"-"+Count);
				Count=1;
			}
		}
		System.out.println(ar[ar.length-1]+"-"+Count);
		
		
	}

}
