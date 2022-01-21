import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
         int length = 0;
        
         int copy = n;
        
         while(copy != 0){
            
             // int remainder = copy%10;
            length += 1; // length = length+1
             copy /= 10; // copy = copy / 10;
            
        }
        
         copy = n;
         int sum = 0;
        while(copy != 0){
            
             int remainder = copy % 10;
            
            sum = sum + (int)(Math.pow(remainder , length));
            
             copy = copy / 10;
            
         }
        
        if(sum == n){
             System.out.println("armstrong number");
            
         }else{
             System.out.println("not a armstrong number");
         }
        
        

  }
}  
  
