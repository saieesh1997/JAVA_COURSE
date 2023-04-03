import java.util.Scanner;

public class ArrayDate27Feb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find the element repeated more
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []ar = new int[n];
		for(int i = 0 ; i <= ar.length-1 ; i++) {
			ar[i]=scan.nextInt();
		}
		int max =0;
		int Count=0;
		int max_value =0;
		for(int i = 0 ; i < ar.length-1 ; i++) {
			if(ar[i]==ar[i+1]) {
				
				Count++;
			}
			else {
				if(Count > max) {
					max = Count;
					max_value = ar[i];
					Count=1;
			}
		}
//			if(Count > max) {
//				max = Count;
//				max_value = ar[ar.length-1];
//				}
//			}
		}
		System.out.println(max_value+"-"+max);
		
		
	
	}

}
