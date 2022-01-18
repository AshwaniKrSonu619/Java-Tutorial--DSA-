import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
  
       // write ur code here
       int number = scn.nextInt();
        
           int ans = 1;
        
         for(int mul=number ; mul>=1 ; mul = mul - 1){ // mul -= 1 // mul--
            ans = ans * mul;
            }
        
           System.out.println(ans);
  
   }
  }
