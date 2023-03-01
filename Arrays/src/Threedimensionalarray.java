import java.util.Scanner;

public class Threedimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[][][] a = new int[2][3][5];
		
		for(int i = 0 ; i<a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				for (int k = 0; k < a[i][j].length ; k++) {
					System.out.println("Enter age for students"+i+j+k);
					a[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for(int i = 0 ; i<a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				for (int k = 0; k < a[i][j].length ; k++) {
					System.out.println(a[i][j][k]);
					
				}
			}
		}

	}

}
