class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Remove_Duplicate_linkedList {

    static void removeDuplicates(Node head) {

        Node current = head;

        while (current != null) {
            Node temp = current;

            while (temp.next != null) {

                if (current.data == temp.next.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }

            current = current.next;
        }
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = new Node(40);

        System.out.println("Before removing duplicates:");
        display(head);

        removeDuplicates(head);

        System.out.println("After removing duplicates:");
        display(head);
    }
}
