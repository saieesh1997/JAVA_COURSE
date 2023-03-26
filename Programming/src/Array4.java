import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OCCUrence of Largest number in array
		//finding the index of given k value
	  int k = 1;
	  int[] ar = array();
	  largestNumber(ar);
	  int index = indexOfK(ar,k);
      System.out.println(index);
	}

	

	 static int indexOfK(int[] ar,int k) {
		// TODO Auto-generated method stub
		for(int i =0 ; i<ar.length ; i++) {
			if(k==ar[i]) {
				return i ;
			}
		}
		return -1;
		
	}



	private static void largestNumber(int[] ar) {
		// TODO Auto-generated method stub
		int count =0;
		int max =ar[0];
		for(int i = 0 ; i<ar.length ; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
			
			if(max == ar[i]) {
				count++;
			}
		}
		System.out.println("Largest number occurence is"+count);
		
	}



	private static int[] array() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		for (int i =0 ;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		return a;
	}

}
