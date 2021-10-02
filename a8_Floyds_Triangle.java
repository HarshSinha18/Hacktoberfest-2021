/*
           1
           2 3
           4 5 6
           7 8 9 10            n = 5;
           11 12 13 14 15
  */
package Pattern_Question;
import java.util.Scanner;
public class a8_Floyds_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int number = 1;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(+number+ " ");
				number++;
			}
			System.out.println();
		}

	}

}
