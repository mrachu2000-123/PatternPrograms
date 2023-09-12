import java.util.Scanner;

public class DiamondShape {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		diamondShapeHollow(n);
	}

	public static void diamondShapeHollow(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j == n/2 || j-i == n/2 || i-j == n/2 || i+j == n/2+(n-1)){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}