import java.util.*;

public class Main {

    public static void main(String[] args){
        
        
        Stack<Integer> stk = new Stack<>();
        
        
        stk.push(1);
        stk.push(2);
        stk.push(3);
        
        
        System.out.println(stk.peek());
        System.out.println(stk.size());
        
        
        System.out.println(stk.pop());
        System.out.println(stk.size());
        

    }

}
