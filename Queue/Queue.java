import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue: " + queue);

        // Peek
        System.out.println("Front: " + queue.peek());

        // Dequeue
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after dequeue: " + queue);

        // Size
        System.out.println("Size: " + queue.size());

        // Check empty
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
