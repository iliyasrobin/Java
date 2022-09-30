
package javaprograms;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int n;
       System.out.print("Enter any positive digits: ");
       n = inp.nextInt();
       int sum =0;
        while(n!=0){
           int x  = n%10;
            sum = sum +x;
            n = n / 10;          
        }
        System.out.println("Sum : "+sum);
        
    }
    
}
