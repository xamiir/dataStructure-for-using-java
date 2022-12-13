public class Node<T> {
    public T data;
    public Node<T> next;
    public Node(){
        this.data = null;
        this.next = null;
    }
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
    public T getData(){
        return this.data;
    }
    public Node<T> getNext(){
        return this.next;
    }
    public void setData(T data){
        this.data = data;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    public String toString(){
        return this.data.toString();
    }
    
}
