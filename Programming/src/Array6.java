
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Count the number of stars in pattern
		
		int n = 10;
		int sum =0;
		for (int i =1;i<=n;i++) {
			sum =sum+ i;
			for(int j=1 ; j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Number of starts printed" + sum);
	}

}
