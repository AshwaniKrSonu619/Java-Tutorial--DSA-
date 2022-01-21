import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
  
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int min = 0;
         if(a < b){
             min = a;
         }else{
             min = b;
             
         }
         while(min >= 1){
             if (a % min == 0 && b % min == 0){
                 
                 
                 int gcd = min;
                 int lcm = (a*b)/gcd;
                 
                 System.out.println("lcm is" +lcm+ ", gcd is " +gcd);
                 return;
             }
         }
         
        

  }
}  
  
