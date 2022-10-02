
package array;

import java.util.Scanner;


public class Array2D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y;
        System.out.print("Enter row numbers: ");
        x = inp.nextInt();
        System.out.print("Enter column numbers: ");
        y = inp.nextInt();
        
        //creating 2D array
        int[][] num = new int[x][y];
        
        //taking input from user using for loop
        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                System.out.print("Enter value of: "+row+","+col+" : ");
                num[row][col] = inp.nextInt();
            }
        }
        
        //printing 2D array using for loop
        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                System.out.print(" "+num[row][col]);
            }
            System.out.println();
        }
    }
}
