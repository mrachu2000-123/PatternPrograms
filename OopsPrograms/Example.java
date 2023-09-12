package OopsPrograms;

class Person {

	 private String name;
	 private int age;
	
	 Person(String name, int age){
		 this.name=name;
		 this.age=age;
	 }
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}

}

public class Example{
	public static void main(String[] args) {

		Person p1 = new Person("Bob",25);
		Person p2 = new Person("Mary",20);
		
		System.out.println(p1.getName()+" "+p1.getAge()+" "+"years of old");
		System.out.println(p2.getName()+" "+p2.getAge()+" "+"years of old");
	}
}
