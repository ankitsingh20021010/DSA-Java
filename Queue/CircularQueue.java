public class CircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int count;

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add element
    void enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % size;
        arr[rear] = value;
        count++;
    }

    // Remove element
    int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[front];

        front = (front + 1) % size;
        count--;

        return value;
    }

    // View front element
    int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    // Check empty
    boolean isEmpty() {
        return count == 0;
    }

    // Check full
    boolean isFull() {
        return count == size;
    }

    // Display queue
    void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            int index = (front + i) % size;
            System.out.print(arr[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.enqueue(60);
        q.enqueue(70);

        System.out.print("Queue after circular insertion: ");
        q.display();

        System.out.println("Front: " + q.peek());
    }
}
