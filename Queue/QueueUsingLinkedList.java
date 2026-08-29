public class QueueUsingLinkedList {

    Node front;
    Node rear;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add element
    void enqueue(int value) {

        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Remove element
    int dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    // View front element
    int peek() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    // Display queue
    void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Front: " + q.peek());

        System.out.print("Queue after dequeue: ");
        q.display();
    }
}
