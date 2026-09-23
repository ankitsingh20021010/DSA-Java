class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteByValue {

    Node head;

    // Add node at end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete node by value
    void delete(int value) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If value is in first node
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == value) {
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }

        System.out.println(value + " not found");
    }

    // Display Linked List
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DeleteByValue list = new DeleteByValue();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before Delete:");
        list.display();

        list.delete(30);

        System.out.println("After Delete:");
        list.display();
    }
}
