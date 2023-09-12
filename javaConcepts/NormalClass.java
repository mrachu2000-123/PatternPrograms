package javaConcepts;

class market{
	void vegetables(){
		System.out.println("There are varieties of vegetables in market");
	}
	void fruits() {
		System.out.println("Different kinds of fruits are available");
	}
}

abstract class veggies extends market{
	
	abstract void fishes();
	abstract void dairyProduct();
}

class mall extends veggies{

	@Override
	void fishes() {
		System.out.println("Fishes are rich in high quality protein");
	}

	@Override
	void dairyProduct() {
		System.out.println("Dairy products are rich in calcium");
	}
	
	void fruits() {
		System.out.println("Seasonal fruits are not available all the time");
	}
}


public class NormalClass {

	public static void main(String[] args) {

		mall m = new mall();
		m.vegetables();
		m.fruits();
		m.fishes();
		m.dairyProduct();
	}

}
