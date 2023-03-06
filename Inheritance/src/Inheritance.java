public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samsung s5 = new Samsung();
		s5.call();
		s5.redial();
		
		SamsungUltra ultra = new SamsungUltra();
		ultra.call();
		ultra.redial();
		System.out.println(ultra.model);
		
	}

}

class MobileCallFeatures{
	void call() {
		System.out.println("Started Call");
	}
	
	void redial() {
		System.out.println("Rediales previous Number");
	}
}

class Samsung extends MobileCallFeatures{
	int model = 123;
	
}

class SamsungUltra extends Samsung {
	
}