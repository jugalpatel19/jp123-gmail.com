package Module2;
/*
 * 
 *  W.A.J.P to Print pattern Given Below.
 * *
* * *
* * * * *
* * *
*
 */
public class Pattern4 {
	

	public static void main(String[] args ) {
		
		for (int i = 1; i <=3; i++) {
			for (int k = i; k <=3; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 2; i >=1; i--) {
			for (int k = i; k <=3; k++) {
				System.out.print(" ");
			}
			for (int j = i*2-1; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



