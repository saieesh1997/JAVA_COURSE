class BankServer extends Thread{
	Customer c ;
	String mode;
	
	public BankServer(Customer c , String mode) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.mode = mode;
	}
	
	@Override
	public void run() {
		c.withdraw(mode);
	}
}

class Customer{
	 synchronized void withdraw(String Mode) {
		for(int i = 0 ; i<10 ; i++) {
			System.out.println("Withdrawing Amount!"+Mode);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultithreadingSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer();
		Customer c1 = new Customer();
		
		BankServer t1 = new BankServer(c,"Phonepe");
		BankServer t2 = new BankServer(c,"GooglePay");
		BankServer t3 = new BankServer(c1,"Paytm");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
