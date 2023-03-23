import java.util.Iterator;

class Eclipse extends Thread {
	void typing() {
		for(int i = 1 ; i<15 ; i++) {
			System.out.println("Typing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void codeCompletion() {
		for(int i = 1 ; i<20 ; i++) {
			System.out.println("Code completion");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void Saving() {
		for(int i = 1 ; i<20 ; i++) {
			System.out.println("Code saved");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("TYPE")) {
			typing();
			
		} else if (Thread.currentThread().getName().equals("CODE")) {
			codeCompletion();
			
		}else if (Thread.currentThread().getName().equals("SAVE")) {
			Saving();
			
		}
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse t1 = new Eclipse();
		Eclipse t2 = new Eclipse();
		Eclipse t3 = new Eclipse();
		
		t1.setName("TYPE");
		t2.setName("CODE");
		t3.setName("SAVE");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
