/*
      1
      1 2
      1 2 3      n = 4
      1 2 3 4
 */
package Pattern_Question;
import java.util.Scanner;
public class a6_Half_Pyramid_WithNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(+j+" ");
			}
			System.out.println();
		}
	}
}
