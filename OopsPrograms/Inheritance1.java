package OopsPrograms;

class Animal{
	
	public void walk() {
		System.out.println("I am Walking");
	}
}

class Bird extends Animal{
	public void fly() {
		System.out.println("I am Flying");
	}
	
   public void sing() {
	   System.out.println("I am Singing");
   }
}

public class Inheritance1 {

	public static void main(String[] args) {

		Bird b = new Bird();
		b.walk();
		b.fly();
		b.sing();
	}

}
