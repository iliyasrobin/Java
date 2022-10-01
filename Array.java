
package javaprograms;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //datatype[] variable name = new datatype[array size];
        int[] numb = new int[5];
        numb[0] = 1;
        int len = numb.length;
        System.out.println(len);
        System.out.println(numb[0]);
        
        
        //Array input
        Scanner inp = new Scanner(System.in);
        int x;
        System.out.print("Enter array size: ");
        x = inp.nextInt();
        int[] num = new int[x];
        System.out.println("Enter numbers: ");
        
        //taking input using for loop
        for (int i = 0; i < num.length; i++) {
            num[i] = inp.nextInt();
        }
        
        //printing Array
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Position "+i+" = "+num[i]);
        }
        
        //Array sum
        
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of array is: "+sum);
        
        
        //Average of array
        
        int avg = sum/num.length;
        System.out.println("Average of array is: "+avg);
    }
}
