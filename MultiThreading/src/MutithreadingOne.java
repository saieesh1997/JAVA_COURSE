


class PrintNumbers{
	void fun1() {
		for(int i =0 ; i<=20 ; i++) {
			System.out.println(i);
		}
	}
}

class PrintCharacters{
	void fun2() {
		for (char i = 'A' ; i <= 'Z' ; i++) {
			System.out.println(i);
		}
	}
}


public class MutithreadingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumbers t1 = new  PrintNumbers();
		PrintCharacters t2 = new PrintCharacters();
		t1.fun1();
		t2.fun2();

	}

}
