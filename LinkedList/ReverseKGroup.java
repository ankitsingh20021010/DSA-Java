class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseKGroup {

    public static Node reverseKGroup(Node head, int k) {

        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // Reverse first k nodes
        while (current != null && count < k) {

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;

            count++;
        }

        // Recursively reverse remaining nodes
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        // prev becomes new head
        return prev;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked List:");
        printList(head);

        int k = 3;

        head = reverseKGroup(head, k);

        System.out.println("After Reversing in K Groups:");
        printList(head);
    }
}
