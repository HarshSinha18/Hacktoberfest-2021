/*
     * * * * *  
     * * * *      n = 5
     * * * 
     * *
     *  
*/
package Pattern_Question;
import java.util.Scanner;
public class a4_inverted_half_pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) {
				System.out.print(" ");
			for( int j = n ; j>=i ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
