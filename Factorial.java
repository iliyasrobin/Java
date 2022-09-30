
package javaprograms;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int j, fac =1;
        System.out.print("Enter any positive integer: ");
        j = inp.nextInt();
        
        //using while loop
//       while(j!=0) {
//          fac = fac* j;
//           j = j-1;
            

            //using for loop
            
            for (int i = j; i >= 1; i--) {
            fac = fac * i;
        }

       
        System.out.println("Factorial of "+j+" is "+fac);
    }
}
