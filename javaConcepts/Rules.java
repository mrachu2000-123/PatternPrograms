package javaConcepts;

abstract class bird{
	abstract void fly();
}

abstract class bird2 extends bird{
	abstract void eat();
}

class Eagle extends bird2{

	@Override
	void eat() {
		System.out.println("Eagles hunt and eat");
	}

	@Override
	void fly() {
		System.out.println("Eagles flies at great height");
	}
	
}

class SerpantEagle extends Eagle{
	
	void eat() {
		System.out.println("SerpantEagle hunt over ocean and eat");
	}
}

class GoldenEagle extends Eagle{
	
	void eat() {
		System.out.println("GoldenEagle hunt over mountain and eat");
	}
}

public class Rules {

	public static void main(String[] args) {
		
		SerpantEagle se = new SerpantEagle();
		GoldenEagle ge = new GoldenEagle();
		se.eat();
		se.fly();
		ge.eat();
		ge.fly();
	}

}
