/*
            *****
           *****
          *****       n = 5
         *****
        *****
 */
package Pattern_Question;
import java.util.Scanner;
public class b2_Rhombus_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			// printing Space
			for(int j = 1 ; j <=(n-i) ; j++) {
				System.out.print(" ");
			}
			//Printing Pattern
			for(int k = 1 ; k <= n ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
