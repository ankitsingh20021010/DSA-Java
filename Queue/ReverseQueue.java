import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    Queue<Integer> queue = new LinkedList<>();

    // Add element
    void enqueue(int value) {
        queue.add(value);
    }

    // Remove element
    int dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue.remove();
    }

    // Reverse the queue
    void reverse() {

        Stack<Integer> stack = new Stack<>();

        // Queue -> Stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Stack -> Queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // Display queue
    void display() {

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int value : queue) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ReverseQueue q = new ReverseQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.print("Original Queue: ");
        q.display();

        q.reverse();

        System.out.print("Reversed Queue: ");
        q.display();
    }
}
