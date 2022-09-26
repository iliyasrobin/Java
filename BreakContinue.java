
package javaprograms;


public class BreakContinue {
    public static void main(String[] args) {
        //break
        for (int i =1;i<=100;i++){
            if(i==10){
                break;
            }
            System.out.println(i);
        }
        
        //continue
         for (int i =1;i<=20;i++){
            if(i==10){
                continue; // ekhane shudhu matro 10 ta print hobe na
                //mane continue a jei condition thake oita skip hoye print kore
                //oi tuku print kore na
            }
            System.out.println(i);
        }
         
          for (int i =1;i<=10;i= i+3){
            if(i==10){
                continue;
            }
            System.out.println(i);
        }
        
    }
}
