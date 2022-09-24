
package javaprograms;


public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        int c ;
        int x = 64,y;
        //Bitwise AND
        c = a & b;
        System.out.println("a & b = "+c);
        //Bitwise OR
        c = a | b;
        System.out.println("a & b = "+c);
        //Bitwise EXOR        
        c = a ^ b;
        System.out.println("a & b = "+c);
        
        //rightshift : ba dik theke dan dike joto ghor shift kora dorkar ta shore ashbe
        // mane ba dik theke 2 diye vag kore shift porjonto ashbe 
        
        y = x >> 2; // ekhane 2 hocche shift shongkha
        System.out.println("Rightshift: "+y);
        
        
        //leftshift : dan dik theke ba dike joto ghor shift kora dorkar ta shore ashbe
        // mane dan dik theke 2 diye gun kore shift porjonto ashbe 
        
        y = x << 2;
        System.out.println("Leftshift : "+y);
        
    }
}
