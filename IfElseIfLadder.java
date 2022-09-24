
package javaprograms;

import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x ;
        System.out.println("Enter a number: ");
        x = inp.nextInt();
        
        if(x>0){
            System.out.println("Positive");
        }
        else if(x<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
    
}
