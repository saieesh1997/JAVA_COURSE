import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDucking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started ");
		
		try {
			fun();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Finally Block Started!");
		}

	}

	 static void fun() throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("fun started");
		FileReader fl = new FileReader("G:\\Mysql.txt");
		System.out.println("fun stopped");
	}

}
