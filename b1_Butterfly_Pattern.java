/*
         *      *
         **    **
         ***  ***
         ********      n = 4
         ********
         ***  ***
         **    **
         *      * 
 */
package Pattern_Question;
import java.util.Scanner;
public class b1_Butterfly_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n= sc.nextInt();
		// 1st Half
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <=i ; j++) {
				System.out.print("*");
			}
			for(int k = 1 ; k<=2*(n-i) ; k++){
				System.out.print(" ");
			}
			for(int l = 1 ; l <= i ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd Half
		for(int i = n ; i >=1 ; i--) {
			for(int j = 1 ; j <=i ; j++) {
				System.out.print("*");
			}
			for(int k = 1 ; k<=2*(n-i) ; k++){
				System.out.print(" ");
			}
			for(int l = 1 ; l <= i ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}