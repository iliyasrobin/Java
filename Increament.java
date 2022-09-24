
package javaprograms;


public class Increament {
    public static void main(String[] args) {
        int x = 11;
        int y = 22;
        int z;
        //pre increament
        z = ++x;
        System.out.println(z);
        //post increament
        z = x++;
        //it will show the previous value of x
        System.out.println(z);
        //but if it found new x , it will then increase the value
        z = x;
        System.out.println(z);
        
    }
}
