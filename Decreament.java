
package javaprograms;


public class Decreament {
    public static void main(String[] args) {
        int y = 22;
        int z;
        //pre decreament
        z = --y;
        System.out.println(z);
        //post decreament
        z = y--;
        //it will show the previous value of y
        System.out.println(z);
        //but if it found new y , it will then decrease the value
        z = y;
        System.out.println(z);
    }
}
