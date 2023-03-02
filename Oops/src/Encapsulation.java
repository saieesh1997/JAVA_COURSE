
class SbiAccount{
	private int accNo;
	private String accHolderName;
	private float accBalance;
	
	void setAccNo(int accNo) {
		
		this.accNo = accNo;
	}
	
	void setaccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	void setaccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	
	int getAccNo() {
		return accNo;
	}
	
	String getaccHolderName() {
		return accHolderName;
	}
	
	float getAccBalance() {
		return accBalance;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SbiAccount s = new SbiAccount();
		s.setAccNo(123);
		s.setaccHolderName("Saieesh Naik");
		s.setaccBalance(50000);
		
		System.out.println(s.getAccBalance() + s.getaccHolderName() + s.getAccNo());

	}

}
