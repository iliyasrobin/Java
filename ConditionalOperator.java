
package javaprograms;

import java.util.Scanner;


public class ConditionalOperator {
//    public static void main(String[] args) {
    
    //biggest number from two
    
//        Scanner inp = new Scanner(System.in);
//        int x,y,big;
//        System.out.print("Enter first number: ");
//         x = inp.nextInt();
//        System.out.print("Enter second number: ");
//        y = inp.nextInt();
//        
//        big = (x>y)?x:y;
//        System.out.println("The biggest number is : "+big);
//        
//    }
    
    // biggest number from three
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y,z,big;
        System.out.print("Enter first number: ");
         x = inp.nextInt();
        System.out.print("Enter second number: ");
        y = inp.nextInt();
        System.out.print("Enter second number: ");
        z = inp.nextInt();
        
        big = (x>y) && (x>z)? x  : (y>x) && (y>z) ? y : z;
        System.out.println("The biggest number is : "+big);
        
    }
}
