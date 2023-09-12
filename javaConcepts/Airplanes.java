package javaConcepts;

interface Flyable{
	void fly_obj();
	void land_obj();
}

class SpaceCraft implements Flyable{

	@Override
	public void fly_obj() {
		System.out.println("SpaceCraft flies at great height and speed");
	}

	@Override
	public void land_obj() {
		System.out.println("SpaceCraft slowed to a safe landing by parachutes");
	}

	public void travel() {
		System.out.println("SpaceCraft is designed for space navigation");
	}

}

class Helicopter implements Flyable{

	@Override
	public void fly_obj() {
		System.out.println("Helicopter flies at low height and speed");
	}

	@Override
	public void land_obj() {
		System.out.println("Helicopter can land on any flat surface");
	}

}

class Aeroplane implements Flyable{

	@Override
	public void fly_obj() {
		System.out.println("Aeroplanes flies at Medium height and speed");		
	}

	@Override
	public void land_obj() {
		System.out.println("Aeroplane are landed in a long runway in Airport");		
	}

	public void travel() {
		System.out.println("Aeroplane is designed to travel through the world");
	}

}

class Airflies{
	public static void permit(Flyable ref) {
		ref.fly_obj();
		ref.land_obj();
	}
}

public class Airplanes {

	public static void main(String[] args) {

		SpaceCraft sc = new SpaceCraft();
		Helicopter he = new Helicopter();
		Aeroplane ap = new Aeroplane();

		Airflies.permit(sc);
		sc.travel();
		Airflies.permit(he);
		Airflies.permit(ap);
		ap.travel();

		//		Flyable[] flyingObjects = {new SpaceCraft(), new Aeroplane(), new Helicopter()};
		//
		//		for (Flyable obj : flyingObjects) {
		//			obj. fly_obj();
		//			obj.land_obj();
		//		}

	}

}
