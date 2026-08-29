import java.util.Stack;

public class QueueUsingTwoStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Add element
    void enqueue(int value) {
        stack1.push(value);
    }

    // Remove element
    int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        // Move elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // View front element
    int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check if queue is empty
    boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        System.out.println("Front: " + q.peek());

        q.enqueue(50);

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
    }
}
