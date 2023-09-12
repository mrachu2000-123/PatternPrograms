package OopsPrograms;

class Bicycle{
	String define() {
		return "a vehicle with pedals.";
	}
	
}

class MotorCycle extends Bicycle{
	String define() {
		return "a vehicle with engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define());
		String temp = super.define();
		System.out.println("My ancestor is a cycle who is "+temp);
	}
}

public class MethodOverSuper {

	public static void main(String[] args) {

		MotorCycle mc = new MotorCycle();
		
	}

}
