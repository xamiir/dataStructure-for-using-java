import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;
import java.util.EmptyStackException;

public class App {
    public static void main(String[] args) throws Exception {
        Stack <Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        
        System.out.println(stack);
        stack.pop();

        System.out.println(stack);
      

   
    
    }
}
