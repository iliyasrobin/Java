
package javaprograms;

import java.util.Scanner;

//public class AreaOfTrinangelandCircle {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float x,y;
//        System.out.println("Enter the base of triangle: ");
//        x = input.nextFloat();
//        System.out.println("Enter the height of triangle: ");
//        y = input.nextFloat();
//        float z =  (float) (0.5*x*y);
//        System.out.println("The area of triangle is : "+z);
//    }
//}
public class AreaOfTrinangelandCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x;
        System.out.println("Enter radius of circle: ");
        x = input.nextFloat();
        float area = (float) (3.1416*x*x);
        System.out.println("Area of circle is : "+area);
        
    }
}
