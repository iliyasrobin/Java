
package javaprograms;

import java.util.Scanner;


public class ArmstrongNumber {
     public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int n = inp.nextInt();
          int sum=0,temp = n, r;
        
        while(temp!=0){
            r = temp%10;
            sum = sum + r*r*r;
            temp = temp / 10;
        }
         
         if (n == sum) {
             System.out.println("Armstrong Number");
         }
         else{
             System.out.println("Not Armstrong");
         }
    }
}
