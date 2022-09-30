
package javaprograms;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y;
        System.out.print("Enter starting number: ");
        x = inp.nextInt();
        System.out.print("Enter ending number: ");
        y = inp.nextInt();
        
        for (int i = x; i <= y; i++) {
            
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+"X"+j+" = "+i*j);
            }
            System.out.println();
        }
    }
}
