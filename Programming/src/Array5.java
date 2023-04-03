import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To find the occurance of largest number in the array
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar = new int[n];
		for(int i = 0 ; i <= ar.length-1 ; i++) {
			ar[i]=scan.nextInt();
		}
		
//		maxOccurance(ar);
		int res =returnIndex(ar);
		System.out.println(res);
		

	}

    public static int returnIndex(int[] ar) {
		// TODO Auto-generated method stub
    	Scanner scan = new Scanner(System.in);
    	int k = scan.nextInt();
    	for(int i =0 ; i<=ar.length-1;i++) {
    		
			if(k==ar[i]) {
				return i;
			}
		}
    	return -1;
		
	}

	static void maxOccurance(int[] ar) {
		// TODO Auto-generated method stub
		int max = ar[0];
		int count = 0;
		
		for(int i =0 ; i<=ar.length-1;i++) {
			if(max<ar[i]) {
				max = ar[i];
			}
		}
		
		for(int i =0 ;i<=ar.length-1;i++) {
			if(max==ar[i]) {
				count++;
			}
		}
		
		System.out.println("Maximum Number is:"+max+"number of time occured is:"+count);
	}

}
