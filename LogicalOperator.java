
package javaprograms;


public class LogicalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        //and operation
        if(x%5==0 && y%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by 5");
        }
        //or operation
        if(x%2==0 || y%5==0){
            System.out.println("Divisible by 2 or 5");
        }
                else{
                System.out.println("Not Divisible by 2 or 5");
                }
    }
}
