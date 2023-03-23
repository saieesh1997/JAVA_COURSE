import java.util.Scanner;

class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "You Too Young Have patience";
	}
}

class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		
		return "You are Too Old Calm Down";
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getLicense();
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (OverAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	private static void getLicense() throws UnderAgeException, OverAgeException {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if (age < 18) {
			
			UnderAgeException e = new UnderAgeException();
			throw e;
		} else if (age > 60 ){
			
			throw new OverAgeException();
		}
		
	}

}
