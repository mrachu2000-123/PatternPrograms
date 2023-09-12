package OopsPrograms;

 class Dog {
	private String name;
	private String breed;

	Dog(String name,String breed){
		this.name = name;
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
 }
 
public class Demo{
	public static void main(String[] args) {

		Dog d1 = new Dog("Jim","Pug");
		Dog d2 = new Dog("zoozoo","Bull Dog");
		System.out.println(d1.getName()+" is a "+d1.getBreed());
		System.out.println(d2.getName()+" is a "+d2.getBreed());

		d1.setName("Charlie");
		d1.setBreed("Golden Retriever");
		d2.setBreed("Labrador");
		
		System.out.println();
		System.out.println(d1.getName()+" is a "+d1.getBreed());
		System.out.println(d2.getName()+" is now a "+d2.getBreed());
	}
}
