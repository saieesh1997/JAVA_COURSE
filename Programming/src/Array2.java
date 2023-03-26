
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		// Permutation of sum and then Min & Max
		
		int[] ar = {2,5,1,4,3};
		int Sum=0;
		int min =ar[0];
		int max =ar[0];;
		for(int i = 0 ; i< ar.length ; i++) {
			Sum += ar[i];
			if(ar[i] < min) {
				min = ar[i];
			}
			
			if(ar[i] > max) {
				max = ar[i];
			}
			
		}
		
		System.out.println("Maximum "+(Sum-min));
		System.out.println("Minimum "+(Sum-max));
		

	}

}
