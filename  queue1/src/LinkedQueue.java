import java.util.EmptyStackException;


public class LinkedQueue <T>{
    private Node<T> head;
    private Node<T> tail;
    private int counter;
    LinkedQueue(){
        this.head = null;
        this.tail = null;
        this.counter = 0;
    }
    LinkedQueue(T data){
        this.head = new Node<T>(data);
        this.tail = this.head;
        this.counter = 0;
    }
    public void enqueue(T data){
        Node<T> node = new Node<T>(data);
        if(isEmpty()){
            this.head = node;
            this.tail = node;
    }
        else{
            this.tail.setNext(node);
            this.tail = node;
        }
        this.counter++;
    }
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        else{
            T data = this.head.getData();
            this.head = this.head.getNext();
            this.counter--;
            return data;
        }
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }
        else{
            return this.head.getData();
        }
    }
    public boolean isEmpty(){
        return this.head == null;
    }
    public int size(){
        return this.counter;
    }
    public T first () throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return this.head.getData();
        }
        
    }
    public void printQueue()throws EmptyStackException{
        if(isEmpty())
        throw new EmptyStackException();
        else{
            Node<T> temp = this.head;
            while(temp != null){
                System.out.println(temp.getData()+"");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    
}
