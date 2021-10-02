/*
           *    
          ***    
         *****    
        *******    
       *********    
       *********    
        *******    
         *****    
          ***    
           *    
 */
package Pattern_Question;
import java.util.Scanner;
public class b5_DimondPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			// For Printing Space ( i st Half )->before Pattern
			for(int j = 1 ; j<=(n-i) ; j++) {
				System.out.print(" ");
			}
			//For Printing Pattern (i st Half)
			for(int k = 1 ; k<=2*i-1 ; k++) {
				System.out.print("*");
			}
			//For Printing Space (i st Half)->after Pattern
		for(int k = (n-1) ; k>= 1 ; k--) {
			System.out.print(" ");
		}
		System.out.println();
		}
		// 2 nd Half
		for(int i = n ; i >=1 ; i--) {
			for(int j = 1 ; j<=(n-i) ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=2*i-1 ; k++) {
				System.out.print("*");
			}
		for(int k = (n-1) ; k>= 1 ; k--) {
			System.out.print(" ");
		}
		System.out.println();
		}
	}
}
