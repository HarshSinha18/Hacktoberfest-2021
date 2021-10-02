/*    
    *****              m = row
    *****              n = column
    *****
    *****                  
*/
package Pattern_Question;
import java.util.Scanner;
public class a1_Solid_Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of Row : ");
		int m = sc.nextInt();
		System.out.print("Enter the no. of column : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= m ; i++) {
			for(int j = 1 ; j<= n ; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}