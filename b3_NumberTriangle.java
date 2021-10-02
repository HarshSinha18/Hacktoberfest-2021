/*
               1     
              2 2    
             3 3 3        n = 5
            4 4 4 4  
           5 5 5 5 5 
*/
package Pattern_Question;
import java.util.Scanner;
public class b3_NumberTriangle {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter N : ");
	 int n = sc.nextInt();
	 for(int i = 1 ; i <= n ; i++) {
		 //Printing Space's
		 for(int j = 1 ; j <=(n-i) ; j++) {
			 System.out.print(" ");
		 }
		 // Printing Number's -> ith times
		 for(int k = 1 ; k <= i ; k++) {
			 System.out.print(+i+" ");
		 }
		 //Printing Space's
		 for(int l = 1 ; l <= (n-i) ; l++) {
			 System.out.print(" ");
		 }
		 System.out.println();
	   }
	}
}
