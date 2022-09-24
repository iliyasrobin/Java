
package javaprograms;

import java.util.Scanner;


public class VowelCons {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character in small letter : ");
        ch = inp.next().charAt(0); //here 0 is the position number
        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
