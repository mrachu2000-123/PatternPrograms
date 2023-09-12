package javaConcepts;

class Heart{
	private float weight;
	private int bpm;
	
	Heart(float weight, int bpm){
		this.weight = weight;
		this.bpm = bpm;
	}

	public float getWeight() {
		return weight;
	}

	public int getBpm() {
		return bpm;
	}
	
}

class Brain{
	private float weight;
	private String color;
	
	Brain(float weight, String color){
		this.weight = weight;
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public String getcolor() {
		return color;
	}
	
}

class Bike{
	private String brand;
	private float mileage;
	
	Bike(String brand, float mileage){
		this.brand = brand;
		this.mileage = mileage;
	}

	public String getbrand() {
		return brand;
	}

	public float getmileage() {
		return mileage;
	}
	
}

class Book{
	private String Name;
	private String Author;
	
	Book(String Name, String Author){
		this.Name = Name;
		this.Author = Author;
	}

	public String getName() {
		return Name;
	}

	public String getAuthor() {
		return Author;
	}
	
}

class Student{
	Heart he = new Heart(284.7f, 72);
	Brain b = new Brain(1.4f, "Grey");
	void hasA(Bike b, Book bo) {
		System.out.println("Bike is of brand "+b.getbrand());
		System.out.println("Bike gives a milege of "+b.getmileage());
		System.out.println("Name of the book is "+bo.getName());
		System.out.println("Book is written by "+bo.getAuthor());
	}
}

public class ACStudent {

	public static void main(String[] args) {

		Bike b = new Bike("Duke", 35);
		Book bo = new Book("Java", "Ritchie");
		Student st = new Student();
		System.out.println("Human brain is weighing around "+st.b.getWeight()+"Kg");
		System.out.println("Human brain is of color "+st.b.getcolor());
		System.out.println("Human heart weight for an average person is "
		+st.he.getWeight()+"g");
		System.out.println("Human heart beats per mintues is "+st.he.getBpm());
		st.hasA(b, bo);
		st = null;
//		System.out.println(st.b.getWeight());
//		System.out.println(st.b.getcolor());
//		System.out.println(st.he.getWeight());
//		System.out.println(st.he.getBpm());
		System.out.println("\nBike is of brand "+b.getbrand());
		System.out.println("Bike gives a milege of "+b.getmileage());
		System.out.println("Name of the book is "+bo.getName());
		System.out.println("Book is written by "+bo.getAuthor());
		
	}

}
