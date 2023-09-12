package javaConcepts;

import java.util.Scanner;

abstract class Shape{
	
	float area;
	abstract void takeInput();
	abstract void calcArea();
	void dispOutput() {
		System.out.println(area);
	}
	
}

class Rectangle extends Shape{
	float length;
	float breadth;
	
	void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		length = scan.nextFloat();
		System.out.println("Enter the breadth");
		breadth = scan.nextFloat();
	}
	
	void calcArea() {
		area = length*breadth;
	}
	
}

class Square extends Shape{
	float side;
	
	void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side");
		side = scan.nextFloat();
	}
	
	void calcArea() {
		area = side*side;
	}
}

class Circle extends Shape{
	float radius;
	
	void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = scan.nextFloat();
	}
	
	void calcArea() {
		area = 3.141f*radius*radius;
	}
	
}

class Geometry{
	
	static void permit(Shape ref) {
		ref.takeInput();
		ref.calcArea();
		ref.dispOutput();
	}
}

public class AreaPrgm {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();
		
		Geometry.permit(r);
		Geometry.permit(s);
		Geometry.permit(c);
		
	}

}
