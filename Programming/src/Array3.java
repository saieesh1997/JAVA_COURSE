
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p =120;
		int[] ar = {2,5,1,4,3};
		
		int [] res = new int[ar.length];
		
		for(int i = 0 ; i< res.length ; i++) {
			res[i] = p/ar[i];
		}
		
		for (int j =0 ; j< res.length ; j++){
			System.out.println(res[j]);
		}

	}

}
