package javaConcepts;

class OS{
	private String name;
	private int size;
	
	OS(String name, int size){
		this.name = name;
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}
	
}

class Charger{
	private String brand;
	private int voltage;
	
	Charger(String brand, int voltage){
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public int getVoltage() {
		return voltage;
	}
	
}

class Mobile{
	OS os = new OS("IOS",512);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
	
}

public class AggCompMob {

	public static void main(String[] args) {

		Charger c = new Charger("Apple", 5);
		Mobile mb = new Mobile();
		System.out.println(mb.os.getName());
		System.out.println(mb.os.getSize());
		mb.hasA(c);
		mb = null;
//		System.out.println(mb.os.getName());
//		System.out.println(mb.os.getSize());
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

}
