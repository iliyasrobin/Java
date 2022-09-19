
package javaprograms;

import java.util.Scanner;
//this is for online a word
public class UserInput {
    public static void main(String[] args) {
        System.out.println("We will take user input here");
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter a name here: ");
        name = input.next();
        System.out.println("Name is: "+name);
    }
}
//this is for phases(First name and surname)
public class UserInput {
    public static void main(String[] args) {
        System.out.println("We will take user input here");
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter a name here: ");
        name = input.nextLine();
        System.out.println("Name is: "+name);
    }
}
