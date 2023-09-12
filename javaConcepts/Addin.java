package javaConcepts;

import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
}

class MyCalculator1 implements Calculator{
	
	int a = 25, b = 10;
	int c;
	@Override
	public void add() {
		 c = a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		 c = a-b;
		System.out.println(c);
	}

	public void mul() {
		c = a*b;
		System.out.println(c);
	}
	
}

class MyCalculator2 implements Calculator{

	Scanner scan = new Scanner(System.in);
	
	@Override
	public void add() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a-b);
	}

}

public class Addin {

	public static void main(String[] args) {

		MyCalculator1 mc1 = new MyCalculator1();
		MyCalculator2 mc2 = new MyCalculator2();
		
		mc1.add();
		mc1.sub();
		mc1.mul();
		mc2.add();
		mc2.sub();
	}

}
