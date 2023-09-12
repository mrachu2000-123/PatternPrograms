package javaConcepts;

abstract class education{
	void field() {
		System.out.println("Different types of education field are there");
	}
	void branch() {
		System.out.println("In different field different branches are there");
	}
	void course() {
		System.out.println("Different branch contains different course");
	}
}
class Engineering extends education{
	void branch() {
		System.out.println("Engineering has different branches related to technology");
	}
}

public class Concreteab {

	public static void main(String[] args) {

		Engineering eng = new Engineering();
		eng.field();
		eng.branch();
		eng.course();
	}

}
