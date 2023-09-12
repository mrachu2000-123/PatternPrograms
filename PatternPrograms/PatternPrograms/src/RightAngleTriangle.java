import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		rightAngleHollow(n);
		rightAngleTriangle(n);
	}

	public static void rightAngleTriangle(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void rightAngleHollow(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j || j ==0 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
