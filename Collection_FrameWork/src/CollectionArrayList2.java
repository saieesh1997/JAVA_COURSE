import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private int id;
	private String name;
	private float balance;
	
	public Employee() {
		
	}
	public Employee(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+this.id+","+this.name+","+this.balance+")";
	}
	
	
	}
public class CollectionArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number Of Employees");
		int n = scan.nextInt();
		
		for(int i =0 ; i<n ; i++) {
			System.out.println("Enter the Employee Details");
			String name = scan.next();
			float salary = scan.nextFloat();
			Employee e = new Employee(i+1001, name, salary);
			employees.add(e);
		}
		
		for(int i =0 ; i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		

	}

}
