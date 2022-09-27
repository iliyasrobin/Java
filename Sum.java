
package javaprograms;

import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        //print all numbers from 1 to 1o
//       int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum+ i;
//        }
//        System.out.println("Sum is: "+sum);
        


        // print  sum of m to n
//        Scanner inp = new Scanner(System.in);
//        int x,y;
//        System.out.println("Enter starting number: ");
//        x = inp.nextInt();
//        System.out.println("Enter the last number: ");
//        y = inp.nextInt();
//        int sum = 0;
//        for (int i=x; i <= y; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum is : "+sum);


        // print  sum of m to n of all even numbers
//        Scanner inp = new Scanner(System.in);
//        int x,y;
//        System.out.println("Enter starting number: ");
//        x = inp.nextInt();
//        System.out.println("Enter the last number: ");
//        y = inp.nextInt();
//        int sum = 0;
//        for (int i=x; i <= y; i++) {
//            if(i%2==0){
//            sum = sum + i;
//            }
//        }
//        System.out.println("Sum is : "+sum);   



        //print sum of all odd numbers
         Scanner inp = new Scanner(System.in);
        int x,y;
        System.out.println("Enter starting number: ");
        x = inp.nextInt();
        System.out.println("Enter the last number: ");
        y = inp.nextInt();
        int sum = 0;
        for (int i=x; i <= y; i++) {
            if(i%2!=0){
            sum = sum + i;
            }
        }
        System.out.println("Sum is : "+sum);  

    }
    
}
