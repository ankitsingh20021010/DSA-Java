class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSearch {

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

    // Search element
    void search(int key) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println(key + " found at position " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println(key + " not found");
    }

    public static void main(String[] args) {

        LinkedListSearch list = new LinkedListSearch();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.search(30);
        list.search(50);
    }
}
