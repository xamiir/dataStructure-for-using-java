import java.util.EmptyStackException;

public class CircularArrayQueue<T> {
    private final int DEFAULT_CAPACITY = 10;
    private int front, rear, count;
    private T[] queue;
    public CircularArrayQueue(int initialCapacity){
        front = rear = count = 0;
        queue = (T[]) new Object[initialCapacity];
    }
    public CircularArrayQueue(){
        front = rear = count = 0;
        queue = (T[]) new Object[DEFAULT_CAPACITY];

    }
    public void enqueue(T data){
        if(count == queue.length){
            expandCapacity();
        }
        queue[rear] = data;
        rear = (rear + 1) % queue.length;
        count++;
    }
    public T dequeue() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T data = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;
        return data;
    }
    public T peek() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return queue[front];
       
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public int size(){
        return count;
    }
    private void expandCapacity(){
       T[] larger = (T[]) new Object[queue.length * 2];
        for(int scan = 0; scan < count; scan++){
            larger[scan] = queue[front];
            front = (front + 1) % queue.length;
        }
        front = 0;
        rear = count;
        queue = larger;
    }
   
    public T first (){
        return queue[front];
    }
    public T last(){
        return queue[rear -1];
    }
    public int max()throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int max = (int) queue[front];
        for(int i = 0; i < queue.length; i++){
            if (queue[i] != null) {
                if((int) queue[i] > max){
                    max = (int) queue[i];
                }
            } 
        }
        return max;
    }
    public int min() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int min = (int) queue[front];
        for(int i = 0; i < queue.length; i++){
            if (queue[i] != null) {
                if((int) queue[i] < min){
                    min = (int) queue[i];
                }
            } 
        }
        return min;
    }
    // public int searchingQueue(T data){
    //     int index = -1;
    //     for(int i = 0; i < queue.length; i++){
    //         if (queue[i] != null) {
    //             if((T) queue[i] == data){
    //                 index = i;
    //             }
    //         } 
    //     }
    //     return index;
    // }
    public boolean searchingQueue(T data){
        boolean found = false;
        for(int i = 0; i < queue.length; i++){
            if (queue[i] != null) {
                if((T) queue[i] == data){
                    found = true;
                }
            } 
        }
        return found;
    }

    

    public String toString(){
        String result = "";
        for(int i = 0; i < queue.length; i++){
            if (queue[i] != null) {

                result += queue[i] + " ";
            } 
        }
        return result;
    }
}

    

