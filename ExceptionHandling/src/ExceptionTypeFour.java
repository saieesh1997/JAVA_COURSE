
public class ExceptionTypeFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// out of memory error
		
		
		System.out.println("Integer Max value: " + Integer.MAX_VALUE);
		try {
			int[] a = new int [Integer.MAX_VALUE];
		}
		catch(OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
		

	}

}
