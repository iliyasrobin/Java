
package javaprograms;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
     
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
        //Max Min
        int max = num[0];
        int min = num[0];
        
        for (int i = 1; i < num.length; i++) {
            if (max<num[i]) {
                max = num[i];
            }
            if (min>num[i]) {
                min = num[i];
            }
        }
        System.out.println("Max is: "+max);
        System.out.println("Max is: "+min);
        
       
    }
}
