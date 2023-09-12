package OopsPrograms;

interface shape{
	double getArea();
}

class Rectangle implements shape{

	private double length;
	private double breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double getArea() {
	  return length * breadth;
	}
	
}

class Circle implements shape{

	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double getArea() {
	  return Math.PI * radius * radius;
	}
	
}

class Triangle implements shape{

	private double base;
	private double height;
	
	Triangle(double base,double height){
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea() {
	  return 0.5 * base * height;
	}
	
}

public class Geometryin {

	public static void main(String[] args) {

		Rectangle re = new Rectangle(10, 12);
		Circle c = new Circle(3);
		Triangle tri = new Triangle(4,6);
		
		System.out.println("Area of rectangle is "+re.getArea());
		System.out.println("Area of Circle is "+c.getArea());
		System.out.println("Area of Triangle is "+tri.getArea());

	}

}
