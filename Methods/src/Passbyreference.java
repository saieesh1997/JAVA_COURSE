
public class Passbyreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		d.name="tipu";
		d.cost=100;
		
		System.out.println(d.name);
		System.out.println(d.cost);
		
		d.alterDog(d);
		
		System.out.println(d.name);
		System.out.println(d.cost);
		

	}

}

class dog{
	String name;
	int cost;
	
	void alterDog(dog y) {
		y.name="ranger";
		y.cost=500;
	}
}
