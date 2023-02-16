
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *****
		 *   *
		 *   *
		 *****
		 */
		
		
		 int n = 5 ;
		 
		 for(  int i = 0 ; i<4 ; i++) 
		 {
			 for(int j = 0; j < 5 ; j++) 
			 {
				 if(i==0 || i == 3 ||j == 0 ||j == n-1 ) 
				 {
					 System.out.print("*");
				 }else 
				 {
					 System.out.print(" ");
				 }
				 
			 }
			 System.out.println();
		 }

	}

}
