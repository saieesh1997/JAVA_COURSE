import java.util.Scanner;

public class Array27feb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar = new int[n];
		for(int i = 0 ; i <= ar.length-1 ; i++) {
			ar[i]=scan.nextInt();
		}
		
		for(int j = ar.length-2 ; j>=0 ;j++) {
			if(ar[j] == ar[j+1]) {
				System.out.println(ar[j]);
				break;
			}
		}
	}

}
