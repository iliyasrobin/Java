
package javaprograms;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter row numbers: ");
        int n = inp.nextInt();
        
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
        
    }
}
