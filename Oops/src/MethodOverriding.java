
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CargoPlane c = new CargoPlane();
		
		c.takeoff();
		c.fly();

	}

}


class Plane{
	void takeoff() {
		System.out.println("Plane taking off");
	}
	
	void fly() {
		System.out.println("Plane flys");
	}
	
	void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane{
	void fly() {
		System.out.println("Cargo plane is flying");
	}
}
