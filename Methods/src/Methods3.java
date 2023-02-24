
public class Methods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		s.add(5, 10);

	}

}

class Sum{
	
	void add(int a , int b) {
		int c = a+b;
		System.out.println(c+" answer");
	}
}