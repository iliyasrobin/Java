
package javaprograms;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter row numbers: ");
        int n = inp.nextInt();
        
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
        
    }
}
