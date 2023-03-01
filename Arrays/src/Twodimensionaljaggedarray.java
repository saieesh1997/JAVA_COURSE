import java.util.Scanner;
public class Twodimensionaljaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[][] a = new int [2][];
		a[0] = new int[3];
		a[1] = new int[5];
		
			for(int i = 0 ; i < a.length ; i++) {
			
			for (int j = 0 ; j < a[i].length ; j++) {
				
				System.out.println("enter the age of student "+j+"from class "+i);
				a[i][j] = scan.nextInt();
			}
		}
			
			for(int i = 0 ; i < a.length ; i++) {
				
				for (int j = 0 ; j < a[i].length ; j++) {
					
					System.out.println(a[i][j]);
				}
			}
		

	}

}
