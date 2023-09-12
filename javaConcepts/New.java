package javaConcepts;

abstract class Animal {

	 abstract void dog();
	
	public void bark() {
		System.out.println("bow-bow");
	}
}

 class Puppy extends Animal{
	
	@Override
	public void dog() {
		System.out.println("dog give birth to puppies");
	}
}
 


public class New {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.dog();
		p.bark();
	}
}
