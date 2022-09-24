
package javaprograms;

import java.util.Scanner;


public class EvenODD {
      public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x ;
        System.out.println("Enter any positive number: ");
        x = inp.nextInt();
        
        if(x%2==0){
            System.out.println("Even");
        }
        
        else{
            System.out.println("Odd");
        }
    }
    
}

