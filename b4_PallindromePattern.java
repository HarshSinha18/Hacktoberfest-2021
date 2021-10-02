/*
                1
               212
              32123     n = 5
             4321234
            543212345
*/
package Pattern_Question;
import java.util.Scanner;
public class b4_PallindromePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			// Printing Space
	          for(int j = 1 ; j<=(n-i) ; j++) {
	        	  System.out.print(" ");
	          }
	          // Printing Numbers(First Half)
	          for(int k = i ; k>=1 ; k--) {
	        	  System.out.print(+k);
	          }
	          //Printing Numbers(Secound Half)
	          for(int l = 2 ; l<=i ; l++) {
	        	  System.out.print(l);
	          }
	          System.out.println();
		}			
	}
}
