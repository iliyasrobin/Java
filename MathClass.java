
package javaprograms;


public class MathClass {
    public static void main(String[] args) {
        int x = 11;
        int y = 22;
        int p = -10;
        int z = Math.max(x,y);
        System.out.println("MAX is : "+z);
        
        int z2 = Math.min(x,y);
        System.out.println("MIN is : "+z2);
        
        int z3 = Math.abs(p);
        System.out.println("Absolute of -10 is : "+z3);
        double a = 3;
        double b = 2;
        double powe = Math.pow(a,b);
        System.out.println("X power of Y is: "+powe);
        
        double n = Math.random();
        System.out.println("random number is: "+n);
        
        double pi = Math.PI;
        System.out.println("PI = "+pi);
        
        double e = Math.E;
        System.out.println("E = "+e);
        
        double sqrt = Math.sqrt(64);
        System.out.println("Sqrt of 64 is : "+sqrt);
        
        
    }
}
