public class App {
    public static void main(String[] args) throws Exception {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.printQueue();
        System.out.println("queue"+queue);
        System.out.println("Size: " + queue.size());
        System.out.println("First: " + queue.first());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        
    }
   
    
}
