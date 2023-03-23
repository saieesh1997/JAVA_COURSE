

class PrintNum implements Runnable{

	@Override
	public void run() {
		// TODO 
		for(int i =0 ; i<=20 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class PrintChar implements Runnable{

	@Override
	public void run() {
		for (char i = 'A' ; i <= 'Z' ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class MultithreaidngUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNum pn = new PrintNum();
		PrintChar pc = new PrintChar();
//		
//		pn.run();
//		pc.run();
		
		Thread t1 = new Thread(pn);
		Thread t2 = new Thread(pc);
		t1.start();
		t2.start();

	}

}
