import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
      
       
       int a = 10;
       int b = 20;
       
       a = a +b;
       b = a-b; // a+b-b
       a = a-b; // a+b-a
       
       

     System.out.println(a);//20
     System.out.println(b);//10
    }
   }
