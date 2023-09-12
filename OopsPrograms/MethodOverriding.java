package OopsPrograms;

class Sports{
	
	String getName() {
		return "Generic Sports";
	}
	
	void getNumberOgTeamMembers() {
		System.out.println("Each team has n players in "+getName());
	}
}

class Soccer extends Sports{
	
	String getName() {
		return "Soccer Sports";
	}
	
	void getNumberOgTeamMembers(int n) {
		System.out.println("Each team has "+ n + " n players in "+getName());
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Sports sp = new Sports();
		Soccer sc = new Soccer();
		System.out.println(sp.getName());
		sp.getNumberOgTeamMembers();
		System.out.println(sc.getName());
		sc.getNumberOgTeamMembers(11);
	}

}
