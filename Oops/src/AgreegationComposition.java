class Charger{
	String brand;
	double voltage;
	public Charger(String brand, double voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getVoltage() {
		return voltage;
	}
}


class  Os {
	String name;
	double size;
	
	public Os() {
		
	}
	
	public Os(String name , double size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}
	
}

class Mobile{
	Os os = new Os("Android",2);
	Charger charger;
	public Mobile() {
	}
	
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	void getChargerDetails() {
		System.out.println(charger.getBrand() + charger.getVoltage());
	}
	
	void getOsDetails() {
		System.out.println(os.getName() + os.getSize());
	}
}	
public class AgreegationComposition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Charger charger = new Charger("MI", 60);
		
		Mobile mb = new Mobile();
		
		mb.setCharger(charger);
		
		mb.getChargerDetails();
		mb.getOsDetails();
		

	}

}
