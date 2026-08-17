class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Find_Maximum_linkedList {
    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(50);
        head.next.next = new Node(30);
        head.next.next.next = new Node(90);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(70);

        int max = head.data;

        Node current = head;

        while (current != null) {

            if (current.data > max) {
                max = current.data;
            }

            current = current.next;
        }

        System.out.println("Maximum = " + max);
    }
}
