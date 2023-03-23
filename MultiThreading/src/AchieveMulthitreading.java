
class PrintNumbers1 extends Thread{
	@Override
	public void run() {
		for(int i =1 ; i<=20 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	void fun1() {
//		for(int i =0 ; i<=20 ; i++) {
//			System.out.println(i);
//		}
//	}
}

class PrintCharacters1 extends Thread{
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
//	void fun2() {
//		for (char i = 'A' ; i <= 'Z' ; i++) {
//			System.out.println(i);
//		}
//	}
}

public class AchieveMulthitreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumbers1 t1 = new PrintNumbers1();
		PrintCharacters1 t2 = new PrintCharacters1();
		
		t1.start();
		t2.start();

	}

}
