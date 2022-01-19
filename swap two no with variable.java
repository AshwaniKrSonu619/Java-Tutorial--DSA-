import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
       
     // write your code here
     int a = 20;
     int b = 10;
     
     int save = b;
     b = a;
     a = save;
     System.out.println(a);//20
     System.out.println(b);//10
    }
   }
