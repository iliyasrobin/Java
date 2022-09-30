
package javaprograms;

import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("How many fibonacci numbers you want to show? : ");
        n = inp.nextInt();
        
        int first = 0, second = 1,fib;
        
        System.out.print(first+" "+second);
        for (int i = 0; i <= n; i++) {
            fib = first + second;
            System.out.print(" "+fib);
            first = second;
            second = fib;
        }
        System.out.println();
    }
}
