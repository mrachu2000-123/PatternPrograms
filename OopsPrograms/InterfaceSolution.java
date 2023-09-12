package OopsPrograms;

interface AdvancedArithmetic{
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		
		int x = 0;
		for (int j = 1; j <= n; j++) {
			if(n%j==0) {
				 x = x+j;
			}
		}
		return x;
	}
	
}

public class InterfaceSolution {

	public static void main(String[] args) {

		MyCalculator calc = new MyCalculator();
		int y = calc.divisor_sum(6);
		System.out.println("I implemented a Advanced Arithmetic");
		System.out.println(y);
	}

}
