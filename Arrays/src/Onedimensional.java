import java.util.Scanner;

public class Onedimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < a.length; i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Content in Arrays");
		for(int j = 0 ; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		

	}

}
