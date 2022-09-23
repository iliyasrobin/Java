
package javaprograms;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 44, y = 10;
        x+=y; // x = x+y
        System.out.println("x = "+x);
        x-=y; // x = x-y
        System.out.println("x = "+x);
         x*=y; // x = x*y
        System.out.println("x = "+x);
         x/=y; // x = x/y
         //here it will print 44 cause x was updated in previous step
        System.out.println("x = "+x);
         x%=y; // x = x%y
        System.out.println("x = "+x);
        
    }
}
