import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
     int a = scn.nextInt();
     int b = scn.nextInt();
     int c = scn.nextInt();
    
    
     double s = (a+b+c)/2;
    
     double ans = (s * (s-a) * (s-b) * (s-c));
    
     System.out.println(Math.sqrt(ans));
 }    
}     
