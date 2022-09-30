
package javaprograms;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,count= 0;
        System.out.print("Enter any positive number: ");
        x = inp.nextInt();
        for (int i = 2; i < x; i++) {
            if (x%i==0) {
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
