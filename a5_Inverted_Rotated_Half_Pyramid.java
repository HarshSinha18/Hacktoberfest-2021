/*   
            *
          * * 
        * * *       n = 4
      * * * *
 */
package Pattern_Question;
import java.util.Scanner;
public class a5_Inverted_Rotated_Half_Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) { // Outer Loop
			// for printing Space
			for(int j = n ; j>i ; j--) {
				System.out.print(" ");
			}
		    // for printing star
			for(int k = 1 ; k<=i ; k++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
		