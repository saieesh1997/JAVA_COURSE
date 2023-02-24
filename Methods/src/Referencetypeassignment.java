
public class Referencetypeassignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car x = new car();
		
		x.name="AUdi";
		x.cost=1200000;
		
		car y;
		
		y = x;
		
		System.out.println(x.name);
		System.out.println(x.cost);
		System.out.println(y.name);
		System.out.println(y.cost);
		
		y.name="Honda";
		y.cost=800000;
		
		System.out.println(x.name);
		System.out.println(x.cost);

	}
	
	
}
class car{
	String name;
	int cost;
}

