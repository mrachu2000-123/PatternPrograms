package OopsPrograms;

import java.util.Scanner;

class Arithmetic{
	
	int add(int a, int b) {
		return a+b;
	}
}

class Adder extends Arithmetic{
	 
}


public class Inheritance2 {

	public static void main(String[] args) {

		Adder add = new Adder();

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("My SuperClass is : "+ add.getClass().getSuperclass().getSimpleName());
		System.out.println(add.add(a, b)+ "  "+ add.add(b, c));
	}

}
