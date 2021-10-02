/*
   *****
   *   *         m(row) = 4
   *   *         n(column) = 5
   *****
  
*/

package Pattern_Question;
import java.util.Scanner;
public class a2_Hollow_Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Column : ");
		int n = sc.nextInt();
		System.out.print("Enter no. of Row : ");
		int m = sc.nextInt();
		for(int i = 1 ; i <= m ; i++) {
			for(int j = 1 ; j<= n ; j++) {
				if(i==1 || i==m || j==1 || j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
