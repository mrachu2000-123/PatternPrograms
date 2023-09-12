import java.util.Scanner;

public class CrossSectional {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		crossSectionalPattern(n);
		
	}

	public static void crossSectionalPattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || j==0 || i==n-1 || j==n-1 || j==n/2 || i==n/2 ||
				 i+j == n/2 || j-i == n/2 || i-j == n/2 || i+j == n/2+(n-1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
	}

}
