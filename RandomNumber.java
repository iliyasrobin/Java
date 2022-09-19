
package javaprograms;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("We will Generate random Number Here");
 
        Random r;
        r = new Random();
        System.out.println("Random Number is: "+r.nextInt(20));
       
    }
}
