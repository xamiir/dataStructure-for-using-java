import  java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;
import java.util.EmptyStackException;

public class Stuck<T> {
    private final static int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;
    Stuck() {
        this(DEFAULT_CAPACITY);
    }
    Stuck(int initialCapacity) {
        top = 0;
        stack = (T[]) new Object[initialCapacity];
    }
    public void push(T element){
        if(size()==stack.length) {
            expandCapacity();
            stack[top] = element;
            top++;
        }
        else {
            stack[top] = element;
            top++;
        }

    }
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length*2);
    }
    public boolean isEmpty() {
        return (top == 0);
    }
    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }
    public T peek() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public int size() {
        return top;
    }
    
    


    public String toString() {
        String result = "";
        for(int scan=0; scan < top; scan++) {
            result = result + stack[scan].toString() + " ";
        }
        return result;
    }
    public int sum(){
        int sum = 0;
        for(int i = 0; i < top; i++){
            sum += (int)stack[i];
        }
        return sum;
    }
    public int max(){
        int max = 0;
        for(int i = 0; i < top; i++){
            if((int)stack[i] > max){
                max = (int)stack[i];
            }
        }
        return max;
    
    }
}

        




   

    

