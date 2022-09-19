
package javaprograms;

import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operations");
        Scanner input = new Scanner(System.in);
        int n1,n2,r;
        System.out.println("Enter First Number: ");
        n1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        n2 = input.nextInt();
        
        r = n1+n2;
        System.out.println("Add is: "+r);
        r = n1-n2;
        System.out.println("Sub is: "+r);
        r = n1*n2;
        System.out.println("Mul is: "+r);
        r = n1/n2;
        System.out.println("Div is: "+r);
        r = n1%n2;
        System.out.println("Remainder is: "+r);
       double r2 = (double)n1/n2; //type casting
        System.out.println("Div with type casting is: "+r2);
        
    }
}
