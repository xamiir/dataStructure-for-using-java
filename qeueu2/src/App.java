public class App {
    public static void main(String[] args) throws Exception {
        CircularArrayQueue<Integer> queue = new CircularArrayQueue<Integer>();
        queue.enqueue(2);
        queue.enqueue(150);
        queue.enqueue(3);
        queue.enqueue(20);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(500);
        
       // queue.toString();
        System.out.println("queue is :"+queue.toString());
        System.out.println("searching is : "+queue.searchingQueue(4*5));     
      
       
    }
}
