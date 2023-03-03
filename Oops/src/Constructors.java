import java.util.Scanner;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Constructor is like a method
		 It Should have same name as class name
		 Whenever you create Object the Constructor Should be Called*/
		
		Scanner scan = new Scanner(System.in);
		int stdId = scan.nextInt();
		
		String stdName = scan.next();
		
		int rollNumber = scan.nextInt();
		
		Student s = new Student(stdId, stdName, rollNumber);
		
		System.out.println(s.getStdId()+" / "+s.getStdName()+" / "+s.getRollNumber());
		

	}

}


class Student{
	private int stdId;
	private String stdName;
	private int rollNumber;
    
	Student(int stdId , String stdName , int rollNumber){
		this();
		System.out.println("Constructor with 3 paramter called!");
		this.stdId = stdId;
		this.stdName = stdName;
		this.rollNumber = rollNumber;
		
	}
	
	Student(){
		System.out.println("Successfully called Constructor from Constructor which has 3 param");
	}

	public int getStdId() {
		return stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	
	
	
}
