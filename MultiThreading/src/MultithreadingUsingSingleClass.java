class Demo extends Thread{
	void printNum() {
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
	
	void printchar() {
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
	
	@Override
	public void run() {
		String name = this.getName();
		if(name.equalsIgnoreCase("NUM")) {
			printNum();
			
		}else if(name.equalsIgnoreCase("CHAR")) {
			printchar();
		}
	}
}
public class MultithreadingUsingSingleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo t1 = new Demo();
		Demo t2 = new Demo();
		t1.setName("NUM");
		t2.setName("CHAR");
		t1.start();
		t2.start();

	}

}
