/*
         1 2 3 4 5 
         1 2 3 4 
         1 2 3       n = 5
         1 2 
         1 
*/

package Pattern_Question;
import java.util.Scanner;
public class a7_Inverted_HalfPyramid_with_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		for(int i = n ; i >=1 ; i--) {
			for(int j = 1 ; j <=i ; j++) {
				System.out.print(+j+ " ");
			}
			System.out.println();
		}
	}
}
